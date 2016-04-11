/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

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
public class DoctorDirectory {

    private ArrayList<Doctor> doctorList;

    public DoctorDirectory() {
        doctorList = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorList;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorList = doctorDirectory;
    }

    public Doctor addDoctor(String firstName, String SSN) {
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
            }}catch(Exception e){
                
            }finally{
        Doctor doctor = new Doctor();
        doctor.setFirstName(firstName);
        doctor.setSsn(SSN);
        doctorList.add(doctor);
        return doctor;
        }
    }

    public boolean isDoctorExist(String ssn) {
        boolean b = true;
        for (Doctor d : doctorList) {
            if (d.getSsn().equals(ssn)) {
                b = false;
            }

        }
        return b;
    }

    public void removeDoctor(Doctor d) {
        doctorList.remove(d);
    }

}
