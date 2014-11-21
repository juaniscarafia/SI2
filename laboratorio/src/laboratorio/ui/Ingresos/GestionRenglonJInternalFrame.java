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
import laboratorio.Entidades.Analisis;
import laboratorio.Entidades.Recetas;

import laboratorio.controladores.AnalisisJpaController;
import laboratorio.controladores.RecetasJpaController;
import laboratorio.ui.analisis.NuevoAnalisisJInternalFrame;

public class GestionRenglonJInternalFrame extends javax.swing.JInternalFrame {
    private static GestionRenglonJInternalFrame INSTANCIA = new GestionRenglonJInternalFrame();
    private DetalleRenglon tableModel;
    public static Recetas auxreceta =new Recetas();
    private static Analisis renglonSeleccionado = null;
    private List<Analisis> lista= new ArrayList();
    private List <Analisis> listaaux=new ArrayList();;
    
    
   
    public GestionRenglonJInternalFrame() {
        this.tableModel = new DetalleRenglon();
        this.tableModel.setReceta(lista);
        initComponents();
    }
    
    public static GestionRenglonJInternalFrame getInstancia() {
        return INSTANCIA;
    }
    
    private void jTable1ValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            GestionRenglonJInternalFrame.renglonSeleccionado = this.tableModel.getRenglon(this.jTable1.getSelectedRow());
           
            if(this.renglonSeleccionado== null){
                this.ModificarIngresojButton.setEnabled(false);
                this.jEliminar.setEnabled(false);
           
            }else{
                this.ModificarIngresojButton.setEnabled(true);
                this.jEliminar.setEnabled(true);
                 }
        }
    }
    private void actualizarDatosJTableOrdenados(){
        this.tableModel.setReceta(GestionRecetasJInternalFrame.getRecetaSeleccionado().getAnalinis());
        this.tableModel.fireTableDataChanged();
    }
     private void actualizarDatosJTable(){
        this.tableModel.setReceta(listaaux);
        this.tableModel.fireTableDataChanged();
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        ModificarIngresojButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jEliminar = new javax.swing.JToggleButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestión de recetas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/UserSetup.png"))); // NOI18N
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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator1);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        jToggleButton1.setText("Nuevo renglón");
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButton1);
        jToolBar1.add(jSeparator3);

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

        jEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/eliminar.png"))); // NOI18N
        jEliminar.setText("Eliminar");
        jEliminar.setEnabled(false);
        jEliminar.setFocusable(false);
        jEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(jEliminar);
        jToolBar1.add(jSeparator4);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código de receta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       this.actualizarDatosJTableOrdenados();
       this.jTextField1.setText(Integer.toString(GestionRecetasJInternalFrame.getRecetaSeleccionado().getCodReceta()));
       this.jTextField1.setEnabled(false);
      
    }//GEN-LAST:event_formInternalFrameActivated

    private void ModificarIngresojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarIngresojButtonActionPerformed
        auxreceta= GestionRecetasJInternalFrame.getRecetaSeleccionado();
        NuevoAnalisisJInternalFrame iFrame = NuevoAnalisisJInternalFrame.getInstancia();
        iFrame.setAnalisis(GestionRenglonJInternalFrame.renglonSeleccionado);
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
          Logger.getLogger(GestionRenglonJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarIngresojButtonActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        auxreceta= GestionRecetasJInternalFrame.getRecetaSeleccionado();
        NuevoAnalisisJInternalFrame iFrame = NuevoAnalisisJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionRenglonJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        
        if( GestionRecetasJInternalFrame.getRecetaSeleccionado().getAnalinis()!= null && GestionRecetasJInternalFrame.getRecetaSeleccionado().getAnalinis().size()== 1){
            
            String msj = "Si eliminas el  análisis seleccionado se eliminará  "
                         + "la receta asociada.\n"
                         + "y no podrán recuperarse.\n"
                         + "Seguro desea continuar?";;
            Object[] opciones = {"Aceptar","Cancelar"};
            int n = JOptionPane.showOptionDialog(this, msj, "Atención!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if(n == JOptionPane.YES_OPTION){
                
                AnalisisJpaController.eliminar(renglonSeleccionado);
                GestionRecetasJInternalFrame.getRecetaSeleccionado().getAnalinis().remove(renglonSeleccionado);
                RecetasJpaController.eliminar(GestionRecetasJInternalFrame.getRecetaSeleccionado());
                
                this.actualizarDatosJTable();
            }
            else{
                this.actualizarDatosJTableOrdenados();
            }
        }else{
            String msj = "Se eliminarán todos los datos del análisis de la base de datos "
                    + "y no podrán recuperarse.\n"
                    + "Seguro desea continuar?";
            int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(n == JOptionPane.YES_OPTION){
                GestionRecetasJInternalFrame.getRecetaSeleccionado().getAnalinis().remove(renglonSeleccionado);
                AnalisisJpaController.eliminar(renglonSeleccionado);
                     
                this.actualizarDatosJTableOrdenados();
            }
        }
    }//GEN-LAST:event_jEliminarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        auxreceta=new Recetas();
        INSTANCIA= new GestionRenglonJInternalFrame();
    }//GEN-LAST:event_formInternalFrameClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModificarIngresojButton;
    private javax.swing.JToggleButton jEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
