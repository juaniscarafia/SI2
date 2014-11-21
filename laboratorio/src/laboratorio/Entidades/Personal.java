package laboratorio.Entidades;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Personal{
    @Id
    @Column(name = "DniPersonal")
    private int dni;
    
    @Column(length=30,name = "NombreYapellido")
    private String nombreYapellido;
    
    @Column(name = "Telefono")
    private String telefono;
    
    @Column(name = "Domicilio")
    private String domicilio;
    
    @Column(name = "Email")
    private String email;
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public String getNombreyApellido() {
        return nombreYapellido;
    }

    public void setNombreyApellido(String nombreyApellido) {
        this.nombreYapellido = nombreyApellido;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }
}
