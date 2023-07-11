package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.DoctorsDao;
import Sanjeevaniapp.dao.EmpDao;
import Sanjeevaniapp.dao.UserDao;
import Sanjeevaniapp.pojo.DoctorPojo;
import Sanjeevaniapp.pojo.UserPojo;
import Sanjeevaniapp.utility.PasswordEncryption;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;


public class RegisterDoctorFrame extends javax.swing.JFrame {

   private Map<String,String>unRegDocList;
   private String logId,selEmpId,selEmpName;
   private String pwd1,pwd2;
   private String contactNo,emailId,qualification,specialist;
    public RegisterDoctorFrame(){
        this.initComponents();
        unRegDocList=new HashMap<>();
        loadDoctorDetails();
//        this.loadEmpId();
//        loadEmpId();
        setLocationRelativeTo(null);
        genNewDocId();
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jcEmployeeId = new javax.swing.JComboBox<>();
        txtDoctorName = new javax.swing.JTextField();
        txtLoginId = new javax.swing.JTextField();
        jcGender = new javax.swing.JComboBox<>();
        txtDoctorId = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtQualification = new javax.swing.JTextField();
        txtSpecialist = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        txtpwd1 = new javax.swing.JPasswordField();
        txtpwd2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/images (2).jpg"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 200, 240));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Employee ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Doctor's Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Doctor Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Login ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Retype Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Gender");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Doctor Id");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Contact no.");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 110, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Qualification");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Specialist");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Email ID");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jcEmployeeId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcEmployeeId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmployeeIdActionPerformed(evt);
            }
        });
        jPanel2.add(jcEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, 40));

        txtDoctorName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDoctorName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 160, 40));

        txtLoginId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLoginId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtLoginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 160, 40));

        jcGender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jcGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcGenderActionPerformed(evt);
            }
        });
        jPanel2.add(jcGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 160, 40));

        txtDoctorId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDoctorId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtDoctorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 170, 40));

        txtContactNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtContactNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 170, 40));

        txtQualification.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtQualification.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 170, 40));

        txtSpecialist.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSpecialist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSpecialist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialistActionPerformed(evt);
            }
        });
        jPanel2.add(txtSpecialist, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 170, 40));

        txtEmailId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEmailId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 170, 40));
        jPanel2.add(txtpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 226, 160, 40));
        jPanel2.add(txtpwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 276, 160, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 720, 380));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Add Patient Frame");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 204, 204));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 700, 210, 50));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 204, 204));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 760, 130, 50));

        btnLogout1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout1.setForeground(new java.awt.Color(0, 204, 204));
        btnLogout1.setText("Logout");
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 760, 120, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setText("Sanjeevani Application");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 460, 50));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 980, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void txtSpecialistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialistActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         ManageDoctorsFrame frame = new ManageDoctorsFrame();
        frame.setVisible(true);
        this.dispose();
                          
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
         if(validateInputs()==false){
         JOptionPane.showMessageDialog(null, "Please input all the fields");
         return;
     }
     String passwordValid=matchPassword();
     if(passwordValid!=null){
         JOptionPane.showMessageDialog(null, passwordValid);
         return;
     }
     if(isContactNoValid()==false)
     {
         JOptionPane.showMessageDialog(null, "Invalid mobile no");
         return;
     }
     try{
         DoctorPojo doc=new DoctorPojo();
         doc.setDoctorId(txtDoctorId.getText());
         doc.setDoctorName(selEmpName);
         doc.setEmailId(emailId);
         doc.setGender(jcGender.getSelectedItem().toString());
         doc.setContactNo(contactNo);
         doc.setQualification(qualification);
         doc.setSpecialist(specialist);
         UserPojo user=new UserPojo();
         user.setLoginId(logId);
         String encPassword=new String(PasswordEncryption.getEncryptedPassword(pwd1));
         user.setPassword(encPassword);
         user.setUserName(selEmpName);
         user.setUserType("DOCTOR");
         boolean result1=DoctorsDao.addDoctor(doc);
         boolean result2=UserDao.addUser(user);
         if(result1==true && result2==true){
             JOptionPane.showMessageDialog(null, "Doctor successfully registered!");
             clearAll();
             genNewDocId();
             return;
         }
        JOptionPane.showMessageDialog(null, "Registration unsuccessful!"); 
        return; 
                 
     }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB:"+ex);
            ex.printStackTrace();
        }
                                              
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
       Frame fr = new LoginFrame();
        this.dispose();
        fr.setVisible(true);
                                     
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void jcGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcGenderActionPerformed

    private void jcEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
          if(jcEmployeeId.getSelectedIndex()==-1)
        return;
    selEmpId=jcEmployeeId.getSelectedItem().toString();
    selEmpName=unRegDocList.get(selEmpId);
    txtDoctorName.setText(selEmpName);
                             
    }                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
               try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDoctorFrame().setVisible(true);
            }
        });
    }
        private void loadDoctorDetails() {
        try{
            unRegDocList=EmpDao.getUnRegisteredDoctors();
            if(unRegDocList.size()==0){
             JOptionPane.showMessageDialog(null, "No Doctor Present");
             return;
            }
            Set <String> empIdSet=unRegDocList.keySet();
            for(String empId:empIdSet){
                jcEmployeeId.addItem(empId);
                System.out.println(empId);
                        
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB:"+ex);
            ex.printStackTrace();
        }
    }

    private void genNewDocId() {
        try
        {
            String docId=DoctorsDao.getNewDocId();
            txtDoctorId.setText(docId);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error in DB:"+ex);
            ex.printStackTrace();
        }
    }
 
  private boolean validateInputs(){
      this.logId=this.txtLoginId.getText().trim();
      char[] p1=this.txtpwd1.getPassword();
      char[] p2=this.txtpwd2.getPassword();
      this.contactNo=txtContactNo.getText().trim();
      this.qualification=txtQualification.getText().trim();
      this.emailId=txtEmailId.getText().trim();
      this.specialist=txtSpecialist.getText().trim();
      if(logId.isEmpty()||p1.length==0||p2.length==0||contactNo.isEmpty()||qualification.isEmpty()||emailId.isEmpty()||specialist.isEmpty())
          return false;
      pwd1=new String(p1);
      pwd2=new String(p2);
      return true;
      
  }
  private String matchPassword(){
     pwd1=pwd1.trim();
     pwd2=pwd2.trim();
     if(pwd1.length()<3 || pwd2.length()<3)
         return "Passwords must be of atleast 3 characters in length";
     if(pwd1.equals(pwd2)==false)
         return "Passwords do not match";
     return null;
  }
  private boolean isContactNoValid(){
      char[]mob=contactNo.toCharArray();
      for(char ch:mob){
          if(Character.isDigit(ch)==false)
              return false;
      }
      if(contactNo.length()==10)
            return true;
      return false;
  }
  private void clearAll(){
      txtLoginId.setText("");
      this.txtContactNo.setText("");
      this.txtDoctorId.setText("");
      this.txtEmailId.setText("");
      this.txtpwd1.setText("");
      this.txtpwd2.setText("");
      this.txtQualification.setText("");
      this.txtSpecialist.setText("");
      this.unRegDocList.remove(selEmpId);
      this.jcEmployeeId.removeItem(selEmpId);
      if(unRegDocList.size()==0){
          JOptionPane.showMessageDialog(null,"All doctors registered!");
          ManageDoctorsFrame manageDoc=new ManageDoctorsFrame();
          manageDoc.setVisible(true);
          this.dispose();
      }
      
      
  }
  



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JComboBox<String> jcEmployeeId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtSpecialist;
    private javax.swing.JPasswordField txtpwd1;
    private javax.swing.JPasswordField txtpwd2;
    // End of variables declaration//GEN-END:variables

//    private void loadEmpId() {
//       try{
//            List<String> empIdList = EmpDao.getAllDocId();
//            if(empIdList.size()==0)
//            {
//                JOptionPane.showMessageDialog(null,"No Doctor Present!!!");
//                return;
//            }
//            for(String id:empIdList){
//                jcEmployeeId.addItem(id);
//            }
//        }catch(SQLException ex){
//            JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
//            ex.printStackTrace();
//        }
//    }
}
