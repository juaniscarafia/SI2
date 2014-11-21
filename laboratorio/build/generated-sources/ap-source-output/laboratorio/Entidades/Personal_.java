package laboratorio.Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-18T09:53:05")
@StaticMetamodel(Personal.class)
public abstract class Personal_ { 

    public static volatile SingularAttribute<Personal, String> domicilio;
    public static volatile SingularAttribute<Personal, String> nombreYapellido;
    public static volatile SingularAttribute<Personal, String> telefono;
    public static volatile SingularAttribute<Personal, Integer> dni;
    public static volatile SingularAttribute<Personal, String> email;

}