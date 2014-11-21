package laboratorio.ui.Ingresos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.Analisis;





public class DetalleRenglon extends AbstractTableModel{
    
    
    private final String[] nombresColumnas = {"Número de renglón", "Código de análisis", "Descripción"};
    private List<Analisis> analisis = new ArrayList<>();
    
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
              case 0: return rowIndex +1 ;
              case 1: return this.analisis.get(rowIndex).getCodAnalisis();
              case 2: return this.analisis.get(rowIndex).getDescripcion();
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
    
    public List<Analisis> getReceta() {
        return analisis;
    }
    
    public void setReceta(List<Analisis> analisis) {
        this.analisis = analisis;
    }
    

    
    public Analisis getRenglon(int fila){
        if(fila >= 0 && fila < this.analisis.size()){
            return this.analisis.get(fila);
        }else{
            return null;
        }
    }
}


    

