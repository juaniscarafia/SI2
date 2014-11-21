package laboratorio.ui.analisis;

import java.awt.KeyboardFocusManager;
import java.beans.PropertyVetoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import laboratorio.ui.LaboratorioJFrame;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import laboratorio.Entidades.Analisis;
import laboratorio.Entidades.BusquedaAnalisis;
import laboratorio.Entidades.Muestra;
import laboratorio.Entidades.Pacientes;
import laboratorio.Entidades.Recetas;
import laboratorio.controladores.AnalisisJpaController;
import laboratorio.controladores.MuestraJpsController;
import laboratorio.controladores.PacientesJpaController;
import laboratorio.controladores.RecetasJpaController;

public class GestionAnalisisJInternalFrame extends javax.swing.JInternalFrame {
    private static GestionAnalisisJInternalFrame INSTANCIA = new GestionAnalisisJInternalFrame();
    private DetalleAnalisisTableModel tableModel;
    private BusquedaAnalisis busqueda;
    private Analisis analisisSeleccionado = null;
    public static Recetas auxreceta =new Recetas();

    public GestionAnalisisJInternalFrame() {
        this.tableModel = new DetalleAnalisisTableModel();
        this.tableModel.setAnalisis(AnalisisJpaController.buscarTodos());
        initComponents();
    }
    
    public static GestionAnalisisJInternalFrame getInstancia() {
        return INSTANCIA;
    }
    
    private void jTable1ValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            this.analisisSeleccionado = this.tableModel.getAnalisis(this.jTable1.getSelectedRow());
            //solo habilito los botones "modificar" o "eliminar" 
            //si hay un alumno seleccionado en la lista
            if(this.analisisSeleccionado != null){
                this.ModificarAnalisisjButton.setEnabled(true);
                this.EliminarAnalisisjButton.setEnabled(true);
            }else{
                this.ModificarAnalisisjButton.setEnabled(false);
                this.EliminarAnalisisjButton.setEnabled(false);
            }
        }
    }
    
    private void actualizarDatosJTableOrdenados(){
        this.tableModel.setAnalisis(AnalisisJpaController.buscarTodos());
        this.tableModel.fireTableDataChanged();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        NuevoAnalisisjButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ModificarAnalisisjButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        EliminarAnalisisjButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestión de Análisis");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/UserSetup.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
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

        NuevoAnalisisjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        NuevoAnalisisjButton.setText("Nuevo");
        NuevoAnalisisjButton.setFocusable(false);
        NuevoAnalisisjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NuevoAnalisisjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevoAnalisisjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoAnalisisjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(NuevoAnalisisjButton);
        jToolBar1.add(jSeparator1);

        ModificarAnalisisjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/modificar.png"))); // NOI18N
        ModificarAnalisisjButton.setText("Modificar");
        ModificarAnalisisjButton.setEnabled(false);
        ModificarAnalisisjButton.setFocusable(false);
        ModificarAnalisisjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ModificarAnalisisjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ModificarAnalisisjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarAnalisisjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ModificarAnalisisjButton);
        jToolBar1.add(jSeparator2);

        EliminarAnalisisjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/eliminar.png"))); // NOI18N
        EliminarAnalisisjButton.setText("Eliminar");
        EliminarAnalisisjButton.setEnabled(false);
        EliminarAnalisisjButton.setFocusable(false);
        EliminarAnalisisjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        EliminarAnalisisjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EliminarAnalisisjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAnalisisjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(EliminarAnalisisjButton);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código de Análisis:");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setText("Código de Muestra:");

        jComboBox1.setModel(new DefaultComboBoxModel(MuestraJpsController.buscarTodos().toArray()));
        ((DefaultComboBoxModel)jComboBox1.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboBox1.getModel()).setSelectedItem(null);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel3.setText("Código de Receta:");

        jComboBox2.setModel(new DefaultComboBoxModel(RecetasJpaController.buscarTodos().toArray()));
        ((DefaultComboBoxModel)jComboBox2.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboBox2.getModel()).setSelectedItem(null);
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jLabel4.setText("Dni Paciente:");

        jComboBox3.setModel(new DefaultComboBoxModel(PacientesJpaController.findAll().toArray()));
        ((DefaultComboBoxModel)jComboBox3.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboBox3.getModel()).setSelectedItem(null);
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoAnalisisjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoAnalisisjButtonActionPerformed
        NuevoAnalisisJInternalFrame iFrame = NuevoAnalisisJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionAnalisisJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NuevoAnalisisjButtonActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        this.actualizarDatosJTableOrdenados();
    }//GEN-LAST:event_formInternalFrameActivated

    private void EliminarAnalisisjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAnalisisjButtonActionPerformed

        Recetas auxRecetas= this.analisisSeleccionado.getReceta();
        if( auxRecetas.getAnalinis()!= null && auxRecetas.getAnalinis().size()== 1){
            
            String msj = "Si eliminas el  análisis seleccionado se eliminará  "
                         + "la receta asociada.\n"
                    ;
            Object[] opciones = {"Aceptar","Cancelar"};
            int n = JOptionPane.showOptionDialog(this, msj, "Atención!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if(n == JOptionPane.YES_OPTION){
                
                AnalisisJpaController.eliminar(this.analisisSeleccionado);
                RecetasJpaController.eliminar(auxRecetas);
                this.actualizarDatosJTableOrdenados();
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
               auxRecetas.getAnalinis().remove(this.analisisSeleccionado);
               AnalisisJpaController.eliminar(this.analisisSeleccionado);
                
               this.actualizarDatosJTableOrdenados();
            }
        }
    }//GEN-LAST:event_EliminarAnalisisjButtonActionPerformed

    private void ModificarAnalisisjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarAnalisisjButtonActionPerformed
        auxreceta = this.analisisSeleccionado.getReceta();
        NuevoAnalisisJInternalFrame iFrame = NuevoAnalisisJInternalFrame.getInstancia();
        iFrame.setAnalisis(this.analisisSeleccionado);
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionAnalisisJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarAnalisisjButtonActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
         Muestra MuestraCombo=(Muestra)  jComboBox1.getSelectedItem();
        if(MuestraCombo != null){
                       
            this.tableModel.setAnalisis((List<Analisis>) MuestraCombo.getAnalisis());
            this.tableModel.fireTableDataChanged();
        }
        else{
              this.actualizarDatosJTableOrdenados();
        
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
          Recetas RecetaCombo=(Recetas)  jComboBox2.getSelectedItem();
        if(RecetaCombo != null){
                       
            this.tableModel.setAnalisis((List<Analisis>) RecetaCombo.getAnalinis());
            this.tableModel.fireTableDataChanged();
        }
        else{
              this.actualizarDatosJTableOrdenados();
        
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged
  private void actualizarDatosJTable(){
        busqueda = BusquedaAnalisis.CODIGO;
        this.tableModel.setAnalisis(AnalisisJpaController.buscarFiltradosOrdenados(this.jTextField1.getText(),this.busqueda));
        this.tableModel.fireTableDataChanged();
    }
  
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
         if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
            manager.focusNextComponent();
        }
        if(evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_DELETE
            && evt.getKeyCode() != KeyEvent.VK_LEFT && evt.getKeyCode() != KeyEvent.VK_RIGHT){
            this.jTextField1.setText(((JTextField)evt.getSource()).getText().toUpperCase());
        }
        this.actualizarDatosJTable();// TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
          Pacientes PacienteCombo=(Pacientes)  jComboBox3.getSelectedItem();
        if(PacienteCombo != null){
                       
            this.tableModel.setAnalisis(AnalisisJpaController.buscarAnalisisPorPacientes(PacienteCombo));
            this.tableModel.fireTableDataChanged();
        }
        else{
              this.actualizarDatosJTableOrdenados();
        
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarAnalisisjButton;
    private javax.swing.JButton ModificarAnalisisjButton;
    private javax.swing.JButton NuevoAnalisisjButton;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
