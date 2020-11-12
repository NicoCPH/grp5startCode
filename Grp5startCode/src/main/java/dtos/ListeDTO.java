/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Pets;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicol
 */
public class ListeDTO {
     List<PetDTO> alle = new ArrayList();
      
      
    public ListeDTO(List<Pets> CityinfoEntities) {  
        CityinfoEntities.forEach((c) -> {
            alle.add(new PetDTO(c));
        });
    }
}
