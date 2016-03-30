/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pets;

import java.util.Date;

/**
 *
 * @author Neha Ghate
 */
public class VitalSign {
     private float respiratoryRate;
    private float heartRate;
    private static int count;
    private int vitalSignId;
    private Date vitalSignDate;
    private int timeSpent;

    public int getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(int timeSpent) {
        this.timeSpent = timeSpent;
    }

     public VitalSign(){
        vitalSignId = count++;
    }
    
    public Date getVitalSignDate() {
        return vitalSignDate;
    }

    public void setVitalSignDate(Date vitalSignDate) {
        this.vitalSignDate = vitalSignDate;
    }


    public int getVitalSignId() {
        return vitalSignId;
    }
    
    public float getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(float respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }
    
    @Override
    public String toString() {
        return  Float.toString(respiratoryRate );
    }

   
    
}
