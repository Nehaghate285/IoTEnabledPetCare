/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VetRole;
import java.util.ArrayList;

/**
 *
 * @author Neha Ghate
 */
public class VetCenterOrganization extends Organization {
    
     public VetCenterOrganization() {
        super(Organization.Type.Vet.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VetRole());
        return roles;
    }
}
