package laboratorio.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Muestra")
public class Muestra  implements Serializable{
    @Id
    @Column(name = "CodMuestra")
    private int codMuestra;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "muestra",fetch = FetchType.LAZY)
    private List<Analisis> analisis;
    
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name="TipoMuestra", referencedColumnName = "CodTipoMuestra")
    private TipoMuestra tipoMuestra;
    
    @Column(name = "Observaciones")
    private String observaciones;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "FechaExpiracion")
    private  Calendar fechaExpiracion;

   
    public TipoMuestra getTipomuestra() {
        return tipoMuestra;
    }

    public void setTipomuestra(TipoMuestra tipomuestra) {
        this.tipoMuestra = tipomuestra;
    }

    public int getCodMuestra() {
        return codMuestra;
    }

    public void setCodMuestra(int codMuestra) {
        this.codMuestra = codMuestra;
    }

    public TipoMuestra getTipoMuestra() {
        return tipoMuestra;
    }

    public void setTipoMuestra(TipoMuestra tipoMuestra) {
        this.tipoMuestra = tipoMuestra;
    }

    

    public List<Analisis> getAnalisis() {
        return analisis;
    }

    public void setAnalisis(List<Analisis> analisis) {
        this.analisis = analisis;
    }

   
    public void addAnalisis(Analisis analisis){
        if(this.analisis == null){
            this.analisis= new ArrayList<Analisis>();
        }
        analisis.setMuestras(this);
        this.analisis.add(analisis);
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.observaciones = Observaciones;
    }

    public Calendar getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Calendar FechaExpiracion) {
        this.fechaExpiracion = FechaExpiracion;
    }
    
    @Override
    public String toString(){
        return ""+ this.codMuestra  + "" ;
    }
}
