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
import UserInterface.PharmacyWorkArea.ViewRequestJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Krithika
 */
public class Pharmacy extends Roles{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network,Ecosystem business) {
        return new ViewRequestJPanel(userProcessContainer,account,organization,enterprise,network); 
    }
}