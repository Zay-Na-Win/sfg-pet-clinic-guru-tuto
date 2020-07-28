package guru.springframework.sfgpetclinicgurututo.repository;

import guru.springframework.sfgpetclinicgurututo.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
