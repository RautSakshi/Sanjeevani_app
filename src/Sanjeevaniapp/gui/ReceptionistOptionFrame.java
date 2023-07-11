
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dbutil.DBConnection;
import Sanjeevaniapp.pojo.UserProfile;
import java.awt.Frame;
import javax.swing.JOptionPane;


public class ReceptionistOptionFrame extends javax.swing.JFrame {

   
    public ReceptionistOptionFrame() {
        initComponents();
        setLocationRelativeTo(null);
        jLabel3.setText("USER-"+UserProfile.getUserName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAddPatient = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        btnUpadate = new javax.swing.JButton();
        btnDeletePatient = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Receptionist");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 70));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hello,");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        btnBack2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(0, 153, 153));
        btnBack2.setText("LOGOUT");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 710, 70));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/images.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 210, 200));

        btnAddPatient.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddPatient.setForeground(new java.awt.Color(0, 153, 153));
        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 140, 290, 90));

        btnViewPatient.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnViewPatient.setForeground(new java.awt.Color(0, 153, 153));
        btnViewPatient.setText("View Patient");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });
        jPanel2.add(btnViewPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 269, 290, 90));

        btnUpadate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpadate.setForeground(new java.awt.Color(0, 153, 153));
        btnUpadate.setText("Upadate Patient");
        btnUpadate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpadateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpadate, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 139, 250, 90));

        btnDeletePatient.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDeletePatient.setForeground(new java.awt.Color(0, 153, 153));
        btnDeletePatient.setText("Delete Patient");
        btnDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientActionPerformed(evt);
            }
        });
        jPanel2.add(btnDeletePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 269, 250, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 1050, 420));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Sanjeevani Application");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 100, 440, 50));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1050, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
           Frame fr = new LoginFrame();
        this.dispose();
        fr.setVisible(true);
                                  
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void btnUpadateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpadateActionPerformed
        // TODO add your handling code here:
         UpdatePatientFrame  Frame=new UpdatePatientFrame();
    Frame.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnUpadateActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
         ViewAllPatientsDetailsFrame  Frame=new ViewAllPatientsDetailsFrame();
    Frame.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        // TODO add your handling code here:
         RemovePatientFrame  Frame=new RemovePatientFrame();
    Frame.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnDeletePatientActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {                                              
       AddPatientFrame addPatFrame=new AddPatientFrame();
    addPatFrame.setVisible(true);
    this.dispose();
                                              

    }                                             

  
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReceptionistOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnDeletePatient;
    private javax.swing.JButton btnUpadate;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
