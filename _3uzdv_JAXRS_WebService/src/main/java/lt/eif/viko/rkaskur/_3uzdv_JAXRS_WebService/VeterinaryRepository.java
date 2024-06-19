package lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService;


import lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing computer shop accounts.
 * Extends JpaRepository to inherit common CRUD operations for Account entities.
 */
public interface VeterinaryRepository extends JpaRepository<Account, Integer> {

}
