/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import Business.Patient.Patient;

/**
 *
 * @author vyaas
 */
public class Feedback {
    String feedback;
    Patient patient;

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Feedback(String feedback, Patient patient){
        this.feedback=feedback;
        this.patient=patient;
    }
    
}
