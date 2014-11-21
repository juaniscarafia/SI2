package laboratorio.ui.Administracion;

import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import laboratorio.controladores.BioquimicosJpaController;
import laboratorio.Entidades.Bioquimicos;
import laboratorio.ui.LaboratorioJFrame;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import laboratorio.Entidades.BusquedaBioquimico;
import laboratorio.ui.listeners.SoloLetrasKeyListeners;
import laboratorio.ui.listeners.SoloNumerosKeyListener;

public class bioquimicoJInternalFrame extends javax.swing.JInternalFrame {

    private static bioquimicoJInternalFrame INSTANCIA = new bioquimicoJInternalFrame();
    private DetalleBioquimicoTableModel tableModel;
    private BusquedaBioquimico  busqueda = BusquedaBioquimico.DNI;
    
    private Bioquimicos bioquimicoSeleccionado = null;
    
    public bioquimicoJInternalFrame() {
        this.tableModel = new DetalleBioquimicoTableModel();
        this.tableModel.setBioquimicos(BioquimicosJpaController.buscarTodosOrdenados(this.busqueda));
        initComponents();
    }
    public static bioquimicoJInternalFrame getInstancia() {
        return INSTANCIA;
    }
    
    private void jTable1ValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            this.bioquimicoSeleccionado = this.tableModel.getBioquimicos(this.jTable1.getSelectedRow());
    
            if(this.bioquimicoSeleccionado != null){
                this.ModificarBioquimicojButton.setEnabled(true);
                this.EliminarBioquimicojButton.setEnabled(true);
            }else{
                this.ModificarBioquimicojButton.setEnabled(false);
                this.EliminarBioquimicojButton.setEnabled(false);
            }
        }
    }
    
    private void actualizarDatosJTableOrdenados(){
        this.tableModel.setBioquimicos(BioquimicosJpaController.buscarFiltradosOrdenados(this.jTextDNI.getText(),this.busqueda));
        this.tableModel.fireTableDataChanged();
    }
    
    private void actualizarDatosJTable(){
      
        busqueda = BusquedaBioquimico.DNI;
        this.tableModel.setBioquimicos(BioquimicosJpaController.buscarFiltradosOrdenados(this.jTextDNI.getText(),this.busqueda));
        this.tableModel.fireTableDataChanged();
    }
    
     private void actualizarDatosJTableNombre(){
        
        busqueda = BusquedaBioquimico.NOMBRE;
        this.tableModel.setBioquimicos(BioquimicosJpaController.buscarFiltradosOrdenados(this.jTextNombre.getText(),this.busqueda));
        this.tableModel.fireTableDataChanged();
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        NuevoBioquimicojButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ModificarBioquimicojButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        EliminarBioquimicojButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextDNI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        filtroOrdenamientoJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestión de Bioquímicos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        NuevoBioquimicojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        NuevoBioquimicojButton.setText("Nuevo");
        NuevoBioquimicojButton.setFocusable(false);
        NuevoBioquimicojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NuevoBioquimicojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevoBioquimicojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoBioquimicojButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(NuevoBioquimicojButton);
        jToolBar1.add(jSeparator1);

        ModificarBioquimicojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/modificar.png"))); // NOI18N
        ModificarBioquimicojButton.setText("Modificar");
        ModificarBioquimicojButton.setEnabled(false);
        ModificarBioquimicojButton.setFocusable(false);
        ModificarBioquimicojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ModificarBioquimicojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ModificarBioquimicojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBioquimicojButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ModificarBioquimicojButton);
        jToolBar1.add(jSeparator2);

        EliminarBioquimicojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/eliminar.png"))); // NOI18N
        EliminarBioquimicojButton.setText("Eliminar");
        EliminarBioquimicojButton.setEnabled(false);
        EliminarBioquimicojButton.setFocusable(false);
        EliminarBioquimicojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        EliminarBioquimicojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EliminarBioquimicojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBioquimicojButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(EliminarBioquimicojButton);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("DNI:");

        jTextDNI.addKeyListener(new SoloNumerosKeyListener());
        jTextDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDNIActionPerformed(evt);
            }
        });
        jTextDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextDNIKeyReleased(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jTextNombre.addKeyListener(new SoloLetrasKeyListeners());
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextNombreKeyReleased(evt);
            }
        });

        jLabel2.setText("Ordenado por:");

        filtroOrdenamientoJComboBox.setModel(new DefaultComboBoxModel(BusquedaBioquimico.values()));
        filtroOrdenamientoJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroOrdenamientoJComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroOrdenamientoJComboBox, 0, 1, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(filtroOrdenamientoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(this.tableModel);
        jScrollPane1.setViewportView(jTable1);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent evt) {
                jTable1ValueChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoBioquimicojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoBioquimicojButtonActionPerformed
        NuevoBioquimicoJInternalFrame iFrame = NuevoBioquimicoJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(bioquimicoJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NuevoBioquimicojButtonActionPerformed

    private void ModificarBioquimicojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBioquimicojButtonActionPerformed
        NuevoBioquimicoJInternalFrame iFrame = NuevoBioquimicoJInternalFrame.getInstancia();
        iFrame.setBioquimicoSeleccionado(this.bioquimicoSeleccionado);
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(bioquimicoJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarBioquimicojButtonActionPerformed

    private void EliminarBioquimicojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBioquimicojButtonActionPerformed

         if(this.bioquimicoSeleccionado.getAnalisis()!= null && this.bioquimicoSeleccionado.getAnalisis().size() >0){
            String msj = "El bioquímico seleccionado no puede eliminarse de la base de datos "
                    + "porque tiene datos de análisis asociados.\n"
                    ;
            Object[] opciones = {"Aceptar"};
            int n = JOptionPane.showOptionDialog(this, msj, "Atención!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if(n == JOptionPane.YES_OPTION){
               this.actualizarDatosJTable();
            }
        }else{
          String msj = "Se eliminarán todos los datos del bioquímicos de la base de datos "
                + "y no podrán recuperarse.\n"
                + "Seguro desea continuar?";
        int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n == JOptionPane.YES_OPTION){
             BioquimicosJpaController.eliminar(this.bioquimicoSeleccionado);
             this.actualizarDatosJTable();
            }
        }
       
    }//GEN-LAST:event_EliminarBioquimicojButtonActionPerformed

    private void jTextDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDNIActionPerformed

    private void jTextDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDNIKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
            manager.focusNextComponent();
        }
        if(evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_DELETE
            && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_RIGHT){
            this.jTextDNI.setText(((JTextField)evt.getSource()).getText().toUpperCase());
        }
        this.actualizarDatosJTable();
    }//GEN-LAST:event_jTextDNIKeyReleased

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed

    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
            manager.focusNextComponent();
        }
        if(evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_DELETE
            && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_RIGHT){
            this.jTextNombre.setText(((JTextField)evt.getSource()).getText());
        }
        this.actualizarDatosJTableNombre();
    }//GEN-LAST:event_jTextNombreKeyReleased

    private void filtroOrdenamientoJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroOrdenamientoJComboBoxItemStateChanged
        BusquedaBioquimico auxOrden = (BusquedaBioquimico)filtroOrdenamientoJComboBox.getSelectedItem();
        if(auxOrden != this.busqueda){
            this.busqueda = auxOrden;
            this.actualizarDatosJTableOrdenados();
        }
    }//GEN-LAST:event_filtroOrdenamientoJComboBoxItemStateChanged

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        this.actualizarDatosJTable();
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarBioquimicojButton;
    private javax.swing.JButton ModificarBioquimicojButton;
    private javax.swing.JButton NuevoBioquimicojButton;
    private javax.swing.JComboBox filtroOrdenamientoJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDNI;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
