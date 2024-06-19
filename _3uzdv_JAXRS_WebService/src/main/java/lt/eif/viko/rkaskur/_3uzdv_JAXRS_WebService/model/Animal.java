package lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

/**
 * Represents an Animal entity.
 */
@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int animal_id;
    private String name;
    private String gender;

    @ManyToOne
    @JoinColumn(name = "vet_id")
    @JsonBackReference
    private Vet vet;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    @JsonBackReference
    private Owner owner;

    // Getters and setters

    /**
     * Gets the ID of the animal.
     * @return the animal ID.
     */
    public int getAnimal_id() {
        return animal_id;
    }

    /**
     * Gets the ID of the animal.
     * @return the animal ID.
     */
    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    /**
     * Gets the name of the animal.
     * @return the animal name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the animal.
     * @param name the animal name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the gender of the animal.
     * @return the animal gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the animal.
     * @param gender the animal gender.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the vet associated with the animal.
     * @return the vet.
     */
    public Vet getVet() {
        return vet;
    }

    /**
     * Sets the vet associated with the animal.
     * @param vet the vet.
     */
    public void setVet(Vet vet) {
        this.vet = vet;
    }

    /**
     * Gets the owner of the animal.
     * @return the owner.
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the owner of the animal.
     * @param owner the owner.
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
