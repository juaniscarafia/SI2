package laboratorio.ui;

import Clases.ImagenFondo;
import laboratorio.ui.Pacientes.GestionPacienteJInternalFrame;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import laboratorio.ui.Administracion.GestionDatosJInternalFrame;
import laboratorio.ui.Administracion.bioquimicoJInternalFrame;

import laboratorio.ui.ObraSocial.GestionObraSocialJInternalFrame;
import laboratorio.ui.Ingresos.GestionIngresosJInternalFrame;
import laboratorio.ui.Ingresos.GestionRecetasJInternalFrame;
import laboratorio.ui.Medicos.GestionMedicosJInternalFrame;
import laboratorio.ui.Pacientes.HistoriaClinicaJInternalFrame;
import laboratorio.ui.analisis.GestionAnalisisJInternalFrame;
import laboratorio.ui.analisis.GestionMuestrasJInternalFrame;

public class LaboratorioJFrame extends javax.swing.JFrame {
    
    public LaboratorioJFrame() {
        initComponents();
        jDesktopPane.setBorder(new ImagenFondo());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jBarraMenu = new javax.swing.JMenuBar();
        jMenuPacientes = new javax.swing.JMenu();
        jMenuPacienteGestionar = new javax.swing.JMenuItem();
        jMenuIPacienteHistoriaClinica = new javax.swing.JMenuItem();
        jMenuPacienteIngreso = new javax.swing.JMenuItem();
        jMenuMedico = new javax.swing.JMenu();
        jMenuMedicoGestionar = new javax.swing.JMenuItem();
        jMenuObraSocial = new javax.swing.JMenu();
        jMenuGestionObraSocial = new javax.swing.JMenuItem();
        jMenuAnalisis = new javax.swing.JMenu();
        jMenuAnalisisGestion = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuAdministracion = new javax.swing.JMenu();
        jMenuAdministracionBioquimicos = new javax.swing.JMenuItem();
        jMenuAdministracionDatos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("-:: Laboratorio de análisis cínicos ::-");

        jMenuPacientes.setText("Pacientes");
        jMenuPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPacientesActionPerformed(evt);
            }
        });

        jMenuPacienteGestionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/GestionPaciente.png"))); // NOI18N
        jMenuPacienteGestionar.setText("Gestión de pacientes");
        jMenuPacienteGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPacienteGestionarActionPerformed(evt);
            }
        });
        jMenuPacientes.add(jMenuPacienteGestionar);

        jMenuIPacienteHistoriaClinica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/HistoriaClinica.png"))); // NOI18N
        jMenuIPacienteHistoriaClinica.setText("Historia Clínica");
        jMenuIPacienteHistoriaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIPacienteHistoriaClinicaActionPerformed(evt);
            }
        });
        jMenuPacientes.add(jMenuIPacienteHistoriaClinica);

        jMenuPacienteIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/IngresoPaciente.png"))); // NOI18N
        jMenuPacienteIngreso.setText("Ingreso");
        jMenuPacienteIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPacienteIngresoActionPerformed(evt);
            }
        });
        jMenuPacientes.add(jMenuPacienteIngreso);

        jBarraMenu.add(jMenuPacientes);

        jMenuMedico.setText("Médicos");
        jMenuMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMedicoActionPerformed(evt);
            }
        });

        jMenuMedicoGestionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/GestionMedicos.png"))); // NOI18N
        jMenuMedicoGestionar.setText("Gestión de médicos");
        jMenuMedicoGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMedicoGestionarActionPerformed(evt);
            }
        });
        jMenuMedico.add(jMenuMedicoGestionar);

        jBarraMenu.add(jMenuMedico);

        jMenuObraSocial.setText("Obra Social");

        jMenuGestionObraSocial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/ObraSocial.png"))); // NOI18N
        jMenuGestionObraSocial.setText("Gestión obra social");
        jMenuGestionObraSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGestionObraSocialActionPerformed(evt);
            }
        });
        jMenuObraSocial.add(jMenuGestionObraSocial);

        jBarraMenu.add(jMenuObraSocial);

        jMenuAnalisis.setText("Análisis");

        jMenuAnalisisGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/GestionAnalisis.png"))); // NOI18N
        jMenuAnalisisGestion.setText("Gestión de análisis");
        jMenuAnalisisGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAnalisisGestionActionPerformed(evt);
            }
        });
        jMenuAnalisis.add(jMenuAnalisisGestion);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/GestionResultados.png"))); // NOI18N
        jMenuItem1.setText("Gestion de Muestras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAnalisis.add(jMenuItem1);

        jBarraMenu.add(jMenuAnalisis);

        jMenuAdministracion.setText("Administración");

        jMenuAdministracionBioquimicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/ui/iconos/Bioquimicos.png"))); // NOI18N
        jMenuAdministracionBioquimicos.setText("Bioquímicos");
        jMenuAdministracionBioquimicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAdministracionBioquimicosActionPerformed(evt);
            }
        });
        jMenuAdministracion.add(jMenuAdministracionBioquimicos);

        jMenuAdministracionDatos.setText("Datos");
        jMenuAdministracionDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAdministracionDatosActionPerformed(evt);
            }
        });
        jMenuAdministracion.add(jMenuAdministracionDatos);

        jBarraMenu.add(jMenuAdministracion);

        setJMenuBar(jBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPacientesActionPerformed
        
    }//GEN-LAST:event_jMenuPacientesActionPerformed

    private void jMenuPacienteGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPacienteGestionarActionPerformed
        GestionPacienteJInternalFrame iFrame = GestionPacienteJInternalFrame.getInstancia();
        addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionPacienteJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuPacienteGestionarActionPerformed

    private void jMenuIPacienteHistoriaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIPacienteHistoriaClinicaActionPerformed
        HistoriaClinicaJInternalFrame iFrame = HistoriaClinicaJInternalFrame.getInstancia();
        addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(HistoriaClinicaJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuIPacienteHistoriaClinicaActionPerformed

    private void jMenuMedicoGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMedicoGestionarActionPerformed
        GestionMedicosJInternalFrame iFrame = GestionMedicosJInternalFrame.getInstancia();
        addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(HistoriaClinicaJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuMedicoGestionarActionPerformed

    private void jMenuGestionObraSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGestionObraSocialActionPerformed
        GestionObraSocialJInternalFrame iFrame = GestionObraSocialJInternalFrame.getInstancia();
        addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionObraSocialJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuGestionObraSocialActionPerformed

    private void jMenuMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMedicoActionPerformed

    private void jMenuAdministracionBioquimicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAdministracionBioquimicosActionPerformed
        bioquimicoJInternalFrame iFrame = bioquimicoJInternalFrame.getInstancia();
        addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(bioquimicoJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuAdministracionBioquimicosActionPerformed

    private void jMenuPacienteIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPacienteIngresoActionPerformed
        GestionIngresosJInternalFrame iFrame = GestionIngresosJInternalFrame.getInstancia();
        addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionIngresosJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuPacienteIngresoActionPerformed

    private void jMenuAnalisisGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAnalisisGestionActionPerformed
         GestionAnalisisJInternalFrame iFrame = GestionAnalisisJInternalFrame.getInstancia();
        addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionAnalisisJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuAnalisisGestionActionPerformed

    private void jMenuAdministracionDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAdministracionDatosActionPerformed
        GestionDatosJInternalFrame iFrame = GestionDatosJInternalFrame.getInstancia();
        addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionDatosJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuAdministracionDatosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        GestionMuestrasJInternalFrame iFrame = GestionMuestrasJInternalFrame.getInstancia();
        addInternalFrame(iFrame);
        iFrame.setVisible(true);
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionMuestrasJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void addInternalFrame(JInternalFrame internalFrame){
        boolean enPantalla = false;
        Object[] componentes = jDesktopPane.getComponents();
        if(componentes.length > 0){
            for(int i = 0; i < componentes.length; i++){
                if(componentes[i] instanceof JInternalFrame){
                    JInternalFrame actual = (JInternalFrame)componentes[i];
                    if(actual.equals(internalFrame)){
                        enPantalla = true;
                    }
                }
            }
        }
        if(!enPantalla){
            internalFrame.setLocation((8+5) * jDesktopPane.getComponentCount(), (27+5) * jDesktopPane.getComponentCount());
            jDesktopPane.add(internalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
            try {
                internalFrame.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(LaboratorioJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String args[]) {
        try{
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e){
           e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
            new LaboratorioJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jBarraMenu;
    private static javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenuAdministracion;
    private javax.swing.JMenuItem jMenuAdministracionBioquimicos;
    private javax.swing.JMenuItem jMenuAdministracionDatos;
    private javax.swing.JMenu jMenuAnalisis;
    private javax.swing.JMenuItem jMenuAnalisisGestion;
    private javax.swing.JMenuItem jMenuGestionObraSocial;
    private javax.swing.JMenuItem jMenuIPacienteHistoriaClinica;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuMedico;
    private javax.swing.JMenuItem jMenuMedicoGestionar;
    private javax.swing.JMenu jMenuObraSocial;
    private javax.swing.JMenuItem jMenuPacienteGestionar;
    private javax.swing.JMenuItem jMenuPacienteIngreso;
    private javax.swing.JMenu jMenuPacientes;
    // End of variables declaration//GEN-END:variables
}
