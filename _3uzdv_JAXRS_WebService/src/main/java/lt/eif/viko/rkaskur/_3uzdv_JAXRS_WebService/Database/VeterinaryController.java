package lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.Database;

import lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.AnimalRepository;
import lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.OwnerRepository;
import lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.VetRepository;
import lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller for handling Veterinary related requests.
 */
@RestController
@RequestMapping("/veterinary")
public class VeterinaryController {

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private VetRepository vetRepository;

    // Animal endpoints

    /**
     * Retrieves a list of all animals.
     * @return a list of animals.
     */
    @GetMapping("/animals")
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    /**
     * Retrieves an animal by its ID.
     * @param id the ID of the animal.
     * @return the animal with the specified ID.
     */
    @GetMapping("/animals/{id}")
    public Optional<Animal> getAnimalById(@PathVariable int id) {
        return animalRepository.findById(id);
    }

    /**
     * Creates a new animal.
     * @param animal the animal to create.
     * @return the created animal.
     */
    @PostMapping("/animals")
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    /**
     * Deletes an animal by its ID.
     * @param id the ID of the animal to delete.
     */
    @DeleteMapping("/animals/{id}")
    public void deleteAnimal(@PathVariable int id) {
        animalRepository.deleteById(id);
    }

    // Owner endpoints

    /**
     * Retrieves a list of all owners.
     * @return a list of owners.
     */
    @GetMapping("/owners")
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    /**
     * Retrieves an owner by its ID.
     * @param id the ID of the owner.
     * @return the owner with the specified ID.
     */
    @GetMapping("/owners/{id}")
    public Optional<Owner> getOwnerById(@PathVariable int id) {
        return ownerRepository.findById(id);
    }

    /**
     * Creates a new owner.
     * @param owner the owner to create.
     * @return the created owner.
     */
    @PostMapping("/owners")
    public Owner createOwner(@RequestBody Owner owner) {
        return ownerRepository.save(owner);
    }

    /**
     * Deletes an owner by its ID.
     * @param id the ID of the owner to delete.
     */
    @DeleteMapping("/owners/{id}")
    public void deleteOwner(@PathVariable int id) {
        ownerRepository.deleteById(id);
    }

    // Vet endpoints

    /**
     * Retrieves a list of all vets.
     * @return a list of vets.
     */
    @GetMapping("/vets")
    public List<Vet> getAllVets() {
        return vetRepository.findAll();
    }

    /**
     * Retrieves a vet by its ID.
     * @param id the ID of the vet.
     * @return the vet with the specified ID.
     */
    @GetMapping("/vets/{id}")
    public Optional<Vet> getVetById(@PathVariable int id) {
        return vetRepository.findById(id);
    }

    /**
     * Creates a new vet.
     * @param vet the vet to create.
     * @return the created vet.
     */
    @PostMapping("/vets")
    public Vet createVet(@RequestBody Vet vet) {
        return vetRepository.save(vet);
    }

    /**
     * Deletes a vet by its ID.
     * @param id the ID of the vet to delete.
     */
    @DeleteMapping("/vets/{id}")
    public void deleteVet(@PathVariable int id) {
        vetRepository.deleteById(id);
    }
}
