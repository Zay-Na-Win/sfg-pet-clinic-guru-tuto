package guru.springframework.sfgpetclinicgurututo.service;

import guru.springframework.sfgpetclinicgurututo.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}