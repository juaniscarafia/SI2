package laboratorio.ui.Ingresos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import laboratorio.Entidades.Ingresos;
import laboratorio.Entidades.Pacientes;
import laboratorio.Entidades.Recetas;

public class DetalleRecetas extends AbstractTableModel{
    
    
    private final String[] nombresColumnas = {"Código de Receta", "Código de Ingreso", "Médico"};
    private List<Recetas> receta = new ArrayList<>();
    
    
    @Override
    public int getRowCount() {
        return this.receta.size();
    }

    
    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex >= 0 && rowIndex < this.receta.size()){
         
          switch(columnIndex){
              case 0: return this.receta.get(rowIndex).getCodReceta();
              case 1: return this.receta.get(rowIndex).getIngresos().getCodIngreso();
              case 2: return this.receta.get(rowIndex).getMedico().getNombreYapellido();
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
    
    public List<Recetas> getReceta() {
        return receta;
    }
    
    public void setReceta(List<Recetas> receta) {
        this.receta = receta;
    }
    

    
    public Recetas getRecetas(int fila){
        if(fila >= 0 && fila < this.receta.size()){
            return this.receta.get(fila);
        }else{
            return null;
        }
    }
}


    

