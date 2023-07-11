
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.EmpDao;
import Sanjeevaniapp.dao.ReceptionistDao;
import Sanjeevaniapp.dao.UserDao;
import Sanjeevaniapp.pojo.ReceptionistPojo;
import Sanjeevaniapp.pojo.UserPojo;
import Sanjeevaniapp.utility.PasswordEncryption;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;


public class AddReceptionistFrame extends javax.swing.JFrame {

    private Map<String,String>unRegRecepList;
    private String selEmpName,selEmpId,loginId;
    private String password,rePassword;
    public AddReceptionistFrame() {
        initComponents();
        this.setVisible(true);
        loadReceptionistDetails();
        getNewRecepId();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jcEmployeeId = new javax.swing.JComboBox<>();
        jcgender = new javax.swing.JComboBox<>();
        txtLoginId = new javax.swing.JTextField();
        txtRecpId = new javax.swing.JTextField();
        txtReceptionistName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtRePwd = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnRegister1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnLogout3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Employee ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Receptionist ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Receptionist Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Login ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Employee ID");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Receptionist ID");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Login ID");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Receptionist Name");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Password");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Retype Password");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("gender");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jcEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmployeeIdActionPerformed(evt);
            }
        });
        jPanel3.add(jcEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 530, 40));

        jcgender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel3.add(jcgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 530, 40));
        jPanel3.add(txtLoginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 530, 40));

        txtRecpId.setEditable(false);
        jPanel3.add(txtRecpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 530, 40));
        jPanel3.add(txtReceptionistName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 530, 40));
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 230, 40));
        jPanel3.add(txtRePwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 200, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Add Receptionist");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 820, 440));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/images (2).jpg"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 220, 290));

        btnRegister1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegister1.setForeground(new java.awt.Color(0, 153, 153));
        btnRegister1.setText("Register");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 800, 200, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel19.setText("Sanjeevani Application");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 460, 50));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1040, 410));

        btnBack2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(0, 153, 153));
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 860, 120, 40));

        jLabel17.setText("jLabel17");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 540, 60));

        btnLogout3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout3.setForeground(new java.awt.Color(0, 153, 153));
        btnLogout3.setText("Logout");
        btnLogout3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 860, 120, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("Add Receptionist");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
         if(validateInputs()==false){
            JOptionPane.showMessageDialog(null,"Please input all fields");
            return;
        }
        String result=matchPassword();
        if(result!=null){
            JOptionPane.showMessageDialog(null,result);
            return;
        }
        try{
            UserPojo user=new UserPojo();
            user.setLoginId(loginId);
            String encPassword=new String(PasswordEncryption.getEncryptedPassword(password));
            user.setPassword(encPassword);
            user.setUserType("RECEPTIONIST");
            user.setUserName(selEmpName);
            ReceptionistPojo recep=new ReceptionistPojo();
            recep.setReceptionistId(txtRecpId.getText().trim());
            recep.setGender(jcgender.getSelectedItem().toString());
            recep.setReceptionistName(selEmpName);
            boolean resp1=UserDao.addUser(user);
            boolean resp2=ReceptionistDao.addReceptionist(recep);
            if(resp1==true && resp2==true){
             JOptionPane.showMessageDialog(null,"Receptionist reg successfully");
             clearAll();
             this.getNewRecepId();
             return;
            }
            JOptionPane.showMessageDialog(null,"Receptionist reg unsuccessful");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB:"+ex);
            ex.printStackTrace();
        }        // TODO add your handling code here:
                                               

                                   
    }//GEN-LAST:event_btnRegister1ActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
       ManageReceptionistFrame Frame=new ManageReceptionistFrame();
      Frame.setVisible( true);
      this.dispose();
                       
                           
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void btnLogout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout3ActionPerformed
        Frame fr = new LoginFrame();
        this.dispose();
        fr.setVisible(true);
    }//GEN-LAST:event_btnLogout3ActionPerformed

    private void jcEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmployeeIdActionPerformed
          if (jcEmployeeId.getSelectedIndex() == -1) {
            return;
        }
        selEmpId = jcEmployeeId.getSelectedItem().toString();
        selEmpName = unRegRecepList.get(selEmpId);
        txtReceptionistName.setText(selEmpName);
                                         
    }//GEN-LAST:event_jcEmployeeIdActionPerformed

   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReceptionistFrame();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnLogout3;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcEmployeeId;
    private javax.swing.JComboBox<String> jcgender;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePwd;
    private javax.swing.JTextField txtReceptionistName;
    private javax.swing.JTextField txtRecpId;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() {
        loginId = this.txtLoginId.getText().trim();
        char[] pw1 = this.txtPassword.getPassword();
        char[] pw2 = this.txtRePwd.getPassword();
        if (loginId.isEmpty() || pw1.length == 0 || pw2.length == 0) {
            return false;
        }
        password = new String(pw1).trim();
        rePassword = new String(pw2).trim();
        return true;
    }

    private String matchPassword() {
        if (password.length() < 3 || rePassword.length() < 3) {
            return "PASSWORD MUST BE ATLEAST 3 CHARACTERS LONG";
        }
        if (password.equals(rePassword) == false) {
            return "PASSWORDS DO NOT MATCH";
        }
        return null;
    }

    private void loadReceptionistDetails() {
        try{
            unRegRecepList=EmpDao.getUnRegisteredReceptionists();
            Set<String>recIdSet=unRegRecepList.keySet();
            if(unRegRecepList.size() == 0){
            JOptionPane.showMessageDialog(null, "All Receptionists Registerd!");
            return;
        }
            for(String id:recIdSet){
                jcEmployeeId.addItem(id);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB:"+ex);
            ex.printStackTrace();
        }
    }

    private void getNewRecepId() {
        try {
            String recId = ReceptionistDao.getNextRecepId();
            this.txtRecpId.setText(recId);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in DB: from addReceptionsitFrame" + ex);
            ex.printStackTrace();
        }
    }



 private void clearAll(){
      txtLoginId.setText("");
      this.txtPassword.setText("");
      this.txtRePwd.setText("");
      this.unRegRecepList.remove(selEmpId);
      this.jcEmployeeId.removeItem(selEmpId);
      if(unRegRecepList.size()==0){
          JOptionPane.showMessageDialog(null,"All receptionists registered!");
          ManageReceptionistFrame manageRecep=new ManageReceptionistFrame();
          manageRecep.setVisible(true);
          this.dispose();
      }
 }
}
 
 

