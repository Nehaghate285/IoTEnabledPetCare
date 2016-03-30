/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PetTakerOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PetAdoptionRoles.PetTakerWorkAreaJPanel;

/**
 *
 * @author Neha Ghate
 */
public class PetTakerRole extends Role {
 
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PetTakerWorkAreaJPanel(userProcessContainer, account, (PetTakerOrganization)organization, enterprise);
    }
}
