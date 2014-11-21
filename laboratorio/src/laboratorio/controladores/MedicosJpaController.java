package laboratorio.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import laboratorio.Entidades.Medicos;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;
import laboratorio.Entidades.BusquedaMedicos;
import laboratorio.Entidades.ObraSociales;
import laboratorio.controladores.Excepciones.PreexistingEntityException;

public class MedicosJpaController {
    public static void crear(Medicos medico)throws PreexistingEntityException{
        try{
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.persist(medico);
            ContenedorEntityManager.EM.getTransaction().commit();
        }catch(Exception ex){
            if(ex.getMessage().contains("MySQLIntegrityConstraintViolationException")){
                throw new PreexistingEntityException("Ya existe un medico con igual DNI en la base de datos");
            }else{
                ex.printStackTrace();
            }
        }
    }
    
    public static void modificar(Medicos medico){
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(medico);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void eliminar(Medicos medico){
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.remove(medico);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void refrescar(Medicos medico){
        ContenedorEntityManager.EM.refresh(medico);
    }
    
    public static Medicos buscarPorDni(int Dni){
        return ContenedorEntityManager.EM.find(Medicos.class, Dni);
    }
    
    public static Medicos buscarPorNombre(String NombreYApellido){
        return ContenedorEntityManager.EM.find(Medicos.class, NombreYApellido);
    }
     public static Medicos buscarPorMatricula(String Matricula ) {     
           return  ContenedorEntityManager.EM.find(Medicos.class, Matricula); 
    }
    
    public static List<Medicos> findAll(){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Medicos as e");
        return q.getResultList();
    }
    
    public static List<Medicos> buscarTodosOrdenados(BusquedaMedicos orden){
       Query q = null;
       String auxQ = "SELECT e FROM Medicos as e ";
       if(orden == BusquedaMedicos.DNI){
           q = ContenedorEntityManager.EM.createQuery(auxQ + "ORDER BY e.dni ASC" );
       }else if(orden == BusquedaMedicos.NOMBRE){
           q = ContenedorEntityManager.EM.createQuery(auxQ + "ORDER BY e.nombreYapellido ASC ");
       }
       return q.getResultList();
    }
     
    public static List<Medicos> buscarFiltradosOrdenados(String filtro, BusquedaMedicos orden){
        Query q = null;
        if(orden == BusquedaMedicos.DNI){
            q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Medicos as e where e.dni like '"+ filtro +"%'" +"ORDER BY e.dni ASC");
        }else if(orden == BusquedaMedicos.NOMBRE){
            q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Medicos as e where e.nombreYapellido like '" + filtro +"%' "+ "ORDER BY e.nombreYapellido ASC ");
        }
        return q.getResultList();
    }
      public static List<ObraSociales> buscarObraSocialPorMedicos(Medicos medico){
         List<ObraSociales> ob= new ArrayList();
     
           for(int i=0;i < medico.getObrasSociales().size();i++){
                ob.add(medico.getObrasSociales().get(i));
          }
        return ob;
     }
    
     
}
