/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Drug.DrugCompany;
import Business.Medicine.Medicine;
import Business.Organization.DrugAdminOrganization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author krithika
 */
public class Prescription {
    
    ArrayList<PrescriptionItem> pi = new ArrayList<PrescriptionItem>();

    public ArrayList<PrescriptionItem> getPi() {
        return pi;
    }

    public void setPi(ArrayList<PrescriptionItem> pi) {
        this.pi = pi;
    }
    UserAccount doctorAccount;

    public Prescription(UserAccount doctorAccount){
        this.doctorAccount = doctorAccount;
    }
    public UserAccount getDoctorAccount() {
        return doctorAccount;
    }

    public void setDoctorAccount(UserAccount doctorAccount) {
        this.doctorAccount = doctorAccount;
    }
  
    public void addPrescription(PrescriptionItem pi){
        this.pi.add(pi);
    }
    public String toString(){
        return this.doctorAccount.getPerson().getFirstName();
    }
}
