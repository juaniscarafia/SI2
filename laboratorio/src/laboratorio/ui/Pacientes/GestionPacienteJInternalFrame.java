package laboratorio.ui.Pacientes;

import java.awt.KeyboardFocusManager;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import laboratorio.controladores.PacientesJpaController;
import laboratorio.Entidades.Pacientes;
import laboratorio.ui.LaboratorioJFrame;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import laboratorio.Entidades.BusquedaPacientes;
import laboratorio.Entidades.Medicos;
import laboratorio.ui.listeners.SoloLetrasKeyListeners;
import laboratorio.ui.listeners.SoloNumerosKeyListener;

public class GestionPacienteJInternalFrame extends javax.swing.JInternalFrame {
    private static GestionPacienteJInternalFrame INSTANCIA = new GestionPacienteJInternalFrame();
    private DetallePacientesTableModel tableModel;
    private BusquedaPacientes  busqueda = BusquedaPacientes.DNI;
    private Pacientes pacienteSeleccionado = null;
    private Medicos medicos =new Medicos();

    public GestionPacienteJInternalFrame() {
        this.tableModel = new DetallePacientesTableModel();
        this.tableModel.setPacientes(PacientesJpaController.buscarTodosOrdenados(this.busqueda));
        initComponents();
    }
    
    public static GestionPacienteJInternalFrame getInstancia() {
        return INSTANCIA;
    }
    
    private void jTable1ValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            this.pacienteSeleccionado = this.tableModel.getPacientes(this.jTable1.getSelectedRow());
            //solo habilito los botones "modificar" o "eliminar" 
            //si hay un alumno seleccionado en la lista
            if(this.pacienteSeleccionado != null){
                this.ModificarPacientejButton.setEnabled(true);
                this.EliminarPacientejButton.setEnabled(true);
            }else{
                this.ModificarPacientejButton.setEnabled(false);
                this.EliminarPacientejButton.setEnabled(false);
            }
        }
    }
    
    private void actualizarDatosJTableOrdenados(){
        this.tableModel.setPacientes(PacientesJpaController.buscarFiltradosOrdenados(this.jTextDNI.getText(),this.busqueda));
        this.tableModel.fireTableDataChanged();
    }
    
    private void actualizarDatosJTable(){
        busqueda = BusquedaPacientes.DNI;
        this.tableModel.setPacientes(PacientesJpaController.buscarFiltradosOrdenados(this.jTextDNI.getText(),this.busqueda));
        this.tableModel.fireTableDataChanged();
    }
    
     private void actualizarDatosJTableNombre(){
        busqueda = BusquedaPacientes.NOMBRE;
        this.tableModel.setPacientes(PacientesJpaController.buscarFiltradosOrdenados(this.jTextNombre.getText(),this.busqueda));
        this.tableModel.fireTableDataChanged();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        NuevoPacientejButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ModificarPacientejButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        EliminarPacientejButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextDNI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        filtroOrdenamientoJComboBox = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestión de Pacientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/UserSetup.png"))); // NOI18N
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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        NuevoPacientejButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        NuevoPacientejButton.setText("Nuevo");
        NuevoPacientejButton.setFocusable(false);
        NuevoPacientejButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NuevoPacientejButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevoPacientejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoPacientejButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(NuevoPacientejButton);
        jToolBar1.add(jSeparator1);

        ModificarPacientejButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/modificar.png"))); // NOI18N
        ModificarPacientejButton.setText("Modificar");
        ModificarPacientejButton.setEnabled(false);
        ModificarPacientejButton.setFocusable(false);
        ModificarPacientejButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ModificarPacientejButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ModificarPacientejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPacientejButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ModificarPacientejButton);
        jToolBar1.add(jSeparator2);

        EliminarPacientejButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/eliminar.png"))); // NOI18N
        EliminarPacientejButton.setText("Eliminar");
        EliminarPacientejButton.setEnabled(false);
        EliminarPacientejButton.setFocusable(false);
        EliminarPacientejButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        EliminarPacientejButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EliminarPacientejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPacientejButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(EliminarPacientejButton);

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

        filtroOrdenamientoJComboBox.setModel(new DefaultComboBoxModel(BusquedaPacientes.values()));
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
                .addComponent(filtroOrdenamientoJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoPacientejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoPacientejButtonActionPerformed
        NuevoPacienteJInternalFrame iFrame = NuevoPacienteJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionPacienteJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NuevoPacientejButtonActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        this.actualizarDatosJTable();
    }//GEN-LAST:event_formInternalFrameActivated

    private void EliminarPacientejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPacientejButtonActionPerformed
         if(this.pacienteSeleccionado.getIngreso()!= null && this.pacienteSeleccionado.getIngreso().size() >0){
            String msj = "El paciente seleccionado no puede eliminarse de la base de datos "
                    + "porque tiene datos de ingresos asociados.\n"
                    ;
            Object[] opciones = {"Aceptar"};
            int n = JOptionPane.showOptionDialog(this, msj, "Atención!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if(n == JOptionPane.YES_OPTION){
                this.actualizarDatosJTable();
            }
        }else{
          String msj = "Se eliminarán todos los datos del paciente de la base de datos "
                + "y no podrán recuperarse.\n"
                + "Seguro desea continuar?";
        int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n == JOptionPane.YES_OPTION){
            medicos=this.pacienteSeleccionado.getMedicoCabecera();
            medicos.getPacientes().remove(this.pacienteSeleccionado);
            PacientesJpaController.eliminar(this.pacienteSeleccionado);
            this.actualizarDatosJTable();
            }
        }
       
        
    }//GEN-LAST:event_EliminarPacientejButtonActionPerformed

    private void ModificarPacientejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPacientejButtonActionPerformed
        NuevoPacienteJInternalFrame iFrame = NuevoPacienteJInternalFrame.getInstancia();
        iFrame.setPacienteSeleccionado(this.pacienteSeleccionado);
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionPacienteJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarPacientejButtonActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void filtroOrdenamientoJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroOrdenamientoJComboBoxItemStateChanged
        BusquedaPacientes auxOrden = (BusquedaPacientes)filtroOrdenamientoJComboBox.getSelectedItem();
        if(auxOrden != this.busqueda){
            this.busqueda = auxOrden;
            this.actualizarDatosJTableOrdenados();
        }
    }//GEN-LAST:event_filtroOrdenamientoJComboBoxItemStateChanged

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

    private void jTextDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDNIActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
    
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyReleased
        // TODO add your handling code here: 
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarPacientejButton;
    private javax.swing.JButton ModificarPacientejButton;
    private javax.swing.JButton NuevoPacientejButton;
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
    private javax.swing.JTextField jTextDNI;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
