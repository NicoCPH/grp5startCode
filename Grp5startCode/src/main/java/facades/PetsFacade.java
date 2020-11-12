/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.ListeDTO;
import dtos.PetDTO;
import entities.Pets;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import security.errorhandling.AuthenticationException;

/**
 *
 * @author Nicol
 */
public class PetsFacade {
     private static EntityManagerFactory emf;
    private static PetsFacade instance;
    
    
    public static PetsFacade getPetsFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new PetsFacade();
        }
        return instance;
    }

    public ListeDTO getPets() throws AuthenticationException {
        EntityManager em = emf.createEntityManager();
        try {
              TypedQuery<Pets> query = em.createQuery("SELECT p FROM Pets p", Pets.class);
            return new ListeDTO(query.getResultList());
        } finally {
            em.close();
        }
    }
    
}
