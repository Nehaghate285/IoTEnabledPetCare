/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.PetOnly.Testimonial;
import Business.Pets.Pet;
import Business.UserAccount.UserAccount;
import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{
    
    private ArrayList<Testimonial> testimonialList;

   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        
        testimonialList = new ArrayList<>();
    
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise,account,ecosystem);
    }
    
     public ArrayList<Testimonial> getTestimonial() {
        return testimonialList;
    }

    public void setTestimonial(ArrayList<Testimonial> testimonialList) {
        this.testimonialList = testimonialList;
    }


    public Testimonial addTestimonial(Testimonial testimonial){
        //Pet pet = new Pet();
        //pet.setPetName(name);
        testimonialList.add(testimonial);
        return testimonial;
    }
      
    
    
}
