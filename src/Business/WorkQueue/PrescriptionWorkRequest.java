/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Encounter.EncounterHistory;
import Business.Patient.Prescription;
import Business.Person.Person;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class PrescriptionWorkRequest extends WorkRequest{
    private Person person;

    private String testResult;
    private Prescription prescription;

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public String toString(){
        return this.getSender().getPerson().getFirstName();
    }
}
