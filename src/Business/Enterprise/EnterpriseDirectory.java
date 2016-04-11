/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        for(Enterprise enterprise: this.getEnterpriseList()){
        if(enterprise.getName().equals(name)){
            return null;
        }
    }
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }

        if (type == Enterprise.EnterpriseType.DrugCompany){
            enterprise = new DrugCompanyEnterprise(name);
            enterpriseList.add(enterprise);
        }

        return enterprise;
    
}
}