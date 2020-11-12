/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Pets;

/**
 *
 * @author Nicol
 */
public class PetDTO {
    String petName;

    public PetDTO(Pets p) {
        this.petName = p.getPetType();
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
    
    
    
}
