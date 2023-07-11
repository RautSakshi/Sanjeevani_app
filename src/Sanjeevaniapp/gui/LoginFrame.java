

package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.UserDao;
import Sanjeevaniapp.dbutil.DBConnection;
import Sanjeevaniapp.pojo.User;
import Sanjeevaniapp.pojo.UserProfile;
import Sanjeevaniapp.utility.PasswordEncryption;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LoginFrame extends javax.swing.JFrame {

  private String loginId,password;
    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jrbAdmin3 = new javax.swing.JRadioButton();
        jrbDoctor = new javax.swing.JRadioButton();
        jrbReceptionist = new javax.swing.JRadioButton();
        btnLogin = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Sanjeevani Application");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 550, 60));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Login ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 200, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 240, 40));

        txtUserId.setBackground(new java.awt.Color(153, 153, 255));
        txtUserId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 250, 40));

        txtPassword.setBackground(new java.awt.Color(153, 153, 255));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.setToolTipText("");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 250, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("User Type");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 210, 50));

        jrbAdmin3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrbAdmin3);
        jrbAdmin3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbAdmin3.setText("Admin");
        jrbAdmin3.setContentAreaFilled(false);
        jPanel2.add(jrbAdmin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 220, 40));

        jrbDoctor.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrbDoctor);
        jrbDoctor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbDoctor.setText("Doctor");
        jrbDoctor.setContentAreaFilled(false);
        jPanel2.add(jrbDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 200, 40));

        jrbReceptionist.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrbReceptionist);
        jrbReceptionist.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbReceptionist.setText("Receptionist");
        jrbReceptionist.setContentAreaFilled(false);
        jrbReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbReceptionistActionPerformed(evt);
            }
        });
        jPanel2.add(jrbReceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 240, 40));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 230, 40));

        btnQuit.setBackground(new java.awt.Color(255, 255, 255));
        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        jPanel2.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 240, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 1030, 280));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
       
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      boolean isInputValid=validateInputs();
        if(isInputValid==false){
            JOptionPane.showMessageDialog(null,"Please input id and password");
            return;
        }
        String userType=getUserType();
        System.out.println(userType);
        if(userType==null){
            JOptionPane.showMessageDialog(null,"Please select a user type");
            return;
        }
        try{
            User user=new User();
            user.setLoginId(loginId);
            String pwd=new String(PasswordEncryption.getEncryptedPassword(password));
            user.setPassword(pwd);
            user.setUserType(userType);
            String userName=UserDao.validateUser(user);
            System.out.println(pwd+","+userType+","+loginId);
            System.out.println(userName);
            if(userName!=null){
                JOptionPane.showMessageDialog(null,"Welcome "+userName,"Login success!",JOptionPane.INFORMATION_MESSAGE);
                UserProfile.setUserName(userName);
                UserProfile.setUserType(userType);
                UserProfile.setUserId(loginId);
                JFrame optionsFrame=null;
                if(userType.equalsIgnoreCase("admin")){
                   optionsFrame=new AdminOptionsFrame();
                 }
                else if(userType.equalsIgnoreCase("receptionist")){
                   optionsFrame=new ReceptionistOptionFrame();
                 }
                else{
                    optionsFrame=new DoctorsOptionsFrame();
                }
                optionsFrame.setVisible(true);
                this.dispose();
                return;
                
            }
            JOptionPane.showMessageDialog(null,"Invalid credentials!","Login denied!",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
                                            

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
    DBConnection .closeConnection();
    System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jrbReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbReceptionistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbReceptionistActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
       
       
    }
     private boolean validateInputs() {
        loginId=txtUserId.getText().trim();
        char []pwd=txtPassword.getPassword();
        if(loginId.isEmpty()|| pwd.length==0)
            return false;
        password=new String(pwd);
        return true;
        
    }

    private String getUserType() {
        if(jrbAdmin3.isSelected())
            return jrbAdmin3.getText().toUpperCase();
        else if(jrbDoctor.isSelected())
            return jrbDoctor.getText().toUpperCase();
        else if(jrbReceptionist.isSelected())
            return jrbReceptionist.getText().toUpperCase();
        return null;
    }

     



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jrbAdmin3;
    private javax.swing.JRadioButton jrbDoctor;
    private javax.swing.JRadioButton jrbReceptionist;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
