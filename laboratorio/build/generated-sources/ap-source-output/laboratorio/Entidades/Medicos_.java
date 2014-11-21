package laboratorio.Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laboratorio.Entidades.ObraSociales;
import laboratorio.Entidades.Pacientes;
import laboratorio.Entidades.Recetas;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-18T09:53:05")
@StaticMetamodel(Medicos.class)
public class Medicos_ { 

    public static volatile SingularAttribute<Medicos, String> domicilio;
    public static volatile ListAttribute<Medicos, Recetas> receta;
    public static volatile SingularAttribute<Medicos, String> matricula;
    public static volatile ListAttribute<Medicos, ObraSociales> obrasSociales;
    public static volatile ListAttribute<Medicos, Pacientes> pacientes;
    public static volatile SingularAttribute<Medicos, String> nombreYapellido;
    public static volatile SingularAttribute<Medicos, String> telefono;
    public static volatile SingularAttribute<Medicos, Integer> dni;

}