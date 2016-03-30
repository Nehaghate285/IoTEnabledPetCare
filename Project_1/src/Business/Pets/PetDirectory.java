/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pets;

import java.util.ArrayList;

/**
 *
 * @author Neha Ghate
 */
public class PetDirectory {
    
   private ArrayList<Pet> petList ;
   private int petCount;
   
    
    public PetDirectory()
    {
     petList = new ArrayList<>();
        
    }

    public ArrayList<Pet> getPetList() {
        return petList;
    }

    public void setPetList(ArrayList<Pet> petList) {
        this.petList = petList;
    }
    
      public Pet createPet(Pet pet){
        //Pet pet = new Pet();
        //pet.setPetName(name);
        petList.add(pet);
        return pet;
    }
      
      public void removePet(Pet p){
          
          petList.remove(p);
      }

    public int getPetCount() {
         petCount = petList.size();
        return petCount;
    }

    public void setPetCount(int petCount) {
        this.petCount = petCount;
    }
      
    
}
