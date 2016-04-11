/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Encounter;

import Business.VitalSign.VitalSign;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Krithika
 */
public class Encounter {
    private final Date date;
    private String sickness;
    private String hospital;
    private VitalSign vitalSign;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public Encounter(String sickness, String hospital, VitalSign vs){
        Calendar cal = Calendar.getInstance();
        this.date = cal.getTime();
        this.sickness = sickness;
        this.hospital = hospital;
        this.vitalSign = vs;
    }

     @Override
    public String toString(){
        return date.toString();
    }
    public String getDate() {
        return date.toString();
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }  
}
