package lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String password;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @ManyToMany
    @JoinTable(
            name = "account_animals",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "animal_id")
    )
    private List<Animal> animals;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    // Constructors
    public Account() {
    }

    public Account(int id, String userName, String password, Owner owner, List<Animal> animals) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.owner = owner;
        this.animals = animals;
    }

    public Account(String userName, String password, Owner owner, List<Animal> animals) {
        this.userName = userName;
        this.password = password;
        this.owner = owner;
        this.animals = animals;
    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return
                String.format("Account:\n\t" +
                                "Username = %s\n\t" +
                                "Password = %s\n" +
                                "\tOwner: \n\t%s\n" +
                                "\tAnimals: \n%s"
                        ,
                        this.userName,
                        this.password,
                        this.owner,
                        this.animals);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                Objects.equals(userName, account.userName) &&
                Objects.equals(password, account.password) &&
                Objects.equals(owner, account.owner) &&
                Objects.equals(animals, account.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, password, owner, animals);
    }
}
