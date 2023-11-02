
package vistas;

import accesoADatos.Conexion;
import accesoADatos.PedidoData;
import accesoADatos.PedidoProductoData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entidades.Pedido;
import entidades.PedidoProducto;


public class Estadistica extends javax.swing.JFrame {
   private DefaultTableModel modelo = new DefaultTableModel();
    PedidoData pedata = new PedidoData();
    PedidoProductoData ppd = new PedidoProductoData();
    Pedido pedido = new Pedido();
    PedidoProducto pediprodu = new PedidoProducto();
    private Connection con = null; 
    /**
     * Creates new form Estadistica
     */
    public Estadistica() {
        initComponents();
         this.setLocationRelativeTo(null);
         armarCabecera();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbPedidosPorMesa = new javax.swing.JButton();
        jbVover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaListas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaption);

        jToggleButton1.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jToggleButton1.setText("Pedidos atendidos ");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton1.setText("Ingresos totales");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton2.setText("Pedidos cobrados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbPedidosPorMesa.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jbPedidosPorMesa.setText("Pedidos por mesa");
        jbPedidosPorMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPedidosPorMesaActionPerformed(evt);
            }
        });

        jbVover.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jbVover.setText("Regresar");
        jbVover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbPedidosPorMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbVover)
                .addContainerGap())
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jToggleButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jbPedidosPorMesa)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbVover)
                .addGap(21, 21, 21))
        );

        jTablaListas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablaListas);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/estadisticas 1000.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(887, 887, 887)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre del mesero: ");     
        borrarFilasPedido();
            for(Pedido p:ppd.listarPedidoporMesero(nombre)){
                modelo.addRow(new Object[]{p.getIdPedido(),p.getIdMesa(),p.getNombreMesero(),p.getFechaHora(),p.getImporte(),p.isCobrada()});
            }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        borrarFilasPedido();
        llenarTablaPedidoTotal();
        con = Conexion.getConexion();
        String sql = "SELECT sum(importe) FROM pedido where cobrada = 1 "; //Suma solo los cobrados
      
       try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
             while (rs.next()) {
            String suma = rs.getString("sum(importe)");
            JOptionPane.showMessageDialog(null, "Suma total de ingresos Cobrados: " +suma);
             }
//            
        } catch (SQLException ex) {
          ex.getMessage();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String nombre=JOptionPane.showInputDialog("Ingrese el nombre del mesero: ");
       borrarFilasPedido();
            for(Pedido p: ppd.listarPedidoCobroMeseroDia(nombre)){
                modelo.addRow(new Object[]{p.getIdMesa(),p.getNombreMesero(),p.getFechaHora(),p.getImporte()});
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbPedidosPorMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPedidosPorMesaActionPerformed
//        Timestamp fechaHora=Timestamp.valueOf(JOptionPane.showInputDialog("Ingrese la fecha a buscar: "));
        int mesa= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de mesa a buscar: "));
        borrarFilasPedido();
            for(Pedido p: ppd.listarPedidoMesa(mesa)){
                modelo.addRow(new Object[]{p.getIdMesa(),p.getNombreMesero(),p.getFechaHora(),p.getImporte(),p.isCobrada()});
            }
        
    }//GEN-LAST:event_jbPedidosPorMesaActionPerformed

    private void jbVoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoverActionPerformed
        Menu men = new Menu();
            men.setVisible(true);
            dispose();
    }//GEN-LAST:event_jbVoverActionPerformed

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
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadistica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaListas;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbPedidosPorMesa;
    private javax.swing.JButton jbVover;
    // End of variables declaration//GEN-END:variables
public void armarCabecera(){
   ArrayList<Object>titulo = new ArrayList();
// titulo.add("ID");
 titulo.add("Mesa");
 titulo.add("Nombre Mesero");
 titulo.add("Fecha");
 titulo.add("Importe");
 titulo.add("Cobro");
 for(Object tit:titulo){
 modelo.addColumn(tit);
 }
 jTablaListas.setModel(modelo);
}
private void borrarFilasPedido(){
int filas=jTablaListas.getRowCount()-1;
  for(;filas>=0;filas--){
  modelo.removeRow(filas);
  }
}

private void llenarTablaPedidoTotal(){
            borrarFilasPedido();
            for(Pedido p:ppd.listarPedidoTotal()){
                modelo.addRow(new Object[]{p.getIdMesa(),p.getNombreMesero(),p.getFechaHora(),p.getImporte(),p.isCobrada()});
            }
    }
}
