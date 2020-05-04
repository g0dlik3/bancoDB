/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Banco;

import ControladorDB.TarjetaDB;
import ControladorDB.TransaccionDB;
import ControladorDB.UsuarioDB;
import Modelo.Banco.Usuario;
import static Utilidades.Utilidades.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
//import sun.swing.table.DefaultTableCellHeaderRenderer;


/**
 *
 * @author cr9_g
 */
public class BuscarCuenta extends javax.swing.JFrame {

    /**
     * Creates new form BuscarCuenta
     */
    public BuscarCuenta() {
        initComponents();
        btnEliminarTarjeta.setVisible(false);
        btnEstaadoCuenta.setEnabled(false);
        btnVerTarjetas.setEnabled(false);
        lblCuenta.setVisible(false);
        lblCUENTA.setVisible(false);
        
        this.setTitle("Buscar Cuenta");
        this.setLocationRelativeTo(null);
        DefaultTableModel modelo = new DefaultTableModel();
        String[] titulos = {"Numero de Cuenta", "Tipo de Cuenta", "Saldo"};
        modelo.setColumnIdentifiers(titulos);
        jTabla.setModel(modelo);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDPI = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnEstaadoCuenta = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnVerTarjetas = new javax.swing.JButton();
        btnEliminarTarjeta = new javax.swing.JButton();
        lblCUENTA = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(231, 231, 231));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Ingrese el DPI:");

        txtDPI.setBackground(new java.awt.Color(255, 255, 255));
        txtDPI.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        txtDPI.setBorder(null);

        btnBuscar.setBackground(new java.awt.Color(17, 144, 27));
        btnBuscar.setFont(new java.awt.Font("Consolas", 3, 17)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Numero de Cuenta", "Tipo de Cuenta", "Saldo"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Usuario:");

        lblNombre.setBackground(new java.awt.Color(153, 153, 153));
        lblNombre.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(153, 153, 153));

        btnEstaadoCuenta.setBackground(new java.awt.Color(17, 144, 27));
        btnEstaadoCuenta.setFont(new java.awt.Font("Consolas", 3, 17)); // NOI18N
        btnEstaadoCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEstaadoCuenta.setText("ESTADO DE CUENTA");
        btnEstaadoCuenta.setToolTipText("");
        btnEstaadoCuenta.setBorder(null);
        btnEstaadoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstaadoCuentaActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(160, 26, 49));
        btnRegresar.setFont(new java.awt.Font("Consolas", 3, 17)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("REGRESAR");
        btnRegresar.setToolTipText("");
        btnRegresar.setBorder(null);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnVerTarjetas.setBackground(new java.awt.Color(17, 144, 27));
        btnVerTarjetas.setFont(new java.awt.Font("Consolas", 3, 17)); // NOI18N
        btnVerTarjetas.setForeground(new java.awt.Color(255, 255, 255));
        btnVerTarjetas.setText("VER TARJETAS");
        btnVerTarjetas.setBorder(null);
        btnVerTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTarjetasActionPerformed(evt);
            }
        });

        btnEliminarTarjeta.setBackground(new java.awt.Color(160, 26, 49));
        btnEliminarTarjeta.setFont(new java.awt.Font("Consolas", 3, 17)); // NOI18N
        btnEliminarTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarTarjeta.setText("Eliminar Tarjeta");
        btnEliminarTarjeta.setBorder(null);

        lblCUENTA.setBackground(new java.awt.Color(153, 153, 153));
        lblCUENTA.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        lblCUENTA.setForeground(new java.awt.Color(153, 153, 153));
        lblCUENTA.setText("Cuenta:");

        lblCuenta.setBackground(new java.awt.Color(153, 153, 153));
        lblCuenta.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        lblCuenta.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCUENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEliminarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnVerTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnEstaadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCUENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstaadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEliminarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        btnEliminarTarjeta.setVisible(false);
        /*<-------------MODELO DE LA TABLA ------------------------>*/
        modeloCuenta = new DefaultTableModel();
        
        
        
        String dpi = txtDPI.getText();
        
        Usuario usuario;
        UsuarioDB usuariodb = new UsuarioDB();
        if(txtDPI.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ha ingresado el numero de DPI", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                if(usuariodb.existeUsuario(dpi) == true){
                    usuario = usuariodb.buscarUsuario(dpi);
                    lblNombre.setText(usuario.getNombre() + " "+ usuario.getApellido());
                    modeloCuenta = usuariodb.getCuentas(dpi);
                    
                    jTabla.setModel(modeloCuenta);
                    btnEstaadoCuenta.setEnabled(true);
                    btnVerTarjetas.setEnabled(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Este usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(BuscarCuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEstaadoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstaadoCuentaActionPerformed
        String numCuenta = null;
        btnEstaadoCuenta.setEnabled(false);
        btnVerTarjetas.setEnabled(false);
        
        
        try {
            int filaSelected = jTabla.getSelectedRow();
            int columnCuenta = 0;
            numCuenta = (String) jTabla.getValueAt(filaSelected, columnCuenta);      //SE OBTIENE LA EL NUM DE CUENTA DE LA FILA SELECCIONADA
            
            //System.out.println(numCuenta);
        } catch (ArrayIndexOutOfBoundsException e) {
            btnEstaadoCuenta.setEnabled(true);
        btnVerTarjetas.setEnabled(true);
            JOptionPane.showMessageDialog(null, "No ha seleccionado una cuenta, seleccione una para poder continuar", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
        if(numCuenta != null){
            TransaccionDB transdb = new TransaccionDB();
            tcr = new DefaultTableCellRenderer();
            //FormatoEncabezados = new DefaultTableCellHeaderRenderer();
            
            try {
                
                modeloEstado = transdb.getEstadoCuenta(numCuenta);
                jTabla.setModel(modeloEstado);
                System.out.println(modeloCuenta.getColumnCount());
                lblCuenta.setText(numCuenta);
                lblCuenta.setVisible(true);
                lblCUENTA.setVisible(true);
                /*<-----------------SE ALINEAN LOS ENCABEZADOS-------------------------------------->*/
                //FormatoEncabezados.setHorizontalAlignment(SwingConstants.CENTER);
                //for(int i = 0; i < 5 ; i++){
                  //  jTabla.getColumnModel().getColumn(i).setHeaderRenderer(FormatoEncabezados);
                
            //}
                
                
                /*<-----------------SE ESTABLECEN LOS TAMAÑOS DE LAS COLUMNAS ---------------------->*/
                jTabla.getColumnModel().getColumn(TRANSACCION).setPreferredWidth(20);
                jTabla.getColumnModel().getColumn(FECHA).setPreferredWidth(60);
                jTabla.getColumnModel().getColumn(DEBITO).setPreferredWidth(20);
                jTabla.getColumnModel().getColumn(CREDITO).setPreferredWidth(20);
                jTabla.getColumnModel().getColumn(SALDO).setPreferredWidth(20);
                
                /*<--------------SE RESTRINGE EL RESIZABLE DE LAS COLUMNAS ---------------------->*/
               
                jTabla.getColumnModel().getColumn(TRANSACCION).setResizable(false);
                jTabla.getColumnModel().getColumn(FECHA).setResizable(false);
                jTabla.getColumnModel().getColumn(DEBITO).setResizable(false);
                jTabla.getColumnModel().getColumn(CREDITO).setResizable(false);
                 jTabla.getColumnModel().getColumn(SALDO).setResizable(false);
                
               
                /*<-----------------------SE CENTRAN LAS COLUMNAS------------------------------>*/
                
                tcr.setHorizontalAlignment(SwingConstants.CENTER);
                
                jTabla.getColumnModel().getColumn(TRANSACCION).setCellRenderer(tcr);
                jTabla.getColumnModel().getColumn(FECHA).setCellRenderer(tcr);
                jTabla.getColumnModel().getColumn(DEBITO).setCellRenderer(tcr);
                jTabla.getColumnModel().getColumn(CREDITO).setCellRenderer(tcr);
                jTabla.getColumnModel().getColumn(SALDO).setCellRenderer(tcr);
                
                
                
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error, intentelo más tarde, si el problema persiste\n " +
                                                     "consulte con el area tecnica" , "ERROR", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(BuscarCuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnEstaadoCuentaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       this.dispose();
        Login.frmAtenCliente.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnVerTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTarjetasActionPerformed
        String numCuenta = null;

        try {
            int filaSelected = jTabla.getSelectedRow();
            int columnCuenta = 0;

            numCuenta = (String) jTabla.getValueAt(filaSelected, columnCuenta);      //SE OBTIENE LA EL NUM DE CUENTA DE LA FILA SELECCIONADA

        } catch (ArrayIndexOutOfBoundsException e) {

            JOptionPane.showMessageDialog(null, "No ha seleccionado una cuenta, seleccione una para poder continuar", "Error", JOptionPane.ERROR_MESSAGE);

        }

        if (numCuenta != null) {
            TarjetaDB tarjetadb = new TarjetaDB();
            tcr = new DefaultTableCellRenderer();
           // FormatoEncabezados = new DefaultTableCellHeaderRenderer();

            try {

                modeloEstado = tarjetadb.getTarjetas(numCuenta);
                jTabla.setModel(modeloEstado);
                System.out.println(modeloCuenta.getColumnCount());
                /*<-----------------SE ALINEAN LOS ENCABEZADOS-------------------------------------->*/
               // FormatoEncabezados.setHorizontalAlignment(SwingConstants.CENTER);
                //for (int i = 0; i < 4; i++) {
                  //  jTabla.getColumnModel().getColumn(i).setHeaderRenderer(FormatoEncabezados);

                //}

                /*<-----------------SE ESTABLECEN LOS TAMAÑOS DE LAS COLUMNAS ---------------------->*/
                jTabla.getColumnModel().getColumn(NUMERO_TARJETA).setPreferredWidth(20);
                jTabla.getColumnModel().getColumn(NUMERO_CUENTA).setPreferredWidth(60);
                jTabla.getColumnModel().getColumn(VALIDA_DESDE).setPreferredWidth(20);
                jTabla.getColumnModel().getColumn(VALIDA_HASTA).setPreferredWidth(20);
                

                /*<--------------SE RESTRINGE EL RESIZABLE DE LAS COLUMNAS ---------------------->*/
                jTabla.getColumnModel().getColumn(NUMERO_TARJETA).setResizable(false);
                jTabla.getColumnModel().getColumn(NUMERO_CUENTA).setResizable(false);
                jTabla.getColumnModel().getColumn(VALIDA_DESDE).setResizable(false);
                jTabla.getColumnModel().getColumn(VALIDA_HASTA).setResizable(false);
               

                /*<-----------------------SE CENTRAN LAS COLUMNAS------------------------------>*/
                tcr.setHorizontalAlignment(SwingConstants.CENTER);

                jTabla.getColumnModel().getColumn(NUMERO_TARJETA).setCellRenderer(tcr);
                jTabla.getColumnModel().getColumn(NUMERO_CUENTA).setCellRenderer(tcr);
                jTabla.getColumnModel().getColumn(VALIDA_DESDE).setCellRenderer(tcr);
                jTabla.getColumnModel().getColumn(VALIDA_HASTA).setCellRenderer(tcr);
                
                btnVerTarjetas.setEnabled(false);
                btnEstaadoCuenta.setEnabled(false);
                btnEliminarTarjeta.setVisible(true);
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error, intentelo más tarde, si el problema persiste\n "
                        + "consulte con el area tecnica", "ERROR", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(BuscarCuenta.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnVerTarjetasActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarTarjeta;
    private javax.swing.JButton btnEstaadoCuenta;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerTarjetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JLabel lblCUENTA;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtDPI;
    // End of variables declaration//GEN-END:variables
   private DefaultTableModel modeloCuenta = null;
   private DefaultTableModel modeloEstado = null;
   private DefaultTableCellRenderer tcr = null;
   //private DefaultTableCellHeaderRenderer FormatoEncabezados = null;
   
}