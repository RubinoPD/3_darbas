package lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.model;

import jakarta.persistence.*;

@Entity
public class Animal {
    @Id
    @GeneratedValue
    private int ID;
    private String name;
    private String gender;

    @ManyToOne(targetEntity = Vet.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "vet_id")
    private Vet vet;

    // Getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
}
