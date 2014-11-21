package laboratorio.Entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import laboratorio.Entidades.Pacientes;

@Entity
@Table(name = "Ingresos")
public class Ingresos   implements Serializable{
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodIngreso")
    private int codIngreso;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "FechaIngreso")
    private Calendar fechaIngreso;
    
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn( name="Paciente", referencedColumnName = "DniPaciente")
    private Pacientes ingresoPaciente;
    
    @OneToMany(mappedBy = "ingreso", fetch = FetchType.LAZY)
    private List<Recetas> recetas;

    public int getCodIngreso() {
        return codIngreso;
    }

    public void setCodIngreso(int CodIngreso) {
        this.codIngreso = CodIngreso;
    }

    public Calendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Calendar FechaIngreso) {
        this.fechaIngreso = FechaIngreso;
    }

    public Pacientes getIngresopacientes() {
        return ingresoPaciente;
    }

    public void setIngresopacientes(Pacientes ingresopacientes) {
        this.ingresoPaciente = ingresopacientes;
    }

    public List<Recetas> getReceta() {
        return recetas;
    }

    public void setReceta(List<Recetas> Receta) {
        this.recetas = Receta;
    }

    public void addRecetas(Recetas recetas){
        if(this.recetas == null){
            this.recetas = new ArrayList<Recetas>();
        }
        recetas.setIngresos(this);
        this.recetas.add(recetas);
    }
    
    @Override
    public String toString(){
        return "" + this.codIngreso;
       
//        return ""+ sdf.format(this.fechaIngreso.getTime())+" " + this.ingresoPaciente.getNombreyApellido();
    }
}
