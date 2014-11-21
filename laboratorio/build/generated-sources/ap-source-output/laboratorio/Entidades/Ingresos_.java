package laboratorio.Entidades;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laboratorio.Entidades.Pacientes;
import laboratorio.Entidades.Recetas;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-18T09:53:05")
@StaticMetamodel(Ingresos.class)
public class Ingresos_ { 

    public static volatile SingularAttribute<Ingresos, Calendar> fechaIngreso;
    public static volatile ListAttribute<Ingresos, Recetas> recetas;
    public static volatile SingularAttribute<Ingresos, Pacientes> ingresoPaciente;
    public static volatile SingularAttribute<Ingresos, Integer> codIngreso;

}