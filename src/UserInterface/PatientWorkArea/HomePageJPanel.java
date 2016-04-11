/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import UserInterface.DoctorWorkArea.*;
import Business.Encounter.Encounter;
import Business.Encounter.EncounterHistory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Message.Message;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PatientAdminOrganization;
import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientEncounterWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krithika
 */
public class HomePageJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private PatientDirectory patientDirectory;
    UserAccount account;
    Organization organization;
    HospitalEnterprise enterprise;
    Ecosystem business;
    private Ecosystem system;
    private DB4OUtil dB4OUtil;
    Patient patientObj = null;
    Network network;
    /**
     * Creates new form PatientEncountersJPanel
     */
    public HomePageJPanel(JPanel userProcessContainer, UserAccount account,
            Organization organization, Enterprise enterprise, Network network, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = (HospitalEnterprise) enterprise;
        this.business = business;
        this.account = account;
        this.network = network;
        this.dB4OUtil = DB4OUtil.getInstance();
        this.system = dB4OUtil.retrieveSystem();
        popOrganizationComboBox();
        this.patientObj = (Patient) account.getPerson();
        Message message = Message.getInstance();
        jTextField2.setText(message.getMessage());
    }

    private void popOrganizationComboBox() {
        DefaultTableModel model = (DefaultTableModel) encounterHistory.getModel();
        model.setRowCount(0);
        for (Patient p : enterprise.getPatientDirectory().getPatientDirectory()) {
            if (p == account.getPerson()) {
                for(Encounter encounter: p.getEncounters().getEncounterList()){
                 Object[] row = new Object[2];
                row[0] = encounter;
                 row[1] = encounter.getHospital();
                model.addRow(row);
            }
            }
        }
    }

    private void populateTable(EncounterHistory eh) {
        DefaultTableModel model = (DefaultTableModel) encounterHistory.getModel();
        model.setRowCount(0);
        for (Encounter encounter : eh.getEncounterList()) {
            Object[] row = new Object[2];
            row[0] = encounter;
            row[1] = encounter.getHospital();
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

        PatientNotFOund = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        encounterHistory = new javax.swing.JTable();
        ViewEncounter = new javax.swing.JButton();
        ViewPrescription = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewDrugFeedBack = new javax.swing.JButton();
        PatientNotFOund1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        jLabel6.setText("Message");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        encounterHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Hospital"
            }
        ));
        jScrollPane1.setViewportView(encounterHistory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 42, 375, 101));

        ViewEncounter.setText("View Encounter");
        ViewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewEncounterActionPerformed(evt);
            }
        });
        add(ViewEncounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 161, -1, -1));

        ViewPrescription.setText("View Prescriptions");
        ViewPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPrescriptionActionPerformed(evt);
            }
        });
        add(ViewPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 196, -1, -1));

        jLabel1.setText("Patient Home Page");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 20, -1, -1));

        viewDrugFeedBack.setText("View Drug Feedback");
        viewDrugFeedBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDrugFeedBackActionPerformed(evt);
            }
        });
        add(viewDrugFeedBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 196, -1, -1));
        add(PatientNotFOund1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 84, 180, 20));

        jLabel7.setText("Message");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 260, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 243, 150, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void ViewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewEncounterActionPerformed
        // TODO add your handling code here:
        int selectedRow = encounterHistory.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        Encounter request = (Encounter) encounterHistory.getValueAt(selectedRow, 0);
        ViewEncounterJPanel processWorkRequestJPanel = new ViewEncounterJPanel(userProcessContainer, request);
        userProcessContainer.add("ViewEncounters", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ViewEncounterActionPerformed

    private void viewDrugFeedBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrugFeedBackActionPerformed
        // TODO add your handling code here:
        DrugFeedback drugFeedback = new DrugFeedback(userProcessContainer, network);
        userProcessContainer.add("ViewEncounters", drugFeedback);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDrugFeedBackActionPerformed

    private void ViewPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPrescriptionActionPerformed
        // TODO add your handling code here:
        ViewPrescriptionJPanel processWorkRequestJPanel = new ViewPrescriptionJPanel(userProcessContainer, patientObj,network);
        userProcessContainer.add("ViewPrescription", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ViewPrescriptionActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PatientNotFOund;
    private javax.swing.JLabel PatientNotFOund1;
    private javax.swing.JButton ViewEncounter;
    private javax.swing.JButton ViewPrescription;
    private javax.swing.JTable encounterHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton viewDrugFeedBack;
    // End of variables declaration//GEN-END:variables
}