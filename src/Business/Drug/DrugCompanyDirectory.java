/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public class DrugCompanyDirectory {

    private ArrayList<DrugCompany> drugDirectory;
    
    public DrugCompanyDirectory() {
        drugDirectory = new ArrayList<>();
    }
    
    public ArrayList<DrugCompany> getDrugDirectory() {
        return drugDirectory;
    }

    public void setDrugDirectory(ArrayList<DrugCompany> drugDirectory) {
        this.drugDirectory = drugDirectory;
    }
   

    public DrugCompany addDrug() {
        DrugCompany p = new DrugCompany();
        drugDirectory.add(p);
        return p;
    }

    public void deleteDetails(DrugCompanyDirectory p) {
        this.drugDirectory.remove(p);
    }

    public DrugCompany searchDrug(String name) {
        for (DrugCompany p : drugDirectory) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }
}
