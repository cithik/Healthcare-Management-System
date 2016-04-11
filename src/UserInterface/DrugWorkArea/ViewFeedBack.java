/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DrugWorkArea;

import Business.Drug.DrugCompany;
import Business.Encounter.Encounter;
import Business.Encounter.EncounterHistory;
import Business.Medicine.Medicine;
import Business.Medicine.MedicineInventroy;
import Business.Message.Message;
import Business.Pharmacy.Pharmacy;
import Business.Pharmacy.PharmacyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krithika
 */
public class ViewFeedBack extends javax.swing.JPanel {

    /**
     * Creates new form viewFeedBack
     */
    
    JPanel upc;
    UserAccount account;
    Message messageObj;
    public ViewFeedBack(JPanel container, UserAccount account) {
         initComponents();
         this.upc=container;
         this.account=account;
         messageObj=Message.getInstance();
        populateTable();
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        DrugCompany drugCompany= (DrugCompany)account.getCompany();
        for (Medicine medicineInventroy : drugCompany.getMedicines().getMedicinesList()){
            if(medicineInventroy.getFeedback()!=null){
            Object[] row = new Object[3];
            row[0] = medicineInventroy.getFeedback().getPatient().getFirstName();
            row[1] = medicineInventroy.getDrugName();
            row[2] = medicineInventroy.getFeedback().getFeedback();
            model.addRow(row);
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
        jButton1 = new javax.swing.JButton();
        SendMessage = new javax.swing.JButton();
        PatientNotFOund = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PatientName", "DrugName", "FeedBack"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 53, 375, 111));

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 290, -1, -1));

        SendMessage.setText("Send Message");
        SendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendMessageActionPerformed(evt);
            }
        });
        add(SendMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 205, 141, -1));
        add(PatientNotFOund, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 180, 20));

        jLabel6.setText("Message");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 218, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 193, 150, 50));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Patient's Feedback");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void SendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendMessageActionPerformed
        // TODO add your handling code here:
        String message = jTextField1.getText();
        messageObj.setMessage(message);
        JOptionPane.showMessageDialog(null, "FeedBack sent to all");
    }//GEN-LAST:event_SendMessageActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);               // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PatientNotFOund;
    private javax.swing.JButton SendMessage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}