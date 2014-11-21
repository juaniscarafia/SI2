package laboratorio.ui.Ingresos;

import java.beans.PropertyVetoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import laboratorio.controladores.PacientesJpaController;
import laboratorio.Entidades.Pacientes;
import laboratorio.ui.LaboratorioJFrame;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import laboratorio.Entidades.BusquedaIngresos;
import laboratorio.Entidades.Ingresos;
import laboratorio.Entidades.Recetas;
import laboratorio.controladores.IngresosJpaController;
import laboratorio.controladores.RecetasJpaController;



public class GestionIngresosJInternalFrame extends javax.swing.JInternalFrame {
    private static GestionIngresosJInternalFrame INSTANCIA = new GestionIngresosJInternalFrame();
    private DetalleIngresos tableModel;
    private BusquedaIngresos  busqueda = BusquedaIngresos.Codigo;

    
    public static Ingresos ingresoSeleccionado = null;

    public static Ingresos getIngresoSeleccionado() {
        return ingresoSeleccionado;
    }
    
    
   
    public GestionIngresosJInternalFrame() {
        this.tableModel = new DetalleIngresos();
        this.tableModel.setIngreso(IngresosJpaController.buscarTodosOrdenados(busqueda));
        
        initComponents();
    }
    
    public static GestionIngresosJInternalFrame getInstancia() {
        return INSTANCIA;
    }
    
    private void jTable1ValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            GestionIngresosJInternalFrame.ingresoSeleccionado = this.tableModel.getIngresos(this.jTable1.getSelectedRow());
            //solo habilito los botones "modificar" o "eliminar" 
            //si hay un alumno seleccionado en la lista
            if(GestionIngresosJInternalFrame.ingresoSeleccionado== null){
                this.ModificarIngresojButton.setEnabled(false);
                this.EliminarIngresojButton.setEnabled(false);
                this.jRecetas.setEnabled(false);
                this.jToggleButton1.setEnabled(false);
            }else{
                this.ModificarIngresojButton.setEnabled(true);
                this.EliminarIngresojButton.setEnabled(true);
                this.jRecetas.setEnabled(true);
                this.jToggleButton1.setEnabled(true);
                
            }
        }
    }
    
    private void actualizarDatosJTableOrdenados(){
        this.tableModel.setIngreso(IngresosJpaController.buscarTodosOrdenados(this.busqueda));
        this.tableModel.fireTableDataChanged();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        NuevoIngresojButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ModificarIngresojButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        EliminarIngresojButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jRecetas = new javax.swing.JToggleButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filtroOrdenamientoJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jComboPacientes = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestión de Ingresos");
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

        NuevoIngresojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        NuevoIngresojButton.setText("Nuevo");
        NuevoIngresojButton.setFocusable(false);
        NuevoIngresojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NuevoIngresojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevoIngresojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoIngresojButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(NuevoIngresojButton);
        jToolBar1.add(jSeparator1);

        ModificarIngresojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/modificar.png"))); // NOI18N
        ModificarIngresojButton.setText("Modificar");
        ModificarIngresojButton.setEnabled(false);
        ModificarIngresojButton.setFocusable(false);
        ModificarIngresojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ModificarIngresojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ModificarIngresojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarIngresojButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ModificarIngresojButton);
        jToolBar1.add(jSeparator2);

        EliminarIngresojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/eliminar.png"))); // NOI18N
        EliminarIngresojButton.setText("Eliminar");
        EliminarIngresojButton.setEnabled(false);
        EliminarIngresojButton.setFocusable(false);
        EliminarIngresojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        EliminarIngresojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EliminarIngresojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarIngresojButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(EliminarIngresojButton);
        jToolBar1.add(jSeparator3);

        jRecetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        jRecetas.setText("Nueva receta");
        jRecetas.setEnabled(false);
        jRecetas.setFocusable(false);
        jRecetas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jRecetas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jRecetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRecetasActionPerformed(evt);
            }
        });
        jToolBar1.add(jRecetas);
        jToolBar1.add(jSeparator4);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/lupaChica.png"))); // NOI18N
        jToggleButton1.setText("Consultar recetas");
        jToggleButton1.setEnabled(false);
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButton1);
        jToolBar1.add(jSeparator5);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Ordenado por:");

        filtroOrdenamientoJComboBox.setModel(new DefaultComboBoxModel(BusquedaIngresos.values()));
        filtroOrdenamientoJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroOrdenamientoJComboBoxItemStateChanged(evt);
            }
        });

        jLabel1.setText("DNI Paciente:");

        jComboPacientes = new javax.swing.JComboBox();

        jComboPacientes.setModel(new DefaultComboBoxModel(PacientesJpaController.buscarTodos().toArray()));

        filtroOrdenamientoJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboPacientesItemStateChanged(evt);
            }
        });
        ((DefaultComboBoxModel)jComboPacientes.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboPacientes.getModel()).setSelectedItem(null);
        jComboPacientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboPacientesItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtroOrdenamientoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroOrdenamientoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoIngresojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoIngresojButtonActionPerformed
        NuevoIngresoJInternalFrame iFrame = NuevoIngresoJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionIngresosJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NuevoIngresojButtonActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       this.actualizarDatosJTableOrdenados();
       this.jRecetas.setEnabled(false);
    }//GEN-LAST:event_formInternalFrameActivated

    private void EliminarIngresojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarIngresojButtonActionPerformed
       
        if(GestionIngresosJInternalFrame.ingresoSeleccionado.getReceta()!= null && GestionIngresosJInternalFrame.ingresoSeleccionado.getReceta().size() > 0){
            
            String msj = "El Ingreso seleccionado no puede eliminarse de la base de datos "
                    + "porque tiene datos de recetas asociados.\n"
                    ;
            Object[] opciones = {"Aceptar"};
            int n = JOptionPane.showOptionDialog(this, msj, "Atención!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if(n == JOptionPane.YES_OPTION){
                
                this.actualizarDatosJTableOrdenados();
            }
        }else{
            String msj = "Se eliminarán todos los datos del ingreso de la base de datos "
                    + "y no podrán recuperarse.\n"
                    + "Seguro desea continuar?";
            int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(n == JOptionPane.YES_OPTION){
                IngresosJpaController.eliminar(GestionIngresosJInternalFrame.ingresoSeleccionado);
                this.actualizarDatosJTableOrdenados();
            }
        }
     
    }//GEN-LAST:event_EliminarIngresojButtonActionPerformed

    private void ModificarIngresojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarIngresojButtonActionPerformed
       NuevoIngresoJInternalFrame iFrame = NuevoIngresoJInternalFrame.getInstancia();
        iFrame.setIngresoSeleccionado(GestionIngresosJInternalFrame.ingresoSeleccionado);
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionIngresosJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarIngresojButtonActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void filtroOrdenamientoJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroOrdenamientoJComboBoxItemStateChanged
        BusquedaIngresos auxOrden = (BusquedaIngresos)filtroOrdenamientoJComboBox.getSelectedItem();
        if(auxOrden != this.busqueda){
            this.busqueda = auxOrden;
            this.actualizarDatosJTableOrdenados();
        }
    }//GEN-LAST:event_filtroOrdenamientoJComboBoxItemStateChanged

    private void jComboPacientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboPacientesItemStateChanged
       Pacientes pacienteCombo=(Pacientes) jComboPacientes.getSelectedItem();
        if(pacienteCombo != null){
                       
            this.tableModel.setIngreso((List<Ingresos>) pacienteCombo.getIngreso());
            this.tableModel.fireTableDataChanged();
        }
        else{
              this.actualizarDatosJTableOrdenados();
        
        }


    }//GEN-LAST:event_jComboPacientesItemStateChanged

    private void jRecetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRecetasActionPerformed
        NuevaRecetaJInternalFrame iFrame = NuevaRecetaJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionRecetasJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }  
         
    }//GEN-LAST:event_jRecetasActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        GestionRecetasJInternalFrame iFrame = GestionRecetasJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionRecetasJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }  
         
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarIngresojButton;
    private javax.swing.JButton ModificarIngresojButton;
    private javax.swing.JButton NuevoIngresojButton;
    private javax.swing.JComboBox filtroOrdenamientoJComboBox;
    private javax.swing.JComboBox jComboPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jRecetas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
