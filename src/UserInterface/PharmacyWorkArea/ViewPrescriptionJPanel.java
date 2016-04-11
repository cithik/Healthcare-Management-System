/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmacyWorkArea;

import Business.Medicine.MedicineInventroy;
import Business.Patient.Prescription;
import Business.Patient.PrescriptionItem;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import UserInterface.PatientWorkArea.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krithika
 */
public class ViewPrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPrescriptionJPanel
     */
    JPanel userProcessContainer;
    Prescription prescription;
    UserAccount userAccount;
    public ViewPrescriptionJPanel(JPanel userProcessContainer, Prescription prescription, UserAccount account) {
        initComponents();
        this.prescription = prescription;
        this.userAccount=account;
        this.userProcessContainer=userProcessContainer;
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                
        model.setRowCount(0);
        for (PrescriptionItem prescriptionItem : prescription.getPi()){
                Object[] row = new Object[3];
                row[0] = prescriptionItem;
                row[1] = prescriptionItem.getDrugCompany();
                row[2] = prescriptionItem.getQuantity();
                model.addRow(row);
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

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        processOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 251, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Drug Name", "Company", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 35, 375, 92));

        processOrder.setText("Process Order");
        processOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processOrderActionPerformed(evt);
            }
        });
        add(processOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 164, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("View Prescription");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void processOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processOrderActionPerformed
        // TODO add your handling code here:
        boolean canSatisfy=true;
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }
        PrescriptionItem prescriptionItem = (PrescriptionItem)jTable1.getValueAt(selectedRow, 0);
        Pharmacy pharmacy= (Pharmacy)userAccount.getCompany();
        boolean medicineFound = false;
        for (MedicineInventroy mi : pharmacy.getMedicines().getMedicinesList()){
            if(mi.getMedicine()==prescriptionItem.getMedicine()){
                medicineFound =true;
                if(!(mi.getQuantity()>=prescriptionItem.getQuantity())){
                    canSatisfy =false;
                }else{
                   mi.setQuantity(mi.getQuantity()-prescriptionItem.getQuantity());
                }
            }
        }
        if(!medicineFound){
            JOptionPane.showMessageDialog(null, "Medicine not found");
        }else if(!canSatisfy){
            JOptionPane.showMessageDialog(null, "Insufficient Quantity");
        }else{
            JOptionPane.showMessageDialog(null, "Medicine sent to Patient");
        }
    }//GEN-LAST:event_processOrderActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);           // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton processOrder;
    // End of variables declaration//GEN-END:variables
}