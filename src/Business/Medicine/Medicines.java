/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Medicine;

import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public class Medicines {
    private ArrayList<Medicine> encounterList;

    public Medicines() {
        encounterList = new ArrayList<>();
    }

    public ArrayList<Medicine> getMedicinesList() {
        return encounterList;
    }

    public void addMedicineList(Medicine e) {
        this.encounterList.add(e);
    }
    
}
