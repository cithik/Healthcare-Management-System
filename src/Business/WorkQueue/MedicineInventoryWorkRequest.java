/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Encounter.EncounterHistory;
import Business.Medicine.MedicineInventroy;
import Business.Medicine.MedicinesInventroy;
import Business.Person.Person;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class MedicineInventoryWorkRequest extends WorkRequest{
    private Person person;
    
    private MedicineInventroy medicineInventroy;

    public MedicineInventroy getMedicinesInventroy() {
        return medicineInventroy;
    }

    public void setMedicinesInventroy(MedicineInventroy medicineInventroy) {
        this.medicineInventroy = medicineInventroy;
    }
    
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public String toString(){
        return this.getSender().getCompany().getName();
    }
}
