package laboratorio.ui.analisis;

import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import laboratorio.Entidades.*;
import laboratorio.controladores.Excepciones.PreexistingEntityException;
import laboratorio.controladores.*;

public class NuevaMuestraJInternalFrame extends javax.swing.JInternalFrame {
    private static NuevaMuestraJInternalFrame INSTANCIA = new NuevaMuestraJInternalFrame();
    private Muestra muestra = new Muestra();
    private TipoMuestra tipoMuestra = new TipoMuestra();
    private Ingresos ingreso = new Ingresos();
    private boolean modificacion = false;
    
    public NuevaMuestraJInternalFrame() {
        initComponents();
    }
    
    public static NuevaMuestraJInternalFrame getInstancia(){
        return INSTANCIA;
    }
    
    private Muestra validarDatos(){
        if(this.tipoMuestra == null){
            this.jLabelError.setText("Debe seleccionar un tipo de muestra");
            return null;
        }
        if(this.jTextCodigo == null){
            this.jLabelError.setText("Debes ingresar un código muestra");
            return null;
        }
        this.muestra.setCodMuestra(Integer.parseInt(this.jTextCodigo.getText()));
        this.muestra.setTipomuestra(tipoMuestra);
        this.muestra.setObservaciones(this.jTextCodigo1.getText());
        this.muestra.setFechaExpiracion(this.jCalendarFechaIngreso.getCalendar());
        return this.muestra;
    }  
    
    public void setMuestra(Muestra muestra) {
        this.setTitle("Modificar muestra");
        this.muestra = muestra;
        this.modificacion = true;
        this.jTextCodigo.setText(Integer.toString(muestra.getCodMuestra()));
        this.jTextCodigo.setEnabled(false);
        this.jTextCodigo.setEnabled(true);
        this.jTextCodigo1.setText(this.muestra.getObservaciones());
        this.jComboMuestras.setSelectedItem(null);
        this.GuardarContinuarjButton.setEnabled(false);
        this.jTextCodigo.setEditable(false);
    }
     
    private void limpiarCampos(){
        this.setTitle("Nueva Muestra");
        this.muestra = new Muestra();
        this.modificacion = false;
        this.jTextCodigo.setText("");
        this.jCalendarFechaIngreso.setDate(Calendar.getInstance().getTime());
        this.jComboMuestras.setSelectedItem(null);
        this.jTextCodigo1.setText("");
        this.jLabelError.setText("");
      
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jLabelMedicoC = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCalendarFechaIngreso = new org.freixas.jcalendar.JCalendarCombo();
        jComboMuestras = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTextCodigo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        GuardarSalirjButton = new javax.swing.JButton();
        GuardarContinuarjButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();

        setClosable(true);
        setResizable(true);
        setTitle("Nueva Muestra");

        jToolBar1.setFloatable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        jLabel2.setText("Código:");

        jTextCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCodigoKeyTyped(evt);
            }
        });

        jLabel4.setText("Fecha de Expiración:");

        jComboMuestras.setModel(new DefaultComboBoxModel(TipoMuestraJpaController.buscarTodos().toArray()));
        ((DefaultComboBoxModel)jComboMuestras.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboMuestras.getModel()).setSelectedItem(null);
        jComboMuestras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboMuestrasItemStateChanged(evt);
            }
        });

        jLabel6.setText("Tipo:");

        jTextCodigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCodigo1KeyTyped(evt);
            }
        });

        jLabel3.setText("Obervaciones:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabelMedicoC, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jTextCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jComboMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCalendarFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCalendarFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTextCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabelMedicoC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar2.setFloatable(false);
        jToolBar2.add(jSeparator1);

        GuardarSalirjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/guardar1.png"))); // NOI18N
        GuardarSalirjButton.setText("Guardar y salir");
        GuardarSalirjButton.setFocusable(false);
        GuardarSalirjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        GuardarSalirjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GuardarSalirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarSalirjButtonActionPerformed(evt);
            }
        });
        jToolBar2.add(GuardarSalirjButton);

        GuardarContinuarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/guardar2.png"))); // NOI18N
        GuardarContinuarjButton.setText("Guardar y continuar");
        GuardarContinuarjButton.setFocusable(false);
        GuardarContinuarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        GuardarContinuarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GuardarContinuarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarContinuarjButtonActionPerformed(evt);
            }
        });
        jToolBar2.add(GuardarContinuarjButton);
        jToolBar2.add(jSeparator2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarSalirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSalirjButtonActionPerformed
        Muestra auxMuestra = this.validarDatos();
        if(auxMuestra != null){
            if(this.modificacion){
                try{MuestraJpsController.modificar(muestra);
                    JOptionPane.showMessageDialog(this, "Los datos de la muestra se han modificado correctamente");
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    MuestraJpsController.crear(muestra);
                    JOptionPane.showMessageDialog(this, "La nueva muestra ha sido creado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                    this.dispose();
                }catch(PreexistingEntityException ex){
                    this.jLabelError.setText(ex.getMessage());
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar guardar los datos");
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_GuardarSalirjButtonActionPerformed

    private void GuardarContinuarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarContinuarjButtonActionPerformed

        Muestra auxMuestra = this.validarDatos();
        if(auxMuestra != null){
            if(this.modificacion){
                try{
                    MuestraJpsController.modificar(muestra);
                    JOptionPane.showMessageDialog(this, "Los datos de la muestra se han modificado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();

                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    MuestraJpsController.crear(muestra);
                    JOptionPane.showMessageDialog(this, "La nueva muestra ha sido creado correctamente");
                    this.limpiarCampos();
                }catch(PreexistingEntityException ex){
                    this.jLabelError.setText(ex.getMessage());
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar guardar los datos");
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_GuardarContinuarjButtonActionPerformed

    private void jTextCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCodigoKeyTyped
        char car = evt.getKeyChar();
        if (car<'0' || car>'9'){
           evt.consume();
        }
        
    }//GEN-LAST:event_jTextCodigoKeyTyped

    private void jComboMuestrasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboMuestrasItemStateChanged
        if (this.jComboMuestras.getSelectedItem() != null){
            this.tipoMuestra = (TipoMuestra) this.jComboMuestras.getSelectedItem();
            this.jLabelMedicoC.setText(this.tipoMuestra.getDescripcion());
        }
    }//GEN-LAST:event_jComboMuestrasItemStateChanged

    private void jTextCodigo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCodigo1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigo1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarContinuarjButton;
    private javax.swing.JButton GuardarSalirjButton;
    private org.freixas.jcalendar.JCalendarCombo jCalendarFechaIngreso;
    private javax.swing.JComboBox jComboMuestras;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelMedicoC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextCodigo1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
