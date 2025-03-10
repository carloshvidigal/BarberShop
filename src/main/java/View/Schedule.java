/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ScheduleController;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author chmov
 */
public class Schedule extends javax.swing.JFrame {

    private final ScheduleController controller;

    /**
     * Creates new form Schedule
     */
    public Schedule() {
        initComponents();
        controller = new ScheduleController(this);
        start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HourField = new javax.swing.JTextField();
        OtherInfoTextField = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        OtherInfoLabel = new javax.swing.JLabel();
        BookButton = new javax.swing.JToggleButton();
        HourLabel = new javax.swing.JLabel();
        DateField = new javax.swing.JTextField();
        ValueField = new javax.swing.JTextField();
        DateLabel = new javax.swing.JLabel();
        ValueLabel = new javax.swing.JLabel();
        ServiceCombo = new javax.swing.JComboBox<>();
        ServiceLabel = new javax.swing.JLabel();
        ClientLabel = new javax.swing.JLabel();
        ClientCombo = new javax.swing.JComboBox<>();
        IdLabel = new javax.swing.JLabel();
        Schedule = new javax.swing.JLabel();
        IdField = new javax.swing.JTextField();
        Panel = new javax.swing.JLabel();
        Panel1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        Background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(HourField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 220, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        OtherInfoTextField.setViewportView(jTextArea1);

        getContentPane().add(OtherInfoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 460, 130));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Client", "Service", "Value($)", "Date", "Hour", "Other Info"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 820, 190));

        OtherInfoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OtherInfoLabel.setText("Other Info");
        getContentPane().add(OtherInfoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        BookButton.setBackground(new java.awt.Color(182, 136, 17));
        BookButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BookButton.setForeground(new java.awt.Color(204, 204, 204));
        BookButton.setText("Book");
        getContentPane().add(BookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 150, -1));

        HourLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HourLabel.setText("Hour");
        getContentPane().add(HourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        DateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateFieldActionPerformed(evt);
            }
        });
        getContentPane().add(DateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 220, 20));
        getContentPane().add(ValueField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 220, 20));

        DateLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DateLabel.setText("Date");
        getContentPane().add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        ValueLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ValueLabel.setText("Value($)");
        getContentPane().add(ValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, 20));

        getContentPane().add(ServiceCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 220, -1));

        ServiceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ServiceLabel.setText("Service");
        getContentPane().add(ServiceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        ClientLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ClientLabel.setText("Client");
        getContentPane().add(ClientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        ClientCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientComboActionPerformed(evt);
            }
        });
        getContentPane().add(ClientCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 220, -1));

        IdLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IdLabel.setText("Id");
        getContentPane().add(IdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, 20));

        Schedule.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Schedule.setText("Schedule");
        getContentPane().add(Schedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));
        getContentPane().add(IdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 220, 20));

        Panel.setIcon(new javax.swing.ImageIcon("C:\\Netbeans Projects\\BarberShop\\src\\main\\java\\View\\Images\\Painel.png")); // NOI18N
        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 490, 250));

        Panel1.setIcon(new javax.swing.ImageIcon("C:\\Netbeans Projects\\BarberShop\\src\\main\\java\\View\\Images\\Painel.png")); // NOI18N
        getContentPane().add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 550, 250));

        Background.setIcon(new javax.swing.ImageIcon("C:\\Netbeans Projects\\BarberShop\\src\\main\\java\\View\\Images\\Schedule.png")); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 490, 500));

        Background2.setIcon(new javax.swing.ImageIcon("C:\\Netbeans Projects\\BarberShop\\src\\main\\java\\View\\Images\\MainMenuBackground - Baixa Transparencia.png")); // NOI18N
        getContentPane().add(Background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientComboActionPerformed

    private void DateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Background2;
    private javax.swing.JToggleButton BookButton;
    private javax.swing.JComboBox<String> ClientCombo;
    private javax.swing.JLabel ClientLabel;
    private javax.swing.JTextField DateField;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JTextField HourField;
    private javax.swing.JLabel HourLabel;
    private javax.swing.JTextField IdField;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JLabel OtherInfoLabel;
    private javax.swing.JScrollPane OtherInfoTextField;
    private javax.swing.JLabel Panel;
    private javax.swing.JLabel Panel1;
    private javax.swing.JLabel Schedule;
    private javax.swing.JComboBox<String> ServiceCombo;
    private javax.swing.JLabel ServiceLabel;
    private javax.swing.JTextField ValueField;
    private javax.swing.JLabel ValueLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void start() {
        this.controller.updateTable();
        this.controller.updateClient();
        this.controller.updateService();
    }

    public JTable getBookingTable() {
        return jTable2;
    }

    public void setBookingTable(JTable BookingTable) {
        this.jTable2 = BookingTable;
    }

    public JComboBox<String> getClientCombo() {
        return ClientCombo;
    }

    public void setClientCombo(JComboBox<String> ClientCombo) {
        this.ClientCombo = ClientCombo;
    }

    public JComboBox<String> getServiceCombo() {
        return ServiceCombo;
    }

    public void setServiceCombo(JComboBox<String> ServiceCombo) {
        this.ServiceCombo = ServiceCombo;
    }
    
    
    
}
