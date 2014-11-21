package laboratorio.ui.Administracion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.Bioquimicos;

public class DetalleBioquimicoTableModel extends AbstractTableModel{

    private final String[] nombresColumnas = {"DNI", "Nombre y Apellido", "Domicilio", "Telefono", "Matrícula", "Email"};
    private List<Bioquimicos> bioquimicos = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return this.bioquimicos.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex >= 0 && rowIndex < this.bioquimicos.size()){
          switch(columnIndex){
              case 0: return this.bioquimicos.get(rowIndex).getDni();
              case 1: return this.bioquimicos.get(rowIndex).getNombreyApellido();
              case 2: return this.bioquimicos.get(rowIndex).getDomicilio();
              case 3: return this.bioquimicos.get(rowIndex).getTelefono();
              case 4: return this.bioquimicos.get(rowIndex).getMatricula();
              case 5: return this.bioquimicos.get(rowIndex).getEmail();
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
    
    public List<Bioquimicos> getBioquimicos() {
        return bioquimicos;
    }
    
    public void setBioquimicos(List<Bioquimicos> bioquimicos) {
        this.bioquimicos = bioquimicos;
    }
    
    public Bioquimicos getBioquimicos(int fila){
        if(fila >= 0 && fila < this.bioquimicos.size()){
            return this.bioquimicos.get(fila);
        }else{
            return null;
        }
    }    
}
