/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.LoginController;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author chmov
 */
public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        controller = new LoginController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserField = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        PasswordField = new javax.swing.JPasswordField();
        PasswordLabel = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JLabel();
        LoginForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserField.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(UserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 130, -1));

        jToggleButton1.setBackground(new java.awt.Color(182, 56, 56));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton1.setText("Entrar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        PasswordField.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 130, -1));

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordLabel.setText("Password");
        getContentPane().add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        UserLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserLabel.setText("User");
        getContentPane().add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        LoginLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 32)); // NOI18N
        LoginLabel.setText("Login");
        getContentPane().add(LoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 100, 50));

        LoginPanel.setIcon(new javax.swing.ImageIcon("C:\\Netbeans Projects\\BarberShop\\src\\main\\java\\View\\Images\\Painel.png")); // NOI18N
        getContentPane().add(LoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 280, 240));

        LoginForm.setIcon(new javax.swing.ImageIcon("C:\\Netbeans Projects\\BarberShop\\src\\main\\java\\View\\Images\\Black Hand Drawn Retro Barber Shop Logo.png")); // NOI18N
        getContentPane().add(LoginForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        this.controller.showAlert();
        System.out.println(UserField.getText());
        System.out.println(PasswordField.getText());
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
    private javax.swing.JLabel LoginForm;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel LoginPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField UserField;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    public void showAlert(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public JPasswordField getPasswordField() {
        return PasswordField;
    }

    public void setPasswordField(JPasswordField PasswordField) {
        this.PasswordField = PasswordField;
    }

    public JTextField getUserField() {
        return UserField;
    }

    public void setUserField(JTextField UserField) {
        this.UserField = UserField;
    }
    
    
}
