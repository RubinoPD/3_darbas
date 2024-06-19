package lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService;

import lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
