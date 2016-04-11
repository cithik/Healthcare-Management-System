/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientWorkArea;

import Business.Drug.DrugCompany;
import Business.Enterprise.DrugCompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Medicine.Medicine;
import Business.Medicine.Medicines;
import Business.Network.Network;
import Business.Patient.Patient;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krithika
 */
public class DrugFeedback extends javax.swing.JPanel {
JPanel userProcessContainer;
Network network;
    /**
     * Creates new form DrugFeedback
     */
    public DrugFeedback(JPanel upc, Network network) {
        initComponents();
        this.userProcessContainer=upc;
        this.network=network;
        populateTable();
    }
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        //cleaning the table
        dtm.setRowCount(0);
        //populating the table
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (ent instanceof DrugCompanyEnterprise) {
                DrugCompanyEnterprise dce = (DrugCompanyEnterprise) ent;
                for (DrugCompany dc : dce.getDrugDirectory().getDrugDirectory()) {
                    for(Medicine medicines:dc.getMedicines().getMedicinesList()){
                        if(medicines.getFeedback()!=null){
                        Object[] row = new Object[2];
                        row[0] = medicines.getDrugName();
                        row[1] = medicines.getFeedback().getFeedback();
                        dtm.addRow(row);
                        }
                    }
                }
            }
        }
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
        jTable1 = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Drug Name", "Feed Back"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 375, 79));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Drug Feedback");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/drugFeedback.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 420, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);         // TODO add your handling code here:
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}