/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PetWalkerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neha Ghate
 */
public class PetWalkerOrganization extends Organization {
    
    public PetWalkerOrganization() {
        super(Organization.Type.PetWalker.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PetWalkerRole());
        return roles;
    }
}
