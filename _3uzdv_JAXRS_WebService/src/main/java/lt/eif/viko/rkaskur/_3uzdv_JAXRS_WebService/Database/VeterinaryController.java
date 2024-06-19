package lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.Database;

import lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.VeterinaryRepository;
import lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veterinary")
public class VeterinaryController {

    @Autowired
    private VeterinaryRepository veterinaryRepository;

    // Account endpoints
    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return veterinaryRepository.findAll();
    }

    @GetMapping("/accounts/{id}")
    public Optional<Account> getAccountById(@PathVariable int id) {
        return veterinaryRepository.findById(id);
    }

    @PostMapping("/accounts")
    public Account createAccount(@RequestBody Account account) {
        return veterinaryRepository.save(account);
    }

    @DeleteMapping("/accounts/{id}")
    public void deleteAccount(@PathVariable int id) {
        veterinaryRepository.deleteById(id);
    }

    // Animal endpoints
    @GetMapping("/animals")
    public List<Animal> getAllAnimals() {
        return veterinaryRepository.findAll();
    }

    @GetMapping("/animals/{id}")
    public Optional<Animal> getAnimalById(@PathVariable int id) {
        return veterinaryRepository.findById(id);
    }

    @PostMapping("/animals")
    public Animal createAnimal(@RequestBody Animal animal) {
        return veterinaryRepository.save(animal);
    }

    @DeleteMapping("/animals/{id}")
    public void deleteAnimal(@PathVariable int id) {
        veterinaryRepository.deleteById(id);
    }

    // Owner endpoints
    @GetMapping("/owners")
    public List<Owner> getAllOwners() {
        return veterinaryRepository.findAll();
    }

    @GetMapping("/owners/{id}")
    public Optional<Owner> getOwnerById(@PathVariable int id) {
        return veterinaryRepository.findById(id);
    }

    @PostMapping("/owners")
    public Owner createOwner(@RequestBody Owner owner) {
        return veterinaryRepository.save(owner);
    }

    @DeleteMapping("/owners/{id}")
    public void deleteOwner(@PathVariable int id) {
        veterinaryRepository.deleteById(id);
    }

    // Vet endpoints
    @GetMapping("/vets")
    public List<Vet> getAllVets() {
        return veterinaryRepository.findAll();
    }

    @GetMapping("/vets/{id}")
    public Optional<Vet> getVetById(@PathVariable int id) {
        return veterinaryRepository.findById(id);
    }

    @PostMapping("/vets")
    public Vet createVet(@RequestBody Vet vet) {
        return veterinaryRepository.save(vet);
    }

    @DeleteMapping("/vets/{id}")
    public void deleteVet(@PathVariable int id) {
        veterinaryRepository.deleteById(id);
    }
}
