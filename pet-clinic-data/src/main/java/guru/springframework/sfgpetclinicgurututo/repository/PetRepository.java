package guru.springframework.sfgpetclinicgurututo.repository;

import guru.springframework.sfgpetclinicgurututo.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
