/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public class PersonDirectory {

    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public Person createPerson(String name, String ssn, Network network) {
        try {
            if (network != null) {
                for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                        for (Person p : org.getPersonDirectory().getPersonList()) {
                            if (p.getFirstName().equals(name)) {
                                return null;
                            }
                            if ((!ssn.equals("")) && (p.getSsn() != null) && (p.getSsn().equals(ssn))) {
                                return null;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {

        } finally {
            Person person = new Person();
            person.setFirstName(name);
            person.setLastName(name);
            person.setSsn(ssn);
            personList.add(person);
            return person;
        }
    }

    public void deleteDetails(Person pd) {
        personList.remove(pd);
    }

}
