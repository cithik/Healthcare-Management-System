/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Roles;

import Business.Doctor.Doctor;
import Business.Doctor.DoctorDirectory;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import UserInterface.HospitalManagementWorkArea.DoctorWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Krithika
 */
public class DoctorAdminRole extends Roles{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, Ecosystem business) {
        return new DoctorWorkArea(userProcessContainer,account,organization,enterprise,business); 
    }
}