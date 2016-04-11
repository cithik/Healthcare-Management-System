/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Company;

/**
 *
 * @author Krithika
 */
public class Company{
    private int CompanyID;
    private String name;
    private String city;
    private String state;
    private int contactNumber;
    private static int count;
    
    public int getCompanyID() {
        return CompanyID;
    }

    public void setCompanyID(int CompanyID) {
        this.CompanyID = CompanyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Company.count = count;
    }
    public Company(){
    CompanyID=count;
    count++;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }   
}
