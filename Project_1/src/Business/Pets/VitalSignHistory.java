/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pets;

import java.util.ArrayList;

/**
 *
 * @author Neha Ghate
 */
public class VitalSignHistory {
    
   private  ArrayList<VitalSign> vitalSignList;

    public VitalSignHistory() {
        this.vitalSignList = new ArrayList<>();
    }
    
    public VitalSign addVitalSigns()
    {
        VitalSign v = new VitalSign();
        vitalSignList.add(v);
        return v;
    }
   
    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    
    
}
