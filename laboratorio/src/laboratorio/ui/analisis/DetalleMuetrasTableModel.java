package laboratorio.ui.analisis;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.Muestra;
        
public class DetalleMuetrasTableModel extends AbstractTableModel{
    private final String[] nombresColumnas = {"Código", "Expiración","Observación"}; 
    private List<Muestra> muestras = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return this.muestras.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
          if(rowIndex >= 0 && rowIndex < this.muestras.size()){
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            switch(columnIndex){
                case 0: return this.muestras.get(rowIndex).getCodMuestra();
                case 1: if(this.muestras.get(rowIndex).getFechaExpiracion() != null){
                          return sdf.format(this.muestras.get(rowIndex).getFechaExpiracion().getTime());
                      }else{
                          return null;
                      }
                case 2: return this.muestras.get(rowIndex).getObservaciones();
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
    
    public List<Muestra> getMuestras() {
        return muestras;
    }
    
    public void setMuetras(List<Muestra> muestras) {
        this.muestras = muestras;
    }
    
    public Muestra getMuestra(int fila){
        if(fila >= 0 && fila < this.muestras.size()){
            return this.muestras.get(fila);
        }else{
            return null;
        }
    }
}
