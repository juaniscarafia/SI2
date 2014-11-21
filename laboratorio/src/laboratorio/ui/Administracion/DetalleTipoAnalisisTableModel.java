package laboratorio.ui.Administracion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.TipoAnalisis;

public class DetalleTipoAnalisisTableModel extends AbstractTableModel{
    private final String[] nombresColumnas = {"Código", "Descripción"};
    private List<TipoAnalisis> tipoAnalisis = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return this.tipoAnalisis.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex >= 0 && rowIndex < this.tipoAnalisis.size()){
          switch(columnIndex){
              case 0: return this.tipoAnalisis.get(rowIndex).getCodTipoAnalisis();
              case 1: return this.tipoAnalisis.get(rowIndex).getDescripcion();
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
    
    public List<TipoAnalisis> getTipoAnslisis() {
        return tipoAnalisis;
    }
    
    public void setTipoAnalisis(List<TipoAnalisis> tipoAnalisis) {
        this.tipoAnalisis = tipoAnalisis;
    }
    
    public TipoAnalisis getTipoAnalisis(int fila){
        if(fila >= 0 && fila < this.tipoAnalisis.size()){
            return this.tipoAnalisis.get(fila);
        }else{
            return null;
        }
    }        
}


