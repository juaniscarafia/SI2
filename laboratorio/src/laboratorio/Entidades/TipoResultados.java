package laboratorio.Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TipoResultados")
public class TipoResultados  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodTipoResultados")
    private int codTipoResultados;
    
    @ManyToMany(mappedBy="resultados")
    private List<TipoAnalisis> anslisis;
    
    @Column(name = "DescripcionTipoResultados")
    private String descripcion;
    
    @Column(name = "ValorMaximo")
    private String valorMax;
    
    @Column(name = "ValorMinimo")
    private String valorMin;
    
    @Column(name = "ValorObtenido")
    private float valorObtenido;
   
    public float getValorObtenido() {
        return valorObtenido;
    }

    public void setValorObtenido(float ValorObtenidos) {
        this.valorObtenido = ValorObtenidos;
    }

    public List<TipoAnalisis> getAnslisis() {
        return anslisis;
    }

    public void setAnslisis(List<TipoAnalisis> anslisis) {
        this.anslisis = anslisis;
    }

    public String getValorMax() {
        return valorMax;
    }

    public void setValorMax(String valorMax) {
        this.valorMax = valorMax;
    }

    public String getValorMin() {
        return valorMin;
    }

    public void setValorMin(String valorMin) {
        this.valorMin = valorMin;
    }

  

    
    public int getCodTipoResultados() {
        return codTipoResultados;
    }

    public void setCodTipoResultados(int CodTipoResultados) {
        this.codTipoResultados = CodTipoResultados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }
    
    @Override
    public String toString(){
        return ""+this.getDescripcion();
    }
}
