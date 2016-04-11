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
import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import Business.UserAccount.UserAccount;
import UserInterface.PatientManagementRole.PatientWorkArea;
import UserInterface.PatientWorkArea.HomePageJPanel;
import static com.db4o.qlin.QLinSupport.p;
import javax.swing.JPanel;

/**
 *
 * @author Krithika
 */
public class PatientRole extends Roles{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network,Ecosystem business) {
        return new HomePageJPanel(userProcessContainer,account,organization,enterprise, network,business); //To change body of generated methods, choose Tools | Templates.
    }   
}
