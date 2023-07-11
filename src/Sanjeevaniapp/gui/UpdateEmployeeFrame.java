
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.EmpDao;
import Sanjeevaniapp.dbutil.DBConnection;
import Sanjeevaniapp.pojo.EmpPojo;
import Sanjeevaniapp.pojo.UserProfile;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author saksh
 */
public class UpdateEmployeeFrame extends javax.swing.JFrame {

   private String empName,empSal;
    public UpdateEmployeeFrame() {
        initComponents();
        loadEmpId();
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
        txtEmpName = new javax.swing.JTextField();
        txtEmpSalary = new javax.swing.JTextField();
        jcEmpId = new javax.swing.JComboBox<>();
        jcDepartments = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Upadate Employee");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Employee Details");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("EMP ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Emp Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 120, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Departement");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 120, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Salary");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 180, 40));
        jPanel2.add(txtEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 280, 40));
        jPanel2.add(txtEmpSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 280, 40));

        jcEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpIdActionPerformed(evt);
            }
        });
        jPanel2.add(jcEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 240, 40));

        jcDepartments.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "DOCTOR", "RECEPTIONIST" }));
        jPanel2.add(jcDepartments, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 240, 40));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 204, 204));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 279, 180, 40));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 204, 204));
        btnUpdate.setText("Upadate");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 279, 360, 40));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 204, 204));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 230, 40));

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(0, 204, 204));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 170, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 1040, 340));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Sanjeevani Application");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 480, 60));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1040, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
           ManageEmployeeFrame Frame=new ManageEmployeeFrame();
      Frame.setVisible( true);
      this.dispose();
                       
                
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         boolean isInputValid=validateInputs();
      if(!isInputValid){
          JOptionPane.showMessageDialog(null,"Please input all fields","Error",JOptionPane.ERROR_MESSAGE);
          return;
      }
      try{
          double esal=Double.parseDouble(txtEmpSalary.getText());
          EmpPojo emp=new EmpPojo();
          emp.setEmpId(jcEmpId.getSelectedItem().toString());
          emp.setEmpDept(jcDepartments.getSelectedItem().toString());
          emp.setEmpName(txtEmpName.getText());
          emp.setEmpSal(esal);
          boolean result=EmpDao.updateEmployee(emp);
          if(result){
              JOptionPane.showMessageDialog(null,"Record updated successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
              System.out.println(UserProfile.getUserId());
              if(UserProfile.getUserId().equalsIgnoreCase(emp.getEmpId()))
                  UserProfile.setUserName(empName);
              return;
              
          }
          JOptionPane.showMessageDialog(null,"Record not updated!","Failure!",JOptionPane.ERROR_MESSAGE);
      }
      catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
      catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Please input numeric value for salary","Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
      
                                             

    
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
         Frame fr = new LoginFrame();
        this.dispose();
        fr.setVisible(true);
                                
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
     AdminOptionsFrame frame = new AdminOptionsFrame();
     frame.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void jcEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpIdActionPerformed
         try{
            String empId=jcEmpId.getSelectedItem().toString();
            EmpPojo emp=EmpDao.getEmployeeDetails(empId);
            txtEmpName.setText(emp.getEmpName());
            txtEmpSalary.setText(String.valueOf(emp.getEmpSal()));
            jcDepartments.setSelectedItem(emp.getEmpDept().toUpperCase());
        }
        catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }//GEN-LAST:event_jcEmpIdActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployeeFrame().setVisible(true);
            }
        });
    }
    private void loadEmpId() {
        try{
            List<String>empIdList=EmpDao.getAllemployeeId();
            for(String id:empIdList){
                jcEmpId.addItem(id);
            }
        }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }

    private boolean validateInputs() {
        empName=txtEmpName.getText().trim();
        empSal=txtEmpSalary.getText().trim();
        if(empName.isEmpty()||empSal.isEmpty())
            return false;
        return true;
    

 
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcDepartments;
    private javax.swing.JComboBox<String> jcEmpId;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpSalary;
    // End of variables declaration//GEN-END:variables
}
