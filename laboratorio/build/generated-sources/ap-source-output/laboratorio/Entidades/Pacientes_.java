package laboratorio.Entidades;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laboratorio.Entidades.Ingresos;
import laboratorio.Entidades.Medicos;
import laboratorio.Entidades.ObraSociales;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-18T09:53:05")
@StaticMetamodel(Pacientes.class)
public class Pacientes_ { 

    public static volatile ListAttribute<Pacientes, Ingresos> ingresos;
    public static volatile SingularAttribute<Pacientes, Medicos> medicoCabecera;
    public static volatile SingularAttribute<Pacientes, String> domicilio;
    public static volatile SingularAttribute<Pacientes, Calendar> fechaNacimiento;
    public static volatile SingularAttribute<Pacientes, ObraSociales> obraSocial;
    public static volatile SingularAttribute<Pacientes, String> nombreYapellido;
    public static volatile SingularAttribute<Pacientes, String> telefono;
    public static volatile SingularAttribute<Pacientes, Integer> dni;

}