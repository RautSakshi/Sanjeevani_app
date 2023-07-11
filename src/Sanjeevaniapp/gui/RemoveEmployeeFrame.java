
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.EmpDao;
import Sanjeevaniapp.dbutil.DBConnection;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;


public class RemoveEmployeeFrame extends javax.swing.JFrame {

   
      public RemoveEmployeeFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadEmpId();
        jcEmpId.setSelectedIndex(0);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcEmpId = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnLogout1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Remove Employee");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Employee ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, 40));

        jcEmpId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpIdActionPerformed(evt);
            }
        });
        jPanel2.add(jcEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 340, 40));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 204, 204));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 160, 40));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 204, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 320, 40));

        btnLogout1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout1.setForeground(new java.awt.Color(0, 204, 204));
        btnLogout1.setText("Logout");
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 191, 160, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 1030, 280));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Sanjeevani Application");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 510, 60));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1070, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
           ManageEmployeeFrame Frame=new ManageEmployeeFrame();
      Frame.setVisible( true);
      this.dispose();
                                          
       
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        // TODO add your handling code here:
          Frame fr = new LoginFrame();
        this.dispose();
        fr.setVisible(true);
  
                                     
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
                    if(jcEmpId.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(null, "Please select an Employee no. first !!","Selection",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String empno = jcEmpId.getSelectedItem().toString();
        try{
            boolean result = EmpDao.removeEmployee(empno);
            if(result){
                JOptionPane.showMessageDialog(null, "Record has been deleted successfully !!","Success",JOptionPane.INFORMATION_MESSAGE);
                jcEmpId.setSelectedIndex(0);
                return;
            }
            JOptionPane.showMessageDialog(null, "Record can't be removed due to some issues !!!","Can't Inserted",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
        catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Please input numeric value for salary","Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jcEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpIdActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(RemoveEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveEmployeeFrame().setVisible(true);
            }
        });
    }
    private void loadEmpId() {
       try{
            List<String> empIdList = EmpDao.getAllemployeeId();
            for(String id:empIdList){
                jcEmpId.addItem(id);
            }
            if(jcEmpId.getItemCount()!=0)
                btnDelete.setEnabled(true);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcEmpId;
    // End of variables declaration//GEN-END:variables
}
