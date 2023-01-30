/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resourcemanagementsystem;

import java.io.FileWriter;
import javax.swing.JOptionPane;


public class UserRegistration extends javax.swing.JFrame {

    String gender,accounttype;
    public UserRegistration() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        role = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 380));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("User Registration Panel");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 70, 440, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 170, 50, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(293, 240, 40, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Password:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 270, 70, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Contact:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 310, 70, 15);
        getContentPane().add(name);
        name.setBounds(340, 170, 170, 30);
        getContentPane().add(email);
        email.setBounds(340, 230, 170, 30);
        getContentPane().add(password);
        password.setBounds(340, 270, 170, 30);
        getContentPane().add(contact);
        contact.setBounds(340, 310, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Gender:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 210, 60, 15);

        buttonGroup1.add(male);
        male.setText("Male");
        getContentPane().add(male);
        male.setBounds(360, 200, 70, 30);

        buttonGroup1.add(female);
        female.setText("Female");
        getContentPane().add(female);
        female.setBounds(420, 200, 80, 30);

        jLabel8.setText("Already registered?");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(710, 10, 130, 50);

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourcemanagementsystem/user.png"))); // NOI18N
        login.setText("   Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(690, 50, 150, 60);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Role:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 350, 40, 15);
        getContentPane().add(role);
        role.setBounds(340, 350, 100, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Age:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(465, 350, 30, 20);
        getContentPane().add(age);
        age.setBounds(500, 350, 84, 30);

        register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourcemanagementsystem/plus_1.png"))); // NOI18N
        register.setText("     Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register);
        register.setBounds(690, 490, 150, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       this.setVisible(false);
       Login log=new Login();
       log.setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        try{
         
         String Name=name.getText();
         String Email=email.getText();
         String Password=password.getText();
         String Contact=contact.getText();
         String Role=role.getText();
         String Age=age.getText();
         accounttype="User";
         if(male.isSelected()){
             gender="Male";
         }
         else if(female.isSelected()){
             gender="Female";
         }
         
         FileWriter d=new FileWriter("registration.txt",true);  //write data in departments file
         String data = Name+","+gender+","+accounttype+","+Email+","+Password+","+Contact+","+Role+","+Age;
         d.write(data);
         d.write(System.getProperty("line.separator"));
         d.close();
         JOptionPane.showMessageDialog(null,"Registered Successfully");
         
             this.setVisible(false);
              Login log=new Login();
               log.setVisible(true);
         
       }
       catch(Exception e){        //exception handling
       JOptionPane.showMessageDialog(null,e);
       }
       name.setText("");
        email.setText("");
        contact.setText("");
        password.setText("");
         male.setSelected(false);
         female.setSelected(false);
    }//GEN-LAST:event_registerActionPerformed

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
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton login;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JButton register;
    private javax.swing.JTextField role;
    // End of variables declaration//GEN-END:variables
}
