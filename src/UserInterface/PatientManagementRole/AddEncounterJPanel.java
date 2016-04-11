/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientManagementRole;

import Business.Ecosystem;
import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import Business.UserAccount.UserAccount;
import Business.VitalSign.VitalSign;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Krithika
 */
public class AddEncounterJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PatientDirectory patientDirectory;
    Patient p;

    /**
     * Creates new form AddEncounterJPanel
     */
    public AddEncounterJPanel(JPanel upc, Patient p) {
        initComponents();
        this.userProcessContainer = upc;
        this.p=p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        complain = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        heartRate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        respiratoryRate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bloodPressure = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        CreateJButton = new javax.swing.JButton();
        BackJButton = new javax.swing.JButton();
        hospital = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Add Encounter");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 6, -1, -1));

        jLabel2.setText("Complain");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 46, -1, -1));

        complain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complainActionPerformed(evt);
            }
        });
        add(complain, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 95, -1));

        jLabel4.setText("Vital Signs");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 153, -1, -1));

        jLabel5.setText("Heart Rate");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 187, -1, -1));
        add(heartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 181, 95, -1));

        jLabel6.setText("Respiratory Rate");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 233, -1, -1));

        respiratoryRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respiratoryRateActionPerformed(evt);
            }
        });
        add(respiratoryRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 227, 95, -1));

        jLabel7.setText("Blood Pressure");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 279, -1, -1));
        add(bloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 273, 95, -1));

        jLabel8.setText("Weight");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 319, -1, -1));
        add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 313, 95, -1));

        CreateJButton.setText("Create");
        CreateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateJButtonActionPerformed(evt);
            }
        });
        add(CreateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 363, -1, -1));

        BackJButton.setText("<< Back");
        BackJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackJButtonActionPerformed(evt);
            }
        });
        add(BackJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 363, -1, -1));
        add(hospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 78, 95, -1));

        jLabel9.setText("Hospital");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 84, 91, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void respiratoryRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respiratoryRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respiratoryRateActionPerformed

    private void BackJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);         // TODO add your handling code here:
    }//GEN-LAST:event_BackJButtonActionPerformed

    private void CreateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateJButtonActionPerformed
        // TODO add your handling code here:
        try {String complainValue = complain.getText();
        //String admittedDateValue = admittedDate.getText();
        String hospitalValue = hospital.getText();
        int heartRateValue = Integer.parseInt(heartRate.getText());
        int respiratoryRateValue = Integer.parseInt(respiratoryRate.getText());
        int bloodPressureValue = Integer.parseInt(bloodPressure.getText());
        int weightValue = Integer.parseInt(weight.getText());
        p.setEncounter(new Encounter(complainValue,
                hospitalValue, new VitalSign(respiratoryRateValue, heartRateValue, bloodPressureValue,
            weightValue)));
        JOptionPane.showMessageDialog(null, "Encounter created");}
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid entry", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_CreateJButtonActionPerformed

    private void complainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complainActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackJButton;
    private javax.swing.JButton CreateJButton;
    private javax.swing.JTextField bloodPressure;
    private javax.swing.JTextField complain;
    private javax.swing.JTextField heartRate;
    private javax.swing.JTextField hospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField respiratoryRate;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}