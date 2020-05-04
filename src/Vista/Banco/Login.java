/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Banco;

import ControladorDB.EmpleadoDB;
import Modelo.Banco.Departamento;
import Modelo.Banco.Empleado;
import Utilidades.Utilidades;
import Utilidades.TextPrompt;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cr9_g
 */
public class Login extends javax.swing.JFrame {
    
    
    

    /**
     * Creates new form Login
     */
    public Empleado usuarioLog;
    public static Caja frmCaja;
    public static AtencionCliente frmAtenCliente;
    public static RecursosHumanos frmRecursosHumanos;
    
    
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt placeholder1 = new TextPrompt("Usuario", txtFieldUser);
        TextPrompt placeholder2 = new TextPrompt("Contraseña", JPassword);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFieldUser = new javax.swing.JTextField();
        JPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(231, 231, 231));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/image1.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIAR SESION");

        txtFieldUser.setBackground(new java.awt.Color(255, 255, 255));
        txtFieldUser.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtFieldUser.setForeground(new java.awt.Color(107, 107, 107));
        txtFieldUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFieldUser.setAlignmentX(0.0F);
        txtFieldUser.setAlignmentY(0.0F);
        txtFieldUser.setBorder(null);
        txtFieldUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFieldUser.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFieldUser.setSelectionColor(new java.awt.Color(102, 102, 102));
        txtFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUserActionPerformed(evt);
            }
        });

        JPassword.setBackground(new java.awt.Color(255, 255, 255));
        JPassword.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        JPassword.setForeground(new java.awt.Color(107, 107, 107));
        JPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JPassword.setAlignmentX(0.0F);
        JPassword.setAlignmentY(0.0F);
        JPassword.setBorder(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/user-icon1.png"))); // NOI18N
        jLabel3.setAlignmentY(0.0F);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/password-icon1.png"))); // NOI18N

        jCheckBox1.setBackground(new java.awt.Color(231, 231, 231));
        jCheckBox1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Recuerdame");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/cuadro.png"))); // NOI18N
        jCheckBox1.setRolloverEnabled(true);
        jCheckBox1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/cuadro.png"))); // NOI18N
        jCheckBox1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/checkmark.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(0, 171, 197));
        jButton2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("INICIAR SESION");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, 0)
                                .addComponent(JPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFieldUser))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldUserActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Empleado usuario = new Empleado();
        Utilidades utilidad = new Utilidades();
        usuario.setUsername(txtFieldUser.getText());
        usuario.setPassword(JPassword.getText());
        usuario.setLast_session(utilidad.setDateTime());
        
        
        EmpleadoDB empleadoSQL = new EmpleadoDB();
        Empleado userEmpleado = new Empleado();
        
        
        try {
            boolean verificar = empleadoSQL.LoginEmpleado(usuario);
                if(verificar == true){
                    
                    /*frmCaja.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Se Ha logeado correctamente");*/
                    
                    
                    //SELECCIONAR TODOS LOS ATRIBUTOS DEL USUARIO EN LA DB
                    
                    userEmpleado = empleadoSQL.getEmpleado(usuario);
                    
                    
                    int id = userEmpleado.getDepartamento().getId_departamento();
                    
                        switch (id) {
                        case 1:
                            
                            JOptionPane.showMessageDialog(null, "Lo sentimos, pero no puedes ingresar porque ella no te ama! :c ", "Ha ocurrido un errorcito compa", JOptionPane.ERROR_MESSAGE);
                            
                            break;
                        case 2:
                            frmCaja = new Caja();
                            JOptionPane.showMessageDialog(null, "¡Bienvenido Nuevamente " + userEmpleado.getNombre()
                                    + " " + userEmpleado.getApellido() + "!");
                            Caja.txtUsername.setText(userEmpleado.getUsername());
                            this.setVisible(false);
                            frmCaja.setLocationRelativeTo(null);
                            frmCaja.setVisible(true);
                            break;
                            
                        case 3:
                            frmAtenCliente = new AtencionCliente();
                            JOptionPane.showMessageDialog(null, "¡Bienvenido Nuevamente " + userEmpleado.getNombre()
                                    + " " + userEmpleado.getApellido() + "!");
                            this.setVisible(false);
                            AtencionCliente.labelUser.setText(userEmpleado.getUsername());
                            frmAtenCliente.setLocationRelativeTo(null);
                            frmAtenCliente.setVisible(true);
                             break;
                        
                        case 4:
                            frmRecursosHumanos = new RecursosHumanos();
                            JOptionPane.showMessageDialog(null, "!Bienvenido Nuevamente " + userEmpleado.getNombre()
                                    + " " + userEmpleado.getApellido() + "!");
                            this.setVisible(false);
                            frmRecursosHumanos.setLocationRelativeTo(null);
                            frmRecursosHumanos.setVisible(true);
                            break;
                    }
                         
                    
                    
                    
                    
                }else if(txtFieldUser.getText().isEmpty() || JPassword.getText().isEmpty()){
                    
                    JOptionPane.showMessageDialog(null, "Rellene los campos porfavor!");
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas!");
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPassword;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFieldUser;
    // End of variables declaration//GEN-END:variables
}