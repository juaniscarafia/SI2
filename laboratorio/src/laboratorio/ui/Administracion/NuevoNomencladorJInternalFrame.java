package laboratorio.ui.Administracion;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import laboratorio.Entidades.Nomenclador;
import laboratorio.Entidades.ObraSociales;
import laboratorio.Entidades.TipoAnalisis;
import laboratorio.controladores.NomencladorJpaController;
import laboratorio.controladores.ObraSocialesJpaController;
import laboratorio.controladores.TipoAnalisisJpaController;

public class NuevoNomencladorJInternalFrame extends javax.swing.JInternalFrame {
    private static NuevoNomencladorJInternalFrame INSTANCIA = new NuevoNomencladorJInternalFrame();
    private Nomenclador nomenclador = new Nomenclador();
    private ObraSociales obraSocialSeleccionada = new ObraSociales();
    private TipoAnalisis analisisSeleccionado = new TipoAnalisis();
    private boolean modificacion = false;

    public NuevoNomencladorJInternalFrame() {
        initComponents();
    }
    
    public static NuevoNomencladorJInternalFrame getInstancia(){
        return INSTANCIA;
    }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        GuardarSalirjIngresoButton = new javax.swing.JButton();
        GuardarContinuarIngresosjButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelObraS = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboObraSocial = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jComboAnalisis = new javax.swing.JComboBox();
        jLabelAnalisis = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Nuevo Nomenclador");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        jLabel6.setText("Precio:");

        jTextPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPrecioKeyTyped(evt);
            }
        });

        jLabel7.setText("Obra social:");

        jComboObraSocial.setModel(new DefaultComboBoxModel(ObraSocialesJpaController.findAll().toArray()));
        ((DefaultComboBoxModel)jComboObraSocial.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboObraSocial.getModel()).setSelectedItem(null);
        jComboObraSocial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboObraSocialItemStateChanged(evt);
            }
        });

        jLabel8.setText("Análisis:");

        jComboAnalisis.setModel(new DefaultComboBoxModel(TipoAnalisisJpaController.buscarTodos().toArray()));
        ((DefaultComboBoxModel)jComboAnalisis.getModel()).insertElementAt(null, 0);
        ((DefaultComboBoxModel)jComboAnalisis.getModel()).setSelectedItem(null);
        jComboAnalisis.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboAnalisisItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(39, 39, 39)
                        .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboObraSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelObraS, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObraS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboObraSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabelAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarSalirjIngresoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarSalirjIngresoButtonActionPerformed
        Nomenclador auxNomenclador = this.validarDatos();
        if(auxNomenclador != null){
            if(this.modificacion){
                try{
                    NomencladorJpaController.modificar(nomenclador);
                    JOptionPane.showMessageDialog(this, "Los datos se han modificado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    NomencladorJpaController.crear(nomenclador);
                    JOptionPane.showMessageDialog(this, "El nuevo nomenclador ha sido creado correctamente");
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
        Nomenclador auxNomenclador = this.validarDatos();
        if(auxNomenclador != null){
            if(this.modificacion){
                try{
                    NomencladorJpaController.modificar(nomenclador);
                    JOptionPane.showMessageDialog(this, "Los datos se han modificado correctamente");
                    this.getDesktopPane().selectFrame(false);
                    this.dispose();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar modificar los datos");
                }
            }else{
                try{
                    NomencladorJpaController.crear(nomenclador);
                    JOptionPane.showMessageDialog(this, "El nuevo nomenclador ha sido creado correctamente");
                    this.limpiarCampos();
                }catch(Exception ex){
                    this.jLabelError.setText("Error al intentar guardar los datos");
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_GuardarContinuarIngresosjButtonActionPerformed

    private void jTextPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPrecioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrecioKeyTyped
        
    private void jComboObraSocialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboObraSocialItemStateChanged
        if (this.jComboObraSocial.getSelectedItem() != null){
            this.obraSocialSeleccionada = (ObraSociales)this.jComboObraSocial.getSelectedItem();
            this.jLabelObraS.setText(Integer.toString(this.obraSocialSeleccionada.getCodObraSocial()));
        }
    }//GEN-LAST:event_jComboObraSocialItemStateChanged

    private void jComboAnalisisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboAnalisisItemStateChanged
        if (this.jComboAnalisis.getSelectedItem() != null){
            this.analisisSeleccionado = (TipoAnalisis)this.jComboAnalisis.getSelectedItem();
            this.jLabelAnalisis.setText(Integer.toString(this.analisisSeleccionado.getCodTipoAnalisis()));
        }
    }//GEN-LAST:event_jComboAnalisisItemStateChanged

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        INSTANCIA = new NuevoNomencladorJInternalFrame();
    }//GEN-LAST:event_formInternalFrameClosed
        
    private Nomenclador validarDatos(){
        this.nomenclador.setPrecio(Float.parseFloat(this.jTextPrecio.getText()));
        this.nomenclador.setTipoAnalisis(analisisSeleccionado);
        this.nomenclador.setObraSocial(obraSocialSeleccionada);
        return this.nomenclador;
    }
    
    public void setNomencladorSeleccionado(Nomenclador nomenclador) {
        this.setTitle("Modificar Nomenclador");
        this.nomenclador = nomenclador;
        this.modificacion= true;
        this.GuardarContinuarIngresosjButton.setEnabled(false);
        this.jTextPrecio.setText(String.valueOf(nomenclador.getPrecio()));
        this.jComboAnalisis.setSelectedItem(nomenclador.getTipoAnalisis());
        this.jComboAnalisis.setEditable(false);
        this.jComboObraSocial.setSelectedItem(nomenclador.getObraSocial());
        this.jComboObraSocial.setEditable(false);
    }
     
    private void limpiarCampos(){
        this.setTitle("Nuevo Nomenclador");
        this.nomenclador = new Nomenclador();
        this.modificacion = false;
        this.jTextPrecio.setText("");
        this.jTextPrecio.setEditable(true);
        this.jComboAnalisis.setSelectedItem(null);
        this.jComboObraSocial.setSelectedItem(null);
        this.jLabelError.setText("");
        this.jLabelObraS.setText("");
        this.jLabelAnalisis.setText("");
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarContinuarIngresosjButton;
    private javax.swing.JButton GuardarSalirjIngresoButton;
    private javax.swing.JComboBox jComboAnalisis;
    private javax.swing.JComboBox jComboObraSocial;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAnalisis;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelObraS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
