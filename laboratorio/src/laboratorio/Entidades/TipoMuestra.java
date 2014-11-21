package laboratorio.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TipoMuestra")
public class TipoMuestra  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CodTipoMuestra")
    private int codTipoMuestra;
    
    @Column(name = "DescripcionTipoMuestra")
    private String descripcion;
     
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoMuestra", fetch = FetchType.LAZY)
    private List<Muestra> muestas;
    
    public int getCodTipoMuestra() {
        return codTipoMuestra;
    }

    public void setCodTipoMuestra(int CodTipoMuestra) {
        this.codTipoMuestra = CodTipoMuestra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public List<Muestra> getMuestas() {
        return muestas;
    }

    public void setMuestas(List<Muestra> muestas) {
        this.muestas = muestas;
    }
    
    public void addMuestra(Muestra muestra){
        if(this.muestas== null){
            this.muestas= new ArrayList <Muestra>();
        }
        muestra.setTipomuestra(this);
        this.muestas.add(muestra);
    }
    
    @Override
    public String toString(){
        return ""+this.descripcion;
    }
}