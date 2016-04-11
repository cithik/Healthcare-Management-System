/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pharmacy;

import UserInterface.PatientManagementRole.*;
import Business.Ecosystem;
import Business.Enterprise.DrugCompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import Business.Pharmacy.Pharmacy;
import Business.Pharmacy.PharmacyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Krithika
 */
public class AddPharmacy extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PharmacyDirectory pharmacyDirectory;
    Pharmacy p;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    Ecosystem business;

    /**
     * Creates new form AddPatient
     */
    public AddPharmacy(JPanel upc, Pharmacy p, PharmacyDirectory pd, 
            UserAccount account, Organization organization, 
            Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = upc;
        this.pharmacyDirectory = pd;
        this.p = p;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.account = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackJButton = new javax.swing.JButton();
        addDrugCompany = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackJButton.setText("<< Back");
        BackJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackJButtonActionPerformed(evt);
            }
        });
        add(BackJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 345, -1, -1));

        addDrugCompany.setText("Add Company");
        addDrugCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrugCompanyActionPerformed(evt);
            }
        });
        add(addDrugCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 63, 76, -1));
        add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 109, 76, -1));

        jLabel3.setText("City");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 115, -1, -1));

        jLabel4.setText("State");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 167, -1, -1));

        jLabel6.setText("Contact Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 207, -1, -1));
        add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 161, 76, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Pharmacy Company Information");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 28, -1, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 75, -1, -1));

        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 201, 76, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/pharmacy_symbol.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 570, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void BackJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);         // TODO add your handling code here:
    }//GEN-LAST:event_BackJButtonActionPerformed

    private void addDrugCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrugCompanyActionPerformed
        try {
            String nameVal = name.getText();
            String cityVal = city.getText();
            String stateVal = state.getText();
            int contactNo = Integer.parseInt(contact.getText());
            Pharmacy pharmacy = ((DrugCompanyEnterprise)enterprise).getPharmacyDirectory().addPharmacy();
            pharmacy.setName(nameVal);
            pharmacy.setCity(cityVal);
            pharmacy.setState(stateVal);
            pharmacy.setContactNumber(contactNo);
            JOptionPane.showMessageDialog(null, "Pharmacy added");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid entry", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_addDrugCompanyActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackJButton;
    private javax.swing.JButton addDrugCompany;
    private javax.swing.JTextField city;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField name;
    private javax.swing.JTextField state;
    // End of variables declaration//GEN-END:variables
}
