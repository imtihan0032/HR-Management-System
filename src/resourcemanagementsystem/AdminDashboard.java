/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resourcemanagementsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdminDashboard extends javax.swing.JFrame {

    String user = null;
    String admin;
    String line, Name = null, Gender = null, AccountType = null, Email = null, Password = null, Contact = null, Role = null, Age = null;

    public AdminDashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        role = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        applicationid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        ApproveORreject = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showdata = new javax.swing.JTextArea();
        refresh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 520));
        setPreferredSize(new java.awt.Dimension(771, 520));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Admin Panel");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 30, 290, 30);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourcemanagementsystem/logout.png"))); // NOI18N
        logout.setText("  Logout?");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(680, 20, 160, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Profile Information");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 260, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 300, 37, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Password:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 340, 63, 15);
        getContentPane().add(name);
        name.setBounds(180, 300, 150, 30);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(180, 340, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Contact:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 380, 60, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Role:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 420, 40, 15);
        getContentPane().add(contact);
        contact.setBounds(180, 380, 150, 30);

        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        getContentPane().add(role);
        role.setBounds(180, 420, 150, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Age:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 460, 28, 15);
        getContentPane().add(age);
        age.setBounds(180, 460, 150, 30);

        update.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(200, 500, 90, 23);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourcemanagementsystem/close (1).png"))); // NOI18N
        close.setText("   Exit");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(20, 20, 110, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Approve/Reject application");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(430, 260, 260, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Application id:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(450, 300, 100, 15);
        getContentPane().add(applicationid);
        applicationid.setBounds(540, 300, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Approve/reject:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(440, 350, 110, 15);

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select option", "Approve", "Reject" }));
        getContentPane().add(status);
        status.setBounds(540, 340, 130, 40);

        ApproveORreject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ApproveORreject.setText("Submit");
        ApproveORreject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveORrejectActionPerformed(evt);
            }
        });
        getContentPane().add(ApproveORreject);
        ApproveORreject.setBounds(550, 390, 100, 23);

        showdata.setColumns(20);
        showdata.setRows(5);
        jScrollPane1.setViewportView(showdata);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 90, 440, 120);

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourcemanagementsystem/refresh.png"))); // NOI18N
        refresh.setText("   Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh);
        refresh.setBounds(535, 220, 130, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourcemanagementsystem/plus_1.png"))); // NOI18N
        jButton1.setText("  Add Admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(670, 490, 170, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.setVisible(false);
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed


        try {
            File temp = new File(".txt");
            File original = new File("registration.txt");
            FileWriter fwtemp = new FileWriter(".txt");
            BufferedWriter bwtemp = new BufferedWriter(fwtemp);
            FileReader fr = new FileReader("registration.txt");
            BufferedReader br = new BufferedReader(fr);
            String srch = Email;
            String line = null;
            int edit = 0;
            while ((line = br.readLine()) != null) {
                if (line.split(",")[3].equals(srch)) {
                    String data = name.getText() + "," + Gender + "," + AccountType + "," + Email + "," + password.getText() + "," + contact.getText() + "," + role.getText() + "," + age.getText();
                    bwtemp.write(data);
                    bwtemp.write(System.getProperty("line.separator"));
                    edit = 1;
                } else {
                    bwtemp.write(line);
                    bwtemp.newLine();
                }
            }
            if (edit == 1) {
                JOptionPane.showMessageDialog(null, "Record is successfully Updated");
            } else {
                JOptionPane.showMessageDialog(null, "Record not found");
            }
            br.close();
            br = null;
            bwtemp.close();
            bwtemp = null;
            fr.close();
            fr = null;
            fwtemp.close();
            fwtemp = null;
            original.delete();
            temp.renameTo(original);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Message");
        }
        name.setText("");
        password.setText("");
        contact.setText("");
        role.setText("");
        age.setText("");

    }//GEN-LAST:event_updateActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Resource Management System...",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeActionPerformed

    private void ApproveORrejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveORrejectActionPerformed
        String approve = (String) status.getSelectedItem();
        String ID = applicationid.getText();
        try {

            File temp = new File(".txt");
            File original = new File("applications.txt");
            File app_rej = new File("ApprovedRejected.txt");
            FileWriter fwtemp = new FileWriter(".txt");
            BufferedWriter bwtemp = new BufferedWriter(fwtemp);
            FileWriter ffw = new FileWriter("ApprovedRejected.txt", true);
            BufferedWriter fbw = new BufferedWriter(ffw);
            FileReader fr = new FileReader("applications.txt");
            BufferedReader br = new BufferedReader(fr);
            String srch = Email;
            String line = null;
            int edit = 0;
            while ((line = br.readLine()) != null) {
                if (line.split(",")[0].equals(ID)) {
                    String a = line.split(",")[0];
                    String b = line.split(",")[1];
                    String c = line.split(",")[2];
                    String d = line.split(",")[3];
                    String e = line.split(",")[4];
                    String f = line.split(",")[5];
                    String g = line.split(",")[6];
                    String data = a + "," + b + "," + c + "," + d + "," + e + "," + f + "," + g + "," + approve;
                    fbw.write(data);
                    fbw.write(System.getProperty("line.separator"));
                    edit = 1;

                } else {
                    bwtemp.write(line);
                    bwtemp.newLine();
                }
            }
            if (edit == 1) {
                JOptionPane.showMessageDialog(null, "Application succesfully Approved/Rejected");
            } else {
                JOptionPane.showMessageDialog(null, "Record not found");
            }
            br.close();
            br = null;
            bwtemp.close();
            bwtemp = null;
            fr.close();
            fr = null;
            fwtemp.close();
            fwtemp = null;
            original.delete();
            temp.renameTo(original);
            fbw.close();
            ffw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Message");
        }
        applicationid.setText("");
    }//GEN-LAST:event_ApproveORrejectActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        showdata.setText("");
        try {

            String[] data;
            FileReader fr = new FileReader("applications.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                showdata.append(line + "\n");
            }

            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_refreshActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminRegistration admin = new AdminRegistration();
        admin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    void viewData(String Username) {

        user = Username;
        //Show user profile data
        try {
            FileReader fr = new FileReader("registration.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                String[] details;
                details = line.split(",");
                Name = details[0];
                Gender = line.split(",")[1];
                AccountType = details[2];
                Email = details[3];
                Password = details[4];
                Contact = details[5];
                Role = details[6];
                Age = details[7];
                if (Email.equals(user)) {
                    name.setText(Name);
                    password.setText(Password);
                    contact.setText(Contact);
                    role.setText(Role);
                    age.setText(Age);

                }
            }

            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String[] data;
            FileReader fr = new FileReader("applications.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                showdata.append(line + "\n");
            }

            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApproveORreject;
    private javax.swing.JTextField age;
    private javax.swing.JTextField applicationid;
    private javax.swing.JButton close;
    private javax.swing.JTextField contact;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField role;
    private javax.swing.JTextArea showdata;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
