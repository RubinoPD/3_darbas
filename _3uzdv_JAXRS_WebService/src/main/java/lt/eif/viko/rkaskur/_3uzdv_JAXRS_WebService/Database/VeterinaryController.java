package lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.Database;

import lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.AnimalRepository;
import lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.OwnerRepository;
import lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.VetRepository;
import lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/animals")
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    @GetMapping("/animals/{id}")
    public Optional<Animal> getAnimalById(@PathVariable int animal_id) {
        return animalRepository.findById(animal_id);
    }

    @PostMapping("/animals")
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    @DeleteMapping("/animals/{id}")
    public void deleteAnimal(@PathVariable int animal_id) {
        animalRepository.deleteById(animal_id);
    }

    // Owner endpoints
    @GetMapping("/owners")
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    @GetMapping("/owners/{id}")
    public Optional<Owner> getOwnerById(@PathVariable int owner_id) {
        return ownerRepository.findById(owner_id);
    }

    @PostMapping("/owners")
    public Owner createOwner(@RequestBody Owner owner) {
        return ownerRepository.save(owner);
    }

    @DeleteMapping("/owners/{id}")
    public void deleteOwner(@PathVariable int owner_id) {
        ownerRepository.deleteById(owner_id);
    }

    // Vet endpoints
    @GetMapping("/vets")
    public List<Vet> getAllVets() {
        return vetRepository.findAll();
    }

    @GetMapping("/vets/{id}")
    public Optional<Vet> getVetById(@PathVariable int vet_id) {
        return vetRepository.findById(vet_id);
    }

    @PostMapping("/vets")
    public Vet createVet(@RequestBody Vet vet) {
        return vetRepository.save(vet);
    }

    @DeleteMapping("/vets/{id}")
    public void deleteVet(@PathVariable int vet_id) {
        vetRepository.deleteById(vet_id);
    }
}
