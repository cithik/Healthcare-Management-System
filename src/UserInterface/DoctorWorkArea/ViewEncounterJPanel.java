/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorWorkArea;

import Business.Ecosystem;
import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author krithika
 */
public class ViewEncounterJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
Enterprise enterprise;
UserAccount account;
Patient patientObj;
Network network;
    /**
     * Creates new form ViewEncounterJPanel
     */
    public ViewEncounterJPanel(JPanel upc, UserAccount account, Patient patientObj, 
            Encounter encounter, Enterprise enterprise, Network network) {
        initComponents();
        this.account= account;
        this.patientObj = patientObj;
        this.userProcessContainer=upc;
        this.enterprise=enterprise;
        this.network = network;
        complain.setText(encounter.getSickness());
        admittedDate.setText(encounter.getDate());
        hospital.setText(encounter.getHospital());
        bloodPressure.setText(Integer.toString(encounter.getVitalSign().getSystolicBloodPressure()));
        heartRate.setText(Integer.toString(encounter.getVitalSign().getHeartRate()));
        respiratoryRate.setText(Integer.toString(encounter.getVitalSign().getRespiratoryRate()));
        weight.setText(Integer.toString(encounter.getVitalSign().getWeightInPounds()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hospital = new javax.swing.JTextField();
        heartRate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        respiratoryRate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bloodPressure = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        complain = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        admittedDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        prescribe = new javax.swing.JButton();
        ViewChartJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalActionPerformed(evt);
            }
        });
        add(hospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 95, -1));
        add(heartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 147, 95, -1));

        jLabel9.setText("Hospital");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 91, -1));

        jLabel6.setText("Respiratory Rate");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 199, -1, -1));

        respiratoryRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respiratoryRateActionPerformed(evt);
            }
        });
        add(respiratoryRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 193, 95, -1));

        jLabel7.setText("Blood Pressure");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 245, -1, -1));
        add(bloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 239, 95, -1));

        jLabel2.setText("Complain");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel8.setText("Weight");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 285, -1, -1));

        complain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complainActionPerformed(evt);
            }
        });
        add(complain, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 95, -1));
        add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 279, 95, -1));

        jLabel3.setText("Admitted Date");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        admittedDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admittedDateActionPerformed(evt);
            }
        });
        add(admittedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 95, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel4.setText("Vital Signs");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel5.setText("Heart Rate");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 153, -1, -1));

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 319, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel1.setText("View Encounter");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        prescribe.setText("Prescribe Medicine");
        prescribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescribeActionPerformed(evt);
            }
        });
        add(prescribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        ViewChartJButton.setText("View Chart");
        ViewChartJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewChartJButtonActionPerformed(evt);
            }
        });
        add(ViewChartJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/vitalsigns.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 6, 580, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void respiratoryRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respiratoryRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respiratoryRateActionPerformed

    private void complainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complainActionPerformed

    private void admittedDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admittedDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admittedDateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalActionPerformed

    private void prescribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescribeActionPerformed
        // TODO add your handling code here:
        Prescribe prescribePanel = new Prescribe(userProcessContainer, account, patientObj, enterprise, network);
        userProcessContainer.add("Prescribe", prescribePanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_prescribeActionPerformed

    private void ViewChartJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewChartJButtonActionPerformed
int RespiratoryRate=Integer.parseInt(respiratoryRate.getText());
int HeartRate=Integer.parseInt(heartRate.getText());
int SystolicBloodPressure=Integer.parseInt(bloodPressure.getText());
int WeightInPounds=Integer.parseInt(weight.getText());

DefaultCategoryDataset dataSet=new DefaultCategoryDataset();
dataSet.setValue(new Double(RespiratoryRate),"values","RespiratoryRate");
dataSet.setValue(new Double(HeartRate),"values","HeartRateRate");
dataSet.setValue(new Double(SystolicBloodPressure),"values","SystolicBloodPressure");
dataSet.setValue(new Double(WeightInPounds),"values","WeightInPounds");
// TODO add your handling code here:
JFreeChart chart=ChartFactory.createBarChart3D("VitalSign Details","Vital Signs","Range",dataSet,PlotOrientation.VERTICAL,false,false,false);

CategoryPlot p=chart.getCategoryPlot();
ChartFrame frame=new ChartFrame("barchart",chart);
frame.setVisible(true);
frame.setSize(450,600);        // TODO add your handling code here:
    }//GEN-LAST:event_ViewChartJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewChartJButton;
    private javax.swing.JTextField admittedDate;
    private javax.swing.JTextField bloodPressure;
    private javax.swing.JTextField complain;
    private javax.swing.JTextField heartRate;
    private javax.swing.JTextField hospital;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton prescribe;
    private javax.swing.JTextField respiratoryRate;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
