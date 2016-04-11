/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Person.PersonDirectory;
import Business.Roles.Roles;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Krithika
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    private int organizationID;
    private static int count;
    public enum Type{
        Admin("Admin Organization") , 
        DoctorAdmin("Doctor Organization"),
        DrugAdmin("Drug Organization"), 
        PatientAdmin("Patient Organization"), 
        PharmacyAdmin("Pharmacy Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Organization(String name)
    {
    this.name=name;
    workQueue=new WorkQueue();
    personDirectory=new PersonDirectory();
    userAccountDirectory=new UserAccountDirectory();
    organizationID=count;
    count++;
    
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

   

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }
    
    @Override
    public String toString() {
        return name;
    }
     public abstract ArrayList<Roles> getSupportedRole();
}
