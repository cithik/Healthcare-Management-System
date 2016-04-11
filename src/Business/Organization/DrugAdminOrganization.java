/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Roles.DoctorAdminRole;
import Business.Roles.DrugAdminRole;
import Business.Roles.PatientAdminRole;
import Business.Roles.PatientRole;
import Business.Roles.Roles;
import java.util.ArrayList;
import javax.management.relation.Role;

/**
 *
 * @author Krithika
 */
public class DrugAdminOrganization extends Organization {

  public  DrugAdminOrganization() {
        super(Organization.Type.DrugAdmin.getValue());
    }
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new DrugAdminRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
}
