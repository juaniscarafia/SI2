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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TipoAnalisis")
public class TipoAnalisis   implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodTipoAnalisis")
    private int codTipoAnalisis;
    
    @ManyToMany
    @JoinTable(name="AnalisiResultados",
        joinColumns=@JoinColumn(name="CodTipoAnalisis"),
        inverseJoinColumns=@JoinColumn(name="CodTipoResultado"))
    private List<TipoResultados> resultados;

    
    @Column(name = "DescripcionTipoAnalisis")
    private String descripcion;

    @OneToMany(mappedBy = "tipoAnalisis", fetch = FetchType.EAGER)
    private List<Analisis> analisis;    

    
    public void addResultados(TipoResultados tipoResultado){
        boolean bandera = true;
        if (this.resultados !=null){
            for(int z=0 ;z < this.resultados.size();z++){
                if(this.resultados.get(z)== tipoResultado){
                    bandera=false;
                    }
                }
                if (bandera){
                    this.resultados.add(tipoResultado);
                }
        }else{
            List<TipoResultados> listResultados = new ArrayList();
            listResultados.add(tipoResultado);
            this.resultados = listResultados;
        }
    }   
    
        
    public void deleteTipoResultado(TipoResultados tipoResultado){
        this.resultados.remove(tipoResultado);
    } 
    
    public List<TipoResultados> getResultados() {
        return resultados;
    }

    public void setResultados(List<TipoResultados> resultados) {
        if (this.resultados !=null){
            for(int i=0;i < resultados.size();i++){
                boolean bandera = true;
                for(int z=0 ;z < this.resultados.size();z++){
                    if(this.resultados.get(z)== resultados.get(i)){
                      bandera=false;
                    }
                }
                if (bandera){
                    this.resultados.add(resultados.get(i));
                }
            }
        }else{
            this.resultados = resultados;  
        } 
    }
    
    public int getCodTipoAnalisis() {
        return codTipoAnalisis;
    }

    public void setCodTipoAnalisis(int CodTipoAnalisis) {
        this.codTipoAnalisis = CodTipoAnalisis;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public List<Analisis> getAnalisis() {
        return analisis;
    }

    public void setAnalisis(List<Analisis> analisis) {
        this.analisis = analisis;
    }
    
    public void addAnalisis(Analisis analisis){
        if(this.analisis== null){
            this.analisis = new ArrayList<Analisis>();
        }
        analisis.setTipoanalisis(this);
        this.analisis.add(analisis);
    }
    
    @Override
    public String toString(){
        return ""+this.getDescripcion();
    }
}
