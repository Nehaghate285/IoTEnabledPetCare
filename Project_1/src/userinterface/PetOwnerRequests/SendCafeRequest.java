/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PetOwnerRequests;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Pets.Pet;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;

/**
 *
 * @author Neha Ghate
 */
public class SendCafeRequest extends SendRequests {
    
    @Override
    public JPanel sendRequestPanel(JPanel userProcessContainer, UserAccount account, Organization.Type selectedOrg, Pet selectedPet, WorkRequest request, Enterprise enterprise) {
        return new SendCafeRequestJPanel(userProcessContainer, request, selectedOrg, account,  enterprise); //To change body of generated methods, choose Tools | Templates.
    } 
    
}
