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
import UserInterface.DrugCompany.DrugWorkArea;
import UserInterface.PatientManagementRole.PatientWorkArea;
import UserInterface.Pharmacy.PharmacyWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Krithika
 */
public class DrugAdminRole extends Roles{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, Ecosystem business) {
        return new DrugWorkArea(userProcessContainer,account,organization,enterprise,business); 
    }
}