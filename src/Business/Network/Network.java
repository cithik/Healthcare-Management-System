/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Message.Message;

/**
 *
 * @author Krithika
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private Message messageObj; 
    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        messageObj=Message.getInstance();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
