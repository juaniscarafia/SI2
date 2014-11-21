package laboratorio.ui.Medicos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.Medicos;

public class DetalleMedicoTableModel extends AbstractTableModel{
    
    private final String[] nombresColumnas = {"DNI", "Nombre y Apellido", "Domicilio", "Matricula", "Telefono"};
    private List<Medicos> medicos = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return this.medicos.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex >= 0 && rowIndex < this.medicos.size()){
          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
          switch(columnIndex){
              case 0: return this.medicos.get(rowIndex).getDni();
              case 1: return this.medicos.get(rowIndex).getNombreyApellido();
              case 2: return this.medicos.get(rowIndex).getDomicilio();
              case 3: return this.medicos.get(rowIndex).getMatricula();
              case 4: return this.medicos.get(rowIndex).getTelefono();
              
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
    
    public List<Medicos> getMedicos() {
        return medicos;
    }
    
    public void setMedicos(List<Medicos> medicos) {
        this.medicos = medicos;
    }
    
    public Medicos getMedicos(int fila){
        if(fila >= 0 && fila < this.medicos.size()){
            return this.medicos.get(fila);
        }else{
            return null;
        }
    }
}
