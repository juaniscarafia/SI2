package laboratorio.ui.Administracion;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import laboratorio.ui.LaboratorioJFrame;
import javax.swing.JOptionPane;
import laboratorio.Entidades.BusquedaNomencladores;
import laboratorio.Entidades.BusquedaTipoAnalisis;
import laboratorio.Entidades.BusquedaTipoMuestra;
import laboratorio.Entidades.BusquedaTipoResultado;
import laboratorio.Entidades.Nomenclador;
import laboratorio.Entidades.TipoAnalisis;
import laboratorio.Entidades.TipoMuestra;
import laboratorio.Entidades.TipoResultados;
import laboratorio.controladores.BioquimicosJpaController;
import laboratorio.controladores.NomencladorJpaController;
import laboratorio.controladores.TipoAnalisisJpaController;
import laboratorio.controladores.TipoMuestraJpaController;
import laboratorio.controladores.TipoResultadosJpaController;

public class GestionDatosJInternalFrame extends javax.swing.JInternalFrame {

    private static GestionDatosJInternalFrame INSTANCIA = new GestionDatosJInternalFrame();
    private DetalleTipoAnalisisTableModel tableModelTipoAnalisis;
    private DetalleTipoResultadoTableModel tableModelTipoResultados;
    private DetalleTipoMuestraTableModel tableModelTipoMuestra;
    private DetalleNomencladorTableModel tableModelNomencladores;
    
    private BusquedaTipoAnalisis  busquedaTipoAnalisis = BusquedaTipoAnalisis.CODIGO;
    private BusquedaTipoResultado busquedaTipoResultado = BusquedaTipoResultado.CODIGO;
    private BusquedaTipoMuestra busquedaTipoMuestra = BusquedaTipoMuestra.CODIGO;
    private BusquedaNomencladores busquedaNomencladores = BusquedaNomencladores.CODIGO;
    
    private TipoAnalisis tipoAnalisisSeleccionado = null;
    private TipoResultados tipoResultadoSeleccionado = null;
    private TipoMuestra tipoMuestraSeleccionada = null;
    private Nomenclador nomencladorSeleccionado = null;
    
    
    public GestionDatosJInternalFrame() {
        this.tableModelTipoAnalisis = new DetalleTipoAnalisisTableModel();
        this.tableModelTipoAnalisis.setTipoAnalisis(TipoAnalisisJpaController.buscarTodos());
        this.tableModelTipoMuestra = new DetalleTipoMuestraTableModel();
        this.tableModelTipoMuestra.setTipoMuestra(TipoMuestraJpaController.buscarTodos());
        this.tableModelTipoResultados = new DetalleTipoResultadoTableModel();
        this.tableModelTipoResultados.setTipoResultados(TipoResultadosJpaController.BuscarTodos());        
        this.tableModelNomencladores = new DetalleNomencladorTableModel();
        this.tableModelNomencladores.setNomencladores(NomencladorJpaController.buscarTodos());
        initComponents();
    }
    
    public static GestionDatosJInternalFrame getInstancia() {
        return INSTANCIA;
    }
    
    ////// TIPO ANALISIS
    private void jTableTipoAnalisisValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            this.tipoAnalisisSeleccionado = this.tableModelTipoAnalisis.getTipoAnalisis(this.jTableTipoAnalisis.getSelectedRow());
            if(this.tipoAnalisisSeleccionado != null){
                this.ModificarTipoAnalisisjButton.setEnabled(true);
                this.EliminarTipoAnalisisjButton.setEnabled(true);
            }else{
                this.ModificarTipoAnalisisjButton.setEnabled(false);
                this.EliminarTipoAnalisisjButton.setEnabled(false);
            }
        }
    }
    
    private void actualizarDatosJTableTipoAnalisisOrdenados(){
        this.tableModelTipoAnalisis.setTipoAnalisis(TipoAnalisisJpaController.buscarTodos());
        this.tableModelTipoAnalisis.fireTableDataChanged();
    }
    
    private void actualizarDatosJTableTipoAnalisis(){
        busquedaTipoAnalisis = BusquedaTipoAnalisis.CODIGO;
        this.tableModelTipoAnalisis.setTipoAnalisis(TipoAnalisisJpaController.buscarTodos());
        this.tableModelTipoAnalisis.fireTableDataChanged();
    }
    
    ///// TIPO RESULTADO
    private void jTableTipoResultadoValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            this.tipoResultadoSeleccionado = this.tableModelTipoResultados.getTipoResultados(this.jTableTipoResultado.getSelectedRow());
            if(this.tipoResultadoSeleccionado != null){
                this.ModificarTipoResultadojButton.setEnabled(true);
                this.EliminarTipoResultadojButton.setEnabled(true);
            }else{
                this.ModificarTipoResultadojButton.setEnabled(false);
                this.EliminarTipoResultadojButton.setEnabled(false);
            }
        }
    }
    
    private void actualizarDatosJTableTipoResultadoOrdenados(){
        this.tableModelTipoResultados.setTipoResultados(TipoResultadosJpaController.BuscarTodos());
        this.tableModelTipoResultados.fireTableDataChanged();
    }
    
    private void actualizarDatosJTableTipoResultados(){
        busquedaTipoResultado = BusquedaTipoResultado.CODIGO;
        this.tableModelTipoResultados.setTipoResultados(TipoResultadosJpaController.BuscarTodos());
        this.tableModelTipoResultados.fireTableDataChanged();
    }
    
    ///// TIPO MUESTRA
    private void jTableTipoMuestraValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            this.tipoMuestraSeleccionada = this.tableModelTipoMuestra.getTipoMuestra(this.jTableTipoMuestra.getSelectedRow());
            if(this.tipoMuestraSeleccionada != null){
                this.ModificarTipoMuestrajButton.setEnabled(true);
                this.EliminarTipoMuestrajButton.setEnabled(true);
            }else{
                this.ModificarTipoMuestrajButton.setEnabled(false);
                this.EliminarTipoMuestrajButton.setEnabled(false);
            }
        }
    }
    
    private void actualizarDatosJTableTipoMuestraOrdenados(){
        this.tableModelTipoMuestra.setTipoMuestra(TipoMuestraJpaController.buscarTodos());
        this.tableModelTipoMuestra.fireTableDataChanged();
    }
    
    private void actualizarDatosJTableTipoMuestra(){
        busquedaTipoMuestra = BusquedaTipoMuestra.CODIGO;
        this.tableModelTipoMuestra.setTipoMuestra(TipoMuestraJpaController.buscarTodos());
        this.tableModelTipoMuestra.fireTableDataChanged();
    }    
    
    ///// NOMENCLADORES
    private void jTableNomencladoresValueChanged(ListSelectionEvent evt){
        if(!evt.getValueIsAdjusting()){
            this.nomencladorSeleccionado = this.tableModelNomencladores.getNomencladores(this.jTableNomencladores.getSelectedRow());
            if(this.nomencladorSeleccionado != null){
                this.ModificarNomencladorjButton.setEnabled(true);
                this.EliminarNomencladorjButton.setEnabled(true);
            }else{
                this.ModificarNomencladorjButton.setEnabled(false);
                this.EliminarNomencladorjButton.setEnabled(false);
            }
        }
    }
    
    private void actualizarDatosJTableNomencladoresOrdenados(){
        this.tableModelNomencladores.setNomencladores(NomencladorJpaController.buscarTodos());
        this.tableModelNomencladores.fireTableDataChanged();
    }
    
    private void actualizarDatosJTableNomencladores(){
        busquedaNomencladores = BusquedaNomencladores.CODIGO;
        this.tableModelNomencladores.setNomencladores(NomencladorJpaController.buscarTodos());
        this.tableModelNomencladores.fireTableDataChanged();
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTipoAnalisis = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTipoResultado = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableNomencladores = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableTipoMuestra = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        NuevoTipoResultadojButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ModificarTipoResultadojButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        EliminarTipoResultadojButton = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        NuevoTipoAnalisisjButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        ModificarTipoAnalisisjButton = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        EliminarTipoAnalisisjButton = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        NuevoTipoMuestrajButton = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        ModificarTipoMuestrajButton = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        EliminarTipoMuestrajButton = new javax.swing.JButton();
        jToolBar5 = new javax.swing.JToolBar();
        NuevoNomencladorjButton = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        ModificarNomencladorjButton = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        EliminarNomencladorjButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gestión de Datos");
        setToolTipText("");
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

        jTableTipoAnalisis.setModel(this.tableModelTipoAnalisis);
        jScrollPane1.setViewportView(jTableTipoAnalisis);
        jTableTipoAnalisis.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTableTipoAnalisis.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent evt) {
                jTableTipoAnalisisValueChanged(evt);
            }
        });

        jTableTipoResultado.setModel(this.tableModelTipoResultados);
        jScrollPane2.setViewportView(jTableTipoResultado);
        jTableTipoResultado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTableTipoResultado.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent evt) {
                jTableTipoResultadoValueChanged(evt);
            }
        });

        jTableNomencladores.setModel(this.tableModelNomencladores);
        jScrollPane3.setViewportView(jTableNomencladores);
        jTableNomencladores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTableNomencladores.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent evt) {
                jTableNomencladoresValueChanged(evt);
            }
        });

        jTableTipoMuestra.setModel(this.tableModelTipoMuestra);
        jScrollPane5.setViewportView(jTableTipoMuestra);
        jTableTipoMuestra.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTableTipoMuestra.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent evt) {
                jTableTipoMuestraValueChanged(evt);
            }
        });

        jLabel1.setText("Tipos de Resultados:");

        jLabel2.setText("Tipos de Analisis:");

        jLabel3.setText("Nomencladores:");

        jLabel4.setText("Tipos de Muestra:");

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        NuevoTipoResultadojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        NuevoTipoResultadojButton.setFocusable(false);
        NuevoTipoResultadojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NuevoTipoResultadojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevoTipoResultadojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoTipoResultadojButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(NuevoTipoResultadojButton);
        jToolBar1.add(jSeparator1);

        ModificarTipoResultadojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/modificar.png"))); // NOI18N
        ModificarTipoResultadojButton.setEnabled(false);
        ModificarTipoResultadojButton.setFocusable(false);
        ModificarTipoResultadojButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ModificarTipoResultadojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ModificarTipoResultadojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarTipoResultadojButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ModificarTipoResultadojButton);
        jToolBar1.add(jSeparator2);

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
        jToolBar1.add(EliminarTipoResultadojButton);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        NuevoTipoAnalisisjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        NuevoTipoAnalisisjButton.setFocusable(false);
        NuevoTipoAnalisisjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NuevoTipoAnalisisjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevoTipoAnalisisjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoTipoAnalisisjButtonActionPerformed(evt);
            }
        });
        jToolBar2.add(NuevoTipoAnalisisjButton);
        jToolBar2.add(jSeparator3);

        ModificarTipoAnalisisjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/modificar.png"))); // NOI18N
        ModificarTipoAnalisisjButton.setEnabled(false);
        ModificarTipoAnalisisjButton.setFocusable(false);
        ModificarTipoAnalisisjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ModificarTipoAnalisisjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ModificarTipoAnalisisjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarTipoAnalisisjButtonActionPerformed(evt);
            }
        });
        jToolBar2.add(ModificarTipoAnalisisjButton);
        jToolBar2.add(jSeparator4);

        EliminarTipoAnalisisjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/eliminar.png"))); // NOI18N
        EliminarTipoAnalisisjButton.setEnabled(false);
        EliminarTipoAnalisisjButton.setFocusable(false);
        EliminarTipoAnalisisjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        EliminarTipoAnalisisjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EliminarTipoAnalisisjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTipoAnalisisjButtonActionPerformed(evt);
            }
        });
        jToolBar2.add(EliminarTipoAnalisisjButton);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        NuevoTipoMuestrajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        NuevoTipoMuestrajButton.setFocusable(false);
        NuevoTipoMuestrajButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NuevoTipoMuestrajButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevoTipoMuestrajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoTipoMuestrajButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(NuevoTipoMuestrajButton);
        jToolBar3.add(jSeparator5);

        ModificarTipoMuestrajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/modificar.png"))); // NOI18N
        ModificarTipoMuestrajButton.setEnabled(false);
        ModificarTipoMuestrajButton.setFocusable(false);
        ModificarTipoMuestrajButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ModificarTipoMuestrajButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ModificarTipoMuestrajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarTipoMuestrajButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(ModificarTipoMuestrajButton);
        jToolBar3.add(jSeparator6);

        EliminarTipoMuestrajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/eliminar.png"))); // NOI18N
        EliminarTipoMuestrajButton.setEnabled(false);
        EliminarTipoMuestrajButton.setFocusable(false);
        EliminarTipoMuestrajButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        EliminarTipoMuestrajButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EliminarTipoMuestrajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTipoMuestrajButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(EliminarTipoMuestrajButton);

        jToolBar5.setFloatable(false);
        jToolBar5.setRollover(true);

        NuevoNomencladorjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/nuevo.png"))); // NOI18N
        NuevoNomencladorjButton.setFocusable(false);
        NuevoNomencladorjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        NuevoNomencladorjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevoNomencladorjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoNomencladorjButtonActionPerformed(evt);
            }
        });
        jToolBar5.add(NuevoNomencladorjButton);
        jToolBar5.add(jSeparator9);

        ModificarNomencladorjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/modificar.png"))); // NOI18N
        ModificarNomencladorjButton.setEnabled(false);
        ModificarNomencladorjButton.setFocusable(false);
        ModificarNomencladorjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ModificarNomencladorjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ModificarNomencladorjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarNomencladorjButtonActionPerformed(evt);
            }
        });
        jToolBar5.add(ModificarNomencladorjButton);
        jToolBar5.add(jSeparator10);

        EliminarNomencladorjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/eliminar.png"))); // NOI18N
        EliminarNomencladorjButton.setEnabled(false);
        EliminarNomencladorjButton.setFocusable(false);
        EliminarNomencladorjButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        EliminarNomencladorjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EliminarNomencladorjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarNomencladorjButtonActionPerformed(evt);
            }
        });
        jToolBar5.add(EliminarNomencladorjButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(202, 202, 202))))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        this.actualizarDatosJTableTipoAnalisis();
        this.actualizarDatosJTableTipoResultados();
        this.actualizarDatosJTableTipoMuestra();
        this.actualizarDatosJTableNomencladores();
    }//GEN-LAST:event_formInternalFrameActivated

    private void NuevoTipoResultadojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoTipoResultadojButtonActionPerformed
        NuevoTipoResultadoJInternalFrame iFrame = NuevoTipoResultadoJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionDatosJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NuevoTipoResultadojButtonActionPerformed

    private void ModificarTipoResultadojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarTipoResultadojButtonActionPerformed
        NuevoTipoResultadoJInternalFrame iFrame = NuevoTipoResultadoJInternalFrame.getInstancia();
        iFrame.setTipoResultadoSeleccionado(this.tipoResultadoSeleccionado);
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionDatosJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarTipoResultadojButtonActionPerformed

    private void EliminarTipoResultadojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTipoResultadojButtonActionPerformed
        String msj = "Se eliminarán todos los datos de la base de datos "
        + "y no podrán recuperarse.\n"
        + "Desea continuar?";
        int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n == JOptionPane.YES_OPTION){
            TipoResultadosJpaController.eliminar(this.tipoResultadoSeleccionado);
            this.actualizarDatosJTableTipoResultados();
        }
    }//GEN-LAST:event_EliminarTipoResultadojButtonActionPerformed

    private void NuevoTipoAnalisisjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoTipoAnalisisjButtonActionPerformed
        NuevoTipoAnalisisJInternalFrame iFrame = NuevoTipoAnalisisJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(NuevoTipoAnalisisJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NuevoTipoAnalisisjButtonActionPerformed

    private void ModificarTipoAnalisisjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarTipoAnalisisjButtonActionPerformed
        NuevoTipoAnalisisJInternalFrame iFrame = NuevoTipoAnalisisJInternalFrame.getInstancia();
        iFrame.setTipoAnalisisSeleccionado(this.tipoAnalisisSeleccionado);
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionDatosJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarTipoAnalisisjButtonActionPerformed

    private void EliminarTipoAnalisisjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTipoAnalisisjButtonActionPerformed
      
        if(this.tipoAnalisisSeleccionado.getAnalisis()!= null && this.tipoAnalisisSeleccionado.getAnalisis().size() >0){
            String msj = "El tipo de análisis seleccionado no puede eliminarse de la base de datos "
                    + "porque tiene datos de análisis asociados.\n"
                    ;
            Object[] opciones = {"Aceptar"};
            int n = JOptionPane.showOptionDialog(this, msj, "Atención!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if(n == JOptionPane.YES_OPTION){
              this.actualizarDatosJTableTipoAnalisis();
            }
        }else{
          String msj = "Se eliminarán todos los datos del tipo de análisis de la base de datos "
                + "y no podrán recuperarse.\n"
                + "Seguro desea continuar?";
        int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n == JOptionPane.YES_OPTION){
             TipoAnalisisJpaController.eliminar(this.tipoAnalisisSeleccionado);
            this.actualizarDatosJTableTipoAnalisis();
            }
        }
    }//GEN-LAST:event_EliminarTipoAnalisisjButtonActionPerformed

    private void NuevoTipoMuestrajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoTipoMuestrajButtonActionPerformed
        NuevoTipoMuestraJInternalFrame iFrame = NuevoTipoMuestraJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionDatosJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NuevoTipoMuestrajButtonActionPerformed

    private void ModificarTipoMuestrajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarTipoMuestrajButtonActionPerformed
        NuevoTipoMuestraJInternalFrame iFrame = NuevoTipoMuestraJInternalFrame.getInstancia();
        iFrame.setTipoMuestraSeleccionada(this.tipoMuestraSeleccionada);
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionDatosJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarTipoMuestrajButtonActionPerformed

    private void EliminarTipoMuestrajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTipoMuestrajButtonActionPerformed
      
         if(this.tipoMuestraSeleccionada.getMuestas()!= null && this.tipoMuestraSeleccionada.getMuestas().size() >0){
            String msj = "El tipo de muestra seleccionado no puede eliminarse de la base de datos "
                    + "porque tiene datos de muestra asociados.\n"
                    ;
            Object[] opciones = {"Aceptar"};
            int n = JOptionPane.showOptionDialog(this, msj, "Atención!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if(n == JOptionPane.YES_OPTION){
              this.actualizarDatosJTableTipoMuestra();
            }
        }else{
          String msj = "Se eliminarán todos los datos del tipo de muestra de la base de datos "
                + "y no podrán recuperarse.\n"
                + "Seguro desea continuar?";
        int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n == JOptionPane.YES_OPTION){
            TipoMuestraJpaController.eliminar(this.tipoMuestraSeleccionada);
            this.actualizarDatosJTableTipoMuestra(); 
            }
        }
    }//GEN-LAST:event_EliminarTipoMuestrajButtonActionPerformed

    private void NuevoNomencladorjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoNomencladorjButtonActionPerformed
        NuevoNomencladorJInternalFrame iFrame = NuevoNomencladorJInternalFrame.getInstancia();
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionDatosJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NuevoNomencladorjButtonActionPerformed

    private void ModificarNomencladorjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarNomencladorjButtonActionPerformed
        NuevoNomencladorJInternalFrame iFrame = NuevoNomencladorJInternalFrame.getInstancia();
        iFrame.setNomencladorSeleccionado(this.nomencladorSeleccionado);
        LaboratorioJFrame.addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionDatosJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarNomencladorjButtonActionPerformed

    private void EliminarNomencladorjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarNomencladorjButtonActionPerformed
        String msj = "Se eliminarán todos los datos de la base de datos "
        + "y no podrán recuperarse.\n"
        + "Desea continuar?";
        int n = JOptionPane.showConfirmDialog(this, msj,"Atención!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n == JOptionPane.YES_OPTION){
            NomencladorJpaController.eliminar(this.nomencladorSeleccionado);
            this.actualizarDatosJTableNomencladores();
        }
        
    }//GEN-LAST:event_EliminarNomencladorjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarNomencladorjButton;
    private javax.swing.JButton EliminarTipoAnalisisjButton;
    private javax.swing.JButton EliminarTipoMuestrajButton;
    private javax.swing.JButton EliminarTipoResultadojButton;
    private javax.swing.JButton ModificarNomencladorjButton;
    private javax.swing.JButton ModificarTipoAnalisisjButton;
    private javax.swing.JButton ModificarTipoMuestrajButton;
    private javax.swing.JButton ModificarTipoResultadojButton;
    private javax.swing.JButton NuevoNomencladorjButton;
    private javax.swing.JButton NuevoTipoAnalisisjButton;
    private javax.swing.JButton NuevoTipoMuestrajButton;
    private javax.swing.JButton NuevoTipoResultadojButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JTable jTableNomencladores;
    private javax.swing.JTable jTableTipoAnalisis;
    private javax.swing.JTable jTableTipoMuestra;
    private javax.swing.JTable jTableTipoResultado;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar5;
    // End of variables declaration//GEN-END:variables
}
