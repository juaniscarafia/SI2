package laboratorio.ui.ObraSocial;

import javax.swing.JOptionPane;
import laboratorio.Entidades.Medicos;
import laboratorio.Entidades.ObraSociales;
import laboratorio.controladores.Excepciones.PreexistingEntityException;
import laboratorio.controladores.ObraSocialesJpaController;

public class NuevaObraSocialJInternalFrame extends javax.swing.JInternalFrame {
    private static NuevaObraSocialJInternalFrame INSTANCIA = new NuevaObraSocialJInternalFrame();
    private ObraSociales obrasocial = new ObraSociales();
    private boolean modificacion = false;
    
    public NuevaObraSocialJInternalFrame() {
        initComponents();
    }
    
    public static NuevaObraSocialJInternalFrame getInstancia(){
        return INSTANCIA;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        GuardarSalirjButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        GuardarContinuarjButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextDomicilio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabelMedicoC = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Nueva Obra Social");
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
        jToolBar1.setRollover(true);

        GuardarSalirjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/guardar1.png"))); // NOI18N
        GuardarSalirjButton.setText("Guardar y Salir");
        GuardarSalirjButton.setFocusable(false);
        GuardarSalirjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        GuardarSalirjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GuardarSalirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarSalirjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(GuardarSalirjButton);
        jToolBar1.add(jSeparator1);

        GuardarContinuarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/guardar2.png"))); // NOI18N
        GuardarContinuarjButton.setText("Guardar y Continuar");
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

        jLabel2.setText("Nombre:");

        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });

        jLabel3.setText("Descripción:");

        jLabel4.setText("Domicilio:");

        jTextDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDomicilioActionPerformed(evt);
            }
        });
        jTextDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDomicilioKeyTyped(evt);
            }
        });

        jLabel5.setText("Teléfono:");

        jTextTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefonoKeyTyped(evt);
            }
        });

        jLabel6.setText("Email:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextDomicilio)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextTelefono))
                    .addComponent(jTextEmail)
                    .addComponent(jTextDescripcion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabelMedicoC, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMedicoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarSalirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSalirjButtonActionPerformed
        ObraSociales auxObraSocial = this.validarDatos();
        if(auxObraSocial != null){
            if(this.modificacion){
                try{
                    ObraSocialesJpaController.modificar(obrasocial);
                    JOptionPane.showMessageDialog(this, "Los datos de la obra social se han modificado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    ObraSocialesJpaController.crear(obrasocial);
                    JOptionPane.showMessageDialog(this, "La nueva obra social ha sido creado correctamente");
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

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        INSTANCIA = new NuevaObraSocialJInternalFrame();
    }//GEN-LAST:event_formInternalFrameClosed

    private void GuardarContinuarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarContinuarjButtonActionPerformed
        ObraSociales auxObraSocial = this.validarDatos();
        if(auxObraSocial != null){
            if(this.modificacion){
                try{
                    ObraSocialesJpaController.modificar(obrasocial);
                    JOptionPane.showMessageDialog(this, "Los datos de la obra social se han modificado correctamente");
                    this.limpiarCampos();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    ObraSocialesJpaController.crear(obrasocial);
                    JOptionPane.showMessageDialog(this, "La obra social ha sido creada correctamente");
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

    private void jTextTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefonoKeyTyped
        char car = evt.getKeyChar();
        if(jTextTelefono.getText().length()>10) evt.consume();
        if((car<'0' || car>'9')) evt.consume(); 
    }//GEN-LAST:event_jTextTelefonoKeyTyped

    private void jTextDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDomicilioKeyTyped
        /*char car = evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<'0' || car>'9')&& (car!=(char)KeyEvent.VK_SPACE)) evt.consume();*/
    }//GEN-LAST:event_jTextDomicilioKeyTyped

    private void jTextDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDomicilioActionPerformed

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
       
    }//GEN-LAST:event_jTextNombreKeyTyped

    private ObraSociales validarDatos(){
        if(this.jTextNombre.getText().length() < 2){
            this.jLabelError.setText("Debe ingresar un nombre");
            return null;
        }
        if(this.jTextDescripcion.getText().length() < 5){
            this.jLabelError.setText("Debe ingresar una descripción");
            return null;
        }
        if(this.jTextDomicilio.getText().length() < 8){
            this.jLabelError.setText("Debe ingresar un domicilio");
            return null;
        }
        if(this.jTextTelefono.getText().length() < 4){
            this.jLabelError.setText("Debe ingresar un telefono");
            return null;
        }
        if(this.jTextEmail.getText().length() < 8){
            this.jLabelError.setText("Debe ingresar un email");
            return null;
        }
        this.obrasocial.setNombre(this.jTextNombre.getText());
        this.obrasocial.setDescripcion(this.jTextDescripcion.getText());
        this.obrasocial.setDomicilio(this.jTextDomicilio.getText());
        this.obrasocial.setTelefono(this.jTextTelefono.getText());
        this.obrasocial.setEmail(this.jTextEmail.getText());
        return this.obrasocial;
    }
    
    public void setObraSocialSeleccionada(ObraSociales obrasocial) {
        this.setTitle("Modificar Obra Social");
        this.obrasocial = obrasocial;
        this.modificacion = true;
        this.GuardarContinuarjButton.setEnabled(false);
        this.jTextNombre.setText(obrasocial.getNombre());
        this.jTextDescripcion.setText(obrasocial.getDescripcion());
        this.jTextDomicilio.setText(obrasocial.getDomicilio());
        this.jTextTelefono.setText(obrasocial.getTelefono());
        this.jTextEmail.setText(obrasocial.getEmail());
    }
    
    private void limpiarCampos(){
        this.setTitle("Nueva Obra Social");
        this.obrasocial = new ObraSociales();
        this.modificacion = false;
        this.jTextNombre.setText("");
        this.jTextDescripcion.setText("");
        this.jTextDomicilio.setText("");
        this.jTextTelefono.setText("");
        this.jTextEmail.setText("");
        this.jLabelError.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarContinuarjButton;
    private javax.swing.JButton GuardarSalirjButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelMedicoC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JTextField jTextDomicilio;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
