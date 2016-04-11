/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.VitalSign;

import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public class VitalSignHistory {
     private ArrayList<VitalSign> vsList;
    
    public VitalSignHistory()
    {
        vsList=new ArrayList<>();
    }
    
    public VitalSign addVitalSign()
    {
        VitalSign vs=new VitalSign();
        vsList.add(vs);
        return vs;
    }

    public void deleteVitalSign(VitalSign vs)
    { vsList.remove(vs);
    }

    public ArrayList<VitalSign> getVsList() {
        return vsList;
    }

    public void setVsList(ArrayList<VitalSign> vsList) {
        this.vsList = vsList;
    }
    
}
