/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pets;

import java.util.Date;
import java.util.Random;
import java.util.TimerTask;

/**
 *
 * @author Neha Ghate
 */
public class ScheduleVitalSign extends TimerTask {

    private Pet pet;
    int Low = 10;
    int High = 100;
    int tHigh = 59;

    public ScheduleVitalSign(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void run() {
        VitalSign vitalSign = pet.getVsh().addVitalSigns();
        Random r = new Random();

        int Result = r.nextInt(High - Low) + Low;
        int RR = r.nextInt(High - Low);
        int timeSpent = r.nextInt(tHigh - Low) + Low;
        vitalSign.setHeartRate(Result);
        vitalSign.setRespiratoryRate(RR);
        vitalSign.setVitalSignDate(new Date());
        vitalSign.setTimeSpent(timeSpent);
        System.out.println("VS added");
    }

}
