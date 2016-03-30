/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PetOwner.getValue())){
            organization = new PetOwnerOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.PetGiver.getValue())){
            organization = new PetGiverOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.PetTaker.getValue())){
            organization = new PetTakerOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.PetWalker.getValue())){
            organization = new PetWalkerOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.PetGroomer.getValue())){
            organization = new PetGroomingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Vet.getValue())){
            organization = new VetCenterOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
    
      public boolean checkIfOrganizationIsUnique(Organization org){
        for (Organization organization : organizationList){
            if (organization.equals(org))
                return false;
        }
        return true;
    }
      
      public boolean checkIfOrgIsUnique(Type orgType){
	   Organization res = null;
	   for(Organization org : organizationList){
			if(org.getName().equals(orgType.getValue())){
				res = org;
				return false;
			}
	   }
	  // res = new Organization(type);
	   return true;
      }
}