package guru.springframework.sfgpetclinicgurututo.service;

import guru.springframework.sfgpetclinicgurututo.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}