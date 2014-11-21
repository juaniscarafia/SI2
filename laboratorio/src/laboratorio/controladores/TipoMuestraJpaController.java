package laboratorio.controladores;

import java.util.List;
import javax.persistence.Query;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;
import laboratorio.Entidades.BusquedaTipoMuestra;
import laboratorio.Entidades.TipoMuestra;
import laboratorio.controladores.Excepciones.PreexistingEntityException;

public class TipoMuestraJpaController {
    public static void crear(TipoMuestra tipoMuestra) throws PreexistingEntityException{
        try{
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.persist(tipoMuestra);
            ContenedorEntityManager.EM.getTransaction().commit();
        }catch(Exception ex){
            if(ex.getMessage().contains("MySQLIntegrityConstraintViolationException")){
                throw new PreexistingEntityException("Ya existe un tipo de muestra con igual codigo en la base de datos");
            }else{
                ex.printStackTrace();
            }
        }
    }
    
    public static void modificar(TipoMuestra tipoMuestra) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(tipoMuestra);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void eliminar(TipoMuestra tipoMuestra){
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.remove(tipoMuestra);
            ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static TipoMuestra buscar(int CodTipoMuestra) {     
           return  ContenedorEntityManager.EM.find(TipoMuestra.class, CodTipoMuestra); 
    }
    
    public static List<TipoMuestra> buscarTodos(){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT e FROM TipoMuestra as e ");
        return q.getResultList();
    }
      
    public static void refrescar(TipoMuestra tipoMuestra){
        ContenedorEntityManager.EM.refresh(tipoMuestra);
    }
    
    public static List<TipoMuestra> buscarFiltradosOrdenados(String filtro, BusquedaTipoMuestra orden){
        Query q = null;
        if(orden == BusquedaTipoMuestra.CODIGO){
            q = ContenedorEntityManager.EM.createQuery("SELECT e FROM TipoMuestra as e where e.codTipoMuestra like '"+ filtro +"%'" +"ORDER BY e.codTipoMuestra ASC");
        }
        return q.getResultList();
    }    
}
