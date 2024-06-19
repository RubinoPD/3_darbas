package lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

/**
 * Represents a Vet entity.
 */
@Entity
public class Vet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vet_id;
    private String name;
    private String lastname;
    private String specialization;

    @OneToMany(mappedBy = "vet", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Animal> animals;

    // Getters and setters

    /**
     * Gets the ID of the vet.
     * @return the vet ID.
     */
    public int getVet_id() {
        return vet_id;
    }

    /**
     * Sets the ID of the vet.
     * @param vet_id the vet ID.
     */
    public void setVet_id(int vet_id) {
        this.vet_id = vet_id;
    }

    /**
     * Gets the first name of the vet.
     * @return the vet's first name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the first name of the vet.
     * @param name the vet's first name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the last name of the vet.
     * @return the vet's last name.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the last name of the vet.
     * @param lastname the vet's last name.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Gets the specialization of the vet.
     * @return the vet's specialization.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Sets the specialization of the vet.
     * @param specialization the vet's specialization.
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * Gets the list of animals associated with the vet.
     * @return the list of animals.
     */
    public List<Animal> getAnimals() {
        return animals;
    }

    /**
     * Sets the list of animals associated with the vet.
     * @param animals the list of animals.
     */
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
