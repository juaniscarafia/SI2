package laboratorio.ui.Administracion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.Nomenclador;

public class DetalleNomencladorTableModel extends AbstractTableModel{
    private final String[] nombresColumnas = {"Análisis", "ObraSocial", "Precio"};
    private List<Nomenclador> nomencladores = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return this.nomencladores.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex >= 0 && rowIndex < this.nomencladores.size()){
          switch(columnIndex){
              case 0: return this.nomencladores.get(rowIndex).getTipoAnalisis().getDescripcion();
              case 1: return this.nomencladores.get(rowIndex).getObraSocial();
              case 2: return this.nomencladores.get(rowIndex).getPrecio();
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
    
    public List<Nomenclador> getNomencladores() {
        return nomencladores;
    }
    
    public void setNomencladores(List<Nomenclador> nomencladores) {
        this.nomencladores = nomencladores;
    }
    
    public Nomenclador getNomencladores(int fila){
        if(fila >= 0 && fila < this.nomencladores.size()){
            return this.nomencladores.get(fila);
        }else{
            return null;
        }
    }        
}
