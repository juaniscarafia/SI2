package laboratorio.ui.Administracion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.TipoMuestra;

public class DetalleTipoMuestraTableModel extends AbstractTableModel{
    private final String[] nombresColumnas = {"Código", "Descripción"};
    private List<TipoMuestra> tipoMuestra = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return this.tipoMuestra.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex >= 0 && rowIndex < this.tipoMuestra.size()){
          switch(columnIndex){
              case 0: return this.tipoMuestra.get(rowIndex).getCodTipoMuestra();
              case 1: return this.tipoMuestra.get(rowIndex).getDescripcion();
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
    
    public List<TipoMuestra> getTipoMuestra() {
        return tipoMuestra;
    }
    
    public void setTipoMuestra(List<TipoMuestra> tipoMuestra) {
        this.tipoMuestra = tipoMuestra;
    }
    
    public TipoMuestra getTipoMuestra(int fila){
        if(fila >= 0 && fila < this.tipoMuestra.size()){
            return this.tipoMuestra.get(fila);
        }else{
            return null;
        }
    }        
}

