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
@Table(name = "Informes")
public class Informes  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodInforme")
    private int codInforme;
    
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(nullable=true, name="TipoInforme", referencedColumnName = "CodTipoInforme")
    private TipoInforme tipoInforme;
    
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name="Analisis", referencedColumnName = "CodAnalisis")
    private Analisis analisis;
    
    public int getCodInforme() {
        return codInforme;
    }

    public void setCodInforme(int CodInforme) {
        this.codInforme = CodInforme;
    }

    public TipoInforme getTipoInforme() {
        return tipoInforme;
    }

    public void setTipoInforme(TipoInforme tipoInforme) {
        this.tipoInforme = tipoInforme;
    }

    public Analisis getAnalisis() {
        return analisis;
    }

    public void setAnalisis(Analisis analisis) {
        this.analisis = analisis;
    }  
}
