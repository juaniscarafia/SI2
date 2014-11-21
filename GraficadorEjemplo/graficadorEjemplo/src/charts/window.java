/*
 * Ejemplo de graficador.
 */

package charts;

import javax.swing.JFrame;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;
import org.jfree.data.category.DefaultCategoryDataset;

public class window extends javax.swing.JFrame {
    
    JFreeChart Grafica;
    DefaultCategoryDataset Datos = new DefaultCategoryDataset();

    public window() {
        initComponents();
        
        //////// DATOS /////////////
        /////// PARAMETROS:
        /// 1 - Valor a Graficar
        /// 2 - Identificador del grupo de datos
        /// 3 - Etiqueta de la columna en grafico de barras
        Datos.addValue(1,"Negocio 1","Lunes");
        Datos.addValue(2,"Negocio 1","Martes");
        Datos.addValue(3,"Negocio 1","Miercoles");
        Datos.addValue(4,"Negocio 1","Jueves");
        Datos.addValue(5,"Negocio 1","Viernes");
        Datos.addValue(6,"Negocio 1","Sábado");
        Datos.addValue(7,"Negocio 1","Domingo");
        
        //////// VARIABLE GRAFICA ////////
        //////// PARAMETROS
        /// 1 - Titulo del grafico
        /// 2 - Etiquete o nombre del eje horizontal
        /// 3 - Etiqueta o nombre el eje vertical
        /// 4 - El modelo de datos
        /// 5 - Se agrega PlotOrientation y se decide si se desea
        ///     que el grafico sea vvertical (PlotOrientation.VERTICAL
        ///     u horizontal (PlotOtientation.HORIZONTAL)
        /// 6 - Un valor True o False.
        ///     - TRUE: una etiqueta debajo del grafico indica que grupo
        ///             de datos representa cada color
        /// 7 - Un valor True o False.
        ///     -TRUE: cuando se le pase el ratón por encima aparecera una
        ///            pequeña etiqueta que indica el valor que halla
        ///            graficado
        /// 8 - Un valor True o False. Para agregar URLS. Para diseños
        ///     Orientados a la web.
        Grafica = ChartFactory.createBarChart("Visitas Diarias",
                      "Días", "Visitas", Datos, 
                      PlotOrientation.HORIZONTAL, true, true, false);
        
        ////////////// AGREGAR EL GRAFICO EN LA VENTANA
        
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jButton1)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jButton1)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ChartPanel Panel = new ChartPanel(Grafica);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
