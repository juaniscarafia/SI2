package laboratorio.ui.analisis;


import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import laboratorio.Entidades.*;
import laboratorio.controladores.Excepciones.PreexistingEntityException;
import laboratorio.controladores.*;
import laboratorio.ui.Ingresos.GestionRenglonJInternalFrame;
import laboratorio.ui.Ingresos.NuevaRecetaJInternalFrame;

public class NuevoAnalisisJInternalFrame extends javax.swing.JInternalFrame {
    private static NuevoAnalisisJInternalFrame INSTANCIA = new NuevoAnalisisJInternalFrame();
    private Bioquimicos bioquimicoSeleccionado = null;
    private Muestra muestraSeleccionada = null;
    private Recetas recetaSeleccionado = null;
    private TipoAnalisis tipoSeleccionada = null;
    private Analisis analisis = new Analisis();
    private boolean modificacion = false;
    private boolean autorizado = false;
    private boolean pagado = false;
    private boolean terminado = false;
    private Recetas aux=null;
    private Recetas aux1=null;
    private Recetas aux2=null;
    public NuevoAnalisisJInternalFrame() {
        initComponents();
    }
    
    public static NuevoAnalisisJInternalFrame getInstancia(){
        return INSTANCIA;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboMedico = new javax.swing.JComboBox();
        jComboMuestra = new javax.swing.JComboBox();
        jLabelMedicoC = new javax.swing.JLabel();
        jCAutorizado = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        GuardarSalirjButton = new javax.swing.JButton();
        GuardarContinuarjButton = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel10.setText("jLabel10");

        setClosable(true);
        setIconifiable(true);
        setTitle("Nuevo Análisis");
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

        jLabel2.setText("Descripcion:");

        jTextDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDescripcionKeyTyped(evt);
            }
        });

        jLabel3.setText("Autorizado");

        jLabel6.setText("Bioquimico:");

        jLabel7.setText("Codigo Muestra:");

        jComboMedico.setModel(new DefaultComboBoxModel(BioquimicosJpaController.buscarTodos().toArray()));
        ((DefaultComboBoxModel)jComboMedico.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboMedico.getModel()).setSelectedItem(null);
        jComboMedico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboMedicoItemStateChanged(evt);
            }
        });

        jComboMuestra.setModel(new DefaultComboBoxModel(MuestraJpsController.buscarTodos().toArray()));
        ((DefaultComboBoxModel)jComboMuestra.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboMuestra.getModel()).setSelectedItem(null);
        jComboMuestra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboMuestraItemStateChanged(evt);
            }
        });
        jComboMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMuestraActionPerformed(evt);
            }
        });

        jCAutorizado.setEnabled(false);
        jCAutorizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAutorizadoActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo Receta:");

        jComboBox1.setModel(new DefaultComboBoxModel(RecetasJpaController.buscarTodos().toArray()));

        ((DefaultComboBoxModel)jComboBox1.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboBox1.getModel()).setSelectedItem(null);
        jComboMuestra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de analisis:");

        jComboBox2.setModel(new DefaultComboBoxModel(TipoAnalisisJpaController.buscarTodos().toArray()));

        ((DefaultComboBoxModel)jComboBox2.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboBox2.getModel()).setSelectedItem(null);
        jComboMuestra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Terminado:");

        jCheckBox1.setEnabled(false);
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Pagado:");

        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
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
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCAutorizado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMedicoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextDescripcion)
                            .addComponent(jComboMedico, 0, 285, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboMuestra, 0, 193, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jComboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMedicoC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jCAutorizado))))))
                .addGap(238, 238, 238))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Datos Personales");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarSalirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSalirjButtonActionPerformed
        Analisis auxIngresos = this.validarDatos();
        if(auxIngresos != null){
            if(this.modificacion){
                try{
                    
                    AnalisisJpaController.modificar(analisis);
                    JOptionPane.showMessageDialog(this, "Los datos del análisis se han modificado correctamente");
                    this.jCAutorizado.setEnabled(false);
                    this.jCheckBox1.setEnabled(false); 
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    AnalisisJpaController.crear(analisis);
                    this.recetaSeleccionado.addAnalisis(analisis);
                    JOptionPane.showMessageDialog(this, "El nuevo análisis ha sido creado correctamente");
                    aux1=new Recetas();
                    
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

    private void jComboMedicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboMedicoItemStateChanged
        if (this.jComboMedico.getSelectedItem() != null){
            this.bioquimicoSeleccionado = (Bioquimicos) this.jComboMedico.getSelectedItem();
            
        }
    }//GEN-LAST:event_jComboMedicoItemStateChanged

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        INSTANCIA = new NuevoAnalisisJInternalFrame();
    }//GEN-LAST:event_formInternalFrameClosed

    private void jComboMuestraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboMuestraItemStateChanged
        if (this.jComboMuestra.getSelectedItem() != null){
            this.muestraSeleccionada = (Muestra)this.jComboMuestra.getSelectedItem();
            this.jLabel11.setText(this.muestraSeleccionada.getTipoMuestra().getDescripcion());
            
        }
    }//GEN-LAST:event_jComboMuestraItemStateChanged

    private void GuardarContinuarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarContinuarjButtonActionPerformed
     
        Analisis auxIngresos = this.validarDatos();
        if(auxIngresos != null){
            if(this.modificacion){
                try{
                    AnalisisJpaController.modificar(analisis);
                    JOptionPane.showMessageDialog(this, "Los datos del análisis se han modificado correctamente");
                   this.getDesktopPane().selectFrame(false);
                    this.dispose();
                   
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                  
       
                    AnalisisJpaController.crear(analisis);
                    this.recetaSeleccionado.addAnalisis(analisis);
                    JOptionPane.showMessageDialog(this, "El nuevo análisis ha sido creado correctamente");
                    aux1=new Recetas();
                    
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

    private void jTextDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDescripcionKeyTyped
         char car = evt.getKeyChar();
        if (car<'0' || car>'9'){
        
        }
        else
        {
                evt.consume();
         }
    }//GEN-LAST:event_jTextDescripcionKeyTyped

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
      aux=NuevaRecetaJInternalFrame.auxreceta;
      aux2=GestionRenglonJInternalFrame.auxreceta;
        if (aux.getCodReceta()!=0){
          this.jComboBox1.setSelectedItem(aux);
          this.jComboBox1.setEnabled(false);
          this.recetaSeleccionado = aux;
          
       }
      
        if (aux2.getCodReceta()!=0){
          this.jComboBox1.setSelectedItem(aux2);
          this.jComboBox1.setEnabled(false);
          this.recetaSeleccionado = aux2;
          
       }
         if (aux2.getCodReceta()==0 && aux.getCodReceta()==0 && this.modificacion==false){
           this.jComboBox1.setEnabled(true);
          
       }
       
    }//GEN-LAST:event_formInternalFrameActivated

    private void jCAutorizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAutorizadoActionPerformed
           autorizado=true;
    }//GEN-LAST:event_jCAutorizadoActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMuestraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboMuestraActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        terminado=true;
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        pagado=true;
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
          if (this.jComboBox1.getSelectedItem() != null){
            this.recetaSeleccionado = (Recetas) this.jComboBox1.getSelectedItem();
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
          if (this.jComboBox2.getSelectedItem() != null){
            this.tipoSeleccionada = (TipoAnalisis) this.jComboBox2.getSelectedItem();
            
        }  
    }//GEN-LAST:event_jComboBox2ItemStateChanged
    
    private Analisis validarDatos(){
        if(this.jTextDescripcion.getText().length() < 5){
            this.jLabelError.setText("Debe ingresar una descripción ");
            return null;
        }
        if(this.bioquimicoSeleccionado == null){
            this.jLabelError.setText("Debe seleccionar un bioquímico");
            return null;
        }
        if(this.recetaSeleccionado== null){
            this.jLabelError.setText("Debe seleccionar una receta");
            return null;
        }
          if(this.tipoSeleccionada == null){
            this.jLabelError.setText("Debe seleccionar un tipo de análisis");
            return null;
        }
        if(this.muestraSeleccionada == null){
            this.jLabelError.setText("Debe seleccionar una muestra");
            return null;
        }
        this.analisis.setDescripcion(this.jTextDescripcion.getText());
        this.analisis.setBioquimicos(this.bioquimicoSeleccionado);
        this.analisis.setMuestras(this.muestraSeleccionada);
        this.analisis.setReceta(this.recetaSeleccionado);
        this.analisis.setTipoanalisis(this.tipoSeleccionada);
        this.analisis.setAutorizado(autorizado);
        this.analisis.setTerminado(terminado);
        this.analisis.setPagado(pagado);
        return this.analisis;
    }

    public void setAnalisis(Analisis analisis1) {
        this.setTitle("Modificar Análisis");
        this.analisis = analisis1;
        this.modificacion = true;
        this.jCAutorizado.setEnabled(true);
        this.jCheckBox1.setEnabled(true);
        this.GuardarContinuarjButton.setEnabled(false);
        this.jTextDescripcion.setText(analisis.getDescripcion());
        this.jComboMedico.setSelectedItem(analisis.getBioquimicos());
        this.jComboMuestra.setSelectedItem(analisis.getMuestras());
        this.jComboBox1.setSelectedItem(analisis.getReceta());
        this.jComboBox1.setEnabled(false);
        this.jComboBox2.setSelectedItem(analisis.getTipoanalisis());
        this.jCAutorizado.setSelected(analisis.isAutorizado());
        this.jCheckBox1.setSelected(analisis.isTerminado());
        this.jCheckBox2.setSelected(analisis.isPagado());
    }
     
    private void limpiarCampos(){
        this.setTitle("Nuevo Análisis");
        this.analisis = new Analisis();
        this.modificacion = false;
        this.jTextDescripcion.setText("");
        this.jComboMedico.setSelectedItem(null);
        this.jComboMuestra.setSelectedItem(null);
        this.jComboBox1.setSelectedItem(aux);
        this.jComboBox1.getSelectedItem();
        this.jComboBox2.setSelectedItem(null);
        this.jLabelError.setText("");
        this.jLabel11.setText("");
      
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarContinuarjButton;
    private javax.swing.JButton GuardarSalirjButton;
    private javax.swing.JCheckBox jCAutorizado;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboMedico;
    private javax.swing.JComboBox jComboMuestra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelMedicoC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
