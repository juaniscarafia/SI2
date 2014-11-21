package laboratorio.ui.Administracion;

import Clases.ImagenPaciente;
import javax.swing.JOptionPane;
import laboratorio.Entidades.Bioquimicos;
import laboratorio.controladores.BioquimicosJpaController;
import laboratorio.controladores.Excepciones.PreexistingEntityException;


public class NuevoBioquimicoJInternalFrame extends javax.swing.JInternalFrame {

    private static NuevoBioquimicoJInternalFrame INSTANCIA = new NuevoBioquimicoJInternalFrame();
    private Bioquimicos bioquimicos = new Bioquimicos();
    private boolean modificacion = false;
    
    public NuevoBioquimicoJInternalFrame() {
        initComponents();
    }

    public static NuevoBioquimicoJInternalFrame getInstancia(){
        return INSTANCIA;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        GuardarSalirjButton = new javax.swing.JButton();
        GuardarContinuarjButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextDNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextNomAp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextDomicilio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextMatNro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextMatF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextMatL = new javax.swing.JTextField();
        jLabelError = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Nuevo Bioquímico");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
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

        jToolBar1.setFloatable(false);

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
        jToolBar1.add(GuardarSalirjButton);

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
        jToolBar1.add(GuardarContinuarjButton);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        jLabel1.setText("DNI:");

        jTextDNI.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDNIKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre y Apellido:");

        jTextNomAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNomApKeyTyped(evt);
            }
        });

        jLabel3.setText("Domicilio:");

        jTextDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDomicilioKeyTyped(evt);
            }
        });

        jLabel4.setText("Email:");

        jLabel5.setText("Teléfono:");

        jTextTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefonoKeyTyped(evt);
            }
        });

        jTextEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextEmailKeyTyped(evt);
            }
        });

        jLabel8.setText("Matrícula:                   Mat.");

        jTextMatNro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMatNroKeyTyped(evt);
            }
        });

        jLabel9.setText("Folio");

        jTextMatF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMatFKeyTyped(evt);
            }
        });

        jLabel10.setText("L");

        jTextMatL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMatLKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextDomicilio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(jTextNomAp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDNI, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTelefono)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextMatNro, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextMatF, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextMatL, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNomAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextMatL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMatF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMatNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarSalirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSalirjButtonActionPerformed
        Bioquimicos auxBioquimico = this.validarDatos();
        if(auxBioquimico != null){
            if(this.modificacion){
                try{
                    BioquimicosJpaController.modificar(bioquimicos);
                    JOptionPane.showMessageDialog(this, "Los datos del bioquímico se han modificado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    BioquimicosJpaController.crear(bioquimicos);
                    JOptionPane.showMessageDialog(this, "El nuevo bioquímico ha sido creado correctamente");
                    this.getDesktopPane().selectFrame(false);
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
        Bioquimicos auxbioquimico = this.validarDatos();
        if(auxbioquimico != null){
            if(this.modificacion){
                try{
                    BioquimicosJpaController.modificar(bioquimicos);
                    JOptionPane.showMessageDialog(this, "Los datos del bioquímico se han modificado correctamente");
                    
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    BioquimicosJpaController.crear(bioquimicos);
                    JOptionPane.showMessageDialog(this, "El nuevo bioquímico ha sido creado correctamente");
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

    private void jTextEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailKeyTyped

    private void jTextTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefonoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(jTextTelefono.getText().length()>10) evt.consume();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_jTextTelefonoKeyTyped

    private void jTextDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDomicilioKeyTyped
       
    }//GEN-LAST:event_jTextDomicilioKeyTyped

    private void jTextNomApKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomApKeyTyped
           char car = evt.getKeyChar();
        if (car<'0' || car>'9'){
        }
        else
        {
                evt.consume();
         }
    }//GEN-LAST:event_jTextNomApKeyTyped

    private void jTextDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDNIKeyTyped
        char car = evt.getKeyChar();

        if(jTextDNI.getText().length()> 7) evt.consume();
        if (car<'0' || car>'9') evt.consume();
    }//GEN-LAST:event_jTextDNIKeyTyped

    private void jTextMatNroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMatNroKeyTyped
       char car = evt.getKeyChar();
        if(jTextMatNro.getText().length()>3) evt.consume();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_jTextMatNroKeyTyped

    private void jTextMatFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMatFKeyTyped
        char car = evt.getKeyChar();
        if(jTextMatF.getText().length()>3) evt.consume();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_jTextMatFKeyTyped

    private void jTextMatLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMatLKeyTyped
        char car = evt.getKeyChar();
        if(jTextMatL.getText().length()>2) evt.consume();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_jTextMatLKeyTyped

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        INSTANCIA = new NuevoBioquimicoJInternalFrame();
    }//GEN-LAST:event_formInternalFrameClosed

    private Bioquimicos validarDatos(){
        
        if(this.jTextDNI.getText().length() < 7){
           
            this.jLabelError.setText("El DNI ingresado es incorrecto");
            return null;
        }
        if(this.jTextNomAp.getText().length() < 6){
            this.jLabelError.setText("Debe ingresar un Nombre y Apellido");
            return null;
        }
        if(this.jTextDomicilio.getText().length() < 6){
            this.jLabelError.setText("Debe ingresar un domicilio");
            return null;
        }
        if(this.jTextTelefono.getText().length() < 6){
            this.jLabelError.setText("Debe ingresar un teléfono");
            return null;
        }
        
        if(this.jTextMatNro.getText().length() < 3){
            this.jLabelError.setText("Debe ingresar un número de matricula");
            return null;
        }
        
        if(this.jTextMatF.getText().length() < 3){
            this.jLabelError.setText("Debe ingresar un número de folio");
            return null;
        }
        if(this.jTextMatL.getText().length() < 2){
            this.jLabelError.setText("Debe ingresar un número l ");
            return null;
        }
        this.bioquimicos.setDni(Integer.parseInt(this.jTextDNI.getText()));
        this.bioquimicos.setNombreyApellido(this.jTextNomAp.getText());
        this.bioquimicos.setDomicilio(this.jTextDomicilio.getText());
        this.bioquimicos.setMatricula("Mat. "+this.jTextMatNro.getText()+" Folio "
                                    +this.jTextMatF.getText()+" L "+this.jTextMatL.getText());
        this.bioquimicos.setTelefono(this.jTextTelefono.getText());
        this.bioquimicos.setEmail(this.jTextEmail.getText());
        return this.bioquimicos;
    }
    
 
    
     public void setBioquimicoSeleccionado(Bioquimicos bioquimicos) {
        this.setTitle("Modificar Bioquímico");
        this.bioquimicos = bioquimicos;
        this.modificacion = true;
        this.GuardarContinuarjButton.setEnabled(false);
        this.jTextDNI.setText(Integer.toString(bioquimicos.getDni()));
        this.jTextDNI.setEditable(false);
        this.jTextNomAp.setText(bioquimicos.getNombreyApellido());
        this.jTextDomicilio.setText(bioquimicos.getDomicilio());
        String matricula = bioquimicos.getMatricula();
        this.jTextMatNro.setText("");
        this.jTextMatF.setText("");
        this.jTextMatL.setText("");
        for (int i = 5; i< 9; i++){
            this.jTextMatNro.setText(this.jTextMatNro.getText()+matricula.charAt(i));
        }
        for (int i = 16; i< 20; i++){
            this.jTextMatF.setText(this.jTextMatF.getText()+matricula.charAt(i));
        }
        for (int i = 23; i< 26; i++){
            this.jTextMatL.setText(this.jTextMatL.getText()+matricula.charAt(i));
        }
        this.jTextTelefono.setText(bioquimicos.getTelefono());
        this.jTextEmail.setText(bioquimicos.getEmail());
    }
     
     private void limpiarCampos(){
        this.setTitle("Nuevo Bioquímico");
        this.bioquimicos = new Bioquimicos();
        this.modificacion = false;
        this.jTextDNI.setText("");
        this.jTextDNI.setEditable(true);
        this.jTextNomAp.setText("");
        this.jTextDomicilio.setText("");
        this.jTextMatNro.setText("");
        this.jTextMatF.setText("");
        this.jTextMatL.setText("");
        this.jTextTelefono.setText("");
        this.jTextEmail.setText("");
        this.jLabelError.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarContinuarjButton;
    private javax.swing.JButton GuardarSalirjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextDNI;
    private javax.swing.JTextField jTextDomicilio;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextMatF;
    private javax.swing.JTextField jTextMatL;
    private javax.swing.JTextField jTextMatNro;
    private javax.swing.JTextField jTextNomAp;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
