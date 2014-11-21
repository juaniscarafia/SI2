package laboratorio.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import laboratorio.Entidades.Ingresos;
import laboratorio.Entidades.Pacientes;
import laboratorio.Entidades.Recetas;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;

public class RecetasJpaController {
    
    public static List<Recetas>receta= new ArrayList();
    public static void crear(Recetas receta) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.persist(receta);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void modificar(Recetas receta)  {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(receta);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void eliminar(Recetas receta) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.remove(receta);
        ContenedorEntityManager.EM.getTransaction().commit();
    }

    public static void refrescar(Recetas receta){
        ContenedorEntityManager.EM.refresh(receta);
    } 
    
    public static List<Recetas> buscarRecetasPorIngreso(Ingresos ingreso){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT c FROM Recetas as c WHERE c.ingreso.codIngreso =:codigoIngreso ");
        q.setParameter("codigoIngreso", ingreso.getCodIngreso());
        return q.getResultList();
    }
    
    public static List<Recetas> buscarRecetasPorpacientes(Pacientes paciente){
        for(int i=0;i < paciente.getIngreso().size();i++){
         for(int j=0; j< paciente.getIngreso().get(i).getReceta().size(); j++){
          
              receta.add(paciente.getIngreso().get(i).getReceta().get(j));
          }
         }
         return receta;
        }
    public static List<Recetas> buscarTodos(){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Recetas as e ");
        return q.getResultList();
    }  
}
