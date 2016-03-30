/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PetOwnerRequests;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization.Type;
import Business.Pets.Pet;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;

/**
 *
 * @author Neha Ghate
 */
public abstract class SendRequests {
    
    
     public  abstract JPanel sendRequestPanel(JPanel userProcessContainer, 
            UserAccount account, Type selectedOrg, Pet selectedPet,WorkRequest request,
            Enterprise enterprise );
}
