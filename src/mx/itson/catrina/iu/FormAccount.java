/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.catrina.iu;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.catrina.Operation.Operation;
import mx.itson.catrina.entities.AccountStatement;
import mx.itson.catrina.entities.Transaction;

/**
 *
 * @author luisd
 */
public class FormAccount extends javax.swing.JFrame {

    /**
     * Creates new form FormAccount
     */
    public FormAccount() {
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

        btnFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxMonth = new javax.swing.JComboBox<>();
        lblName = new javax.swing.JLabel();
        lblRfc = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        lblClabe = new javax.swing.JLabel();
        lblCurrency = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblDeposits = new javax.swing.JLabel();
        lblWithdrawals = new javax.swing.JLabel();
        lblFinalBalance = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransactions = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estado de cuenta");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        btnFile.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFile.setText("Selecione...");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Eliga el archivo a cargar");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Estado de cuenta");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Eliga el mes");

        cbxMonth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", "Todos" }));
        cbxMonth.setSelectedIndex(12);
        cbxMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxMonthItemStateChanged(evt);
            }
        });

        lblName.setBackground(new java.awt.Color(255, 204, 0));
        lblName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblName.setText("Información del usuario");
        lblName.setOpaque(true);

        lblRfc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblRfc.setText("RFC:");

        lblAddress.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAddress.setText("Dirección:");

        lblCity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCity.setText("Ciudad:");

        jLabel5.setBackground(new java.awt.Color(255, 204, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText(" Cuenta");
        jLabel5.setOpaque(true);

        lblAccount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAccount.setText("Cuenta: ");

        lblClabe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblClabe.setText("Clave:");

        lblCurrency.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCurrency.setText("Divisa:");

        jLabel6.setBackground(new java.awt.Color(255, 204, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Resumen del periodo");
        jLabel6.setOpaque(true);

        lblDeposits.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDeposits.setText("Depositos:");

        lblWithdrawals.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblWithdrawals.setText("Retiros");

        lblFinalBalance.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFinalBalance.setText("Saldo Final");

        tblTransactions.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblTransactions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Descripción", "Depósitos", "Retiro", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(tblTransactions);
        if (tblTransactions.getColumnModel().getColumnCount() > 0) {
            tblTransactions.getColumnModel().getColumn(0).setMinWidth(90);
            tblTransactions.getColumnModel().getColumn(0).setMaxWidth(90);
            tblTransactions.getColumnModel().getColumn(1).setMinWidth(300);
            tblTransactions.getColumnModel().getColumn(1).setMaxWidth(300);
            tblTransactions.getColumnModel().getColumn(2).setMinWidth(100);
            tblTransactions.getColumnModel().getColumn(2).setMaxWidth(100);
            tblTransactions.getColumnModel().getColumn(3).setMinWidth(100);
            tblTransactions.getColumnModel().getColumn(3).setMaxWidth(100);
            tblTransactions.getColumnModel().getColumn(4).setMinWidth(120);
            tblTransactions.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        jLabel7.setBackground(new java.awt.Color(255, 204, 0));
        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel7.setText("Transacciones");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);

        lblZipCode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblZipCode.setText("Zip Code:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(cbxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnFile)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblRfc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addComponent(lblZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFinalBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeposits, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblWithdrawals, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblClabe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(464, 464, 464)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(194, 194, 194))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(btnFile))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(cbxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDeposits, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWithdrawals, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFinalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblClabe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        Operation operation = new Operation();
        DecimalFormat df = new DecimalFormat("$,#00.00");
        DateFormat datef = new SimpleDateFormat("yyyy-MM-dd");
        double subTotal = 0;
        double deposits = 0;
        double withdrawals = 0;
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            if (jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION);

            File file = jFileChooser.getSelectedFile();
            byte fileByte[] = Files.readAllBytes(file.toPath());
            String content = new String(fileByte, StandardCharsets.UTF_8);
            accountStatement = new AccountStatement().deserialize(content);
            accountStatement.setTransactions(
                    operation.bubblesort(
                            accountStatement.getTransactions(), accountStatement.getTransactions().size()));
            List<Transaction> transactionByMonth = operation.byMonth(accountStatement.getTransactions(), cbxMonth.getSelectedIndex());

            if (accountStatement != null) {

                //Datos del Cliente
                lblName.setText(accountStatement.getCustomer().getName());
                lblRfc.setText("RFC: " + accountStatement.getCustomer().getRfc());
                lblAddress.setText("Dirección: " + accountStatement.getCustomer().getAddres());
                lblCity.setText(accountStatement.getCustomer().getCity());
                lblZipCode.setText(accountStatement.getCustomer().getZipCode());

                //Datos de la cuenta
                lblAccount.setText("Cuenta: " + accountStatement.getAccount());
                lblClabe.setText("Clave: " + accountStatement.getClabe());
                lblCurrency.setText("Divisa: " + accountStatement.getCurrency());

                //Datos de las transaciiones
                DefaultTableModel model = (DefaultTableModel) tblTransactions.getModel();
                model.setRowCount(0);
                for (Transaction a : transactionByMonth) {
                    if (a.getType() == a.getType().DEPOSITS) {
                        subTotal += a.getAmount();
                        deposits += a.getAmount();
                        model.addRow(new Object[]{
                            datef.format(a.getDate()), a.getDescription(), df.format(a.getAmount()), "", df.format(subTotal)

                        });
                    } else {
                        subTotal -= a.getAmount();
                        withdrawals += a.getAmount();
                        model.addRow(new Object[]{
                            datef.format(a.getDate()), a.getDescription(), "", df.format(a.getAmount()), df.format(subTotal)
                        });
                    }
                }

                lblDeposits.setText("Deposito: " + df.format(deposits));
                lblWithdrawals.setText("Retiros: " + df.format(withdrawals));
                lblFinalBalance.setText("Total: " + df.format(subTotal));

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    ex,
                    "Algo salio mal!",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnFileActionPerformed

    private void cbxMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxMonthItemStateChanged
        Operation operation = new Operation();
        DecimalFormat df = new DecimalFormat("$,#00.00");
        DateFormat datef = new SimpleDateFormat("yyyy-MM-dd");
        double subTotal = 0;
        double deposits = 0;
        double withdrawals = 0;

        
        
        if (accountStatement != null) {

            List<Transaction> transactionByMonth = operation.byMonth(accountStatement.getTransactions(), cbxMonth.getSelectedIndex());
            //Datos del Cliente
            lblName.setText(accountStatement.getCustomer().getName());
            lblRfc.setText("RFC: " + accountStatement.getCustomer().getRfc());
            lblAddress.setText("Dirección: " + accountStatement.getCustomer().getAddres());
            lblCity.setText(accountStatement.getCustomer().getCity());
            lblZipCode.setText(accountStatement.getCustomer().getZipCode());

            //Datos de la cuenta
            lblAccount.setText("Cuenta: " + accountStatement.getAccount());
            lblClabe.setText("Clave: " + accountStatement.getClabe());
            lblCurrency.setText("Divisa: " + accountStatement.getCurrency());

            //Datos de las transaciiones
            DefaultTableModel model = (DefaultTableModel) tblTransactions.getModel();
            model.setRowCount(0);
            for (Transaction a : transactionByMonth) {
                if (a.getType() == a.getType().DEPOSITS) {
                    subTotal += a.getAmount();
                    deposits += a.getAmount();
                    model.addRow(new Object[]{
                        datef.format(a.getDate()), a.getDescription(), df.format(a.getAmount()), "", df.format(subTotal)

                    });
                } else {
                    subTotal -= a.getAmount();
                    withdrawals += a.getAmount();
                    model.addRow(new Object[]{
                        datef.format(a.getDate()), a.getDescription(), "", df.format(a.getAmount()), df.format(subTotal)
                    });
                }
            }

            lblDeposits.setText("Deposito: " + df.format(deposits));
            lblWithdrawals.setText("Retiros: " + df.format(withdrawals));
            lblFinalBalance.setText("Total: " + df.format(subTotal));

        }
    }//GEN-LAST:event_cbxMonthItemStateChanged

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
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAccount().setVisible(true);
            }
        });
    }

    private AccountStatement accountStatement = new AccountStatement();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFile;
    private javax.swing.JComboBox<String> cbxMonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblClabe;
    private javax.swing.JLabel lblCurrency;
    private javax.swing.JLabel lblDeposits;
    private javax.swing.JLabel lblFinalBalance;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRfc;
    private javax.swing.JLabel lblWithdrawals;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTable tblTransactions;
    // End of variables declaration//GEN-END:variables
}
