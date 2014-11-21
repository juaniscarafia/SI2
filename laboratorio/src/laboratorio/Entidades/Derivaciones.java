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
@Table(name = "Derivaciones")
public class Derivaciones  implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodDerivacion")
    private int codDerivacion;
    
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name="analisis", referencedColumnName = "CodAnalisis")
    private Analisis analisis;
    
    @Column(name = "Terminado")
    private Boolean terminado;

    public int getCodDerivaciones() {
        return codDerivacion;
    }

    public void setCodDerivaciones(int CodDerivaciones) {
        this.codDerivacion = CodDerivaciones;
    }
   
    public Boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(Boolean Terminado) {
        this.terminado = Terminado;
    }

    public Analisis getAnalisis() {
        return analisis;
    }

    public void setAnalisis(Analisis analisis) {
        this.analisis = analisis;
    }
}
