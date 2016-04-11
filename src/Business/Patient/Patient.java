/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Patient;

import Business.Encounter.Encounter;
import Business.Encounter.EncounterHistory;

import Business.Person.Person;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Krithika
 */
public class Patient extends Person {
    private EncounterHistory encounters;
    private String allergyList;
    private Date dateOfBirth;
    private LinkedList<Prescription> prescriptions = new LinkedList<Prescription>();

    public LinkedList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(LinkedList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
    
    public void addPrescription(Prescription prescription){
        this.prescriptions.add(prescription);
    }
    public Patient(){
        encounters=new EncounterHistory();
    }

    public EncounterHistory getEncounters() {
        return encounters;
    }

    public void setEncounter(Encounter encounter) {
        this.encounters.addEncounterList(encounter);
    }
    public String getAllergyList() {
        return allergyList;
    }

    public void setAllergyList(String allergyList) {
        this.allergyList = allergyList;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
