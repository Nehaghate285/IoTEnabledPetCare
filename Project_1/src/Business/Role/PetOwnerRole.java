/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PetOwnerOrganization;
import Business.Pets.PetDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PetOwnerRole.PetOwnerDashboardJPanel;

/**
 *
 * @author Neha Ghate
 */
public class PetOwnerRole extends Role{

    private PetDirectory petDirectory;
    
   UserAccount ua;
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
         if(petDirectory == null)  {
        petDirectory = new PetDirectory();
        }
         this.ua = account;
       // return new PetOwnerWorkAreaJPanel(userProcessContainer, account, (PetOwnerOrganization)organization, enterprise,petDirectory);
        return new PetOwnerDashboardJPanel(userProcessContainer, account, (PetOwnerOrganization)organization, enterprise,petDirectory);
    }
    
     public PetDirectory getPetDirectory() {
        return petDirectory;
    }

}
