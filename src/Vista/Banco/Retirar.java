/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Banco;

import ControladorDB.TransaccionDB;
import ControladorDB.UsuarioDB;
import Modelo.Banco.Cuenta;
import Modelo.Banco.CuentaAhorro;
import Modelo.Banco.CuentaMonetaria;
import Modelo.Banco.Transaccion;
import Modelo.Banco.Usuario;
import Utilidades.Utilidades;
import static Vista.Banco.Login.frmCaja;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cr9_g
 */
public class Retirar extends javax.swing.JFrame {

    /**
     * Creates new form Retirar
     */
    public Retirar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFnumCuenta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFMonto = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lblNombreCuenta = new javax.swing.JLabel();
        lbltipoCuenta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(231, 231, 231));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Número de Cuenta:");

        txtFnumCuenta.setBackground(new java.awt.Color(255, 255, 255));
        txtFnumCuenta.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        txtFnumCuenta.setForeground(new java.awt.Color(153, 153, 153));
        txtFnumCuenta.setBorder(null);

        btnBuscar.setBackground(new java.awt.Color(17, 144, 27));
        btnBuscar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Tipo de Cuenta");

        jLabel4.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Monto");

        txtFMonto.setBackground(new java.awt.Color(255, 255, 255));
        txtFMonto.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        txtFMonto.setForeground(new java.awt.Color(153, 153, 153));
        txtFMonto.setBorder(null);

        btnRetirar.setBackground(new java.awt.Color(17, 144, 27));
        btnRetirar.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setText("RETIRAR");
        btnRetirar.setEnabled(false);
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(160, 26, 49));
        jButton4.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("REGRESAR");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lblNombreCuenta.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblNombreCuenta.setForeground(new java.awt.Color(153, 153, 153));

        lbltipoCuenta.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lbltipoCuenta.setForeground(new java.awt.Color(153, 153, 153));

        jLabel5.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RETIRAR FONDOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(txtFMonto)
                                    .addComponent(txtFnumCuenta)
                                    .addComponent(lbltipoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblNombreCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFnumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(lblNombreCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(lbltipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(txtFMonto))
                .addGap(41, 41, 41)
                .addComponent(btnRetirar)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        UsuarioDB usuarioDB = new UsuarioDB();
        Cuenta cuentica = null;
        

        try {
            if (usuarioDB.existeCuenta(txtFnumCuenta.getText()) == true) {

                cuentica = usuarioDB.buscarCuenta(txtFnumCuenta.getText());
                this.tipocuenta = cuentica.getId_tipoCuenta();
                btnRetirar.setEnabled(true);

                switch (tipocuenta) {
                    case 1:
                        Cuenta cuentaA = new CuentaAhorro();
                        cuentaA = cuentica;
                        lblNombreCuenta.setText(cuentaA.getUser().getNombre() + " " + cuentaA.getUser().getApellido());
                        lbltipoCuenta.setText("Cuenta de Ahorro");
                        break;
                        
                    case 2:
                        Cuenta cuentaM = new CuentaMonetaria();
                        cuentaM = cuentica;
                         lblNombreCuenta.setText(cuentaM.getUser().getNombre() + " " + cuentaM.getUser().getApellido());
                        lbltipoCuenta.setText("Cuenta Monetaria");
                        break;
                        
                        
                }

            }else{
                JOptionPane.showMessageDialog(null, "La cuenta solicitada no existe", "¡Alerta!", JOptionPane.ERROR_MESSAGE);
                lblNombreCuenta.setText("");
                txtFMonto.setText("");
                lbltipoCuenta.setText("");
                btnRetirar.setEnabled(false);
            }

        } catch (SQLException e) {
            e.getMessage();
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        UsuarioDB usuarioDB = new UsuarioDB();
        Transaccion trans = new Transaccion();
        TransaccionDB transDB = new TransaccionDB();
        Utilidades utilidad = new Utilidades();
        Cuenta cuentica = null;
        String cuenta = txtFnumCuenta.getText();
        
        
         if (tipocuenta == 1) {
            cuentica = new CuentaAhorro();
        } else if (tipocuenta == 2) {
            cuentica = new CuentaMonetaria();
        }
         
        
            
           
            
            
       if (txtFMonto.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "El campo está vacío, ingrese una cantidad para continuar", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            double monto = Double.parseDouble(txtFMonto.getText());
            if (monto <= 0) {
                
                JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida", "¡Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    double saldo = usuarioDB.getSaldo(cuenta);
                    
                    if (monto <= saldo) {
                        
                        cuentica.setNumeroCuenta(cuenta);
        cuentica.setId_tipoCuenta(tipocuenta);
        trans.setCuenta(cuentica);
        trans.setMonto(Double.parseDouble(txtFMonto.getText()));
        trans.setTipo_trans(2);
        trans.setFechaTransaccion(utilidad.setDateTime());
                        
                        usuarioDB.retirar(monto, cuenta);
                        transDB.insertTransaccion(trans);
                        
                        JOptionPane.showMessageDialog(null, "Retiro realizado con éxito", "Transacción realizada", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay fondos suficientes", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Retirar.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
                    
                    
                    
                }
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        frmCaja.setVisible(true);
        this.dispose();
        frmCaja.setLocationRelativeTo(null);
        frmCaja.setVisible(true);
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
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Retirar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombreCuenta;
    private javax.swing.JLabel lbltipoCuenta;
    private javax.swing.JTextField txtFMonto;
    private javax.swing.JTextField txtFnumCuenta;
    // End of variables declaration//GEN-END:variables
    private int tipocuenta;
}