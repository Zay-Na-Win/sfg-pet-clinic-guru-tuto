package guru.springframework.sfgpetclinicgurututo.repository;

import guru.springframework.sfgpetclinicgurututo.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
