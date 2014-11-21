package laboratorio.Entidades;

import java.io.Serializable;
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

@Entity
@Table(name = "Pacientes")
public class Pacientes  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DniPaciente")
    private int dni;
    
    @Column(name = "NombreYapellidoPaciente")
    private String nombreYapellido;
    
    @Column(name = "DomicilioPaciente")
    private String domicilio;
    
    @Column(name = "TelefonoPaciente")
    private String telefono;
    
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name="ObraSocial", referencedColumnName = "CodObraSocial")
    private ObraSociales obraSocial;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "FechaNacimiento")
    private  Calendar fechaNacimiento;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="DniMedico", nullable = false)
    private Medicos medicoCabecera;
    
    @OneToMany(mappedBy = "ingresoPaciente", fetch = FetchType.LAZY)
    private List<Ingresos> ingresos;
    
    public int getDni() {
        return dni;
    }

    public ObraSociales getObrasocial() {
        return obraSocial;
    }

    public void setObrasocial(ObraSociales obrasocial) {
        this.obraSocial = obrasocial;
    }

    public Medicos getMedicoCabecera() {
        return medicoCabecera;
    }

    public void setMedicoCabecera(Medicos MedicoCabecera) {
        this.medicoCabecera = MedicoCabecera;
    }

    public List<Ingresos> getIngreso() {
        return ingresos;
    }

    public void setIngreso(List<Ingresos> ingreso) {
        this.ingresos = ingreso;
    }
    
    public void addIngresos(Ingresos ingreso){
        if(this.ingresos == null){
            this.ingresos = new ArrayList<Ingresos>();
        }
        ingreso.setIngresopacientes(this);
        this.ingresos.add(ingreso);
    }

    public void setDni(int Dni) {
        this.dni = Dni;
    }

    public String getNombreyApellido() {
        return nombreYapellido;
    }

    public void setNombreyApellido(String NombreyApellido) {
        this.nombreYapellido = NombreyApellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.domicilio = Domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String Telefono) {
        this.telefono = Telefono;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar FechaNacimiento) {
        this.fechaNacimiento = FechaNacimiento;
    }
    
    @Override
    public String toString(){
        return ""+this.dni;
    }
}