package laboratorio.ui.Ingresos;

import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import laboratorio.Entidades.Analisis;
import laboratorio.Entidades.Medicos;
import laboratorio.Entidades.Recetas;
import laboratorio.controladores.MedicosJpaController;
import laboratorio.controladores.RecetasJpaController;
import laboratorio.ui.LaboratorioJFrame;
import laboratorio.ui.analisis.NuevoAnalisisJInternalFrame;

public class NuevaRecetaJInternalFrame extends javax.swing.JInternalFrame {
    private static NuevaRecetaJInternalFrame INSTANCIA = new NuevaRecetaJInternalFrame();
    private Medicos MedicoSeleccionado = null;
    private Recetas receta = new Recetas();
    public static Recetas auxreceta =new Recetas();
    private boolean modificacion = false;
    
    
    
    public NuevaRecetaJInternalFrame() {
      
        initComponents();
    }
    
    public static NuevaRecetaJInternalFrame getInstancia(){
        return INSTANCIA;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboPaciente = new javax.swing.JComboBox();
        jLabelObraS = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        NuevoRenglonjButton = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        GuardarSalirjIngresoButton = new javax.swing.JButton();
        GuardarContinuarIngresosjButton = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Nueva Receta");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/PatientMale.png"))); // NOI18N
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
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        jLabel4.setText("Código de Ingreso:");

        jLabel6.setText("Médico:");

        jComboPaciente.setModel(new DefaultComboBoxModel(MedicosJpaController.findAll().toArray()));
        ((DefaultComboBoxModel)jComboPaciente.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboPaciente.getModel()).setSelectedItem(null);
        jComboPaciente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboPacienteItemStateChanged(evt);
            }
        });

        NuevoRenglonjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        NuevoRenglonjButton.setText("Añadir Análisis");
        NuevoRenglonjButton.setFocusable(false);
        NuevoRenglonjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NuevoRenglonjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevoRenglonjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoRenglonjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelObraS, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(NuevoRenglonjButton))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelObraS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NuevoRenglonjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.setFloatable(false);

        GuardarSalirjIngresoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/guardar1.png"))); // NOI18N
        GuardarSalirjIngresoButton.setText("Guardar y salir");
        GuardarSalirjIngresoButton.setEnabled(false);
        GuardarSalirjIngresoButton.setFocusable(false);
        GuardarSalirjIngresoButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        GuardarSalirjIngresoButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GuardarSalirjIngresoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarSalirjIngresoButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(GuardarSalirjIngresoButton);

        GuardarContinuarIngresosjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/guardar2.png"))); // NOI18N
        GuardarContinuarIngresosjButton.setText("Guardar y continuar");
        GuardarContinuarIngresosjButton.setEnabled(false);
        GuardarContinuarIngresosjButton.setFocusable(false);
        GuardarContinuarIngresosjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        GuardarContinuarIngresosjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GuardarContinuarIngresosjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarContinuarIngresosjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(GuardarContinuarIngresosjButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Datos Personales");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarSalirjIngresoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSalirjIngresoButtonActionPerformed
        Recetas auxRecetas = this.validarDatos();
        if(auxRecetas != null){
                      
                   if(this.modificacion){
                     try{
                        RecetasJpaController.modificar(receta);
                        JOptionPane.showMessageDialog(this, "Los datos de la receta se han modificado correctamente");
                        this.getDesktopPane().selectFrame(false);
                        this.dispose();
                        }catch(Exception ex){
                        this.jLabelError.setText("Error al intentar modificar los datos");
                        }
                      }else{
            
                        try{
                            auxreceta=new Recetas();
                            JOptionPane.showMessageDialog(this, "La nueva receta con su detalle han sido creado correctamente");
                            this.getDesktopPane().selectFrame(false);
                            this.dispose();
                            }catch(Exception ex){
                                this.jLabelError.setText("Error al intentar guardar los datos");
                                ex.printStackTrace();
                            }
                        }
                 }
    }//GEN-LAST:event_GuardarSalirjIngresoButtonActionPerformed

    private void jComboPacienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboPacienteItemStateChanged
        if (this.jComboPaciente.getSelectedItem() != null){
            this.MedicoSeleccionado = (Medicos) this.jComboPaciente.getSelectedItem();
        
        }
    }//GEN-LAST:event_jComboPacienteItemStateChanged

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        
        INSTANCIA = new NuevaRecetaJInternalFrame();
    }//GEN-LAST:event_formInternalFrameClosed

    private void GuardarContinuarIngresosjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarContinuarIngresosjButtonActionPerformed
        Recetas auxRecetas = this.validarDatos();
        if(auxRecetas != null){
               try{
                                      
                    JOptionPane.showMessageDialog(this, "La nueva receta con su detalle han sido creado correctamente");
                    this.limpiarCampos();
                    this.GuardarContinuarIngresosjButton.setEnabled(false);
                    this.GuardarSalirjIngresoButton.setEnabled(false);
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar guardar los datos");
                    ex.printStackTrace();
                }
            }
        
    }//GEN-LAST:event_GuardarContinuarIngresosjButtonActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       
        this.jTextField1.setText(Integer.toString(GestionIngresosJInternalFrame.ingresoSeleccionado.getCodIngreso()));
         this.jTextField1.setEditable(false);
    }//GEN-LAST:event_formInternalFrameActivated

    private void NuevoRenglonjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoRenglonjButtonActionPerformed
        
        
        auxreceta=this.validarDatos();
        RecetasJpaController.crear(this.receta);
        
        NuevoAnalisisJInternalFrame iFrame = NuevoAnalisisJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(NuevaRecetaJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.GuardarContinuarIngresosjButton.setEnabled(true);
        this.GuardarSalirjIngresoButton.setEnabled(true);
    }//GEN-LAST:event_NuevoRenglonjButtonActionPerformed

    private Recetas validarDatos(){
                  
        if(this.MedicoSeleccionado == null){
            this.jLabelError.setText("Debe seleccionar un médico");
            return null;
        }
        this.receta.setIngreso(GestionIngresosJInternalFrame.ingresoSeleccionado);
        this.receta.setMedico(this.MedicoSeleccionado);
   
        return this.receta;
    }
       
    
    public void setRecetaSeleccionado(Recetas recetas) {
        this.setTitle("Modificar Recetas");
        this.receta =recetas ;
        this.modificacion= true;
        this.GuardarContinuarIngresosjButton.setEnabled(false);
        this.jComboPaciente.setSelectedItem(receta.getMedico());
        this.NuevoRenglonjButton.setEnabled(false);
        
        this.GuardarSalirjIngresoButton.setEnabled(true);
    }
    
    
  
    private void limpiarCampos(){
        this.setTitle("Nuevo Receta");
        this.receta = new Recetas();
        this.modificacion= false;
        this.jComboPaciente.setSelectedItem(null);
        this.jLabelError.setText("");
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarContinuarIngresosjButton;
    private javax.swing.JButton GuardarSalirjIngresoButton;
    private javax.swing.JButton NuevoRenglonjButton;
    private javax.swing.JComboBox jComboPaciente;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelObraS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
