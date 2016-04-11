/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Drug.DrugCompanyDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public class DrugCompanyEnterprise extends Enterprise {
    DrugCompanyDirectory drugCompanyDirectory;
    PharmacyDirectory pharmacyCompanyDirectory;
    public DrugCompanyEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.DrugCompany);
        this.drugCompanyDirectory=new DrugCompanyDirectory();
        this.pharmacyCompanyDirectory=new PharmacyDirectory();
    }

   public DrugCompanyDirectory getDrugDirectory() {
        return drugCompanyDirectory;
    }

    public void setDrugDirectory(DrugCompanyDirectory drugDirectory) {
        this.drugCompanyDirectory = drugDirectory;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyCompanyDirectory;
    }

    public void setPharmacyDirectory(PharmacyDirectory pharmacyDirectory) {
        this.pharmacyCompanyDirectory = pharmacyDirectory;
    }

    public String toString(){
        return this.getName();
    }
   @Override
    public ArrayList<Roles> getSupportedRole() {
        return null;
    }
}