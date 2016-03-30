/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validator;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PetGroomerWorkRequest;
import java.util.Date;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Neha Ghate
 */
public class ScheduleGroomingTask extends TimerTask {

   private PetGroomerWorkRequest request;
   private Date newRequestDate;
   private Organization org;
           private UserAccount acc;
   public ScheduleGroomingTask(PetGroomerWorkRequest request,Date newDate,Organization org, UserAccount acc){
        this.request = request;
        this.newRequestDate = newDate;
        this.org = org;
        this.acc= acc;
    }
    @Override
    public void run() {
        
        System.out.println("Fetching mail...");
        System.out.println("Creating request");
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to send grooming request?","Confirmation",dialogButton );
            if(dialogResult == JOptionPane.YES_OPTION)
            {
               // System.out.println("new date: " + newRequestDate );
               PetGroomerWorkRequest newRequest =  new PetGroomerWorkRequest();
               newRequest.setChecklist(request.getChecklist());
               newRequest.setMessage(request.getMessage());
               newRequest.setPet(request.getPet());
               newRequest.setSender(request.getSender());
               newRequest.setRequestDate(new Date());
               
               //newRequest = request;
               newRequest.setDateOfGroomRequest(newRequestDate);
               newRequest.setStatus("Sent");
                org.getWorkQueue().getWorkRequestList().add(newRequest);
                acc.getWorkQueue().getWorkRequestList().add(newRequest);
        
               JOptionPane.showMessageDialog(null, "Test is Requested sucessfully to "+org.getName(), "Request is created", JOptionPane.INFORMATION_MESSAGE);
            }
    }
    
}
