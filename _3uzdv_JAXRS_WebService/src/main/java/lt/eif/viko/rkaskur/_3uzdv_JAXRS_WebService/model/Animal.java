package lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

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
    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
