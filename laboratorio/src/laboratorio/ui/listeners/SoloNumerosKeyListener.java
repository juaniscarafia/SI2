package laboratorio.ui.listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 * Este listener me asegura que en cualquier campo de texto donde se requiera
 * un DNI solo se podrán ingresar números
 * @author srod
 */
public class SoloNumerosKeyListener extends KeyAdapter{
    
    private int cantMaxCaracteresCodigoProducto = 8;

    @Override
    public void keyTyped(java.awt.event.KeyEvent evt) {
        if((evt.getKeyChar()<'0' || evt.getKeyChar()>'9')
            &&(evt.getKeyChar() != KeyEvent.VK_BACK_SPACE)
            &&(evt.getKeyChar() != '-')){
            evt.consume();
            return;
        }
        if(((JTextField)evt.getSource()).getText().length() >= this.cantMaxCaracteresCodigoProducto){
            evt.consume();
        }
    }
    
}