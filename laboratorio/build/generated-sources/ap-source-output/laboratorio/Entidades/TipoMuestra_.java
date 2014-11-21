package laboratorio.Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laboratorio.Entidades.Muestra;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-18T09:53:05")
@StaticMetamodel(TipoMuestra.class)
public class TipoMuestra_ { 

    public static volatile SingularAttribute<TipoMuestra, String> descripcion;
    public static volatile SingularAttribute<TipoMuestra, Integer> codTipoMuestra;
    public static volatile ListAttribute<TipoMuestra, Muestra> muestas;

}