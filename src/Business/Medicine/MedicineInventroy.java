/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Medicine;

import Business.Drug.DrugCompany;

/**
 *
 * @author Krithika
 */
public class MedicineInventroy {
    DrugCompany drugCompany;
    Medicine medicine;
    int quantity;
    public DrugCompany getDrugCompany() {
        return drugCompany;
    }

    public void setDrugCompany(DrugCompany drugCompany) {
        this.drugCompany = drugCompany;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public MedicineInventroy(DrugCompany drugCompany, Medicine medicine, int quantity){
        this.drugCompany = drugCompany;
        this.medicine = medicine;
        this.quantity = quantity;
    }
    public String toString(){
        return this.medicine.getDrugName();
    }
}
