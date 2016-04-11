/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.VitalSign;

import java.util.Date;

/**
 *
 * @author Krithika
 */
public class VitalSign {
     private int RespiratoryRate;
    private int HeartRate;
    private int SystolicBloodPressure;
    private int WeightInPounds;
    private Date TimeStamp;

    public VitalSign(int RespiratoryRate, int HeartRate, int SystolicBloodPressure,
            int WeightInPounds){
        this.RespiratoryRate = RespiratoryRate;
        this.HeartRate = HeartRate;
        this.SystolicBloodPressure = SystolicBloodPressure;
        this.WeightInPounds = WeightInPounds;
    }

    VitalSign() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getRespiratoryRate() {
        return RespiratoryRate;
    }

    public void setRespiratoryRate(int RespiratoryRate) {
        this.RespiratoryRate = RespiratoryRate;
    }

    public int getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(int HeartRate) {
        this.HeartRate = HeartRate;
    }

    public int getSystolicBloodPressure() {
        return SystolicBloodPressure;
    }

    public void setSystolicBloodPressure(int SystolicBloodPressure) {
        this.SystolicBloodPressure = SystolicBloodPressure;
    }

    public int getWeightInPounds() {
        return WeightInPounds;
    }

    public void setWeightInPounds(int WeightInPounds) {
        this.WeightInPounds = WeightInPounds;
    }

    public Date getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Date TimeStamp) {
        this.TimeStamp = TimeStamp;
    }
   
     public String toString(){
        return TimeStamp.toString();
}
}