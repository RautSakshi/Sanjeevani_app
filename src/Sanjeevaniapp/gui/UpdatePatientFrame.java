
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.AppointmentDao;
import Sanjeevaniapp.dao.DoctorsDao;
import Sanjeevaniapp.dao.PatientDao;
import Sanjeevaniapp.pojo.AppointmentPojo;
import Sanjeevaniapp.pojo.PatientPojo;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;


public class UpdatePatientFrame extends javax.swing.JFrame {
     
    private String OPD,selDoctorId,PatientID;
   private String LastName,FirstName,Status;
   private String contactNo,City,Date,Address;
    private int OTP,Age;
     java.sql.Date dt;
    public UpdatePatientFrame() {
        initComponents();
        loadPatientsId();
        loadDoctorsId();
        setLocationRelativeTo(null);
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        txtOPD = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtContactNum = new javax.swing.JTextField();
        jcDocId = new javax.swing.JComboBox<>();
        jcPatientId = new javax.swing.JComboBox<>();
        jcGender = new javax.swing.JComboBox<>();
        jcMeritalStatus = new javax.swing.JComboBox<>();
        txtCity = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Patient Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("OPD");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Age");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Doctorid");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Patient id");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("City");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Address");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("First Name");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Date");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Phone no.");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Gender");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Marial Status");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        txtOPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOPDActionPerformed(evt);
            }
        });
        jPanel2.add(txtOPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 280, 40));
        jPanel2.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 280, 40));
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 290, 40));
        jPanel2.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 280, 40));
        jPanel2.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 280, 40));

        txtDate.setEditable(false);
        jPanel2.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 280, 40));
        jPanel2.add(txtContactNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 280, 40));

        jcDocId.setEnabled(false);
        jPanel2.add(jcDocId, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 120, 280, 40));

        jcPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPatientIdActionPerformed(evt);
            }
        });
        jPanel2.add(jcPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 170, 280, 40));

        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jcGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcGenderActionPerformed(evt);
            }
        });
        jPanel2.add(jcGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 280, 40));

        jcMeritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        jPanel2.add(jcMeritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 280, 40));
        jPanel2.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 280, 290, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 890, 440));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/images (2).jpg"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 460, 200, 300));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 153, 153));
        btnUpdate.setText("Upadate");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(943, 759, 240, 40));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 820, 130, 40));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 153, 153));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 820, 130, 40));

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(0, 153, 153));
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 220, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Upadate Patient Frame");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 280, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel18.setText("Sanjeevani Application");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 430, 50));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1170, 400));

        jLabel17.setText("jLabel17");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         ReceptionistOptionFrame frame = new  ReceptionistOptionFrame();
        frame.setVisible(true);
        this.dispose();
                                  
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
         LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
              
         {                                          
      if(validateInputs()==false){
         JOptionPane.showMessageDialog(null, "Please input all the fields");
         return;
        }
      if(isContactNoValid()==false){
         JOptionPane.showMessageDialog(null, "Invalid mobile no");
         return;
        }
     try{
         PatientPojo pat=new PatientPojo();
         pat.setAddress(Address);
         pat.setPatientId(PatientID);
         pat.setAge(Age);
         pat.setCity(City);
         pat.setMno(contactNo);
         pat.setDoctorId(jcDocId.getSelectedItem().toString());
         pat.setFirstName(FirstName);
         pat.setGender(jcGender.getSelectedItem().toString());
         pat.setLastName(LastName);
         pat.setMarriedStatus(jcMeritalStatus.getSelectedItem().toString());
         pat.setOpd(OPD);
        // pat.setDate(dt);
         pat.setAptStatus(Status);
         pat.setOtp(OTP);
         System.out.println(pat);
         boolean result1=PatientDao.updatePatient(pat);
         String DocName=DoctorsDao.getDoctorNameById(selDoctorId);
         AppointmentPojo patient=new AppointmentPojo();
         patient.setMobileNo(contactNo);
         patient.setDocotorName(DocName);
         //patient.setAppointmentDate();
         patient.setOpd(OPD);
         patient.setPatientId(PatientID);
         patient.setPatientName(FirstName+" "+LastName);
         patient.setStatus(Status);
         System.out.println(patient);
         boolean result2=AppointmentDao.updateAppointment(patient);
         System.out.println("result 1 ="+result1);
         System.out.println("result2 = "+result2);
         if(result1==true && result2==true){
         JOptionPane.showMessageDialog(null, "Patient update successfully ");
         return;
         }
        JOptionPane.showMessageDialog(null, "Patient update unsuccessful!"); 
        return; 
                 
     }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB update Patient:"+ex);
            ex.printStackTrace();
        
                                           

     }      

         }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jcPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPatientIdActionPerformed
       
         try {
            String patId = jcPatientId.getSelectedItem().toString();
            PatientPojo pat = PatientDao.getPatientDetails(patId);
            
            
            this.txtOPD.setText(pat.getOpd());
            this.jcDocId.setSelectedItem(pat.getDoctorId());;
            this.txtCity.setText(pat.getCity());
            this.txtAddress.setText(pat.getAddress());
            this.txtFirstName.setText(pat.getFirstName());
            this.txtLastName.setText(pat.getLastName());
            this.jcGender.setSelectedItem(pat.getGender().toUpperCase());
            this.jcMeritalStatus.setSelectedItem(pat.getMarriedStatus().toUpperCase());
            this.txtContactNum.setText(pat.getMno());
            this.txtAge.setText(String.valueOf(pat.getAge()));
            txtDate.setText(pat.getDate().toString());
            OTP=pat.getOtp();
            Status=pat.getAptStatus();
            dt=pat.getDate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error In DB from update patients frame" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jcPatientIdActionPerformed

    private void txtOPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOPDActionPerformed

    private void jcGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcGenderActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        ReceptionistOptionFrame rec =new ReceptionistOptionFrame();
        rec.setVisible(true);
        this.dispose();    }//GEN-LAST:event_btnHomeActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePatientFrame().setVisible(true);
            }
        });
    
     
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JComboBox<String> jcDocId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JComboBox<String> jcMeritalStatus;
    private javax.swing.JComboBox<String> jcPatientId;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNum;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtOPD;
    // End of variables declaration//GEN-END:variables
  private void loadPatientsId() {
        try{
            List<String>patientIdList=PatientDao.getAllPatientId();
            for(String id:patientIdList){
                jcPatientId.addItem(id);
            }
             }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB update PatientS loadPatientId "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }
       private void loadDoctorsId() {
  try{
            List<String>docList=DoctorsDao.getAllDoctorId();
            for(String docId:docList){
                jcDocId.addItem(docId);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB: Update Patient "+ex.getMessage());
            ex.printStackTrace();
        }
    }
        private boolean validateInputs(){
         PatientID = jcPatientId.getSelectedItem().toString();
         Address=txtAddress.getText().trim();
         City=txtCity.getText().trim();
         FirstName=txtFirstName.getText().trim();
         LastName=txtLastName.getText().trim();
         OPD=txtOPD.getText().trim();
         contactNo=txtContactNum.getText().trim();
         selDoctorId=jcDocId.getSelectedItem().toString();
                
      if(Address.isEmpty()||contactNo.isEmpty()||City.isEmpty()||FirstName.isEmpty()||LastName.isEmpty()||OPD.isEmpty())
      {    
           JOptionPane.showMessageDialog(null,"Please fill all the fields");
           return false;
           
       }  
           
    try{
           Age=Integer.parseInt(this.txtAge.getText().trim());
           
       }catch(NumberFormatException ex){
          JOptionPane.showMessageDialog(null,"Invalid age"+ex);
          return false;
       }
    if(!isContactNoValid()){
        JOptionPane.showMessageDialog(null,"Invalid Mobile no");
        return false;
    }
    return true;
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
}
