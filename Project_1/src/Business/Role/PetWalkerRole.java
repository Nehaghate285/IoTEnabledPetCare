/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PetWalkerOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PetAdoptionRoles.PetWalkerWorkAreaJPanel;

/**
 *
 * @author Neha Ghate
 */
public class PetWalkerRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PetWalkerWorkAreaJPanel(userProcessContainer, account, (PetWalkerOrganization)organization, enterprise);
    }
}
