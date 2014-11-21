package laboratorio.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Bioquimicos")
public class Bioquimicos extends Personal implements Serializable {
    
   @Column(name = "Matricula")
   private String matricula;

   @OneToMany(mappedBy = "bioquimico")
   private List<Analisis> analisis;
      
   public String getMatricula() {
        return matricula;
   }

   public void setMatricula(String Matricula) {
        this.matricula = Matricula;
   }

   public List<Analisis> getAnalisis() {
        return analisis;
   }

   public void setAnalisis(List<Analisis> analisis) {
        this.analisis = analisis;
   }
    
   public void addAnalisis(Analisis analisis){
        if(this.analisis == null){
            this.analisis = new ArrayList<Analisis>();
        }
        analisis.setBioquimicos(this);
        this.analisis.add(analisis);
    }
   
   @Override
   public String toString(){
        return  this.matricula;
    }
}
