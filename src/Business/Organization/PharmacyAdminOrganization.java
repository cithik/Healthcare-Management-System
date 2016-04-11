/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Roles.DoctorAdminRole;
import Business.Roles.PharmacyAdminRole;
import Business.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public class PharmacyAdminOrganization extends Organization{
    
      public PharmacyAdminOrganization() {
        super(Organization.Type.PharmacyAdmin.getValue());
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new PharmacyAdminRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
}
