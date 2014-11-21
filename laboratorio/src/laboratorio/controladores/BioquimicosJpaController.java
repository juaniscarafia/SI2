package laboratorio.controladores;

import java.util.List;
import javax.persistence.Query;
import laboratorio.Entidades.Bioquimicos;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;
import laboratorio.Entidades.BusquedaBioquimico;
import laboratorio.controladores.Excepciones.PreexistingEntityException;

public class BioquimicosJpaController {
      public static void crear(Bioquimicos bioquimico) throws PreexistingEntityException{
        try{
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.persist(bioquimico);
            ContenedorEntityManager.EM.getTransaction().commit();
        }catch(Exception ex){
            if(ex.getMessage().contains("MySQLIntegrityConstraintViolationException")){
                throw new PreexistingEntityException("Ya existe un bioquimico con igual DNI en la base de datos");
            }else{
                ex.printStackTrace();
            }
        }
    }
    
    public static void modificar(Bioquimicos bioquimico) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(bioquimico);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void eliminar(Bioquimicos bioquimico){
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.remove(bioquimico);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static List<Bioquimicos> buscarTodos(){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Bioquimicos as e ");
        return q.getResultList();
    }
    
    public static void refrescar(Bioquimicos bioquimico){
        ContenedorEntityManager.EM.refresh(bioquimico);
    }
    
    public static List<Bioquimicos> buscarTodosOrdenados(BusquedaBioquimico orden){
       Query q = null;
       String auxQ = "SELECT e FROM Bioquimicos as e ";
       if(orden == BusquedaBioquimico.DNI){
           q = ContenedorEntityManager.EM.createQuery(auxQ + "ORDER BY e.dni ASC" );
       }else if(orden == BusquedaBioquimico.NOMBRE){
           q = ContenedorEntityManager.EM.createQuery(auxQ + "ORDER BY e.nombreYapellido ASC ");
       }
       return q.getResultList();
    }
     
    public static List<Bioquimicos> buscarFiltradosOrdenados(String filtro, BusquedaBioquimico orden){
        Query q = null;
        if(orden == BusquedaBioquimico.DNI){
            q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Bioquimicos as e where e.dni like '"+ filtro +"%'" +"ORDER BY e.dni ASC");
        }else if(orden == BusquedaBioquimico.NOMBRE){
            q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Bioquimicos as e where e.nombreyApellido like '" + filtro +"%' "+ "ORDER BY e.nombreyApellido ASC ");
        }
        return q.getResultList();
    }    
}
