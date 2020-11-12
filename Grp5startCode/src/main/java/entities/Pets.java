/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nicol
 */
@Entity
@Table(name = "pets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pets.findAll", query = "SELECT p FROM Pets p"),
    @NamedQuery(name = "Pets.findByPetType", query = "SELECT p FROM Pets p WHERE p.petType = :petType")})
public class Pets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pet_type")
    private String petType;
    @OneToMany(mappedBy = "petsPetType")
    private List<User> usersList;

    public Pets() {
    }

    public Pets(String petType) {
        this.petType = petType;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    @XmlTransient
    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    public void addPet(User user) {
        usersList.add(user);
        if (user != null) {
            user.setPetsPetType(this);
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (petType != null ? petType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pets)) {
            return false;
        }
        Pets other = (Pets) object;
        if ((this.petType == null && other.petType != null) || (this.petType != null && !this.petType.equals(other.petType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pets[ petType=" + petType + " ]";
    }
    
}
