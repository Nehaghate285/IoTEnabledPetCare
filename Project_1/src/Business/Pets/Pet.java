/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pets;

import java.awt.image.BufferedImage;
import java.util.Date;

/**
 *
 * @author Neha Ghate
 */
public class Pet {
    
    private String petName;
    private Date dob;
    private String petBreed;
    private VitalSignHistory vsh;
    private int petId;
    private static int count=1;
    private BufferedImage petImage;
    
    
    public Pet(){
        vsh = new VitalSignHistory();
                
        petId=count++;
        
    }

    public BufferedImage getPetImage() {
        return petImage;
    }

    public void setPetImage(BufferedImage petImage) {
        this.petImage = petImage;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public VitalSignHistory getVsh() {
        return vsh;
    }

    public void setVsh(VitalSignHistory vsh) {
        this.vsh = vsh;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    @Override
    public String toString() {
        return  petName ;
    }
    
     
    
}
