package laboratorio.Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laboratorio.Entidades.Analisis;
import laboratorio.Entidades.Ingresos;
import laboratorio.Entidades.Medicos;
import laboratorio.Entidades.RenglonesDeRecetas;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-18T09:53:05")
@StaticMetamodel(Recetas.class)
public class Recetas_ { 

    public static volatile ListAttribute<Recetas, Analisis> analisis;
    public static volatile SingularAttribute<Recetas, Ingresos> ingreso;
    public static volatile SingularAttribute<Recetas, Medicos> medico;
    public static volatile SingularAttribute<Recetas, Integer> codReceta;
    public static volatile ListAttribute<Recetas, RenglonesDeRecetas> renglones;

}