package laboratorio.ui.Pacientes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.Analisis;

public class DetalleAnalisisTableModel extends AbstractTableModel{
   
    private final String[] nombresColumnas = {"Codigo", "Descripcion", "Autorizado", "Terminado", "Codigo Muestra", "Bioquimico",
        "Codigo Receta","Tipo","Pagado"};
 
   
    private List <Analisis> analisis = new ArrayList<>();
    
    
    
    @Override
    public int getRowCount() {
        return this.analisis.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }
    
     @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
        if(rowIndex >= 0 && rowIndex < this.analisis.size()){
            switch(columnIndex){
               
                case 0: return this.analisis.get(rowIndex).getCodAnalisis();
                case 1: return this.analisis.get(rowIndex).getDescripcion();
                case 2: return this.analisis.get(rowIndex).isAutorizado();
                case 3: return this.analisis.get(rowIndex).isTerminado();
                case 4: return this.analisis.get(rowIndex).getMuestras().getCodMuestra();
                case 5: return this.analisis.get(rowIndex).getBioquimicos().getMatricula();
                case 6: return this.analisis.get(rowIndex).getReceta().getCodReceta();
                case 7: return this.analisis.get(rowIndex).getTipoanalisis().getDescripcion();
                case 8: return this.analisis.get(rowIndex).isPagado();
                case 9: return this.analisis.get(rowIndex).getBioquimicos().getMatricula();    
                
                default: return null;
                }
                }else{
                    return null;
                }      
        }
    
    
    @Override
    public String getColumnName(int col) {
        return nombresColumnas[col];
    }
    

    public List <Analisis> getAnalisis() {
        return analisis;
    }

    public void setAnalisis(List<Analisis> analisis) {
        this.analisis = analisis;
    }
    
   
    
    public Analisis getAnalisis(int fila){
        if(fila >= 0 && fila < this.analisis.size()){
            return this.analisis.get(fila);
        }else{
            return null;
        }
    }
     
}
