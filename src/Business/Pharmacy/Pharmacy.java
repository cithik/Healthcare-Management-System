/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Pharmacy;

import Business.Company.Company;
import Business.Drug.DrugCompany;
import Business.Patient.*;
import Business.Encounter.Encounter;
import Business.Encounter.EncounterHistory;
import Business.Medicine.Medicine;
import Business.Medicine.MedicineInventroy;
import Business.Medicine.Medicines;
import Business.Medicine.MedicinesInventroy;
import Business.Person.Person;
import java.util.Date;

/**
 *
 * @author Krithika
 */
public class Pharmacy extends Company {
    private MedicinesInventroy medicinesInventroy;

    public MedicinesInventroy getMedicines() {
        return medicinesInventroy;
    }

    public void setMedicines(MedicinesInventroy medicinesInventroy) {
        this.medicinesInventroy = medicinesInventroy;
    }
    public Pharmacy(){
        medicinesInventroy=new MedicinesInventroy();   
    }

}
