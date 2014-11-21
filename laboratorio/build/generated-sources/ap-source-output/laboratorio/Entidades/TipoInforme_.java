package laboratorio.Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laboratorio.Entidades.Informes;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-18T09:53:05")
@StaticMetamodel(TipoInforme.class)
public class TipoInforme_ { 

    public static volatile SingularAttribute<TipoInforme, String> descripcion;
    public static volatile SingularAttribute<TipoInforme, Integer> codInforme;
    public static volatile SingularAttribute<TipoInforme, String> encabezado;
    public static volatile SingularAttribute<TipoInforme, String> tamañoDeHoja;
    public static volatile ListAttribute<TipoInforme, Informes> informes;

}