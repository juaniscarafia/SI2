package laboratorio.controladores;

import java.util.List;
import javax.persistence.Query;
import laboratorio.Entidades.Muestra;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;
import laboratorio.controladores.Excepciones.PreexistingEntityException;

public class MuestraJpsController {
    public static void crear(Muestra muestra)throws PreexistingEntityException{
        try{
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.persist(muestra);
            ContenedorEntityManager.EM.getTransaction().commit();
        }catch(Exception ex){
            if(ex.getMessage().contains("MySQLIntegrityConstraintViolationException")){
                throw new PreexistingEntityException("Ya existe una muestra con igual Codigo en la base de datos");
            }else{
                ex.printStackTrace();
            }
        }
    }
    
    public static void modificar(Muestra muestra) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(muestra);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void eliminar(Muestra muestra){
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.remove(muestra);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static List<Muestra> buscarTodos(){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Muestra as e ");
        return q.getResultList();
    }

    public static void refrescar(Muestra muestra){
        ContenedorEntityManager.EM.refresh(muestra);   
    }          
    
    public static Muestra buscarPorCodigo(int Cod_Muestra ) {     
           return  ContenedorEntityManager.EM.find(Muestra.class,Cod_Muestra); 
    }
}
