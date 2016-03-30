/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Pets.Pet;

/**
 *
 * @author Neha Ghate
 */
public class WorkRequestLogic {
    
     public static PetTakerWorkRequest getPetTakerRequest(Type selectedOrgType,WorkRequest workRequest){
        PetTakerWorkRequest request=null;
         if(selectedOrgType.equals(Organization.Type.PetTaker)){
             request =  (PetTakerWorkRequest)workRequest;   
            
        }
            
            return request;
    }
     
     public static PetWalkerWorkRequest getPetWalkerRequest(Type selectedOrgType,WorkRequest workRequest){
        PetWalkerWorkRequest request=null;
         if(selectedOrgType.equals(Organization.Type.PetWalker)){
             request =  (PetWalkerWorkRequest)workRequest;
            
        }
            
            return request;
    }
    
     public static PetGiverWorkRequest getPetGiverRequest(Type selectedOrgType,WorkRequest workRequest){
        PetGiverWorkRequest request=null;
         if(selectedOrgType.equals(Organization.Type.PetGiver)){
             request =  (PetGiverWorkRequest)workRequest;   
            
        }
            
            return request;
    }
     
     public static PetGroomerWorkRequest getPetGroomerRequest(Type selectedOrgType,WorkRequest workRequest){
        PetGroomerWorkRequest request=null;
         if(selectedOrgType.equals(Organization.Type.PetGroomer)){
             request =  (PetGroomerWorkRequest)workRequest;
            
        }
            
            return request;
    }
      public static VetWorkRequest getVetRequest(Type selectedOrgType,WorkRequest workRequest){
        VetWorkRequest request=null;
         if(selectedOrgType.equals(Organization.Type.Vet)){
             request =  (VetWorkRequest)workRequest;
            
        }
            
            return request;
    }
    
       public static CafeEmployeeWorkRequest getCafeEmployeeWorkRequest(Type selectedOrgType,WorkRequest workRequest){
        CafeEmployeeWorkRequest request=null;
         if(selectedOrgType.equals(Organization.Type.CafeEmployee)){
             request =  (CafeEmployeeWorkRequest)workRequest;
            
        }
            
            return request;
    }
    public static PetTakerWorkRequest setPetTakerRequest(Type selectedOrgType){
        PetTakerWorkRequest request =null;
        if(selectedOrgType.equals(Organization.Type.PetTaker)){
            request = new PetTakerWorkRequest();
            
        }
            
            return request;
    }
    
    public static PetGiverWorkRequest setPetGiverRequest(Type selectedOrgType ){
        PetGiverWorkRequest request =null;
        if(selectedOrgType.equals(Organization.Type.PetGiver)){
            request = new PetGiverWorkRequest();
            
        }
            
            return request;
    }
    public static PetWalkerWorkRequest setPetWalkerRequest(Type selectedOrgType){
        PetWalkerWorkRequest request =null;
        if(selectedOrgType.equals(Organization.Type.PetWalker)){
            request = new PetWalkerWorkRequest();
            
        }
            
            return request;
    }
    
    public static PetGroomerWorkRequest setPetGroomerRequest(Type selectedOrgType ){
        PetGroomerWorkRequest request =null;
        if(selectedOrgType.equals(Organization.Type.PetGroomer)){
            request = new PetGroomerWorkRequest();
        }
            
            return request;
    }
    public static  VetWorkRequest setVetRequest(Type selectedOrgType ){
        VetWorkRequest request =null;
        if(selectedOrgType.equals(Organization.Type.Vet)){
            request = new VetWorkRequest();
            
        }
            
            return request;
    }
    
     public static  CafeEmployeeWorkRequest setCafeRequest(Type selectedOrgType ){
        CafeEmployeeWorkRequest request =null;
        if(selectedOrgType.equals(Organization.Type.CafeEmployee)){
            request = new CafeEmployeeWorkRequest();
            
        }
            
            return request;
    }
}
