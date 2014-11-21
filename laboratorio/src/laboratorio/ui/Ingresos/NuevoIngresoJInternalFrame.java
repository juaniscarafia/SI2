package laboratorio.ui.Ingresos;

import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.util.Calendar;
import laboratorio.Entidades.Ingresos;
import laboratorio.Entidades.Pacientes;
import laboratorio.controladores.IngresosJpaController;
import laboratorio.controladores.PacientesJpaController;

public class NuevoIngresoJInternalFrame extends javax.swing.JInternalFrame {
    private static NuevoIngresoJInternalFrame INSTANCIA = new NuevoIngresoJInternalFrame();
    private Pacientes pacienteSeleccionado = null;
    private Ingresos ingreso = new Ingresos();
    private boolean modificacion = false;
    
    public NuevoIngresoJInternalFrame() {
        initComponents();
    }
    
    public static NuevoIngresoJInternalFrame getInstancia(){
        return INSTANCIA;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboPaciente = new javax.swing.JComboBox();
        jLabelMedicoC = new javax.swing.JLabel();
        jCalendarFechaIngreso = new org.freixas.jcalendar.JCalendarCombo();
        jToolBar1 = new javax.swing.JToolBar();
        GuardarSalirjIngresoButton = new javax.swing.JButton();
        GuardarContinuarIngresosjButton = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Nuevo Ingreso");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/PatientMale.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
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
                formInternalFrameActivated(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        jLabel4.setText("Fecha de Ingreso:");

        jLabel6.setText("Páciente:");

        jComboPaciente.setModel(new DefaultComboBoxModel(PacientesJpaController.findAll().toArray()));
        ((DefaultComboBoxModel)jComboPaciente.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboPaciente.getModel()).setSelectedItem(null);
        jComboPaciente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboPacienteItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelMedicoC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCalendarFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCalendarFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabelMedicoC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Datos Personales");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarSalirjIngresoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSalirjIngresoButtonActionPerformed
        Ingresos auxPaciente = this.validarDatos();
        if(auxPaciente != null){
            if(this.modificacion){
                try{
                    IngresosJpaController.modificar(ingreso);
                    JOptionPane.showMessageDialog(this, "Los datos del ingreso se han modificado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    IngresosJpaController.crear(ingreso);
                    JOptionPane.showMessageDialog(this, "El nuevo ingreso ha sido creado correctamente");
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
            this.pacienteSeleccionado = (Pacientes) this.jComboPaciente.getSelectedItem();
            this.jLabelMedicoC.setText(this.pacienteSeleccionado.getNombreyApellido());
        }
    }//GEN-LAST:event_jComboPacienteItemStateChanged

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        INSTANCIA = new NuevoIngresoJInternalFrame();
    }//GEN-LAST:event_formInternalFrameClosed

    private void GuardarContinuarIngresosjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarContinuarIngresosjButtonActionPerformed
        Ingresos auxPaciente = this.validarDatos();
        if(auxPaciente != null){
            if(this.modificacion){
                try{
                    IngresosJpaController.modificar(ingreso);
                    JOptionPane.showMessageDialog(this, "Los datos del ingreso se han modificado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                    
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    IngresosJpaController.crear(ingreso);
                    JOptionPane.showMessageDialog(this, "El nuevo ingreso ha sido creado correctamente");
                    this.limpiarCampos();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar guardar los datos");
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_GuardarContinuarIngresosjButtonActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated

    private Ingresos validarDatos(){
        if(this.jCalendarFechaIngreso.getCalendar() == null){
            this.jLabelError.setText("Debe seleccionar una fecha de Ingreso");
            return null;
        }
        if(this.pacienteSeleccionado == null){
            this.jLabelError.setText("Debe seleccionar un paciente");
            return null;
        }
        this.ingreso.setFechaIngreso(this.jCalendarFechaIngreso.getCalendar());
        this.ingreso.setIngresopacientes(this.pacienteSeleccionado);
        return this.ingreso;
    }
    
    public void setIngresoSeleccionado(Ingresos Ingresos) {
        this.setTitle("Modificar Ingreso");
        this.ingreso =Ingresos ;
        this.modificacion= true;
        this.GuardarContinuarIngresosjButton.setEnabled(false);
        this.jComboPaciente.setSelectedItem(ingreso.getIngresopacientes());
    }
     
    private void limpiarCampos(){
        this.setTitle("Nuevo Ingreso");
        this.ingreso = new Ingresos();
        this.modificacion = false;
        this.jCalendarFechaIngreso.setDate(Calendar.getInstance().getTime());
        this.jComboPaciente.setSelectedItem(null);
        this.jLabelMedicoC.setText("");
        this.jLabelError.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarContinuarIngresosjButton;
    private javax.swing.JButton GuardarSalirjIngresoButton;
    private org.freixas.jcalendar.JCalendarCombo jCalendarFechaIngreso;
    private javax.swing.JComboBox jComboPaciente;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelMedicoC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
