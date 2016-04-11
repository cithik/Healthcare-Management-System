/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public class OrganizationDirectory { 
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.DoctorAdmin.getValue())){
            organization = new DoctorAdminOrganization();
            organizationList.add(organization);
        
        }

        else if (type.getValue().equals(Organization.Type.PatientAdmin.getValue())){
            organization = new PatientAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.DrugAdmin.getValue())){
            organization = new DrugAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.PharmacyAdmin.getValue())){
            organization = new PharmacyAdminOrganization();
            organizationList.add(organization);
        } 
        return organization;
    }
    
}
