package laboratorio.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Nomenclador")
public class Nomenclador  implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodNomenclador")
    private int codNomenclador;
      
    @Column(name = "Precio")
    private float precio;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ObraSocial", referencedColumnName = "CodObraSocial")
    private ObraSociales obraSocial;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="TipoAnalisis", referencedColumnName = "CodTipoAnalisis")
    private TipoAnalisis tipoAnalisis;

    public void setPrecio(float Precio) {
        this.precio = Precio;
    }

    public void setObraSocial(ObraSociales obraSocial) {
        this.obraSocial = obraSocial;
    }

    public void setTipoAnalisis(TipoAnalisis tipoAnalisis) {
        this.tipoAnalisis = tipoAnalisis;
    }

    public int getCodNomenclador() {
        return codNomenclador;
    }

    public float getPrecio() {
        return precio;
    }

    public ObraSociales getObraSocial() {
        return obraSocial;
    }

    public TipoAnalisis getTipoAnalisis() {
        return tipoAnalisis;
    }
}

