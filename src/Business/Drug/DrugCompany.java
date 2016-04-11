/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Drug;

import Business.Medicine.Medicine;
import Business.Medicine.Medicines;
import Business.Company.Company;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import java.util.Date;

/**
 *
 * @author Krithika
 */
public class DrugCompany extends Company {
    private Medicines medicines;
    
    public Medicines getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicines medicines) {
        this.medicines = medicines;
    }

    public DrugCompany(){
        medicines=new Medicines();   
    }
    public String toString(){
        return this.getName();
    }
   
}
