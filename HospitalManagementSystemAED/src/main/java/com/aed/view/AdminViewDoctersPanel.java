/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.aed.view;

import com.aed.aedlab2.AedLab2;
import com.aed.model.Community;
import com.aed.model.Docter;
import com.aed.model.Patient;
import com.aed.model.Person;
import static java.awt.Frame.NORMAL;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshilajagtap
 */
public class AdminViewDoctersPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form AdminViewDoctersPanel
     */
    public static Person p=null;
    public AdminViewDoctersPanel() {
        initComponents();
        if(SystemAdminJFrame.swit==3)
            setCommunityTable();
        else if(SystemAdminJFrame.swit==2)
            setDocterTable();
        else if(SystemAdminJFrame.swit==1)
            setpatientTable();
    }
    
    String hospitalNames(int docid){
        String hos="";
        for(Integer i : AedLab2.docterMap.get(docid).getHospitalId())
            hos+=AedLab2.hospitalMap.get(i).getName()+",";
        return hos;
    }
    void setDocterTable(){
        
        int rIndex = 0;

        String[][] data = new String[AedLab2.docterMap.size()][4];
        for (Docter e
                : AedLab2.docterMap.values()) {
            data[rIndex][0] = String.valueOf(e.getDocterId());
            data[rIndex][1] = AedLab2.personMap.get(e.getPersonId()).getName();
            data[rIndex][2] = String.valueOf(AedLab2.personMap.get(e.getPersonId()).getAge());
            data[rIndex][3] = hospitalNames(e.getDocterId());
      
            rIndex++;
        }

        String[] col = {"ID", "DocterName", "Age", "HospitalNAme"};
        DefaultTableModel model = new DefaultTableModel(data, col);
        docterTable.setModel(model);
    }
    
    void setpatientTable(){
        int rIndex = 0;
        String[][] data = new String[AedLab2.patientMap.size()][2];
        for (Patient e
                : AedLab2.patientMap.values()) {
            data[rIndex][0] = String.valueOf(e.getPatientId());
            data[rIndex][1] = AedLab2.personMap.get(e.getPersonId()).getName();
            rIndex++;
        }

        String[] col = {"ID", "PatientName"};
        DefaultTableModel model = new DefaultTableModel(data, col);
        docterTable.setModel(model);
    }
    void setCommunityTable(){
        int rIndex = 0;
        String[][] data = new String[AedLab2.communityMap.size()][5];
        for (Community e : AedLab2.communityMap.values()) {
            data[rIndex][0] = String.valueOf(e.getCommunityId());
            data[rIndex][1] = e.getName();
            data[rIndex][2] = e.getCity();
            data[rIndex][3] = e.getZipcode();
            data[rIndex][4] = AedLab2.personMap.get(e.getPersonId()).getName();
            rIndex++;
            }
        

        String[] col = {"ID", "CommunityName","City","Zipcode","AdminName"};
        DefaultTableModel model = new DefaultTableModel(data, col);
        docterTable.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        docterTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(504, 0));
        setSize(new java.awt.Dimension(100, 100));

        docterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        docterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(docterTable);

        jLabel1.setText("Select");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void docterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docterTableMouseClicked
        // TODO add your handling code here:
        if(SystemAdminJFrame.swit==3){
            int id = Integer.parseInt(docterTable.getValueAt(docterTable.getSelectedRow(), NORMAL).toString());
          p=AedLab2.personMap.get(AedLab2.communityMap.get(id).getPersonId()); 
            System.out.println("community id: "+id+"person id fetched : "+p.getPersonID());
          SystemAdminJFrame.swit=0;
          new CommunityAdminJFrame().show();
        }
        else if(SystemAdminJFrame.swit==2){
        int id1 = Integer.parseInt(docterTable.getValueAt(docterTable.getSelectedRow(), NORMAL).toString());
        System.out.println("com.aed.view.AdminViewDoctersPanel.docterTableMouseClicked(): "+id1);
        
        p=AedLab2.personMap.get(AedLab2.docterMap.get(id1).getPersonId());
        SystemAdminJFrame.swit=0;
        new DocterJFrame().show();
        }   
        else if(SystemAdminJFrame.swit==1){
            int id2 = Integer.parseInt(docterTable.getValueAt(docterTable.getSelectedRow(), NORMAL).toString());
            p=AedLab2.personMap.get(AedLab2.patientMap.get(id2).getPersonId());
            SystemAdminJFrame.swit=0;
            new PatientJFrame().show();
        }
    }//GEN-LAST:event_docterTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable docterTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}