

package Sanjeevaniapp.gui;

import Sanjeevaniapp.pojo.UserProfile;
import java.awt.Frame;


public class ManageReceptionistFrame extends javax.swing.JFrame {

    /** Creates new form RegisterReceptionist */
    public ManageReceptionistFrame() {
        initComponents();
        setLocationRelativeTo(null);
        jLabel2.setText("USER-"+UserProfile.getUserName());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblAddRec = new javax.swing.JButton();
        lblViewReceptionist = new javax.swing.JButton();
        lblAddRec1 = new javax.swing.JButton();
        lblRemoveReceptionist = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Receptionist");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hello,");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USER-");

        btnBack2.setBackground(new java.awt.Color(0, 0, 0));
        btnBack2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(btnBack2)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack2)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 16, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 330, 109, 39));

        lblAddRec.setBackground(new java.awt.Color(0, 0, 0));
        lblAddRec.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAddRec.setForeground(new java.awt.Color(255, 255, 255));
        lblAddRec.setText("Add Receptionist");
        lblAddRec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAddRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAddRecActionPerformed(evt);
            }
        });
        jPanel2.add(lblAddRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 127, 299, 59));

        lblViewReceptionist.setBackground(new java.awt.Color(0, 0, 0));
        lblViewReceptionist.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblViewReceptionist.setForeground(new java.awt.Color(255, 255, 255));
        lblViewReceptionist.setText("View Receptionist");
        lblViewReceptionist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViewReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblViewReceptionistActionPerformed(evt);
            }
        });
        jPanel2.add(lblViewReceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 240, 299, 53));

        lblAddRec1.setBackground(new java.awt.Color(0, 0, 0));
        lblAddRec1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAddRec1.setForeground(new java.awt.Color(255, 255, 255));
        lblAddRec1.setText("Update Receptionist");
        lblAddRec1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAddRec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAddRec1ActionPerformed(evt);
            }
        });
        jPanel2.add(lblAddRec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 127, 280, 59));

        lblRemoveReceptionist.setBackground(new java.awt.Color(0, 0, 0));
        lblRemoveReceptionist.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRemoveReceptionist.setForeground(new java.awt.Color(255, 255, 255));
        lblRemoveReceptionist.setText("Remove Receptionist");
        lblRemoveReceptionist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblRemoveReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblRemoveReceptionistActionPerformed(evt);
            }
        });
        jPanel2.add(lblRemoveReceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 240, 280, 53));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/doctor.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 200, 180));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 1030, 400));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Sanjeevani Application");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, 80));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1050, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAddRecActionPerformed
       AddReceptionistFrame addRecFrame=new AddReceptionistFrame();
       addRecFrame.setVisible(true);
       this.dispose();
                     
    }//GEN-LAST:event_lblAddRecActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
    Frame fr = new LoginFrame();
        this.dispose();
        fr.setVisible(true);
                

                                
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
           AdminOptionsFrame frame=new AdminOptionsFrame();
      frame.setVisible( true);
      this.dispose();
                       
    }//GEN-LAST:event_btnBackActionPerformed

    private void lblAddRec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAddRec1ActionPerformed
      Frame fr=new UpdateReceptionistsFrame();
      fr.setVisible( true);
      this.dispose();
                     
                                          
    }//GEN-LAST:event_lblAddRec1ActionPerformed

    private void lblViewReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblViewReceptionistActionPerformed
         ViewReceptionistFrame Frame=new ViewReceptionistFrame();
      Frame.setVisible( true);
      this.dispose();
                      
                                                   

    }//GEN-LAST:event_lblViewReceptionistActionPerformed

    private void lblRemoveReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblRemoveReceptionistActionPerformed
        RemoveReceptionistFrame frame = new  RemoveReceptionistFrame ();
       frame.setVisible(true);
       this.dispose();
                 
    }//GEN-LAST:event_lblRemoveReceptionistActionPerformed

   
    public static void main(String args[]) {
        
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton lblAddRec;
    private javax.swing.JButton lblAddRec1;
    private javax.swing.JButton lblRemoveReceptionist;
    private javax.swing.JButton lblViewReceptionist;
    // End of variables declaration//GEN-END:variables

}
