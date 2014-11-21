package laboratorio.controladores;

import laboratorio.Entidades.Personal;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;

public class PersonalJpaController {
    public static void crear(Personal personal) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.persist(personal);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void modificar(Personal personal) {
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.merge(personal);
        ContenedorEntityManager.EM.getTransaction().commit();
    }
    
    public static void eliminar(Personal personal){
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.remove(personal);
        ContenedorEntityManager.EM.getTransaction().commit();
    }

    public static void refrescar(Personal personal){
        ContenedorEntityManager.EM.refresh(personal);
    }
}
