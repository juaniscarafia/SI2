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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TipoInforme")
public class TipoInforme  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name = "CodInforme")
    private int codInforme;
    
    @Column(name = "DescripcionInforme")
    private String descripcion;
   
    private String tamañoDeHoja;
    
    private String encabezado;
      
    @OneToMany(mappedBy = "tipoInforme", fetch = FetchType.LAZY)
    private List<Informes> informes;
    
    public int getCodInforme() {
        return codInforme;
    }

    public void setCodInforme(int CodInforme) {
        this.codInforme = CodInforme;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public String getTamañoDeHoja() {
        return tamañoDeHoja;
    }

    public void setTamañoDeHoja(String TamañoDeHoja) {
        this.tamañoDeHoja = TamañoDeHoja;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String Encabezado) {
        this.encabezado = Encabezado;
    }

    public List<Informes> getInforme() {
        return informes;
    }

    public void setInforme(List<Informes> informe) {
        this.informes = informe;
    }
    
    public void addInforme(Informes informe){
        if(this.informes== null){
            this.informes= new ArrayList<Informes>();
        }
        informe.setTipoInforme(this);
        this.informes.add(informe);
    }
}