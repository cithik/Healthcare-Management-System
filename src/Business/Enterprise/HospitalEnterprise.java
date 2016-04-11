/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Doctor.DoctorDirectory;
import Business.Patient.PatientDirectory;
import Business.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public class HospitalEnterprise extends Enterprise {
    PatientDirectory patientDirectory;
    DoctorDirectory doctorDirectory;
    public HospitalEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Hospital);
        this.patientDirectory=new PatientDirectory();
        this.doctorDirectory=new DoctorDirectory();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }


   @Override
    public ArrayList<Roles> getSupportedRole() {
        return null;
    }
}