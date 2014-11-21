package laboratorio.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Medicos")
public class Medicos   implements Serializable{
    @Id
    @Column(name = "DniMedico")
    private int dni;
    
    @Column(name = "NombreYapellido")
    private String nombreYapellido;
    
    @Column(name = "Matricula")
    private String matricula;
        
    @Column(name = "Telefono")
    private String telefono;
    
    @Column(name = "Domicilio")
    private String domicilio;

    @OneToMany(mappedBy="medicoCabecera")
    private List<Pacientes> pacientes;
    
    @ManyToMany(mappedBy="medicos")
    private List<ObraSociales> obrasSociales;
    
    
    @OneToMany( mappedBy = "medico", fetch = FetchType.LAZY)
    private List<Recetas> receta;

    public String getNombreYapellido() {
        return nombreYapellido;
    }

    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }

    public List<Pacientes> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Pacientes> pacientes) {
        this.pacientes = pacientes;
    }

    public List<ObraSociales> getObrasSociales() {
        return obrasSociales;
    }

    public void setObrasSociales(List<ObraSociales> obrasSociales) {
        if (this.obrasSociales !=null){
            for(int i=0;i < obrasSociales.size();i++){
                boolean bandera = true;
                for(int z=0 ;z < this.obrasSociales.size();z++){
                    if(this.obrasSociales.get(z)== obrasSociales.get(i)){
                      bandera=false;
                    }
                }
                if (bandera){
                    this.obrasSociales.add(obrasSociales.get(i));
                }
            }
        }else{
            this.obrasSociales = obrasSociales;  
        } 
    }

    public List<Pacientes> getPaciente() {
        return pacientes;
    }

    public void setPaciente(List<Pacientes> paciente) {
        this.pacientes = paciente;
    }

    public List<Recetas> getReceta() {
        return receta;
    }

    public void setReceta(List<Recetas> receta) {
        this.receta = receta;
    }
    
    public void addPacientes(Pacientes pacientes){
        if(this.pacientes == null){
            this.pacientes = new ArrayList<Pacientes>();
        }
        pacientes.setMedicoCabecera(this);
        this.pacientes.add(pacientes);
    }
    
    public void addRecetas(Recetas recetas){
        if(this.receta == null){
            this.receta = new ArrayList<Recetas>();
        }
        recetas.setMedico(this);
        this.receta.add(recetas);
    }

    public void addObraSocial(ObraSociales obraSocial) {
        boolean bandera = true;
        if (this.obrasSociales !=null){
            for(int z=0 ;z < this.obrasSociales.size();z++){
                if(this.obrasSociales.get(z)== obraSocial){
                    bandera=false;
                    }
                }
                if (bandera){
                    this.obrasSociales.add(obraSocial);
                }
        }else{
            List<ObraSociales> listObrasSociales = new ArrayList();
            listObrasSociales.add(obraSocial);
            this.obrasSociales = listObrasSociales;
        }
    } 
    
    public void deleteObraSocial(ObraSociales obraSocial) {
            obrasSociales.remove(obraSocial);
        }    
    
    public int getDni() {
        return dni;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String Matricula) {
        this.matricula = Matricula;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String Telefono) {
        this.telefono = Telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.domicilio = Domicilio;
    }
    
    @Override
    public String toString(){
        return this.nombreYapellido;
    }
}
