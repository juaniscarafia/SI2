package laboratorio.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import laboratorio.Entidades.Analisis;
import laboratorio.Entidades.Bioquimicos;
import laboratorio.Entidades.Muestra;
import laboratorio.Entidades.Recetas;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;
import laboratorio.Entidades.BusquedaAnalisis;
import laboratorio.Entidades.Pacientes;
import laboratorio.controladores.Excepciones.PreexistingEntityException;

public class AnalisisJpaController {
    
     
    public static void crear(Analisis analisis) throws PreexistingEntityException{
        try{
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.persist(analisis);
            ContenedorEntityManager.EM.getTransaction().commit();
        }catch(Exception ex){
            if(ex.getMessage().contains("MySQLIntegrityConstraintViolationException")){
                throw new PreexistingEntityException("Ya existe un analisis con igual codigo en la base de datos");
            }else{
                ex.printStackTrace();
            }
        }
    }
    
    public static void modificar(Analisis analisis) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(analisis);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void eliminar(Analisis analisis){
            ContenedorEntityManager.EM.getTransaction().begin();
            ContenedorEntityManager.EM.remove(analisis);
            ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static Analisis buscar(int Cod_Analisis) {     
           return  ContenedorEntityManager.EM.find(Analisis.class, Cod_Analisis); 
    }
    
    public static List<Analisis> buscarTodos(){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Analisis as e ");
        return q.getResultList();
    }
      
    public static List<Analisis> buscarAnalisisPorRecetas(Recetas receta){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT c FROM Analisis as c WHERE c.receta.codReceta = :codigoReceta ");
        q.setParameter("codigoReceta", receta.getCodReceta());
        return q.getResultList();
    }
    
    
    public static List<Analisis> buscarAnalisisPorBioquimicos(Bioquimicos bioquimico){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT c FROM Analisis as c WHERE c.bioquimicos =:matricula ");
        q.setParameter("matricula", bioquimico.getMatricula());
        return q.getResultList();
    }
    
    public static List<Analisis> buscarAnalisisPorMuestra(Muestra muestra){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT c FROM Analisis as c WHERE c.muestra =:CodMuestra ");
        q.setParameter("CodMuestra", muestra.getCodMuestra());
        return q.getResultList();
    }
    
  
     public static List<Analisis> buscarAnalisisPorPacientes(Pacientes paciente){
         List<Analisis> analisis= new ArrayList();
     
        for(int i=0;i < paciente.getIngreso().size();i++){
         for(int j=0; j< paciente.getIngreso().get(i).getReceta().size(); j++){
          for(int k=0; k< paciente.getIngreso().get(i).getReceta().get(j).getAnalinis().size(); k++){
              analisis.add(paciente.getIngreso().get(i).getReceta().get(j).getAnalinis().get(k));
          }
             
         }
        }
     return analisis;
     }
    public static void refrescar(Analisis analisis){
        ContenedorEntityManager.EM.refresh(analisis);
    }
    
    public static List<Analisis> buscarFiltradosOrdenados(String filtro, BusquedaAnalisis orden){
        Query q = null;
        if(orden == BusquedaAnalisis.CODIGO){
            q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Analisis as e where e.codAnalisis like '"+ filtro +"%'" +"ORDER BY e.codAnalisis ASC");
        }
        return q.getResultList();
    }
}