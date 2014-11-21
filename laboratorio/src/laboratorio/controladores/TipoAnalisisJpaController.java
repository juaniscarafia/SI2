package laboratorio.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import laboratorio.Entidades.BusquedaTipoAnalisis;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;
import laboratorio.Entidades.TipoAnalisis;
import laboratorio.controladores.Excepciones.PreexistingEntityException;

public class TipoAnalisisJpaController {
  public static List<TipoAnalisis>tipoanalisis= new ArrayList();
  public static void crear(TipoAnalisis tipoAnalisis) throws PreexistingEntityException{
        try{
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.persist(tipoAnalisis);
            ContenedorEntityManager.EM.getTransaction().commit();
        }catch(Exception ex){
            if(ex.getMessage().contains("MySQLIntegrityConstraintViolationException")){
                throw new PreexistingEntityException("Ya existe un tipo de analisis con igual codigo en la base de datos");
            }else{
                ex.printStackTrace();
            }
        }
    }
    
    public static void modificar(TipoAnalisis tipoAnalisis) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(tipoAnalisis);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void eliminar(TipoAnalisis tipoAnalisis){
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.remove(tipoAnalisis);
            ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static TipoAnalisis buscar(int CodTipoAnalisis) {     
           return  ContenedorEntityManager.EM.find(TipoAnalisis.class, CodTipoAnalisis); 
    }
    
    public static List<TipoAnalisis> buscarTodos(){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT e FROM TipoAnalisis as e ");
        return q.getResultList();
    }
     
    public static void refrescar(TipoAnalisis tipoAnalisis){
        ContenedorEntityManager.EM.refresh(tipoAnalisis);
    }
    
    public static List<TipoAnalisis> buscarFiltradosOrdenados(String filtro, BusquedaTipoAnalisis orden){
        Query q = null;
        if(orden == BusquedaTipoAnalisis.CODIGO){
            q = ContenedorEntityManager.EM.createQuery("SELECT e FROM TipoAnalisis as e where e.codTipoAnalisis like '"+ filtro +"%'" +"ORDER BY e.codTipoAnalisis ASC");
        }
        return q.getResultList();
    }
}
