package laboratorio.controladores;

import java.util.List;
import javax.persistence.Query;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;
import laboratorio.Entidades.BusquedaTipoResultado;
import laboratorio.Entidades.TipoResultados;
import laboratorio.controladores.Excepciones.PreexistingEntityException;

public class TipoResultadosJpaController {
 public static void crear(TipoResultados tipoResultados) throws PreexistingEntityException{
        try{
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.persist(tipoResultados);
            ContenedorEntityManager.EM.getTransaction().commit();
        }catch(Exception ex){
            if(ex.getMessage().contains("MySQLIntegrityConstraintViolationException")){
                throw new PreexistingEntityException("Ya existe un tipo de resultados con igual codigo en la base de datos");
            }else{
                ex.printStackTrace();
            }
        }
    }
    
    public static void modificar(TipoResultados tipoResultados) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(tipoResultados);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void eliminar(TipoResultados tipoResultados){
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.remove(tipoResultados);
            ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static TipoResultados buscar(int CodTipoResultados) {     
           return  ContenedorEntityManager.EM.find(TipoResultados.class, CodTipoResultados); 
    }
    
    public static List<TipoResultados> BuscarTodos(){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT e FROM TipoResultados as e ");
        return q.getResultList();
    }
 
    public static void refrescar(TipoResultados tipoAnalisis){
        ContenedorEntityManager.EM.refresh(tipoAnalisis);
    }
    
    public static List<TipoResultados> buscarFiltradosOrdenados(String filtro, BusquedaTipoResultado orden){
        Query q = null;
        if(orden == BusquedaTipoResultado.CODIGO){
            q = ContenedorEntityManager.EM.createQuery("SELECT e FROM TipoResultados as e where e.codTipoResultados like '"+ filtro +"%'" +"ORDER BY e.codTipoResultados ASC");
        }
        return q.getResultList();
    }    
}
