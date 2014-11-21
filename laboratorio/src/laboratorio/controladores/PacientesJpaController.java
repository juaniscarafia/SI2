package laboratorio.controladores;

import java.util.List;
import javax.persistence.Query;
import laboratorio.Entidades.Pacientes;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;
import laboratorio.controladores.Excepciones.PreexistingEntityException;
import laboratorio.Entidades.BusquedaPacientes;

public class PacientesJpaController {
    public static void crear(Pacientes paciente) throws PreexistingEntityException{
        try{
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.persist(paciente);
            ContenedorEntityManager.EM.getTransaction().commit();
        }catch(Exception ex){
            if(ex.getMessage().contains("MySQLIntegrityConstraintViolationException")){
                throw new PreexistingEntityException("Ya existe un Paciente con igual  en la base de datos");
            }else{
                ex.printStackTrace();
            }
        }
    }
    
    public static void modificar(Pacientes paciente) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(paciente);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void eliminar(Pacientes paciente){
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.remove(paciente);
        ContenedorEntityManager.EM.getTransaction().commit();
    }

    public static void refrescar(Pacientes paciente){
        ContenedorEntityManager.EM.refresh(paciente);
        
    } 
    
    public static Pacientes buscarPorDni(int Dni ) {     
           return  ContenedorEntityManager.EM.find(Pacientes.class,Dni); 
    }
    
    public static Pacientes buscarPorNombre(String Nombre ) {
         return  ContenedorEntityManager.EM.find(Pacientes.class,Nombre); 
    }
      
    public static List<Pacientes> buscarTodos(){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Pacientes as e");
        return q.getResultList();
    }
      
    public static List<Pacientes> buscarTodosOrdenados(BusquedaPacientes orden){
       Query q = null;
       String auxQ = "SELECT e FROM Pacientes as e ";
       if(orden == BusquedaPacientes.DNI){
           q = ContenedorEntityManager.EM.createQuery(auxQ + "ORDER BY e.dni ASC" );
       }else if(orden == BusquedaPacientes.NOMBRE){
           q = ContenedorEntityManager.EM.createQuery(auxQ + "ORDER BY e.nombreYapellido ASC ");
       }
       return q.getResultList();
    }
    
    public static List<Pacientes> findAll(){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Pacientes as e");
        return q.getResultList();
    }
     
    public static List<Pacientes> buscarFiltradosOrdenados(String filtro, BusquedaPacientes orden){
        Query q = null;
        //String auxQ = "SELECT e FROM Pacientes as e where e.Dni like '" + filtro +"%' ";
        if(orden == BusquedaPacientes.DNI){
            q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Pacientes as e where e.dni like '"+ filtro +"%'" +"ORDER BY e.dni ASC");
        }else if(orden == BusquedaPacientes.NOMBRE){
            q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Pacientes as e where e.nombreYapellido like '" + filtro +"%' "+ "ORDER BY e.nombreYapellido ASC ");
        }
        return q.getResultList();
    }   
}
      
      

