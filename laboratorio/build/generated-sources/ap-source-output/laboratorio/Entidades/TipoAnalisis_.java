package laboratorio.Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laboratorio.Entidades.Analisis;
import laboratorio.Entidades.TipoResultados;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-18T09:53:05")
@StaticMetamodel(TipoAnalisis.class)
public class TipoAnalisis_ { 

    public static volatile SingularAttribute<TipoAnalisis, String> descripcion;
    public static volatile SingularAttribute<TipoAnalisis, Integer> codTipoAnalisis;
    public static volatile ListAttribute<TipoAnalisis, TipoResultados> resultados;
    public static volatile ListAttribute<TipoAnalisis, Analisis> analisis;

}