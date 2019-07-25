/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cliente;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Modelo.*;
import Controlador.*;
import java.awt.Color;

public class dialogcliente extends javax.swing.JDialog {

    ControlClientes cli;
DefaultTableModel m;

    public dialogcliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        LoadClientes();
        cli = new ControlClientes();
       
    }

    void LoadClientes() {
        List<Cliente> cliente = ControlClientes.ClienteShow();
        if (cliente.size() > 0) {
            Iterator consulta = cliente.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) tbClientes.getModel();
                Vector datos = new Vector();
                Cliente fila = (Cliente) consulta.next();
                datos.add(fila.getCodCli());
                datos.add(fila.getNomCli());
                datos.add(fila.getApeCli());
                datos.add(fila.getSexoCli());
                datos.add(fila.getTelCli());
                datos.add(fila.getDniCli());
                datos.add(fila.getRucCli());
                datos.add(fila.getEmailCli());
                datos.add(fila.getDirCli());
                datos.add(fila.getTipoCli());
                // datos.add(fila.getSucursales().getNombre());
                tabla.addRow(datos);

            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay registros");
        }
    }
//  void LoadClientesEncontrado(String encontrado){
//         
//        List<Cliente> cliente =cli.getcliente(encontrado) ;
//        if(cliente.size()>0){
//            Iterator consulta = cliente.iterator();
//            while(consulta.hasNext()){
//                DefaultTableModel tabla = (DefaultTableModel)tbClientes.getModel();
//                Vector datos = new Vector();
//                Cliente fila = (Cliente)consulta.next();
//                datos.add(fila.getNomCli());
//                datos.add(fila.getDniCli());
//               // datos.add(fila.getSucursales().getNombre());
//                tabla.addRow(datos);
//                
//            }
//        }else{
//            JOptionPane.showMessageDialog(null, "No hay registros");
//        }
//    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Buscar Cliente");

        jButton1.setText("Mostrar Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Cliente", "Nombres", "Apellidos", "Sexo", "Telefono", "Cedula", "Ruc", "Email", "Direccion", "Tipo Cliente"
            }
        ));
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbClientes);

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mdiMenuPrincipal p = new mdiMenuPrincipal();
        dialogIngresarCliente cli = new dialogIngresarCliente(p, rootPaneCheckingEnabled);
        cli.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed
//private void mnenviarActionPerformed(java.awt.event.ActionEvent evt) {                                         
//// TODO add your handling code here:
//    String cod="",nom="",ape="",dni="",dir="",ruc="",tipo="";
//    int fila = tbClientes.getSelectedRow();
//    try {
//        if(fila==-1)
//        {
//            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");
//                  
//        }
//        else
//        {
//         cod =  (String)tbClientes.getValueAt(fila, 2);
////         nom =  (String)tbClientes.getValueAt(fila, 3);
////         ape =  (String)tbClientes.getValueAt(fila, 2);
////         dni =  (String)tbClientes.getValueAt(fila, 4);
////         ruc =  (String)tbClientes.getValueAt(fila, 6);
////         dir=  (String)tbClientes.getValueAt(fila, 8);
////         tipo=  (String)tbClientes.getValueAt(fila, 9);  
//         
//         Factura.txtcod.setDisabledTextColor(Color.blue);
//         Factura.txtcod.setText(cod);
//         Factura.txtnomape.setDisabledTextColor(Color.blue);
//         Factura.txtnomape.setText(nom+"   "+ape);
//         Factura.txtdir.setDisabledTextColor(Color.blue);
//         Factura.txtdir.setText(dir);
//         Factura.txtdni.setDisabledTextColor(Color.blue);
//         Factura.txtdni.setText(dni);
//         Factura.txtruc.setDisabledTextColor(Color.blue);
//         Factura.txtruc.setText(ruc);
//         Factura.txtTipoCli.setDisabledTextColor(Color.blue);
//         Factura.txtTipoCli.setText(tipo);
//        
//       
//         
//         this.dispose();
//         
//        }
//    } catch (Exception e) {
//    }
//}
    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        //        int fila = tbClientes.getSelectedRow();
        //        String[] tableHeader = new String[]{"Codigo Cliente","Nombres","Apellidos","Sexo","Telefono","Cedula","Ruc","Email","Direccion","Tipo Cliente"};
        //        DefaultTableModel editores = (DefaultTableModel) tbClientes.getModel();
        //        txtcodc.setText(String.valueOf(editores.getValueAt(fila, Arrays.asList(tableHeader).indexOf("Codigo Cliente"))));
        //        txtnom.setText(String.valueOf(editores.getValueAt(fila, Arrays.asList(tableHeader).indexOf("Nombres"))));
        //        txtape.setText(String.valueOf(editores.getValueAt(fila, Arrays.asList(tableHeader).indexOf("Apellidos"))));
        //        txttel.setText(String.valueOf(editores.getValueAt(fila, Arrays.asList(tableHeader).indexOf("Telefono"))));
        //        txtCedula.setText(String.valueOf(editores.getValueAt(fila, Arrays.asList(tableHeader).indexOf("Cedula"))));
        //        txtruc.setText(String.valueOf(editores.getValueAt(fila, Arrays.asList(tableHeader).indexOf("Ruc"))));
        //        txtemail.setText(String.valueOf(editores.getValueAt(fila, Arrays.asList(tableHeader).indexOf("Email"))));
        //        txtdir.setText(String.valueOf(editores.getValueAt(fila, Arrays.asList(tableHeader).indexOf("Direccion"))));
    }//GEN-LAST:event_tbClientesMouseClicked
    public static void reiniciarJTable(javax.swing.JTable Tabla) {
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Cliente cli_res = cli.buscarcliente(Integer.parseInt(txtBuscar.getText()));
        reiniciarJTable(tbClientes);
        JOptionPane.showMessageDialog(null, cli_res.getNomCli());
        DefaultTableModel tabla = (DefaultTableModel) tbClientes.getModel();
        Vector datos = new Vector();
         datos.add(cli_res.getCodCli());
                datos.add(cli_res.getNomCli());
                datos.add(cli_res.getDniCli());
                datos.add(cli_res.getSexoCli());
                datos.add(cli_res.getTelCli());
                datos.add(cli_res.getDniCli());
                datos.add(cli_res.getRucCli());
                datos.add(cli_res.getEmailCli());
                datos.add(cli_res.getDirCli());
                datos.add(cli_res.getTipoCli());

        tabla.addRow(datos);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       LoadClientes();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      String codigo="",apellido="";
        int selec = tbClientes.getSelectedRow();
      
        try {
            if (selec==-1) {
                 JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");
            }else{
                codigo=(String)tbClientes.getValueAt(selec, 1);
                apellido=(String)tbClientes.getValueAt(selec, 2);
                frmFactura.txtnombre.setText(codigo+" "+apellido);
//                this.dispose();
JOptionPane.showMessageDialog(null, codigo);
            }
  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(dialogcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogcliente dialog = new dialogcliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
