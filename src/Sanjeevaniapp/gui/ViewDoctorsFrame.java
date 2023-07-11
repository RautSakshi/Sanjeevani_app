
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.DoctorsDao;
import Sanjeevaniapp.pojo.DoctorPojo;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewDoctorsFrame extends javax.swing.JFrame {

   
    private DefaultTableModel model;
    public ViewDoctorsFrame() {
        initComponents();
        model=(DefaultTableModel)jtAllDoc.getModel();
        viewAllDoctorDetails();
        setLocationRelativeTo(null);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAllDoc = new javax.swing.JTable();
        btnLogout2 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtAllDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DOCTOR ID", "DOCTOR NAME", "EMAIL ID", "CONTACT", "QUALIFICATION", "GENDER", "SPECIALIST"
            }
        ));
        jScrollPane1.setViewportView(jtAllDoc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 1010, 330));

        btnLogout2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout2.setForeground(new java.awt.Color(0, 204, 204));
        btnLogout2.setText("Logout");
        btnLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, 140, 40));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 204, 204));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 491, 140, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View All Doctors");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 210, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Sanjeevani Application");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 450, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 990, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
             ManageDoctorsFrame Frame=new ManageDoctorsFrame();
      Frame.setVisible( true);
      this.dispose();
                       
                          
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout2ActionPerformed
          Frame fr = new LoginFrame();
        this.dispose();
        fr.setVisible(true);
        
                                          

    }//GEN-LAST:event_btnLogout2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDoctorsFrame().setVisible(true);
            }
        });
    }
    
            
        
       
 

        
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtAllDoc;
    // End of variables declaration//GEN-END:variables

    private void viewAllDoctorDetails() {
        try{
            List<DoctorPojo>DocList=DoctorsDao.getAllDoctorDetails();
            if(DocList.isEmpty()){
                JOptionPane.showMessageDialog(null,"No record found!");
                return;
            }
            for(DoctorPojo d:DocList){
                Object[] obj=new Object[7];
                obj[0]=d.getDoctorId();
                obj[1]=d.getDoctorName();
                obj[2]=d.getEmailId();
                obj[3]=d.getContactNo();
                obj[4]=d.getQualification();
                obj[5]=d.getGender();
                obj[6]=d.getSpecialist();
                model.addRow(obj);
            }
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }


}

