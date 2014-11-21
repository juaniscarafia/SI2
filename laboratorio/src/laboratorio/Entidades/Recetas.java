package laboratorio.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
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
import laboratorio.Entidades.Analisis;
import laboratorio.Entidades.Medicos;

@Entity
@Table(name = "Recetas")
public class Recetas  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodReceta")
    private int codReceta;
     
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name="Medico", referencedColumnName = "DniMedico")
    private Medicos medico;
    
    @OneToMany(mappedBy = "receta", fetch = FetchType.LAZY)
    private List<Analisis> analisis;
    
    
     
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name="Ingreso", referencedColumnName = "CodIngreso")
    private Ingresos ingreso;

    public int getCodReceta() {
        return codReceta;
    }

    public List<Analisis> getAnalisis() {
        return analisis;
    }

    public void setAnalisis(List<Analisis> analisis) {
        this.analisis = analisis;
    }

  

    public Ingresos getIngreso() {
        return ingreso;
    }

    public void setIngreso(Ingresos ingreso) {
        this.ingreso = ingreso;
    }
    

    public List<Analisis> getAnalinis() {
        return analisis;
    }

    public void setAnalinis(List<Analisis> Analinis) {
        this.analisis = Analinis;
    }
    public void setCodReceta(int CodReceta) {
        this.codReceta = CodReceta;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos Medico) {
        this.medico = Medico;
    }

    public Ingresos getIngresos() {
        return ingreso;
    }

    public void setIngresos(Ingresos ingresos) {
        this.ingreso = ingresos;
    }
    
   public void addAnalisis(Analisis analisis){
        if(this.analisis == null){
            this.analisis = new ArrayList<Analisis>();
        }
        analisis.setReceta(this);
        this.analisis.add(analisis);
    }
   
      @Override
    public String toString(){
        return ""+ codReceta + "" ;
    }
}
