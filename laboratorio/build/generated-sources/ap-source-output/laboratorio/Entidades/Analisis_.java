package laboratorio.Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laboratorio.Entidades.Bioquimicos;
import laboratorio.Entidades.Derivaciones;
import laboratorio.Entidades.Informes;
import laboratorio.Entidades.Muestra;
import laboratorio.Entidades.Recetas;
import laboratorio.Entidades.TipoAnalisis;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-18T09:53:05")
@StaticMetamodel(Analisis.class)
public class Analisis_ { 

    public static volatile SingularAttribute<Analisis, String> descripcion;
    public static volatile ListAttribute<Analisis, Derivaciones> derivaciones;
    public static volatile SingularAttribute<Analisis, Boolean> terminado;
    public static volatile SingularAttribute<Analisis, Integer> codAnalisis;
    public static volatile SingularAttribute<Analisis, Boolean> pagado;
    public static volatile SingularAttribute<Analisis, Recetas> receta;
    public static volatile SingularAttribute<Analisis, Bioquimicos> bioquimico;
    public static volatile SingularAttribute<Analisis, Boolean> autorizado;
    public static volatile SingularAttribute<Analisis, Boolean> derivado;
    public static volatile SingularAttribute<Analisis, TipoAnalisis> tipoAnalisis;
    public static volatile SingularAttribute<Analisis, Muestra> muestra;
    public static volatile ListAttribute<Analisis, Informes> informes;

}