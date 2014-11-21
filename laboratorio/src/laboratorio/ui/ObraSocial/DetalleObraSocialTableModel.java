package laboratorio.ui.ObraSocial;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.ObraSociales;

public class DetalleObraSocialTableModel extends AbstractTableModel{
    private final String[] nombresColumnas = {"Codigo", "Nombre", "Descripción", "Domicilio", "Telefono", "Email"};
    private List<ObraSociales> obrasocial = new ArrayList<>();

    @Override
    public int getRowCount() {
        return this.obrasocial.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex >= 0 && rowIndex < this.obrasocial.size()){
            switch(columnIndex){
                case 0: return this.obrasocial.get(rowIndex).getCodObraSocial();
                case 1: return this.obrasocial.get(rowIndex).getNombre();
                case 2: return this.obrasocial.get(rowIndex).getDescripcion();
                case 3: return this.obrasocial.get(rowIndex).getDomicilio();
                case 4: return this.obrasocial.get(rowIndex).getTelefono();
                case 5: return this.obrasocial.get(rowIndex).getEmail();
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
    
    public List<ObraSociales> getObraSociales() {
        return obrasocial;
    }
    
    public void setObraSociales(List<ObraSociales> obrasocial) {
        this.obrasocial = obrasocial;
    }
    
    public ObraSociales getObraSociales(int fila){
        if(fila >= 0 && fila < this.obrasocial.size()){
            return this.obrasocial.get(fila);
        }else{
            return null;
        }
    }
}
