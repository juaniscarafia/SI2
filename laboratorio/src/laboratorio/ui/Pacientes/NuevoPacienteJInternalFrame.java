package laboratorio.ui.Pacientes;

import Clases.ImagenPaciente;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.util.Calendar;
import laboratorio.Entidades.Pacientes;
import laboratorio.Entidades.Medicos;
import laboratorio.Entidades.ObraSociales;
import laboratorio.controladores.PacientesJpaController;
import laboratorio.controladores.MedicosJpaController;
import laboratorio.controladores.Excepciones.PreexistingEntityException;
import laboratorio.controladores.ObraSocialesJpaController;

public class NuevoPacienteJInternalFrame extends javax.swing.JInternalFrame {
    private static NuevoPacienteJInternalFrame INSTANCIA = new NuevoPacienteJInternalFrame();
    private Medicos medicoSeleccionado = null;
    private ObraSociales obrasocialSeleccionada = null;
    private Pacientes pacientes = new Pacientes();
    private boolean modificacion = false;
    private Medicos medico=new Medicos();
    public NuevoPacienteJInternalFrame() {
        initComponents();
    }
    
    public static NuevoPacienteJInternalFrame getInstancia(){
        return INSTANCIA;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboMedico = new javax.swing.JComboBox();
        jComboObraSocial = new javax.swing.JComboBox();
        jLabelMedicoC = new javax.swing.JLabel();
        jLabelObraS = new javax.swing.JLabel();
        jCalendarFechaNacimiento = new org.freixas.jcalendar.JCalendarCombo();
        jToolBar1 = new javax.swing.JToolBar();
        GuardarSalirjButton = new javax.swing.JButton();
        GuardarContinuarjButton = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Nuevo Paciente");
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

        jLabel4.setText("Fecha de nacimiento:");

        jLabel5.setText("Teléfono:");

        jTextTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefonoKeyTyped(evt);
            }
        });

        jLabel6.setText("Médico de cabecera:");

        jLabel7.setText("Obra social:");

        jComboMedico.setModel(new DefaultComboBoxModel(MedicosJpaController.findAll().toArray()));
        ((DefaultComboBoxModel)jComboMedico.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboMedico.getModel()).setSelectedItem(null);
        jComboMedico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboMedicoItemStateChanged(evt);
            }
        });

        jComboObraSocial.setModel(new DefaultComboBoxModel(ObraSocialesJpaController.findAll().toArray()));
        ((DefaultComboBoxModel)jComboObraSocial.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboObraSocial.getModel()).setSelectedItem(null);
        jComboObraSocial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboObraSocialItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboObraSocial, javax.swing.GroupLayout.Alignment.LEADING, 0, 179, Short.MAX_VALUE)
                            .addComponent(jComboMedico, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelMedicoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelObraS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextNomAp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDNI, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextDomicilio)
                        .addGap(92, 92, 92))
                    .addComponent(jCalendarFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
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
                    .addComponent(jCalendarFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jComboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelMedicoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboObraSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelObraS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
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
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Datos Personales");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarSalirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSalirjButtonActionPerformed
        Pacientes auxPaciente = this.validarDatos();
        if(auxPaciente != null){
            if(this.modificacion){
                try{
                    if (medico!=this.pacientes.getMedicoCabecera()){
                        medico.getPacientes().remove(this.pacientes);
                    
                    }
                    PacientesJpaController.modificar(pacientes);
                    JOptionPane.showMessageDialog(this, "Los datos del paciente se han modificado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    PacientesJpaController.crear(pacientes);
                    JOptionPane.showMessageDialog(this, "El nuevo paciente ha sido creado correctamente");
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

    private void jComboMedicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboMedicoItemStateChanged
        if (this.jComboMedico.getSelectedItem() != null){
            this.medicoSeleccionado = (Medicos) this.jComboMedico.getSelectedItem();
            this.jLabelMedicoC.setText(this.medicoSeleccionado.getMatricula());
        }
    }//GEN-LAST:event_jComboMedicoItemStateChanged

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        INSTANCIA = new NuevoPacienteJInternalFrame();
    }//GEN-LAST:event_formInternalFrameClosed

    private void jComboObraSocialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboObraSocialItemStateChanged
        if (this.jComboObraSocial.getSelectedItem() != null){
            this.obrasocialSeleccionada = (ObraSociales)this.jComboObraSocial.getSelectedItem();
            this.jLabelObraS.setText(Integer.toString(this.obrasocialSeleccionada.getCodObraSocial()));
        }
    }//GEN-LAST:event_jComboObraSocialItemStateChanged

    private void GuardarContinuarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarContinuarjButtonActionPerformed
        Pacientes auxpaciente = this.validarDatos();
        if(auxpaciente != null){
            if(this.modificacion){
                try{
                    PacientesJpaController.modificar(pacientes);
                    JOptionPane.showMessageDialog(this, "Los datos del paciente se han modificado correctamente");
                    this.limpiarCampos();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    PacientesJpaController.crear(pacientes);
                    JOptionPane.showMessageDialog(this, "El nuevo paciente ha sido creado correctamente");
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
        char car = evt.getKeyChar();
       
        if((car<'0' || car>'9')) evt.consume(); 
    }//GEN-LAST:event_jTextTelefonoKeyTyped

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated

    private Pacientes validarDatos(){
        if(this.jTextDNI.getText().length() < 7){
            this.jLabelError.setText("El DNI ingresado es incorrecto");
            return null;
        }
        if(this.jTextNomAp.getText().length() < 8){
            this.jLabelError.setText("Debe ingresar un Nombre y Apellido");
            return null;
        }
        if(this.jTextDomicilio.getText().length() < 8){
            this.jLabelError.setText("Debe ingresar un domicilio");
            return null;
        }
        if(this.jCalendarFechaNacimiento.getCalendar() == null){
            this.jLabelError.setText("Debe seleccionar una fecha de nacimiento");
            return null;
        }
        if(this.jTextTelefono.getText().length() < 5){
            this.jLabelError.setText("Debe ingresar un teléfono");
            return null;
        }
        if(this.medicoSeleccionado == null){
            this.jLabelError.setText("Debe seleccionar una Médico de cabecera");
            return null;
        }
        if(this.obrasocialSeleccionada == null){
            this.jLabelError.setText("Debe seleccionar una Obra Social");
            return null;
        }
        this.pacientes.setDni(Integer.parseInt(this.jTextDNI.getText()));
        this.pacientes.setNombreyApellido(this.jTextNomAp.getText());
        this.pacientes.setDomicilio(this.jTextDomicilio.getText());
        this.pacientes.setFechaNacimiento(this.jCalendarFechaNacimiento.getCalendar());
        this.pacientes.setTelefono(this.jTextTelefono.getText());
        this.pacientes.setMedicoCabecera(this.medicoSeleccionado);
        this.pacientes.setObrasocial(this.obrasocialSeleccionada);
        return this.pacientes;
    }

     public void setPacienteSeleccionado(Pacientes paciente) {
        this.setTitle("Modificar Paciente");
        this.pacientes = paciente;
        this.modificacion = true;
        this.GuardarContinuarjButton.setEnabled(false);
        this.jTextDNI.setText(Integer.toString(paciente.getDni()));
        this.jTextDNI.setEditable(false);
        this.jTextNomAp.setText(paciente.getNombreyApellido());
        this.jTextDomicilio.setText(paciente.getDomicilio());
        this.jCalendarFechaNacimiento.setDate(paciente.getFechaNacimiento().getTime());
        this.jTextTelefono.setText(paciente.getTelefono());
        medico=paciente.getMedicoCabecera();
        this.jComboMedico.setSelectedItem(paciente.getMedicoCabecera());
        this.jComboObraSocial.setSelectedItem(paciente.getObrasocial());
    }
     
    private void limpiarCampos(){
        this.setTitle("Nuevo Paciente");
        this.pacientes = new Pacientes();
        this.modificacion = false;
        this.jTextDNI.setText("");
        this.jTextDNI.setEditable(true);
        this.jTextNomAp.setText("");
        this.jTextDomicilio.setText("");
        this.jCalendarFechaNacimiento.setDate(Calendar.getInstance().getTime());
        this.jTextTelefono.setText("");
        this.jComboMedico.setSelectedItem(null);
        this.jLabelMedicoC.setText("");
        this.jComboObraSocial.setSelectedItem(null);
        this.jLabelObraS.setText("");
        this.jLabelError.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarContinuarjButton;
    private javax.swing.JButton GuardarSalirjButton;
    private org.freixas.jcalendar.JCalendarCombo jCalendarFechaNacimiento;
    private javax.swing.JComboBox jComboMedico;
    private javax.swing.JComboBox jComboObraSocial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelMedicoC;
    private javax.swing.JLabel jLabelObraS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextDNI;
    private javax.swing.JTextField jTextDomicilio;
    private javax.swing.JTextField jTextNomAp;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
