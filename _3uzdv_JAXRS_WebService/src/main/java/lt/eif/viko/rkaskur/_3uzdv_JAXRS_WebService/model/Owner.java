package lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

/**
 * Represents an Owner entity.
 */
@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int owner_id;
    private String name;
    private String lastname;

    @OneToMany
    @JoinTable(
            name = "owner_animals",
            joinColumns = @JoinColumn(name = "owner_id"),
            inverseJoinColumns = @JoinColumn(name = "animal_id")
    )
    @JsonManagedReference
    private List<Animal> animals;

    // Getters and setters

    /**
     * Gets the ID of the owner.
     * @return the owner ID.
     */
    public int getOwner_id() {
        return owner_id;
    }

    /**
     * Sets the ID of the owner.
     * @param owner_id the owner ID.
     */
    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    /**
     * Gets the first name of the owner.
     * @return the owner's first name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the first name of the owner.
     * @param name the owner's first name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the last name of the owner.
     * @return the owner's last name.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the last name of the owner.
     * @param lastname the owner's last name.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Gets the list of animals owned by the owner.
     * @return the list of animals.
     */
    public List<Animal> getAnimals() {
        return animals;
    }

    /**
     * Sets the list of animals owned by the owner.
     * @param animals the list of animals.
     */
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
