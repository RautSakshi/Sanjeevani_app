
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.PatientDao;
import Sanjeevaniapp.dao.ReceptionistDao;
import Sanjeevaniapp.dao.UserDao;
import Sanjeevaniapp.dao.EmpDao;
import Sanjeevaniapp.pojo.ReceptionistPojo;
import Sanjeevaniapp.pojo.UserPojo;
import Sanjeevaniapp.utility.PasswordEncryption;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;


public class UpdateReceptionistsFrame extends javax.swing.JFrame {

   
     String oldName;
    String recepName,loginId,gender,password,rePassword;
    public UpdateReceptionistsFrame() {
       initComponents();
        loadRegIds();
        super.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcgender = new javax.swing.JComboBox<>();
        jcReceptionistID = new javax.swing.JComboBox<>();
        txtReceptionistName = new javax.swing.JTextField();
        txtLoginID = new javax.swing.JTextField();
        pwd2 = new javax.swing.JPasswordField();
        pwd1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        btnUpadate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setText("Sanjeevani Application");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 440, 50));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 410));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Receptionist Details");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Receptionist Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Receptionist ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Login ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Retype Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("gender");

        jcgender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jcReceptionistID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcReceptionistIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel7)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcReceptionistID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtReceptionistName)
                            .addComponent(txtLoginID)
                            .addComponent(jcgender, javax.swing.GroupLayout.Alignment.TRAILING, 0, 400, Short.MAX_VALUE)
                            .addComponent(pwd2)
                            .addComponent(pwd1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcReceptionistID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReceptionistName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLoginID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwd2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcgender, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 780, 460));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/images (2).jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 210, 320));

        btnUpadate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpadate.setForeground(new java.awt.Color(0, 153, 153));
        btnUpadate.setText("Upadate");
        btnUpadate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpadateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpadate, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 730, 150, 40));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 800, 120, 40));

        btnLogout3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout3.setForeground(new java.awt.Color(0, 153, 153));
        btnLogout3.setText("Logout");
        btnLogout3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 800, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcReceptionistIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcReceptionistIDActionPerformed
        // TODO add your handling code here:
       try{
          
            String recepId=this.jcReceptionistID.getSelectedItem().toString();
            ReceptionistPojo recep = ReceptionistDao.getReceptionistDetails(recepId);
            this.jcgender.setSelectedItem(recep.getGender().toUpperCase());
            this.txtReceptionistName.setText(recep.getReceptionistName());
             oldName = this.txtReceptionistName.getText();
//          System.out.println(oldName);
//            System.out.println(recepId);
//            System.out.println(recep.getReceptionistName());
        
            UserPojo user = UserDao.getReceptionistsDetailsFromUsers(recep.getReceptionistName());
//            System.out.println(user.getLoginId()+","+user.getPassword());
            this.txtLoginID.setText(user.getLoginId());
            this.pwd1.setText(user.getPassword());
            this.pwd2.setText(user.getPassword());
            
        }
        catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }

    }//GEN-LAST:event_jcReceptionistIDActionPerformed

    private void btnUpadateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpadateActionPerformed
        // TODO add your handling code here:
       if (validateInputs() == false) {
            JOptionPane.showMessageDialog(null, "Please input all the fields");
            return;
        }
        String passwordValid = matchPassword();
        if (passwordValid != null) {
            JOptionPane.showMessageDialog(null, passwordValid);
            pwd1.requestFocus();
            return;
        }
        try {
            UserPojo user = new UserPojo();
            user.setLoginId(loginId);
            String encPassword = new String(PasswordEncryption.getEncryptedPassword(password));
            user.setPassword(encPassword);
            user.setUserType("RECEPTIONIST");
            user.setUserName(recepName);
            ReceptionistPojo recep = new ReceptionistPojo();
            recep.setReceptionistId(this.jcReceptionistID.getSelectedItem().toString());
            recep.setGender(this.jcgender.getSelectedItem().toString());
            recep.setReceptionistName(recepName);
//            oldName = this.jcReceptionistName.getText();
            System.out.println(oldName);
            boolean resp1 = UserDao.updateUser(user,oldName);
            System.out.println("resp1"+resp1);
             boolean empRest = EmpDao.updateEmployeeByName(oldName,recepName);
            boolean resp2 = ReceptionistDao.updateReceptionist(recep);
            System.out.println("resp2"+resp2);
            if (resp1 == true && resp2 == true && empRest == true) {
                JOptionPane.showMessageDialog(null, "Receptionist Updated Successfully!");
                return;
            }
            JOptionPane.showMessageDialog(null, "Receptioist Updated unsuccessfully!");
        } 
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in DB from register actionPerformed:" + ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpadateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManageReceptionistFrame Frame=new ManageReceptionistFrame();
        Frame.setVisible( true);
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout3ActionPerformed
        Frame fr = new LoginFrame();
        this.dispose();
        fr.setVisible(true);       
    }//GEN-LAST:event_btnLogout3ActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateReceptionistsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout3;
    private javax.swing.JButton btnUpadate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcReceptionistID;
    private javax.swing.JComboBox<String> jcgender;
    private javax.swing.JPasswordField pwd1;
    private javax.swing.JPasswordField pwd2;
    private javax.swing.JTextField txtLoginID;
    private javax.swing.JTextField txtReceptionistName;
    // End of variables declaration//GEN-END:variables

 private void loadRegIds() {
         try
        {
            List<String>regIdList=ReceptionistDao.getAllReceptionistsId();
            for(String id:regIdList){
                this.jcReceptionistID.addItem(id);
            }            
        }
        catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB from updateReceptionostFrame"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }
    
    private boolean validateInputs() {
         recepName = this.txtReceptionistName.getText().trim();
         loginId = this.txtLoginID.getText().trim();
         gender = this.jcgender.getSelectedItem().toString();
        char[] pw1 = this.pwd1.getPassword();
        char[] pw2 = this.pwd2.getPassword();
        if (recepName.isEmpty() || pw1.length == 0 || pw2.length == 0 || loginId.isEmpty()) {
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
}
