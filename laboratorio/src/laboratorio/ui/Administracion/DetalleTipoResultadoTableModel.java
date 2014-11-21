package laboratorio.ui.Administracion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.TipoResultados;

public class DetalleTipoResultadoTableModel extends AbstractTableModel{
    private final String[] nombresColumnas = {"Código", "Descripción"};
    private List<TipoResultados> tipoResultados = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return this.tipoResultados.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex >= 0 && rowIndex < this.tipoResultados.size()){
          switch(columnIndex){
              case 0: return this.tipoResultados.get(rowIndex).getCodTipoResultados();
              case 1: return this.tipoResultados.get(rowIndex).getDescripcion();
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
    
    public List<TipoResultados> getTipoResultados() {
        return tipoResultados;
    }
    
    public void setTipoResultados(List<TipoResultados> tipoResultados) {
        this.tipoResultados = tipoResultados;
    }
    
    public TipoResultados getTipoResultados(int fila){
        if(fila >= 0 && fila < this.tipoResultados.size()){
            return this.tipoResultados.get(fila);
        }else{
            return null;
        }
    }        
}

