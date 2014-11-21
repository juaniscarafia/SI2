package laboratorio.ui.listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;


public class SoloLetrasKeyListeners extends KeyAdapter{
    private int cantMaxCaracteresCodigoProducto = 30;

    @Override
    public void keyTyped(java.awt.event.KeyEvent evt) {
        if(((evt.getKeyChar()<'a' || evt.getKeyChar()>'z')&& (evt.getKeyChar()<'A' || evt.getKeyChar()>'Z') &&(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE))
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
