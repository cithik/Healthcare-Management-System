/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Pharmacy;

import Business.Patient.*;
import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public class PharmacyDirectory {
   private  ArrayList<Pharmacy> pharmacyDirectory;

    public ArrayList<Pharmacy> getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public void setPharmacyDirectory(ArrayList<Pharmacy> pharmacyDirectory) {
        this.pharmacyDirectory = pharmacyDirectory;
    }
   
   
   public PharmacyDirectory(){
       pharmacyDirectory=new ArrayList<>();
   
   }

    
    public Pharmacy addPharmacy()
    {
    Pharmacy p=new Pharmacy();
    pharmacyDirectory.add(p);
    return p;
    }
    
    public void deleteDetails(PharmacyDirectory p)
    {
        pharmacyDirectory.remove(p);
    }
    public Pharmacy searchAccount(String key)
    {
        for(Pharmacy p : pharmacyDirectory)
        {
            if(p.getName().equals(key))
            {
                return p;
            }
            
            }
            return null;
    }
}

