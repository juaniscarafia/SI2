package laboratorio.ui.Administracion;

import javax.swing.JOptionPane;
import laboratorio.Entidades.TipoMuestra;
import laboratorio.controladores.TipoMuestraJpaController;

public class NuevoTipoMuestraJInternalFrame extends javax.swing.JInternalFrame {
    private static NuevoTipoMuestraJInternalFrame INSTANCIA = new NuevoTipoMuestraJInternalFrame();
    private TipoMuestra tipoMuestra = new TipoMuestra();
    private boolean modificacion = false;

    public NuevoTipoMuestraJInternalFrame() {
        initComponents();
    }
    
    public static NuevoTipoMuestraJInternalFrame getInstancia(){
        return INSTANCIA;
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextDescripcion = new javax.swing.JTextField();
        jLabelError = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        GuardarSalirjIngresoButton = new javax.swing.JButton();
        GuardarContinuarIngresosjButton = new javax.swing.JButton();

        setClosable(true);
        setTitle("Nuevo Tipo de Muestra");
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
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        jLabel6.setText("Descripcion:");

        jTextDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDescripcionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.setFloatable(false);

        GuardarSalirjIngresoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/guardar1.png"))); // NOI18N
        GuardarSalirjIngresoButton.setText("Guardar y salir");
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
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDescripcionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescripcionKeyTyped

    private void GuardarSalirjIngresoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSalirjIngresoButtonActionPerformed
        TipoMuestra auxTipoMuestra = this.validarDatos();
        if(auxTipoMuestra != null){
            if(this.modificacion){
                try{
                    TipoMuestraJpaController.modificar(tipoMuestra);
                    JOptionPane.showMessageDialog(this, "Los datos se han modificado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    TipoMuestraJpaController.crear(tipoMuestra);
                    JOptionPane.showMessageDialog(this, "El nuevo tipo de muestra ha sido creado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar guardar los datos");
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_GuardarSalirjIngresoButtonActionPerformed

    private void GuardarContinuarIngresosjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarContinuarIngresosjButtonActionPerformed
        TipoMuestra auxTipoMuestra = this.validarDatos();
        if(auxTipoMuestra != null){
            if(this.modificacion){
                try{
                    TipoMuestraJpaController.modificar(tipoMuestra);
                    JOptionPane.showMessageDialog(this, "Los datos se han modificado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    TipoMuestraJpaController.crear(tipoMuestra);
                    JOptionPane.showMessageDialog(this, "El nuevo tipo de muestra ha sido creado correctamente");
                    this.limpiarCampos();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar guardar los datos");
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_GuardarContinuarIngresosjButtonActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        INSTANCIA = new NuevoTipoMuestraJInternalFrame();
    }//GEN-LAST:event_formInternalFrameClosed

    private TipoMuestra validarDatos(){
        this.tipoMuestra.setDescripcion(this.jTextDescripcion.getText());
        return this.tipoMuestra;
    }
    
    public void setTipoMuestraSeleccionada(TipoMuestra tipoMuestra) {
        this.setTitle("Modificar Tipo de Muestra");
        this.tipoMuestra = tipoMuestra ;
        this.modificacion= true;
        this.GuardarContinuarIngresosjButton.setEnabled(false);
        this.jTextDescripcion.setText(tipoMuestra.getDescripcion());
    }
     
    private void limpiarCampos(){
        this.setTitle("Nuevo Tipo de Muestra");
        this.tipoMuestra = new TipoMuestra();
        this.modificacion = false;
        this.jTextDescripcion.setText("");
        this.jTextDescripcion.setEditable(true);
        this.jLabelError.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarContinuarIngresosjButton;
    private javax.swing.JButton GuardarSalirjIngresoButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
