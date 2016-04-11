/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Roles.Roles;
import Business.Roles.SystemAdminRole;
import java.util.ArrayList;
import javax.management.relation.Role;

/**
 *
 * @author Krithika
 */
public class Ecosystem extends Organization {

    private static Ecosystem business;
    private ArrayList<Network> networkList;

    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    private Ecosystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList; //To change body of generated methods, choose Tools | Templates.
    }
}
