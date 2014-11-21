package laboratorio.ui.Medicos;

import Clases.ImagenPaciente;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import laboratorio.Entidades.Medicos;
import laboratorio.Entidades.ObraSociales;
import laboratorio.controladores.MedicosJpaController;
import laboratorio.controladores.Excepciones.PreexistingEntityException;
import laboratorio.controladores.ObraSocialesJpaController;

public class NuevoMedicoJInternalFrame extends javax.swing.JInternalFrame {
    private static NuevoMedicoJInternalFrame INSTANCIA = new NuevoMedicoJInternalFrame();
    private ObraSociales obraSocialSeleccionada = null;
    private ObraSociales obraSocialSeleccionadaTable = null;
    private List<ObraSociales> obraSocialTable = new ArrayList();
    private DetalleOSMedicoTableModel tableModelOSMedico = new DetalleOSMedicoTableModel();
    private Medicos medicos = new Medicos();
    private boolean modificacion = false;
    
    

    public NuevoMedicoJInternalFrame() {
        initComponents();
    }

    public static NuevoMedicoJInternalFrame getInstancia(){
        return INSTANCIA;
    }
    
    private Medicos validarDatos(){
        if(this.jTextDNI.getText().length() < 7){
            this.jLabelError.setText("El DNI ingresado es incorrecto");
            return null;
        }
        if(this.jTextNomAp.getText().length() < 5){
            this.jLabelError.setText("Debe ingresar un Nombre y Apellido");
            return null;
        }
        if(this.jTextDomicilio.getText().length() < 5){
            this.jLabelError.setText("Debe ingresar un domicilio");
            return null;
        }
        if(this.jTextTelefono.getText().length() < 5){
            this.jLabelError.setText("Debe ingresar un teléfono");
            return null;
        }
       
        if(this.jTextMatNro.getText().length() < 3){
            this.jLabelError.setText("Debe ingresar un número de matrícula");
            return null;
        }
        
        if(this.jTextMatF.getText().length() < 3){
            this.jLabelError.setText("Debe ingresar un número de folio");
            return null;
        }
        if(this.jTextMatL.getText().length() < 2){
            this.jLabelError.setText("Debe ingresar un número l");
            return null;
        }
        this.medicos.setDni(Integer.parseInt(this.jTextDNI.getText()));
        this.medicos.setNombreyApellido(this.jTextNomAp.getText());
        this.medicos.setDomicilio(this.jTextDomicilio.getText());
        this.medicos.setMatricula("Mat. "+this.jTextMatNro.getText()+" Folio "
                                     +this.jTextMatF.getText()+" L "+this.jTextMatL.getText());
        this.medicos.setTelefono(this.jTextTelefono.getText());
        this.medicos.setObrasSociales(tableModelOSMedico.getObrasSociales());
        return this.medicos;
    }
        
    public void setMedicoSeleccionado(Medicos medicos) {
        this.setTitle("Modificar Médico");
       
        this.medicos = medicos;
        this.modificacion = true;
        this.jTextDNI.setText(Integer.toString(medicos.getDni()));
        this.jTextDNI.setEditable(false);
        this.jTextNomAp.setText(medicos.getNombreyApellido());
        this.jTextDomicilio.setText(medicos.getDomicilio());
        this.jTextMatNro.setText("");
        this.jTextMatF.setText("");
        this.jTextMatL.setText("");
        
        String matricula = medicos.getMatricula();
        for (int i = 5; i< 9; i++){
            this.jTextMatNro.setText(this.jTextMatNro.getText()+matricula.charAt(i));
        }
        for (int i = 16; i< 20; i++){
            this.jTextMatF.setText(this.jTextMatF.getText()+ matricula.charAt(i));
        }
        for (int i = 23; i< 26; i++){
            this.jTextMatL.setText(this.jTextMatL.getText()+matricula.charAt(i));
        }
        this.jTextTelefono.setText(medicos.getTelefono());
        this.tableModelOSMedico.setObrasSociales(medicos);
    }
     
   
    private void jTableOSValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            this.obraSocialSeleccionadaTable = this.tableModelOSMedico.getObraSocial(this.jTableOS.getSelectedRow());
            if(this.obraSocialSeleccionadaTable != null){
                this.EliminarOSjButton.setEnabled(true);
            }else{
                this.EliminarOSjButton.setEnabled(false);
            }
        }
    }      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        GuardarSalirjButton = new javax.swing.JButton();
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
        jLabel7 = new javax.swing.JLabel();
        jComboObraSocial = new javax.swing.JComboBox();
        jTextMatL = new javax.swing.JTextField();
        jTextMatF = new javax.swing.JTextField();
        jTextMatNro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableOS = new javax.swing.JTable();
        NuevoTipoResultadojButton = new javax.swing.JButton();
        EliminarOSjButton = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Nuevo Médico");
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

        jLabel4.setText("Matrícula:                   Mat.");

        jLabel5.setText("Teléfono:");

        jTextTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefonoKeyTyped(evt);
            }
        });

        jLabel7.setText("Obras Sociales:");

        jComboObraSocial.setModel(new DefaultComboBoxModel(ObraSocialesJpaController.findAll().toArray()));
        ((DefaultComboBoxModel)jComboObraSocial.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboObraSocial.getModel()).setSelectedItem(null);
        jComboObraSocial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboObraSocialItemStateChanged(evt);
            }
        });

        jTextMatL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMatLKeyTyped(evt);
            }
        });

        jTextMatF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMatFKeyTyped(evt);
            }
        });

        jTextMatNro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMatNroKeyTyped(evt);
            }
        });

        jLabel8.setText("Folio");

        jLabel9.setText("L");

        jLabel10.setText("Obra social:");

        jTableOS.setModel(this.tableModelOSMedico);
        jScrollPane2.setViewportView(jTableOS);
        jTableOS.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTableOS.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent evt) {
                jTableOSValueChanged(evt);
            }
        });

        NuevoTipoResultadojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        NuevoTipoResultadojButton.setText("Añadir Obra social");
        NuevoTipoResultadojButton.setFocusable(false);
        NuevoTipoResultadojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NuevoTipoResultadojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevoTipoResultadojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoTipoResultadojButtonActionPerformed(evt);
            }
        });

        EliminarOSjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/eliminar.png"))); // NOI18N
        EliminarOSjButton.setText("Dar de bajo obra social");
        EliminarOSjButton.setEnabled(false);
        EliminarOSjButton.setFocusable(false);
        EliminarOSjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        EliminarOSjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EliminarOSjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarOSjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                .addComponent(jTextDomicilio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextNomAp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextMatNro, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextMatF, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextMatL, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextDNI, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboObraSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(312, 312, 312)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NuevoTipoResultadojButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(EliminarOSjButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
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
                    .addComponent(jTextMatL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMatF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMatNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboObraSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NuevoTipoResultadojButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)))
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EliminarOSjButton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarSalirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSalirjButtonActionPerformed
        Medicos auxMedico = this.validarDatos();
        if(auxMedico != null){
            if(this.modificacion){
                try{
                    MedicosJpaController.modificar(medicos);
                    JOptionPane.showMessageDialog(this, "Los datos del médico se han modificado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    MedicosJpaController.crear(medicos);
                    JOptionPane.showMessageDialog(this, "El nuevo médico ha sido creado correctamente");
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

    private void jTextDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDNIKeyTyped
        char car = evt.getKeyChar();

        if(jTextDNI.getText().length()> 7) evt.consume();
        if (car<'0' || car>'9') evt.consume();
    }//GEN-LAST:event_jTextDNIKeyTyped

    private void jTextNomApKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomApKeyTyped
        char car = evt.getKeyChar();
        if (car<'0' || car>'9'){
        }
        else
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextNomApKeyTyped

    private void jTextDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDomicilioKeyTyped
      
    }//GEN-LAST:event_jTextDomicilioKeyTyped

    private void jTextTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefonoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(jTextTelefono.getText().length()>10) evt.consume();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_jTextTelefonoKeyTyped

    private void actualizarDatosJTableOS(){
        this.tableModelOSMedico.setObrasSociales(medicos);
        this.tableModelOSMedico.fireTableDataChanged();
    }  
    
    private void jComboObraSocialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboObraSocialItemStateChanged
        if (this.jComboObraSocial.getSelectedItem() != null){
            this.obraSocialSeleccionada = (ObraSociales)this.jComboObraSocial.getSelectedItem();
        }
        
    }//GEN-LAST:event_jComboObraSocialItemStateChanged

    private void jTextMatLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMatLKeyTyped
        char car = evt.getKeyChar();
        if(jTextMatL.getText().length()>2) evt.consume();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_jTextMatLKeyTyped

    private void jTextMatFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMatFKeyTyped
         char car = evt.getKeyChar();
        if(jTextMatF.getText().length()>3) evt.consume();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_jTextMatFKeyTyped

    private void jTextMatNroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMatNroKeyTyped
         char car = evt.getKeyChar();
        if(jTextMatNro.getText().length()>3) evt.consume();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_jTextMatNroKeyTyped

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        INSTANCIA = new NuevoMedicoJInternalFrame();
    }//GEN-LAST:event_formInternalFrameClosed

    private void NuevoTipoResultadojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoTipoResultadojButtonActionPerformed
       this.medicos.addObraSocial(obraSocialSeleccionada);
       this.actualizarDatosJTableOS();
    }//GEN-LAST:event_NuevoTipoResultadojButtonActionPerformed

    private void EliminarOSjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarOSjButtonActionPerformed
        String msj = "Se eliminaran todos los datos de la base de datos "
        + "y no podrán recuperarse.\n"
        + "Desea continuar?";
        int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n == JOptionPane.YES_OPTION){
            medicos.deleteObraSocial(obraSocialSeleccionadaTable);
            this.actualizarDatosJTableOS();
        }
    }//GEN-LAST:event_EliminarOSjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarOSjButton;
    private javax.swing.JButton GuardarSalirjButton;
    private javax.swing.JButton NuevoTipoResultadojButton;
    private javax.swing.JComboBox jComboObraSocial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableOS;
    private javax.swing.JTextField jTextDNI;
    private javax.swing.JTextField jTextDomicilio;
    private javax.swing.JTextField jTextMatF;
    private javax.swing.JTextField jTextMatL;
    private javax.swing.JTextField jTextMatNro;
    private javax.swing.JTextField jTextNomAp;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
