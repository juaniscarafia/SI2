package laboratorio.ui.Pacientes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.Pacientes;

public class DetallePacientesTableModel extends AbstractTableModel{
    
    private final String[] nombresColumnas = {"DNI", "Nombre y Apellido", "Domicilio", "Fecha Nacimiento", "Telefono", "Medico Cabecera", "Obra Social"};
    private List<Pacientes> pacientes = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return this.pacientes.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex >= 0 && rowIndex < this.pacientes.size()){
          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
          switch(columnIndex){
              case 0: return this.pacientes.get(rowIndex).getDni();
              case 1: return this.pacientes.get(rowIndex).getNombreyApellido();
              case 2: return this.pacientes.get(rowIndex).getDomicilio();
              case 3: if(this.pacientes.get(rowIndex).getFechaNacimiento() != null){
                          return sdf.format(this.pacientes.get(rowIndex).getFechaNacimiento().getTime());
                      }else{
                          return null;
                      }
              case 4: return this.pacientes.get(rowIndex).getTelefono();
              case 5: return this.pacientes.get(rowIndex).getMedicoCabecera();
              case 6: return this.pacientes.get(rowIndex).getObrasocial();
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
    
    public List<Pacientes> getPacientes() {
        return pacientes;
    }
    
    public void setPacientes(List<Pacientes> pacientes) {
        this.pacientes = pacientes;
    }
    
    public Pacientes getPacientes(int fila){
        if(fila >= 0 && fila < this.pacientes.size()){
            return this.pacientes.get(fila);
        }else{
            return null;
        }
    }
}
