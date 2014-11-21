package laboratorio.ui.Ingresos;

import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import laboratorio.ui.LaboratorioJFrame;
import javax.swing.JOptionPane;
import laboratorio.Entidades.Ingresos;


import laboratorio.Entidades.Recetas;
import laboratorio.controladores.AnalisisJpaController;

import laboratorio.controladores.RecetasJpaController;


public class GestionRecetasJInternalFrame extends javax.swing.JInternalFrame {
    private static GestionRecetasJInternalFrame INSTANCIA = new GestionRecetasJInternalFrame();
    private DetalleRecetas tableModel;
    private Ingresos ingreso=new Ingresos();
    private static Recetas recetaSeleccionado = null;

    

    public static Recetas getRecetaSeleccionado() {
        return recetaSeleccionado;
    }
   
    public GestionRecetasJInternalFrame() {
        this.tableModel = new DetalleRecetas();
        initComponents();
    }
    
    public static GestionRecetasJInternalFrame getInstancia() {
        return INSTANCIA;
    }
    
    private void jTable1ValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            GestionRecetasJInternalFrame.recetaSeleccionado = this.tableModel.getRecetas(this.jTable1.getSelectedRow());
            if(GestionRecetasJInternalFrame.recetaSeleccionado== null){
                this.ModificarIngresojButton.setEnabled(false);
                this.EliminarIngresojButton.setEnabled(false);
                this.jToggleButton1.setEnabled(false);
                
            }else{
                this.ModificarIngresojButton.setEnabled(true);
                this.EliminarIngresojButton.setEnabled(true);
                this.jToggleButton1.setEnabled(true);
                
            }
        }
    }
    
    private void actualizarDatosJTableOrdenados(){
        this.tableModel.setReceta(RecetasJpaController.buscarRecetasPorIngreso(GestionIngresosJInternalFrame.getIngresoSeleccionado()));
        this.tableModel.fireTableDataChanged();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ModificarIngresojButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        EliminarIngresojButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestión de Recetas");
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

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/lupaChica.png"))); // NOI18N
        jToggleButton1.setText("Ver detalle de receta");
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
        jToolBar1.add(jSeparator4);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
      this.actualizarDatosJTableOrdenados();
    }//GEN-LAST:event_formInternalFrameActivated

    private void EliminarIngresojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarIngresojButtonActionPerformed
      
        if(GestionRecetasJInternalFrame.recetaSeleccionado.getAnalisis() != null && GestionRecetasJInternalFrame.recetaSeleccionado.getAnalisis().size()==1){
            
            String msj = "Se eliminarán los datos de las recetas y los análisis asociados "
                        + "y no podrán recuperarse.\n"
                        + "Seguro desea continuar?";
            Object[] opciones = {"Aceptar","Cancelar"};
            int n = JOptionPane.showOptionDialog(this, msj, "Atención!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if(n == JOptionPane.YES_OPTION){
                for(int i=0;i < GestionRecetasJInternalFrame.recetaSeleccionado.getAnalisis().size();i++){
                    AnalisisJpaController.eliminar(GestionRecetasJInternalFrame.recetaSeleccionado.getAnalinis().get(i));
                }
                 RecetasJpaController.eliminar(GestionRecetasJInternalFrame.recetaSeleccionado);
                this.actualizarDatosJTableOrdenados();
            }else{
                 this.actualizarDatosJTableOrdenados();
            
            }
        }else{
            String msj = "Se eliminarán todos los datos de la receta y los análisis asociados de la base de datos "
                    + "y no podrán recuperarse.\n"
                    + "Seguro desea continuar?";
            int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(n == JOptionPane.YES_OPTION){
                for(int i=0;i < GestionRecetasJInternalFrame.recetaSeleccionado.getAnalinis().size();i++){
                    AnalisisJpaController.eliminar(GestionRecetasJInternalFrame.recetaSeleccionado.getAnalinis().get(i));
                }
                ingreso=GestionRecetasJInternalFrame.recetaSeleccionado.getIngreso();
                ingreso.getReceta().remove(GestionRecetasJInternalFrame.recetaSeleccionado);
                RecetasJpaController.eliminar(GestionRecetasJInternalFrame.recetaSeleccionado);
                this.actualizarDatosJTableOrdenados();
            }
        }    
    }//GEN-LAST:event_EliminarIngresojButtonActionPerformed

    private void ModificarIngresojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarIngresojButtonActionPerformed
             
        NuevaRecetaJInternalFrame iFrame = NuevaRecetaJInternalFrame.getInstancia();
        iFrame.setRecetaSeleccionado(GestionRecetasJInternalFrame.recetaSeleccionado);
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionRecetasJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarIngresojButtonActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        GestionRenglonJInternalFrame iFrame = GestionRenglonJInternalFrame.getInstancia();
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
