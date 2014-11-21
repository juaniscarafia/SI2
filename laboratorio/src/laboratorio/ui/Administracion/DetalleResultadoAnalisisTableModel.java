package laboratorio.ui.Administracion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.TipoAnalisis;
import laboratorio.Entidades.TipoResultados;

public class DetalleResultadoAnalisisTableModel  extends AbstractTableModel{
    private final String[] nombresColumnas = {"Código", "Descripción","ValorMin","ValorMax"};
    private List<TipoResultados> tiposResultados = new ArrayList();
    
    @Override
    public int getRowCount() {
        return this.tiposResultados.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex >= 0 && rowIndex < this.tiposResultados.size()){
          switch(columnIndex){
              case 0: return this.tiposResultados.get(rowIndex).getCodTipoResultados();
              case 1: return this.tiposResultados.get(rowIndex).getDescripcion();
              case 2: return this.tiposResultados.get(rowIndex).getValorMin();
              case 3: return this.tiposResultados.get(rowIndex).getValorMax();    
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
        return tiposResultados;
    }

    public void setTiposResultados(List<TipoResultados> tiposResultados) {
        this.tiposResultados = tiposResultados;
    }
    
    
    
//    public void addTipoResultados(List<TipoResultados> tipoResultados) {
//        TipoResultados tipoResultado = new TipoResultados();
//        for (int i = 0; i <= tipoResultados.size(); i++){
//            tipoResultado = tipoResultados.get(i);
//            tiposResultados.add(tipoResultado);
//        }
//    }
//    
    public TipoResultados getTipoResultados(int fila){
        if(fila >= 0 && fila < this.tiposResultados.size()){
            return this.tiposResultados.get(fila);
        }else{
            return null;
        }
    }
}
