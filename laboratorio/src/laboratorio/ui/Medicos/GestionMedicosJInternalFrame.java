package laboratorio.ui.Medicos;

import java.awt.KeyboardFocusManager;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import laboratorio.controladores.MedicosJpaController;
import laboratorio.Entidades.Medicos;
import laboratorio.ui.LaboratorioJFrame;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import laboratorio.Entidades.BusquedaMedicos;
import laboratorio.ui.listeners.SoloLetrasKeyListeners;
import laboratorio.ui.listeners.SoloNumerosKeyListener;

public class GestionMedicosJInternalFrame extends javax.swing.JInternalFrame {

    private static GestionMedicosJInternalFrame INSTANCIA = new GestionMedicosJInternalFrame();
    private DetalleMedicoTableModel tableModel;
    private BusquedaMedicos  busqueda = BusquedaMedicos.DNI;
    
    public static Medicos medicoSeleccionado = null;

    public static Medicos getMedicoSeleccionado() {
        return medicoSeleccionado;
    }
    
    
    public GestionMedicosJInternalFrame() {
        this.tableModel = new DetalleMedicoTableModel();
        this.tableModel.setMedicos(MedicosJpaController.buscarTodosOrdenados(this.busqueda));
        initComponents();
    }
    
    public static GestionMedicosJInternalFrame getInstancia() {
        return INSTANCIA;
    }
    
    private void jTable1ValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            GestionMedicosJInternalFrame.medicoSeleccionado = this.tableModel.getMedicos(this.jTable1.getSelectedRow());
            //solo habilito los botones "modificar" o "eliminar" 
            //si hay un alumno seleccionado en la lista
            if(GestionMedicosJInternalFrame.medicoSeleccionado != null){
                this.ModificarMedicojButton.setEnabled(true);
                this.EliminarMedicojButton.setEnabled(true);
            }else{
                this.ModificarMedicojButton.setEnabled(false);
                this.EliminarMedicojButton.setEnabled(false);
            }
        }
    }
    
    private void actualizarDatosJTableOrdenados(){
        this.tableModel.setMedicos(MedicosJpaController.buscarFiltradosOrdenados(this.jTextDNI.getText(),this.busqueda));
        this.tableModel.fireTableDataChanged();
    }
    
    private void actualizarDatosJTable(){
        //this.tableModel.setPacientes(PacientesJpaController.buscarTodos());
        busqueda = BusquedaMedicos.DNI;
        this.tableModel.setMedicos(MedicosJpaController.buscarFiltradosOrdenados(this.jTextDNI.getText(),this.busqueda));
        this.tableModel.fireTableDataChanged();
    }
    
     private void actualizarDatosJTableNombre(){
        //this.tableModel.setPacientes(PacientesJpaController.buscarTodos());
        busqueda = BusquedaMedicos.NOMBRE;
        this.tableModel.setMedicos(MedicosJpaController.buscarFiltradosOrdenados(this.jTextNombre.getText(),this.busqueda));
        this.tableModel.fireTableDataChanged();
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        NuevoMedicojButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ModificarMedicojButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        EliminarMedicojButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
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
        setTitle("Gestion de Médicos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        NuevoMedicojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        NuevoMedicojButton.setText("Nuevo");
        NuevoMedicojButton.setFocusable(false);
        NuevoMedicojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NuevoMedicojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevoMedicojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoMedicojButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(NuevoMedicojButton);
        jToolBar1.add(jSeparator1);

        ModificarMedicojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/modificar.png"))); // NOI18N
        ModificarMedicojButton.setText("Modificar");
        ModificarMedicojButton.setEnabled(false);
        ModificarMedicojButton.setFocusable(false);
        ModificarMedicojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ModificarMedicojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ModificarMedicojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarMedicojButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ModificarMedicojButton);
        jToolBar1.add(jSeparator2);

        EliminarMedicojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/eliminar.png"))); // NOI18N
        EliminarMedicojButton.setText("Eliminar");
        EliminarMedicojButton.setEnabled(false);
        EliminarMedicojButton.setFocusable(false);
        EliminarMedicojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        EliminarMedicojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EliminarMedicojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarMedicojButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(EliminarMedicojButton);
        jToolBar1.add(jSeparator3);
        jToolBar1.add(jSeparator4);

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

        filtroOrdenamientoJComboBox.setModel(new DefaultComboBoxModel(BusquedaMedicos.values()));
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoMedicojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoMedicojButtonActionPerformed
        NuevoMedicoJInternalFrame iFrame = NuevoMedicoJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionMedicosJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NuevoMedicojButtonActionPerformed

    private void ModificarMedicojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarMedicojButtonActionPerformed
        NuevoMedicoJInternalFrame iFrame = NuevoMedicoJInternalFrame.getInstancia();
        iFrame.setMedicoSeleccionado(GestionMedicosJInternalFrame.medicoSeleccionado);
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionMedicosJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarMedicojButtonActionPerformed

    private void EliminarMedicojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarMedicojButtonActionPerformed

      if(GestionMedicosJInternalFrame.medicoSeleccionado.getPaciente() != null && this.medicoSeleccionado.getPaciente().size() > 0){
            String msj = "El Médico seleccionado no puede eliminarse de la base de datos "
                    + "porque tiene datos de pacientes asociados.\n"
                    ;
            Object[] opciones = {"Aceptar"};
            int n = JOptionPane.showOptionDialog(this, msj, "Atención!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if(n == JOptionPane.YES_OPTION){
                this.actualizarDatosJTable();
            }
        }else{
            String msj = "Se eliminarán todos los datos del médico de la base de datos "
                    + "y no podrán recuperarse.\n"
                    + "Seguro desea continuar?";
            int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(n == JOptionPane.YES_OPTION){
                 MedicosJpaController.eliminar(GestionMedicosJInternalFrame.medicoSeleccionado);
                this.actualizarDatosJTable();
            }
        }
    }//GEN-LAST:event_EliminarMedicojButtonActionPerformed

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

    private void filtroOrdenamientoJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroOrdenamientoJComboBoxItemStateChanged
        BusquedaMedicos auxOrden = (BusquedaMedicos)filtroOrdenamientoJComboBox.getSelectedItem();
        if(auxOrden != this.busqueda){
            this.busqueda = auxOrden;
            this.actualizarDatosJTableOrdenados();
        }
    }//GEN-LAST:event_filtroOrdenamientoJComboBoxItemStateChanged

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       this.actualizarDatosJTable();
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        INSTANCIA= new GestionMedicosJInternalFrame();
    }//GEN-LAST:event_formInternalFrameClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarMedicojButton;
    private javax.swing.JButton ModificarMedicojButton;
    private javax.swing.JButton NuevoMedicojButton;
    private javax.swing.JComboBox filtroOrdenamientoJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDNI;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
