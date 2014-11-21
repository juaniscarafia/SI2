package laboratorio.controladores.Excepciones;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ContenedorEntityManager{
    
    public static final EntityManagerFactory EMF;
    public static final EntityManager EM;

    static{
        try {
         EMF = Persistence.createEntityManagerFactory("LaboratorioPU");
         EM = EMF.createEntityManager();
      } catch (Throwable ex) {
         System.err.println("Error al iniciar el EntityManager." + ex);
         throw new ExceptionInInitializerError(ex);
      }
    }
}
