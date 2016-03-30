/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PetGroomerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neha Ghate
 */
public class PetGroomingOrganization extends Organization {

     public PetGroomingOrganization() {
        super(Organization.Type.PetGroomer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PetGroomerRole());
        return roles;
    }
}

