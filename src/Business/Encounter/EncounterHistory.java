/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Encounter;

import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterList;

    public EncounterHistory() {
        encounterList = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void addEncounterList(Encounter e) {
        this.encounterList.add(e);
    }
    
}
