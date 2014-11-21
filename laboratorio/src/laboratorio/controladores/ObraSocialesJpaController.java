package laboratorio.controladores;

import java.util.List;
import javax.persistence.Query;
import laboratorio.Entidades.ObraSociales;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;
import laboratorio.Entidades.BusquedaObraSocial;
import laboratorio.Entidades.Medicos;
import laboratorio.controladores.Excepciones.PreexistingEntityException;

public class ObraSocialesJpaController {
    public static void crear(ObraSociales ObraSocial) throws PreexistingEntityException{
        try{
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.persist(ObraSocial);
            ContenedorEntityManager.EM.getTransaction().commit();
        }catch(Exception ex){
            if(ex.getMessage().contains("MySQLIntegrityConstraintViolationException")){
                throw new PreexistingEntityException("Ya existe una Obra Social con igual codigo en la base de datos");
            }else{
                ex.printStackTrace();
            }
        }
     }
    
    public static void modificar(ObraSociales ObraSocial) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(ObraSocial);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void eliminar(ObraSociales ObraSocial){
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.remove(ObraSocial);
        ContenedorEntityManager.EM.getTransaction().commit();
    }

    public static void refrescar(ObraSociales ObraSocial){
        ContenedorEntityManager.EM.refresh(ObraSocial);
    }          
    
    public static ObraSociales buscarPorCodigo(int Cod_Obrasocial ) {
           return  ContenedorEntityManager.EM.find(ObraSociales.class,Cod_Obrasocial); 
    }
    
    public static ObraSociales buscarPorNombre(String Nombre){
        return ContenedorEntityManager.EM.find(ObraSociales.class, Nombre);
    }
    
    public static List<ObraSociales> findAll() {
        Query q = ContenedorEntityManager.EM.createQuery("select object(p) from ObraSociales as p");
        return q.getResultList();
    }
    
    public static List<ObraSociales> buscarTodosOrdenados(BusquedaObraSocial orden){
       Query q = null;
       String auxQ = "SELECT e FROM ObrasSociales as e ";
       if(orden == BusquedaObraSocial.CODIGO){
           q = ContenedorEntityManager.EM.createQuery(auxQ + "ORDER BY e.codObraSocial ASC" );
       }else if(orden == BusquedaObraSocial.NOMBRE){
           q = ContenedorEntityManager.EM.createQuery(auxQ + "ORDER BY e.nombre ASC ");
       }
       return q.getResultList();
    }
    
    public static List<ObraSociales> buscarFiltradosOrdenados(String filtro, BusquedaObraSocial orden){
        Query q = null;
        if(orden == BusquedaObraSocial.CODIGO){
            q = ContenedorEntityManager.EM.createQuery("SELECT e FROM ObraSociales as e where e.codObraSocial like '"+ filtro +"%'" +"ORDER BY e.codObraSocial ASC");
        }else if(orden == BusquedaObraSocial.NOMBRE){
            q = ContenedorEntityManager.EM.createQuery("SELECT e FROM ObraSociales as e where e.nombre like '" + filtro +"%' "+ "ORDER BY e.nombre ASC ");
        }
        return q.getResultList();
    }
  
}
