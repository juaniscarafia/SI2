package laboratorio.ui.Medicos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.Medicos;
import laboratorio.Entidades.ObraSociales;

public class DetalleOSMedicoTableModel extends AbstractTableModel{
    private final String[] nombresColumnas = {"Codigo", "Descripcion","Tefono"};
    private List<ObraSociales> obrasSociales = new ArrayList();
    
    @Override
    public int getRowCount() {
        return this.obrasSociales.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex >= 0 && rowIndex < this.obrasSociales.size()){
          switch(columnIndex){
              case 0: return this.obrasSociales.get(rowIndex).getCodObraSocial();
              case 1: return this.obrasSociales.get(rowIndex).getDescripcion();
              case 2: return this.obrasSociales.get(rowIndex).getTelefono();
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
    
    public List<ObraSociales> getObrasSociales() {
        return obrasSociales;
    }
    
    public void setObrasSociales(Medicos medico) {
        this.obrasSociales = medico.getObrasSociales();
    }
    
    public ObraSociales getObraSocial(int fila){
        if(fila >= 0 && fila < this.obrasSociales.size()){
            return this.obrasSociales.get(fila);
        }else{
            return null;
        }
    }
}
