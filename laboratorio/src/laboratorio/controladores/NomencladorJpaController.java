package laboratorio.controladores;

import java.util.List;
import javax.persistence.Query;
import laboratorio.Entidades.Analisis;
import laboratorio.Entidades.Nomenclador;
import laboratorio.Entidades.ObraSociales;
import laboratorio.Entidades.TipoAnalisis;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;
import laboratorio.controladores.Excepciones.PreexistingEntityException;

public class NomencladorJpaController {
    public static void crear(Nomenclador nomenclador) throws PreexistingEntityException{
        try{
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.persist(nomenclador);
            ContenedorEntityManager.EM.getTransaction().commit();
        }catch(Exception ex){
            if(ex.getMessage().contains("MySQLIntegrityConstraintViolationException")){
                throw new PreexistingEntityException("Ya existe un nomenclador con igual codigo en la base de datos");
            }else{
                ex.printStackTrace();
            }
        }
    }
    
    public static void modificar(Nomenclador nomenclador) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(nomenclador);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void eliminar(Nomenclador nomenclador){
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.remove(nomenclador);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
      
    public static List<Nomenclador> buscarNomencladorPorObraSocial(ObraSociales obrasocial){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT c FROM Nomenclador as c WHERE c.nomencladorPK.CodObraSocial =:codigoOS ");
        q.setParameter("codigoOS", obrasocial.getCodObraSocial());
        return q.getResultList();
    }
    
    public static List<Nomenclador> buscarNomencladorPorAnalisis(TipoAnalisis tipoAnalisis){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT c FROM Nomenclador as c WHERE c.nomencladorPK.CodTipoAnalisis =:codigoA ");
        q.setParameter("codigoA", tipoAnalisis.getCodTipoAnalisis());
        return q.getResultList();
    }
    
    public static List<Nomenclador> buscarTodos(){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Nomenclador as e ");
        return q.getResultList();
    }
    
    public static void refrescar(Nomenclador nomenclador){
        ContenedorEntityManager.EM.refresh(nomenclador);
    } 
}
