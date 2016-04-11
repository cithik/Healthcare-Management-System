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
public class MedicinesInventroy {
    private ArrayList<MedicineInventroy> encounterList;

    public MedicinesInventroy() {
        encounterList = new ArrayList<>();
    }

    public ArrayList<MedicineInventroy> getMedicinesList() {
        return encounterList;
    }

    public void addMedicineList(MedicineInventroy e) {
        this.encounterList.add(e);
    }
    
}
