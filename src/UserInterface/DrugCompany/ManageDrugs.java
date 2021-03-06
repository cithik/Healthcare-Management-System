/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DrugCompany;

import UserInterface.HospitalManagementWorkArea.*;
import Business.Doctor.Doctor;
import Business.Doctor.DoctorDirectory;
import Business.Drug.DrugCompany;
import Business.Drug.DrugCompanyDirectory;
import Business.Ecosystem;
import Business.Enterprise.DrugCompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krithika
 */
public class ManageDrugs extends javax.swing.JPanel {
JPanel userProcessContainer;
private DrugCompanyDirectory drugDirectory;
private UserAccount userAccount;
private Enterprise enterprise;
    private Organization organization;   
    private DrugCompany d;
    private Ecosystem business;/**

    /**
     * Creates new form ManageDoctors
  E   */
    public ManageDrugs(DrugCompanyDirectory drugDirectory,DrugCompany d,JPanel upc,UserAccount userAccount,Enterprise enterprise,Organization organization,Ecosystem business) {
        initComponents();
        this.userProcessContainer=upc;
        this.userAccount=userAccount;
        this.drugDirectory=drugDirectory;
        this.enterprise=enterprise;
        this.organization=organization;
        this.business=business;
        this.d=d;
        refresh();
    }
    public void refresh(){
     DefaultTableModel dtm = (DefaultTableModel) drugCompanyJTable.getModel();
        //cleaning the table
        dtm.setRowCount(0);
        //populating the table
        
        for (DrugCompany d : ((DrugCompanyEnterprise)enterprise).getDrugDirectory().getDrugDirectory())
        {
            Object row[] = new Object[4];
            row[0] = d;
            row[1] = d.getCity();
            row[2] = d.getState();
            row[3] = d.getContactNumber();
            dtm.addRow(row);
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

        BackJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugCompanyJTable = new javax.swing.JTable();

        BackJButton.setText("<< Back");
        BackJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackJButtonActionPerformed(evt);
            }
        });

        drugCompanyJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "City", "State", "ContactNo"
            }
        ));
        jScrollPane1.setViewportView(drugCompanyJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(BackJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(BackJButton)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);          // TODO add your handling code here:
    }//GEN-LAST:event_BackJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackJButton;
    private javax.swing.JTable drugCompanyJTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
