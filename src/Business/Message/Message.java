/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Message;

/**
 *
 * @author vyaas
 */
public class Message {
    String message;
    static boolean objExists=false;
    private static Message messageObj;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    private Message(){
        
    }
    public static Message getInstance(){
        if(!objExists){
           messageObj= new Message();
           objExists=true;
        }
        return messageObj;
    }
}
