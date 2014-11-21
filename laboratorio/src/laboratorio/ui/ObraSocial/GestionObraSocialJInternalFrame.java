package laboratorio.ui.ObraSocial;

import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import laboratorio.Entidades.BusquedaObraSocial;
import laboratorio.Entidades.ObraSociales;
import laboratorio.controladores.ObraSocialesJpaController;
import laboratorio.ui.LaboratorioJFrame;
import laboratorio.ui.listeners.SoloLetrasKeyListeners;
import laboratorio.ui.listeners.SoloNumerosKeyListener;

public class GestionObraSocialJInternalFrame extends javax.swing.JInternalFrame {
    private static GestionObraSocialJInternalFrame INSTANCIA = new GestionObraSocialJInternalFrame();
    private DetalleObraSocialTableModel tableModel;
    private BusquedaObraSocial  busqueda = BusquedaObraSocial.CODIGO;
    private ObraSociales obrasocialSeleccionada = null;
    
    public GestionObraSocialJInternalFrame() {
        this.tableModel = new DetalleObraSocialTableModel();
        initComponents();
    }
    
    public static GestionObraSocialJInternalFrame getInstancia() {
        return INSTANCIA;
    }
    
    private void jTable1ValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            this.obrasocialSeleccionada = this.tableModel.getObraSociales(this.jTable1.getSelectedRow());
              if(this.obrasocialSeleccionada != null){
                this.ModificarObraSocialjButton.setEnabled(true);
                this.EliminarObraSocialjButton.setEnabled(true);
            }else{
                this.ModificarObraSocialjButton.setEnabled(false);
                this.EliminarObraSocialjButton.setEnabled(false);
            }
        }
    }
    
    private void actualizarDatosJTableOrdenados(){
        this.tableModel.setObraSociales(ObraSocialesJpaController.buscarFiltradosOrdenados(this.jTextCodigo.getText(),this.busqueda));
        this.tableModel.fireTableDataChanged();
    }
    
    private void actualizarDatosJTable(){
        busqueda = BusquedaObraSocial.CODIGO;
        this.tableModel.setObraSociales(ObraSocialesJpaController.buscarFiltradosOrdenados(this.jTextCodigo.getText(),this.busqueda));
        this.tableModel.fireTableDataChanged();
    }
    
    private void actualizarDatosJTableNombre(){
        busqueda = BusquedaObraSocial.NOMBRE;
        this.tableModel.setObraSociales(ObraSocialesJpaController.buscarFiltradosOrdenados(this.jTextNombre.getText(),this.busqueda));
        this.tableModel.fireTableDataChanged();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        NuevaObraSocialjButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ModificarObraSocialjButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        EliminarObraSocialjButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        filtroOrdenamientoJComboBox = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestión de Obras Sociales");
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

        NuevaObraSocialjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        NuevaObraSocialjButton.setText("Nueva");
        NuevaObraSocialjButton.setFocusable(false);
        NuevaObraSocialjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NuevaObraSocialjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevaObraSocialjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaObraSocialjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(NuevaObraSocialjButton);
        jToolBar1.add(jSeparator1);

        ModificarObraSocialjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/modificar.png"))); // NOI18N
        ModificarObraSocialjButton.setText("Modificar");
        ModificarObraSocialjButton.setEnabled(false);
        ModificarObraSocialjButton.setFocusable(false);
        ModificarObraSocialjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ModificarObraSocialjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ModificarObraSocialjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarObraSocialjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ModificarObraSocialjButton);
        jToolBar1.add(jSeparator2);

        EliminarObraSocialjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/eliminar.png"))); // NOI18N
        EliminarObraSocialjButton.setText("Eliminar");
        EliminarObraSocialjButton.setEnabled(false);
        EliminarObraSocialjButton.setFocusable(false);
        EliminarObraSocialjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        EliminarObraSocialjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EliminarObraSocialjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarObraSocialjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(EliminarObraSocialjButton);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código:");

        jTextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigoActionPerformed(evt);
            }
        });
        jTextCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextCodigoKeyReleased(evt);
            }
        });
        jTextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextNombreKeyReleased(evt);
            }
        });

        jLabel3.setText("Ordenado por:");

        filtroOrdenamientoJComboBox.setModel(new DefaultComboBoxModel(BusquedaObraSocial.values()));
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
                .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(filtroOrdenamientoJComboBox, 0, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(filtroOrdenamientoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextCodigo.addKeyListener(new SoloNumerosKeyListener());
        jTextNombre.addKeyListener(new SoloLetrasKeyListeners());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setModel(this.tableModel);
        jScrollPane1.setViewportView(jTable1);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent evt) {
                jTable1ValueChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        this.EliminarObraSocialjButton.setEnabled(false);
        this.ModificarObraSocialjButton.setEnabled(false);
        this.actualizarDatosJTable();
    }//GEN-LAST:event_formInternalFrameActivated

    private void jTextCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCodigoKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
            manager.focusNextComponent();
        }
        if(evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_DELETE
            && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_RIGHT){
            this.jTextCodigo.setText(((JTextField)evt.getSource()).getText().toUpperCase());
        }
        this.actualizarDatosJTable();
    }//GEN-LAST:event_jTextCodigoKeyReleased

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
        BusquedaObraSocial auxOrden = (BusquedaObraSocial)filtroOrdenamientoJComboBox.getSelectedItem();
        if(auxOrden != this.busqueda){
            this.busqueda = auxOrden;
            this.actualizarDatosJTableOrdenados();
        }
    }//GEN-LAST:event_filtroOrdenamientoJComboBoxItemStateChanged

    private void jTextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigoActionPerformed

    private void NuevaObraSocialjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaObraSocialjButtonActionPerformed
        NuevaObraSocialJInternalFrame iFrame = NuevaObraSocialJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionObraSocialJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NuevaObraSocialjButtonActionPerformed

    private void ModificarObraSocialjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarObraSocialjButtonActionPerformed
        NuevaObraSocialJInternalFrame iFrame = NuevaObraSocialJInternalFrame.getInstancia();
        iFrame.setObraSocialSeleccionada(this.obrasocialSeleccionada);
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionObraSocialJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarObraSocialjButtonActionPerformed

    private void EliminarObraSocialjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarObraSocialjButtonActionPerformed
         if(this.obrasocialSeleccionada.getPaciente() != null && this.obrasocialSeleccionada.getPaciente().size() > 0){
            String msj = "La obra seleccionado no puede eliminarse de la base de datos "
                        + "porque tiene datos de pacientes y médicos asociados.\n"
                        ;
            Object[] opciones = {"Aceptar"};
            int n = JOptionPane.showOptionDialog(this, msj, "Atención!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if(n == JOptionPane.YES_OPTION){
                this.actualizarDatosJTable();
            }
        }else{
            String msj = "Se eliminarán todos los datos de la obra social de la base de datos "
                          + "y no podrán recuperarse.\n"
                           + "Seguro desea continuar?";
            int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(n == JOptionPane.YES_OPTION){
                 ObraSocialesJpaController.eliminar(this.obrasocialSeleccionada);
                this.actualizarDatosJTable();
            }
        }
    }//GEN-LAST:event_EliminarObraSocialjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarObraSocialjButton;
    private javax.swing.JButton ModificarObraSocialjButton;
    private javax.swing.JButton NuevaObraSocialjButton;
    private javax.swing.JComboBox filtroOrdenamientoJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
