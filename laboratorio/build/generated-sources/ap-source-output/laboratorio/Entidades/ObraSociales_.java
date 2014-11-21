package laboratorio.Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laboratorio.Entidades.Medicos;
import laboratorio.Entidades.Pacientes;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-18T09:53:05")
@StaticMetamodel(ObraSociales.class)
public class ObraSociales_ { 

    public static volatile SingularAttribute<ObraSociales, String> descripcion;
    public static volatile SingularAttribute<ObraSociales, String> domicilio;
    public static volatile SingularAttribute<ObraSociales, Integer> codObraSocial;
    public static volatile ListAttribute<ObraSociales, Pacientes> pacientes;
    public static volatile ListAttribute<ObraSociales, Medicos> medicos;
    public static volatile SingularAttribute<ObraSociales, String> telefono;
    public static volatile SingularAttribute<ObraSociales, String> nombre;
    public static volatile SingularAttribute<ObraSociales, String> email;

}