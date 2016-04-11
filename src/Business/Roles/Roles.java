/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Roles;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Krithika
 */
public abstract class Roles {
    public enum RoleType{
        DoctorAdmin("DoctorAdmin"),
        HospitalManager("Hospital Manager"),
        DrugManager("Drug Manager"),
        PatientAdmin("PatientAdmin"),
        Pharmacy("Pharmacy"),
        SystemAdmin("SystemAdmin"),
        Doctor("Doctor"),
        Patient("Patient");
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, Network network,Ecosystem business);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
