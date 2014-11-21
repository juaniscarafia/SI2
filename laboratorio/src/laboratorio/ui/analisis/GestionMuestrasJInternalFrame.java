package laboratorio.ui.analisis;

import java.awt.KeyboardFocusManager;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import laboratorio.ui.LaboratorioJFrame;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import laboratorio.Entidades.BusquedMuestra;
import laboratorio.Entidades.Muestra;
import laboratorio.controladores.MuestraJpsController;
import laboratorio.ui.listeners.SoloNumerosKeyListener;

public class GestionMuestrasJInternalFrame extends javax.swing.JInternalFrame {
    private static GestionMuestrasJInternalFrame INSTANCIA = new GestionMuestrasJInternalFrame();
    private DetalleMuetrasTableModel tableModel= new DetalleMuetrasTableModel() ;
    private BusquedMuestra  busqueda = BusquedMuestra.CODIGO;
    
    public static Muestra muestraSeleccionado = null;    
    
    public GestionMuestrasJInternalFrame() {
        this.tableModel= new DetalleMuetrasTableModel();
        initComponents();
    }

    public static GestionMuestrasJInternalFrame getInstancia() {
        return INSTANCIA;
    }    
    
    private void jTableMuestrasValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            GestionMuestrasJInternalFrame.muestraSeleccionado = this.tableModel.getMuestra(this.jTableMuestras.getSelectedRow());
           
            if(GestionMuestrasJInternalFrame.muestraSeleccionado != null){
                this.ModificarMedicojButton.setEnabled(true);
                this.EliminarMedicojButton.setEnabled(true);
            }else{
                this.ModificarMedicojButton.setEnabled(false);
                this.EliminarMedicojButton.setEnabled(false);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextDNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        filtroOrdenamientoJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMuestras = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        NuevoMedicojButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ModificarMedicojButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        EliminarMedicojButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();

        setClosable(true);
        setTitle("Gestión Muestras");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
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

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Codigo:");

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

        jLabel2.setText("Ordenado por:");

        filtroOrdenamientoJComboBox.setModel(new DefaultComboBoxModel(BusquedMuestra.values()));
        filtroOrdenamientoJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroOrdenamientoJComboBoxItemStateChanged(evt);
            }
        });

        jTableMuestras.setModel(this.tableModel);
        jScrollPane1.setViewportView(jTableMuestras);
        jTableMuestras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTableMuestras.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent evt) {
                jTableMuestrasValueChanged(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroOrdenamientoJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(288, 288, 288))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                        .addComponent(jLabel1)
                        .addComponent(jTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        this.actualizarDatosJTableMuestras();
    }//GEN-LAST:event_jTextDNIKeyReleased

    private void filtroOrdenamientoJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroOrdenamientoJComboBoxItemStateChanged
        BusquedMuestra auxOrden = (BusquedMuestra)filtroOrdenamientoJComboBox.getSelectedItem();
        if(auxOrden != this.busqueda){
            this.busqueda = auxOrden;
            this.actualizarDatosJTableOrdenados();
        }
    }//GEN-LAST:event_filtroOrdenamientoJComboBoxItemStateChanged

    private void actualizarDatosJTableOrdenados(){
        this.tableModel.setMuetras((List<Muestra>) MuestraJpsController.buscarPorCodigo(Integer.parseInt(this.jTextDNI.getText())));
        this.tableModel.fireTableDataChanged();
    }
    
    private void NuevoMedicojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoMedicojButtonActionPerformed
        NuevaMuestraJInternalFrame iFrame = NuevaMuestraJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionMuestrasJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NuevoMedicojButtonActionPerformed

    private void ModificarMedicojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarMedicojButtonActionPerformed
        NuevaMuestraJInternalFrame iFrame = NuevaMuestraJInternalFrame.getInstancia();
        iFrame.setMuestra(GestionMuestrasJInternalFrame.muestraSeleccionado);
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionMuestrasJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarMedicojButtonActionPerformed

    private void EliminarMedicojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarMedicojButtonActionPerformed

        if(GestionMuestrasJInternalFrame.muestraSeleccionado.getAnalisis() != null && this.muestraSeleccionado.getAnalisis().size() > 0){
            String msj = "La Muestra seleccionado no puede eliminarse de la base de datos "
            + "porque tiene datos de analisis asociados.\n"
            ;
            Object[] opciones = {"Aceptar"};
            int n = JOptionPane.showOptionDialog(this, msj, "Atención!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if(n == JOptionPane.YES_OPTION){
                this.actualizarDatosJTableMuestras();
            }
        }else{
            String msj = "Se eliminarán todos los datos del médico de la base de datos "
            + "y no podrán recuperarse.\n"
            + "Seguro desea continuar?";
            int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(n == JOptionPane.YES_OPTION){
                MuestraJpsController.eliminar(GestionMuestrasJInternalFrame.muestraSeleccionado);
                this.actualizarDatosJTableMuestras();
            }
        }
    }//GEN-LAST:event_EliminarMedicojButtonActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        this.actualizarDatosJTableMuestras();
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        INSTANCIA= new GestionMuestrasJInternalFrame();
    }//GEN-LAST:event_formInternalFrameClosed

private void actualizarDatosJTableMuestras() {
        this.tableModel.setMuetras(MuestraJpsController.buscarTodos());
        this.tableModel.fireTableDataChanged();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarMedicojButton;
    private javax.swing.JButton ModificarMedicojButton;
    private javax.swing.JButton NuevoMedicojButton;
    private javax.swing.JComboBox filtroOrdenamientoJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTable jTableMuestras;
    private javax.swing.JTextField jTextDNI;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    
}
