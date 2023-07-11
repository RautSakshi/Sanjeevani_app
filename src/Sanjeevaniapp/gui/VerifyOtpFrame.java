
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.AppointmentDao;
import Sanjeevaniapp.dao.DoctorsDao;
import Sanjeevaniapp.dao.PatientDao;
import Sanjeevaniapp.pojo.AppointmentPojo;
import Sanjeevaniapp.pojo.PatientPojo;
import Sanjeevaniapp.utility.OTPSender;
import Sanjeevaniapp.utility.Sender;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class VerifyOtpFrame extends javax.swing.JFrame {

   private PatientPojo patient;   
    public VerifyOtpFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
      public VerifyOtpFrame(PatientPojo patient) {
       this();
       txtPatientName.setText(patient.getFirstName()+" "+patient.getLastName());
       txtMno.setText(patient.getMno());
       this.patient=patient;
       
        
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
        txtPatientName = new javax.swing.JTextField();
        txtOTP = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txtMno = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnVerify = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        btnSendOTP = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Employee Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Patient Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Enter OTP");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Phone no.");

        jTextField3.setText("jTextField3");

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 153));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnVerify.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVerify.setForeground(new java.awt.Color(0, 153, 153));
        btnVerify.setText("VERIFY");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        btnBack2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(0, 153, 153));
        btnBack2.setText("LOGOUT");

        btnSendOTP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSendOTP.setForeground(new java.awt.Color(0, 153, 153));
        btnSendOTP.setText("SEND OTP");
        btnSendOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendOTPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(btnSendOTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtMno, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 52, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 1170, 350));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Sanjeevani Application");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 450, 60));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1160, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendOTPActionPerformed
         try{
           Sender sender=new OTPSender();
           String pOtp=String.valueOf(patient.getOtp());
             System.out.println(pOtp);
             System.out.println(patient.getMno());
           boolean result=sender.send(patient.getMno(), pOtp);
           if(result){
               JOptionPane.showMessageDialog(null,"OTP sent successfully!");
           }else{
               JOptionPane.showMessageDialog(null,"Cannot send the OTP . Please check the number!");
           }
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Server issue");
           ex.printStackTrace();
       }
        
    

    }//GEN-LAST:event_btnSendOTPActionPerformed

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
         if(!isValidOTP()){
            JOptionPane.showMessageDialog(null,"Invalid OTP. Try again!");
            return;
        }
        try{
           AppointmentPojo appojo = new AppointmentPojo();
            appojo.setAppointmentDate(patient.getDate().toString());
            appojo.setOpd(patient.getOpd());
            appojo.setPatientId(patient.getPatientId());
            appojo.setPatientName(txtPatientName.getText());
            appojo.setStatus("REQUEST");
            appojo.setMobileNo(this.txtMno.getText());
            String docName = DoctorsDao.getDoctorNameById(patient.getDoctorId());
            appojo.setDocotorName(docName);
            boolean result1 = PatientDao.addPatient(patient);
            boolean result2 = AppointmentDao.addAppointment(appojo);
            if (result1 && result2) {
                JOptionPane.showMessageDialog(null, "Patient record Saved!!");
                ViewAllPatientsDetailsFrame viewAll = new ViewAllPatientsDetailsFrame();
                this.dispose();
                viewAll.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Sorry! could not save the patient record!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in DB");
            ex.printStackTrace();
        }
            
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         AddPatientFrame Frame=new AddPatientFrame();
      Frame.setVisible( true);
      this.dispose();
    
    }//GEN-LAST:event_btnBackActionPerformed

   
    public static void main(String args[]) {
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerifyOtpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerifyOtpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerifyOtpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerifyOtpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerifyOtpFrame().setVisible(true);
            }
        });
    }
    private boolean isValidOTP() {
        boolean result=false;
        try{
            int otp=Integer.parseInt(txtOTP.getText().trim());
            if(otp==patient.getOtp())
                result=true;
        }catch(NumberFormatException ex){
           //JOptionPane.showMessageDialog(null, "Please input digits only!");
           
        }finally{
            return result;
        }
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnSendOTP;
    private javax.swing.JButton btnVerify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtMno;
    private javax.swing.JTextField txtOTP;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
