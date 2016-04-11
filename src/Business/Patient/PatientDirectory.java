/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Patient;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public class PatientDirectory {
   private  ArrayList<Patient> PatientDirectory;
   
   
   public PatientDirectory(){
       PatientDirectory=new ArrayList<>();
   
   }

    public ArrayList<Patient> getPatientDirectory() {
        return PatientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> PatientDirectory) {
        this.PatientDirectory = PatientDirectory;
    }
    public Patient addPatient(String firstName, String SSN)
    {
        try{
            DB4OUtil dB4OUtil = DB4OUtil.getInstance();
            Ecosystem system = dB4OUtil.retrieveSystem();
            for(Network network: system.getNetworkList()){        
            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
            for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList()){
                for(UserAccount ua:org.getUserAccountDirectory().getUserAccountList()){
                    if((ua.getUsername().equals(firstName))||(ua.getPerson().getSsn().equals(SSN))){
                        return null;
                    }
                }
            }
            }
            }
        }catch(Exception e){
            
        } finally{
    Patient p=new Patient();
    p.setFirstName(firstName);
    p.setSsn(SSN);
    PatientDirectory.add(p);
    return p;
        }
    }
    
    public void deleteDetails(PatientDirectory p)
    {
        PatientDirectory.remove(p);
    }
    public Patient searchAccount(String key)
    {
        for(Patient p : PatientDirectory)
        {
            if(p.getSsn().equals(key))
            {
                return p;
            }
            
            }
            return null;
    }
}

