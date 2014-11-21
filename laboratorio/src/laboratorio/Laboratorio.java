package laboratorio;

import laboratorio.Entidades.TipoResultados;
import laboratorio.controladores.Excepciones.ContenedorEntityManager;

public class Laboratorio {

    public static void main(String[] args) {
        
        TipoResultados tipoResultado = new TipoResultados();
         // Recupera el entity manager
        ContenedorEntityManager.EM.getTransaction().begin();
        ContenedorEntityManager.EM.persist(tipoResultado);
        ContenedorEntityManager.EM.getTransaction().commit();
       // Crea un nuevo contacto
     
        // TODO code application logic here
    }
    
}
