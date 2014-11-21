package laboratorio.ui.Administracion;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import laboratorio.Entidades.TipoAnalisis;
import laboratorio.Entidades.TipoResultados;
import laboratorio.controladores.TipoAnalisisJpaController;
import laboratorio.controladores.TipoResultadosJpaController;

public class NuevoTipoAnalisisJInternalFrame extends javax.swing.JInternalFrame {
    private static NuevoTipoAnalisisJInternalFrame INSTANCIA = new NuevoTipoAnalisisJInternalFrame();
    private TipoAnalisis tipoAnalisis = new TipoAnalisis();
    private DetalleResultadoAnalisisTableModel tableModel = new DetalleResultadoAnalisisTableModel();
    private boolean modificacion = false;
    private TipoResultados tipoResultadoSeleccionado = new TipoResultados();
    private TipoResultados tipoResultadoSeleccionadoTable = new TipoResultados();
    
    public NuevoTipoAnalisisJInternalFrame() {
        this.tableModel = new DetalleResultadoAnalisisTableModel();
        initComponents();
    }

    public static NuevoTipoAnalisisJInternalFrame getInstancia(){
        return INSTANCIA;
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        GuardarSalirjIngresoButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextDescripcion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTipoResultado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        jComboResultado = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        EliminarTipoResultadojButton = new javax.swing.JButton();
        NuevoTipoResultadojButton = new javax.swing.JButton();

        setClosable(true);
        setTitle("Nuevo Tipo de Análisis");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addContainerGap())))
        );

        jTableTipoResultado.setModel(this.tableModel);
        jScrollPane2.setViewportView(jTableTipoResultado);
        jTableTipoResultado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTableTipoResultado.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent evt) {
                jTableTipoResultadoValueChanged(evt);
            }
        });

        jLabel1.setText("Tipos de Resultados:");

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jComboResultado.setModel(new DefaultComboBoxModel(TipoResultadosJpaController.BuscarTodos().toArray()));
        ((DefaultComboBoxModel)jComboResultado.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboResultado.getModel()).setSelectedItem(null);
        jComboResultado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboResultadoItemStateChanged(evt);
            }
        });

        jLabel8.setText("Resultado:");

        EliminarTipoResultadojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/eliminar.png"))); // NOI18N
        EliminarTipoResultadojButton.setEnabled(false);
        EliminarTipoResultadojButton.setFocusable(false);
        EliminarTipoResultadojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        EliminarTipoResultadojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EliminarTipoResultadojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTipoResultadojButtonActionPerformed(evt);
            }
        });

        NuevoTipoResultadojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        NuevoTipoResultadojButton.setFocusable(false);
        NuevoTipoResultadojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NuevoTipoResultadojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevoTipoResultadojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoTipoResultadojButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NuevoTipoResultadojButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EliminarTipoResultadojButton))
                                    .addComponent(jComboResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(288, 288, 288)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(237, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevoTipoResultadojButton)
                    .addComponent(EliminarTipoResultadojButton))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(376, 376, 376)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarSalirjIngresoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSalirjIngresoButtonActionPerformed
        TipoAnalisis auxTipoAnalisis = this.validarDatos();
        if(auxTipoAnalisis != null){
            if(this.modificacion){
                try{
                    TipoAnalisisJpaController.modificar(tipoAnalisis);
                    JOptionPane.showMessageDialog(this, "Los datos se han modificado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    TipoAnalisisJpaController.crear(tipoAnalisis);
                    JOptionPane.showMessageDialog(this, "El nuevo tipo de análisis ha sido creado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar guardar los datos");
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_GuardarSalirjIngresoButtonActionPerformed

    private void actualizarDatosJTableTipoResultados(){
        this.tableModel.setTiposResultados(tipoAnalisis.getResultados());
        this.tableModel.fireTableDataChanged();
    }    
    
    private void jTextDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDescripcionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescripcionKeyTyped

    private void NuevoTipoResultadojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoTipoResultadojButtonActionPerformed
       this.tipoAnalisis.addResultados(tipoResultadoSeleccionado);
       this.actualizarDatosJTableTipoResultados();
    }//GEN-LAST:event_NuevoTipoResultadojButtonActionPerformed

    private void EliminarTipoResultadojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTipoResultadojButtonActionPerformed
        String msj = "Se eliminarán todos los datos de la base de datos "
        + "y no podrán recuperarse.\n"
        + "Desea continuar?";
        int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n == JOptionPane.YES_OPTION){
            tipoAnalisis.deleteTipoResultado(tipoResultadoSeleccionadoTable);
            this.actualizarDatosJTableTipoResultados();
        }
    }//GEN-LAST:event_EliminarTipoResultadojButtonActionPerformed

    private void jComboResultadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboResultadoItemStateChanged
        if (this.jComboResultado.getSelectedItem() != null){
            this.tipoResultadoSeleccionado = (TipoResultados) this.jComboResultado.getSelectedItem();
        }
    }//GEN-LAST:event_jComboResultadoItemStateChanged

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        INSTANCIA = new NuevoTipoAnalisisJInternalFrame();
    }//GEN-LAST:event_formInternalFrameClosed
    
    private void jTableTipoResultadoValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            this.tipoResultadoSeleccionadoTable = this.tableModel.getTipoResultados(this.jTableTipoResultado.getSelectedRow());
            if(this.tipoResultadoSeleccionadoTable != null){
                this.EliminarTipoResultadojButton.setEnabled(true);
            }else{
                this.EliminarTipoResultadojButton.setEnabled(false);
            }
        }
    }    
    
    private TipoAnalisis validarDatos(){
        this.tipoAnalisis.setDescripcion(this.jTextDescripcion.getText());
        this.tipoAnalisis.setResultados(this.tableModel.getTipoResultados());
        return this.tipoAnalisis;
    }
    
    public void setTipoAnalisisSeleccionado(TipoAnalisis tipoAnalisis) {
        this.setTitle("Modificar Tipo Análisis");
        this.tipoAnalisis = tipoAnalisis;
        this.jTextDescripcion.setText(tipoAnalisis.getDescripcion());
        this.tableModel.setTiposResultados(tipoAnalisis.getResultados());
        this.modificacion= true;
        
    }
     
    private void limpiarCampos(){
        this.setTitle("Nuevo Tipo Análisis");
        this.tipoAnalisis = new TipoAnalisis();
        this.modificacion = false;
        this.jTextDescripcion.setText("");
        this.tipoAnalisis.setResultados(null);
        this.jLabelError.setText("");
        this.tableModel.setTiposResultados(this.tipoAnalisis.getResultados());
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarTipoResultadojButton;
    private javax.swing.JButton GuardarSalirjIngresoButton;
    private javax.swing.JButton NuevoTipoResultadojButton;
    private javax.swing.JComboBox jComboResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTipoResultado;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
