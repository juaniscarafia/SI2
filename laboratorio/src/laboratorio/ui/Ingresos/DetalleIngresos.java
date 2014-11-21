package laboratorio.ui.Ingresos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.Ingresos;
import laboratorio.Entidades.Pacientes;

public class DetalleIngresos extends AbstractTableModel{
    
    
    private final String[] nombresColumnas = {"Código", "Fecha de Ingreso", "Páciente"};
    private List<Ingresos> ingreso = new ArrayList<>();
    private List<Pacientes> pacientes;
    
    @Override
    public int getRowCount() {
        return this.ingreso.size();
    }

    
    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex >= 0 && rowIndex < this.ingreso.size()){
          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
          switch(columnIndex){
              case 0: return this.ingreso.get(rowIndex).getCodIngreso();
              
              case 1: if(this.ingreso.get(rowIndex).getFechaIngreso() != null){
                          return sdf.format(this.ingreso.get(rowIndex).getFechaIngreso().getTime());
                      }else{
                          return null;
                      }
              case 2: return this.ingreso.get(rowIndex).getIngresopacientes().getDni();
             
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
    
    public List<Ingresos> getIngreso() {
        return ingreso;
    }
    
    public void setIngreso(List<Ingresos> ingreso) {
        this.ingreso = ingreso;
    }
    
    public void setPacientes(List<Pacientes> pacientes) {
        this.pacientes = pacientes;
    }
    
    public void getPacientes(List<Pacientes> pacientes) {
        this.pacientes = pacientes;
    }
    
    public Ingresos getIngresos(int fila){
        if(fila >= 0 && fila < this.ingreso.size()){
            return this.ingreso.get(fila);
        }else{
            return null;
        }
    }
}


    

