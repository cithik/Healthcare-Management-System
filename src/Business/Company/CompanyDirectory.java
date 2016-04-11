/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Company;

import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public class CompanyDirectory {
    private final ArrayList<Company> companyList;

    public CompanyDirectory() {
        companyList = new ArrayList<>();
    }
    public ArrayList<Company> getPersonList() {
        return companyList;
    }
    
    public Company createPerson(String name){
        for(Company c: this.getPersonList()){
            if(c.getName().equals(name)){
                return null;
            }
        }
        Company person = new Company();
        person.setName(name);
        companyList.add(person);
        return person;
    }
    
}
