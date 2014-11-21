package laboratorio.Entidades;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laboratorio.Entidades.Analisis;
import laboratorio.Entidades.TipoMuestra;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-18T09:53:05")
@StaticMetamodel(Muestra.class)
public class Muestra_ { 

    public static volatile SingularAttribute<Muestra, Integer> codMuestra;
    public static volatile ListAttribute<Muestra, Analisis> analisis;
    public static volatile SingularAttribute<Muestra, TipoMuestra> tipoMuestra;
    public static volatile SingularAttribute<Muestra, Calendar> fechaExpiracion;
    public static volatile SingularAttribute<Muestra, String> observaciones;

}