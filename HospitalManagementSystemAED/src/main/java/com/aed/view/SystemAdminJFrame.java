/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aed.view;

import com.aed.aedlab2.AedLab2;
import com.aed.model.Person;
import java.awt.CardLayout;
import java.awt.Color;

/**
 *
 * @author harshilajagtap
 */
public class SystemAdminJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminJFrame
     */
    Person admin;
    public static String ad="";
    CardLayout cardLayout;
    HospitalJPanel hospitalJPanel;
    public static int swit=0;
    
    public SystemAdminJFrame() {
        initComponents();
        ad="SYSTEMADMIN";
        patientButton.setForeground(Color.white);
        hospitalButton.setForeground(Color.white);
        personButton.setForeground(Color.white);
        communityButton.setForeground(Color.white);
        docterButton.setForeground(Color.white);
        backButton.setForeground(Color.white);
        logoutButton.setForeground(Color.white);
        
        hospitalStatField.setForeground(Color.white);
        communityStatField.setForeground(Color.white);
        docterStatField.setForeground(Color.white);
        encounterStatField.setForeground(Color.white);
        patientStatField.setForeground(Color.white);
        peopleStatField.setForeground(Color.white);
        
        backButton.setVisible(false);
        cardLayout= (CardLayout)(viewPanel.getLayout());
        viewPanel.add("adminProfile",new AdminProfilePanel());
        cardLayout.next(viewPanel);
        admin = LoginJFrame.loggedInPerson;
        
        hospitalStatField.setText(utility.UtilityFunctions.convertIntToString(AedLab2.hospitalMap.size()));
        communityStatField.setText(utility.UtilityFunctions.convertIntToString(AedLab2.communityMap.size()));
        docterStatField.setText(utility.UtilityFunctions.convertIntToString(AedLab2.docterMap.size()));
        encounterStatField.setText(utility.UtilityFunctions.convertIntToString(AedLab2.encounterMap.size()));
        patientStatField.setText(utility.UtilityFunctions.convertIntToString(AedLab2.patientMap.size()));
        peopleStatField.setText(utility.UtilityFunctions.convertIntToString(AedLab2.personMap.size()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        operationsPanel = new javax.swing.JPanel();
        hospitalButton = new javax.swing.JButton();
        communityButton = new javax.swing.JButton();
        personButton = new javax.swing.JButton();
        docterButton = new javax.swing.JButton();
        patientButton = new javax.swing.JButton();
        StatisticsPanel = new javax.swing.JPanel();
        hospitalStatLabel = new javax.swing.JLabel();
        communityStatLabel = new javax.swing.JLabel();
        docterStatLabel = new javax.swing.JLabel();
        encounterStatLabel = new javax.swing.JLabel();
        patientStatLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        peopleStatField = new javax.swing.JTextField();
        docterStatField = new javax.swing.JTextField();
        hospitalStatField = new javax.swing.JTextField();
        communityStatField = new javax.swing.JTextField();
        encounterStatField = new javax.swing.JTextField();
        patientStatField = new javax.swing.JTextField();
        logoutButton = new javax.swing.JButton();
        viewPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        adjustmentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        operationsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        hospitalButton.setText("Hospital");
        hospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalButtonActionPerformed(evt);
            }
        });

        communityButton.setText("Community");
        communityButton.setToolTipText("");
        communityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityButtonActionPerformed(evt);
            }
        });

        personButton.setText("Person");
        personButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personButtonActionPerformed(evt);
            }
        });

        docterButton.setText("Docter");
        docterButton.setToolTipText("");
        docterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docterButtonActionPerformed(evt);
            }
        });

        patientButton.setText("Patient");
        patientButton.setToolTipText("");
        patientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout operationsPanelLayout = new javax.swing.GroupLayout(operationsPanel);
        operationsPanel.setLayout(operationsPanelLayout);
        operationsPanelLayout.setHorizontalGroup(
            operationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operationsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(operationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hospitalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(communityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(docterButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        operationsPanelLayout.setVerticalGroup(
            operationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operationsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hospitalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(communityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(personButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(docterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(patientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        StatisticsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Statistics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N
        StatisticsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hospitalStatLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        hospitalStatLabel.setText("Total Hospitals:");
        hospitalStatLabel.setToolTipText("");
        StatisticsPanel.add(hospitalStatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 109, 32));

        communityStatLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        communityStatLabel.setText("Total Communities:");
        communityStatLabel.setToolTipText("");
        StatisticsPanel.add(communityStatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 109, 32));

        docterStatLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        docterStatLabel.setText("Total Docters:");
        docterStatLabel.setToolTipText("");
        StatisticsPanel.add(docterStatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 80, 110, 32));

        encounterStatLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        encounterStatLabel.setText("Total Encounters:");
        StatisticsPanel.add(encounterStatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 109, 30));

        patientStatLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        patientStatLabel.setText("Total Patients:");
        patientStatLabel.setToolTipText("");
        StatisticsPanel.add(patientStatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 109, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        jLabel1.setText("Total People:");
        StatisticsPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 109, 30));

        peopleStatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peopleStatFieldActionPerformed(evt);
            }
        });
        StatisticsPanel.add(peopleStatField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, 20));
        StatisticsPanel.add(docterStatField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, 20));

        hospitalStatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalStatFieldActionPerformed(evt);
            }
        });
        StatisticsPanel.add(hospitalStatField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 20));
        StatisticsPanel.add(communityStatField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, 20));

        encounterStatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encounterStatFieldActionPerformed(evt);
            }
        });
        StatisticsPanel.add(encounterStatField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, 20));
        StatisticsPanel.add(patientStatField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, 20));

        logoutButton.setText("LogOut");
        logoutButton.setToolTipText("");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        viewPanel.setLayout(new java.awt.CardLayout());

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adjustmentPanelLayout = new javax.swing.GroupLayout(adjustmentPanel);
        adjustmentPanel.setLayout(adjustmentPanelLayout);
        adjustmentPanelLayout.setHorizontalGroup(
            adjustmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        adjustmentPanelLayout.setVerticalGroup(
            adjustmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StatisticsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(operationsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adjustmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(backButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(operationsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StatisticsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(viewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adjustmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void communityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityButtonActionPerformed
        // TODO add your handling code here:
        swit=3;
        cardLayout= (CardLayout)(viewPanel.getLayout());
        viewPanel.add("adminViewDoctersPanel",new AdminViewDoctersPanel());
        cardLayout.next(viewPanel);
        
    }//GEN-LAST:event_communityButtonActionPerformed

    private void personButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personButtonActionPerformed
        // TODO add your handling code here:
        cardLayout= (CardLayout)(viewPanel.getLayout());
        viewPanel.add("PersonPanel",new PersonPanel());
        cardLayout.next(viewPanel);
    }//GEN-LAST:event_personButtonActionPerformed

    private void docterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docterButtonActionPerformed
        // TODO add your handling code here:
        swit=2;
        
        cardLayout= (CardLayout)(viewPanel.getLayout());
        viewPanel.add("adminViewDoctersPanel",new AdminViewDoctersPanel());
        cardLayout.next(viewPanel);
        
        
            
//        new DocterJFrame().show();
//        dispose();
    }//GEN-LAST:event_docterButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        ad="";
        new LoginJFrame().show();
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void hospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalButtonActionPerformed
        // TODO add your handling code here:
        
        cardLayout= (CardLayout)(viewPanel.getLayout());
        viewPanel.add("Hospitals",new HospitalJPanel());
        cardLayout.next(viewPanel);
    }//GEN-LAST:event_hospitalButtonActionPerformed

    private void patientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientButtonActionPerformed
        // TODO add your handling code here:
//        cardLayout= (CardLayout)(viewPanel.getLayout());
//        viewPanel.add("patientJFrame",new PatientJFrame());
//        cardLayout.next(viewPanel);
            swit=1;
            
            cardLayout= (CardLayout)(viewPanel.getLayout());
            viewPanel.add("adminViewDoctersPanel",new AdminViewDoctersPanel());
             cardLayout.next(viewPanel);
            
    }//GEN-LAST:event_patientButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new SystemAdminJFrame().show();
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void hospitalStatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalStatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalStatFieldActionPerformed

    private void encounterStatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounterStatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encounterStatFieldActionPerformed

    private void peopleStatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peopleStatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peopleStatFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel StatisticsPanel;
    private javax.swing.JPanel adjustmentPanel;
    public static javax.swing.JButton backButton;
    private javax.swing.JButton communityButton;
    private javax.swing.JTextField communityStatField;
    private javax.swing.JLabel communityStatLabel;
    private javax.swing.JButton docterButton;
    private javax.swing.JTextField docterStatField;
    private javax.swing.JLabel docterStatLabel;
    private javax.swing.JTextField encounterStatField;
    private javax.swing.JLabel encounterStatLabel;
    private javax.swing.JButton hospitalButton;
    private javax.swing.JTextField hospitalStatField;
    private javax.swing.JLabel hospitalStatLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel operationsPanel;
    private javax.swing.JButton patientButton;
    private javax.swing.JTextField patientStatField;
    private javax.swing.JLabel patientStatLabel;
    private javax.swing.JTextField peopleStatField;
    private javax.swing.JButton personButton;
    private javax.swing.JPanel viewPanel;
    // End of variables declaration//GEN-END:variables
}
