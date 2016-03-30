/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PetOnly;

import Business.Pets.Pet;

/**
 *
 * @author Neha Ghate
 */
public class Testimonial {
    private String testimonialMessage;
    private Pet pet;  

    public String getTestimonialMessage() {
        return testimonialMessage;
    }

    public void setTestimonialMessage(String testimonialMessage) {
        this.testimonialMessage = testimonialMessage;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return testimonialMessage ;
    }
    
}
