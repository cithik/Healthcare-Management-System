/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Drug.DrugCompany;
import Business.Medicine.Medicine;

/**
 *
 * @author vyaas
 */
public class PrescriptionItem {
    Medicine medicine;
    DrugCompany drugCompany;
    int quantity;

    public PrescriptionItem(Medicine medicine,
    DrugCompany drugCompany,
    int quantity){
        this.medicine = medicine;
        this.drugCompany = drugCompany;
        this.quantity = quantity;
    }
    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public DrugCompany getDrugCompany() {
        return drugCompany;
    }

    public void setDrugCompany(DrugCompany drugCompany) {
        this.drugCompany = drugCompany;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString(){
        return this.getMedicine().getDrugName();
    }
}
