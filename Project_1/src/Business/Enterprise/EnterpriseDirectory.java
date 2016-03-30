/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.MyPetCare){
            enterprise = new MyPetCareEnterprise(name);
            enterpriseList.add(enterprise);
        }
//        if (type == Enterprise.EnterpriseType.Hospital){
//            enterprise = new HospitalEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//        else
//        if (type == Enterprise.EnterpriseType.MyPetCare){
//            enterprise = new MyPetCareEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//        else
//        if (type == Enterprise.EnterpriseType.PetAdoption){
//            enterprise = new PetAdoptionEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
//        else
//            if(type == Enterprise.EnterpriseType.PetCafe){
//                enterprise = new PetCafeEnterprise(name);
//                 enterpriseList.add(enterprise);
//            }
//        else
//                if(type == Enterprise.EnterpriseType.PetGrooming){
//                enterprise = new PetGroomingEnterprise(name);
//                 enterpriseList.add(enterprise);
//            } 
//             else
//                {
//                    enterprise = new VetCenterEnterprise(name);
//                 enterpriseList.add(enterprise);
//                    
//                }
//        
         return enterprise;
    }
    
    public  boolean checkIfEnterpriseIsUnique(String username){
        for (Enterprise enterprise : enterpriseList){
            if (enterprise.getName().equals(username))
                return false;
        }
        return true;
    }
    
}
