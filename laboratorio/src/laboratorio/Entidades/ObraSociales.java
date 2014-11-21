package laboratorio.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ObraSociales")
public class ObraSociales   implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodObraSocial")
    private int codObraSocial;
    
    @Column(name = "Nombre")
    private String nombre;
    
    @Column(name = "Descripcion")
    private String descripcion;
    
    @Column(name = "Domicilio")
    private String domicilio;
    
    @Column(name = "Telefono")
    private String telefono;
    
    @Column(name = "Email")
    private String email;
    
    @OneToMany(mappedBy = "obraSocial",fetch = FetchType.LAZY)
    private List<Pacientes> pacientes;
    
    @ManyToMany
    @JoinTable(name="OsMedicos",
        joinColumns=@JoinColumn(name="CodObraSocial"),
        inverseJoinColumns=@JoinColumn(name="DniMedico"))
    private List<Medicos> medicos;

    public List<Pacientes> getPaciente() {
        return pacientes;
    }

    public void setPaciente(List<Pacientes> paciente) {
        this.pacientes = paciente;
    }
     
    public void addPacientes(Pacientes paciente){
        if(this.pacientes == null){
            this.pacientes= new ArrayList<Pacientes>();
        }
        paciente.setObrasocial(this);
        this.pacientes.add(paciente);
    }
    
    public int getCodObraSocial() {
        return codObraSocial;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
