package laboratorio.Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laboratorio.Entidades.TipoAnalisis;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-18T09:53:05")
@StaticMetamodel(TipoResultados.class)
public class TipoResultados_ { 

    public static volatile SingularAttribute<TipoResultados, String> descripcion;
    public static volatile SingularAttribute<TipoResultados, Float> valorMax;
    public static volatile SingularAttribute<TipoResultados, Float> valorObtenido;
    public static volatile ListAttribute<TipoResultados, TipoAnalisis> anslisis;
    public static volatile SingularAttribute<TipoResultados, Integer> codTipoResultados;
    public static volatile SingularAttribute<TipoResultados, Float> valorMin;

}