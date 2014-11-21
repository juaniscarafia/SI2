package laboratorio.Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laboratorio.Entidades.Analisis;
import laboratorio.Entidades.TipoInforme;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-18T09:53:05")
@StaticMetamodel(Informes.class)
public class Informes_ { 

    public static volatile SingularAttribute<Informes, Integer> codInforme;
    public static volatile SingularAttribute<Informes, Analisis> analisis;
    public static volatile SingularAttribute<Informes, TipoInforme> tipoInforme;

}