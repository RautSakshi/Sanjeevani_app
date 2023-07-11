
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.DoctorsDao;
import Sanjeevaniapp.dao.PatientDao;
import Sanjeevaniapp.pojo.PatientPojo;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;


public class AddPatientFrame extends javax.swing.JFrame {

    
     java.sql.Date dt;
        List<String> doctorIds;
    String opd, age, city, address, firstName, lastName, mobileNo,patientId;
    private static int OTP = 1000+(int)(Math.random()*323);
    public AddPatientFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadDoctorIds();
        getNewPatientId();
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
        txtPatientId = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtPhoneno = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jcDoctorId = new javax.swing.JComboBox<>();
        jcMarialStatus = new javax.swing.JComboBox<>();
        jcGender = new javax.swing.JComboBox<>();
        txtCity1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Patient Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 8, 228, 31));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("OPD");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("DoctorId");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Patient Id");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Age");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("City");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Address");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Last Name");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Gender");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Date");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Phone no.");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Marial Status");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("First Name");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        txtOPD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtOPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 236, 44));

        txtPatientId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 236, 40));

        txtDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 256, 40));

        txtAge.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 236, 40));

        txtaddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 236, 42));

        txtPhoneno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtPhoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 250, 40));

        txtFirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 256, 50));

        txtLastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 256, 46));

        jcDoctorId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jcDoctorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 240, 40));

        jcMarialStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcMarialStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        jcMarialStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMarialStatusActionPerformed(evt);
            }
        });
        jPanel2.add(jcMarialStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 250, 40));

        jcGender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jPanel2.add(jcGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 260, 40));

        txtCity1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 236, 42));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 920, 460));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/images (2).jpg"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 480, 230, 310));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Add Patient Frame");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 280, 40));

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(0, 153, 153));
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 429, 180, 40));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 153, 153));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 810, 250, 50));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 153, 153));
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 870, 110, 40));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 153));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 870, 110, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel17.setText("Sanjeevani Application");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 470, 50));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1190, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 990));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcMarialStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMarialStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcMarialStatusActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
           ReceptionistOptionFrame frame = new  ReceptionistOptionFrame();
        frame.setVisible(true);
        this.dispose();
                                           
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       
          LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
        this.dispose();
                                             
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (validateInputs() == false) {
            JOptionPane.showMessageDialog(null, "Please input all the fields");
            return;
        }
        if(validMobileNo()==false){
            JOptionPane.showMessageDialog(null, "Please enter a valid mobile no.!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            PatientPojo pat = new PatientPojo();
            pat.setOpd(txtOPD.getText().trim());
//            pat.setAge(Integer.parseInt(txtAge.getText()));
            pat.setCity(txtCity1.getText().trim());
            pat.setAddress(txtaddress.getText().trim());
            pat.setFirstName(txtFirstName.getText().trim());
            pat.setLastName(txtLastName.getText().trim());
            String slectedDocId=jcDoctorId.getSelectedItem().toString();
            pat.setDoctorId(slectedDocId);
            pat.setPatientId(txtPatientId.getText().trim());
            String slectedGender=jcGender.getSelectedItem().toString();
            pat.setGender(slectedGender);
            String slectedMaritalStatus=jcMarialStatus.getSelectedItem().toString();
            pat.setMarriedStatus(slectedMaritalStatus);
            pat.setMno(txtPhoneno.getText().trim());
            pat.setAptStatus("REQUESTED");
            String date=txtDate.getText().trim();
            SimpleDateFormat obj=new SimpleDateFormat("dd-MMM-yyyy");
            java.sql.Date sqlDate=new java.sql.Date(obj.parse(date).getTime());
            pat.setOtp(OTP);
            pat.setDate(sqlDate);
            VerifyOtpFrame frame=new VerifyOtpFrame(pat);
            this.dispose();
            frame.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error in DB:" + ex);
            ex.printStackTrace();
        }        // TODO add your handling code here:
 
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        ReceptionistOptionFrame rec =new ReceptionistOptionFrame();
        rec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

   
    public static void main(String args[]) {
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatientFrame().setVisible(true);
            }
        });
    }
    private void loadDoctorIds() {
        try {
            doctorIds = DoctorsDao.getAllDoctorId();
            for (String docId : doctorIds) {
                jcDoctorId.addItem(docId);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in DB:" + ex);
            System.out.println("Error in DB");
            ex.printStackTrace();
        }
    }

    private void getNewPatientId() {
        try {
            patientId = PatientDao.getNewPatientId();
            txtPatientId.setText(patientId);
            Date today = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            String dateStr = sdf.format(today);
            txtDate.setText(dateStr);
            java.util.Date d = sdf.parse(dateStr);
            long ms = d.getTime();
            dt = new java.sql.Date(ms);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in DB from frame Add PatientsFrame.java" + ex);
            ex.printStackTrace();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error in date conversion:" + ex);
            ex.printStackTrace();
        }
    }

    private boolean validateInputs() {
        opd = txtOPD.getText().trim();
        age = txtAge.getText().trim();
        city = txtaddress.getText().trim();
        address = txtaddress.getText().trim();
        firstName = txtFirstName.getText().trim();
        lastName = txtLastName.getText().trim();
        mobileNo = txtPhoneno.getText().trim();
        if (opd.isEmpty() || city.isEmpty() || firstName.isEmpty() || mobileNo.isEmpty()) {
            return false;
        }
        return true;
    }
    
    private boolean validMobileNo(){
        if (mobileNo.length() != 10) {
            return false;
        }
        return true;
    }

    private void clearAll() {
        this.txtOPD.setText("");
        this.txtLastName.setText("");
        this.txtFirstName.setText("");
        this.txtPhoneno.setText("");
        this.txtAge.setText("");
        this.txtaddress.setText("");                       
        txtOPD.setFocusable(true);
    

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JComboBox<String> jcDoctorId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JComboBox<String> jcMarialStatus;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity1;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtOPD;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPhoneno;
    private javax.swing.JTextField txtaddress;
    // End of variables declaration//GEN-END:variables
}
