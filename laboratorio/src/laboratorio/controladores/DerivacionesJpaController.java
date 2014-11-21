package laboratorio.controladores;

import java.util.List;
import javax.persistence.Query;
import laboratorio.Entidades.Derivaciones;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;

public class DerivacionesJpaController {
     public static void crear(Derivaciones derivacion) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.persist(derivacion);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void modificar(Derivaciones derivacion) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(derivacion);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
      public static void eliminar(Derivaciones derivacion){
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.remove(derivacion);
        ContenedorEntityManager.EM.getTransaction().commit();
      }
        public static List<Derivaciones> buscarTodos(){
        Query q = ContenedorEntityManager.EM.createQuery("SELECT e FROM Derivaciones as e ");
        return q.getResultList();
    }
}
