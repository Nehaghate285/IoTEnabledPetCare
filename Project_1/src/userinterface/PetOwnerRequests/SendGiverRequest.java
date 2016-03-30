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
import userinterface.requestPanel.GiverJPanel;

/**
 *
 * @author Neha Ghate
 */
public class SendGiverRequest extends SendRequests {

   @Override
    public JPanel sendRequestPanel(JPanel userProcessContainer, UserAccount account, Type selectedOrg, Pet selectedPet, WorkRequest request, Enterprise enterprise) {
    return new SendGiverRequestJPanel(userProcessContainer, request, selectedOrg,selectedPet, account,  enterprise); 
   //return new GiverJPanel(userProcessContainer, request, selectedOrg,selectedPet, account,  enterprise);
    }
    
}
