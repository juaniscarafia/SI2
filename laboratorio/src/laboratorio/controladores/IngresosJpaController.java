package laboratorio.controladores;

import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import laboratorio.Entidades.Ingresos;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;
import laboratorio.Entidades.BusquedaIngresos;
import laboratorio.controladores.Excepciones.PreexistingEntityException;

public class IngresosJpaController {
    public static void crear(Ingresos ingreso) throws PreexistingEntityException{
        try{
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.persist(ingreso);
            ContenedorEntityManager.EM.getTransaction().commit();
        }catch(Exception ex){
            if(ex.getMessage().contains("MySQLIntegrityConstraintViolationException")){
                throw new PreexistingEntityException("Ya existe un ingreso con igual codigo en la base de datos");
            }else{
                ex.printStackTrace();
            }
        }
    }
         
    public static void modificar(Ingresos ingreso) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(ingreso);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void eliminar(Ingresos ingreso){
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.remove(ingreso);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static List<Ingresos> buscarTodos(){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Ingresos as e ");
        return q.getResultList();
    }
      
    public static Ingresos buscarPorFecha(Date Fecha ) {     
           return  ContenedorEntityManager.EM.find(Ingresos.class, Fecha); 
    }
        
    public static Ingresos buscarPorPacientes(int Dni ) {     
           return  ContenedorEntityManager.EM.find(Ingresos.class, Dni); 
    }
     
    public static List<Ingresos> buscarTodosOrdenados(BusquedaIngresos orden){
       Query q = null;
       String auxQ = "SELECT e FROM Ingresos as e ";
       if(orden == BusquedaIngresos.Codigo){
           q = ContenedorEntityManager.EM.createQuery(auxQ + "ORDER BY e.codIngreso ASC" );
       }else if(orden == BusquedaIngresos.Fecha){
           q = ContenedorEntityManager.EM.createQuery(auxQ + "ORDER BY e.fechaIngreso ASC ");
       }
       return q.getResultList();
    }

    public static void refrescar(Ingresos ingreso){
        ContenedorEntityManager.EM.refresh(ingreso);
    }
}
