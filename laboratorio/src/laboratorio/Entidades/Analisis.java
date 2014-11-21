package laboratorio.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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

@Entity
@Table(name = "Analisis")
public class Analisis  implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodAnalisis")
    private int codAnalisis;
     
    @Column(name = "Descripcion")
    private String descripcion;
        
    @ManyToOne(optional = false,fetch = FetchType.EAGER)
    @JoinColumn(name="CodigoReceta", referencedColumnName = "CodReceta")
    private Recetas receta;
    
    @OneToMany(mappedBy = "analisis", fetch = FetchType.EAGER)
    private List<Informes> informes;
    
    @OneToMany(mappedBy = "analisis", fetch = FetchType.EAGER)
    private List<Derivaciones> derivaciones;
     
    @ManyToOne(optional = false,fetch = FetchType.EAGER)
    @JoinColumn( name="CodMuestra", referencedColumnName = "CodMuestra")
    private Muestra muestra;
    
    @ManyToOne(optional = false,fetch = FetchType.EAGER)
    @JoinColumn(name="TipoAnalisis", referencedColumnName = "CodTipoAnalisis")
    private TipoAnalisis tipoAnalisis;
          
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Bioquimico")
    private Bioquimicos bioquimico;
    
    @Column(name = "Autorizado")
    private Boolean autorizado;
    
    @Column(name = "Derivado")
    private Boolean derivado;
    
    @Column(name = "Terminado")
    private Boolean terminado;
    
    @Column(name = "Pagado")
    private Boolean pagado;
    
    public int getCodAnalisis() {
        return codAnalisis;
    }
    
    public void setCodAnalisis(int CodAnalisis) {
        this.codAnalisis = CodAnalisis;
    }

    public Recetas getReceta() {
        return receta;
    }

    public void setReceta(Recetas receta) {
        this.receta = receta;
    }

    public Muestra getMuestras() {
        return muestra;
    }

    public void setMuestras(Muestra muestra) {
        this.muestra = muestra;
    }

    public List<Informes> getInforme() {
        return informes;
    }

    public void setInforme(List<Informes> informe) {
        this.informes = informe;
    }

    public List<Derivaciones> getDerivacion() {
        return derivaciones;
    }

    public void setDerivacion(List<Derivaciones> derivacion) {
        this.derivaciones = derivacion;
    }
     
     public void addDerivaciones(Derivaciones derivacion){
        if(this.derivaciones == null){
            this.derivaciones = new ArrayList<Derivaciones>();
        }
        
        derivacion.setAnalisis(this);
        this.derivaciones.add(derivacion);
    }
  
     
    public void addInformes(Informes informes){
        if(this.informes == null){
            this.informes = new ArrayList<Informes>();
        }
        
        informes.setAnalisis(this);
        this.informes.add(informes);
    }
      
    public TipoAnalisis getTipoanalisis() {
        return tipoAnalisis;
    }

    public void setTipoanalisis(TipoAnalisis tipoAnalisis) {
        this.tipoAnalisis = tipoAnalisis;
    }

    public Bioquimicos getBioquimicos() {
        return bioquimico;
    }

    public void setBioquimicos(Bioquimicos bioquimico) {
        this.bioquimico = bioquimico;
    }
  
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }
  
    public Boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Boolean Autorizado) {
        this.autorizado = Autorizado;
    }

    public Boolean isDerivado() {
        return derivado;
    }

    public void setDerivado(Boolean Derivado) {
        this.derivado = Derivado;
    }

    public Boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(Boolean Terminado) {
        this.terminado = Terminado;
    }

    public Boolean isPagado() {
        return pagado;
    }

    public void setPagado(Boolean Pagado) {
        this.pagado = Pagado;
    }
}
