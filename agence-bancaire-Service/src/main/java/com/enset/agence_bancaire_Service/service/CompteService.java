package com.enset.agence_bancaire_Service.service;

import com.enset.agence_bancaire_Service.entities.Compte;
import com.enset.agence_bancaire_Service.repositories.CompteRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CompteService {
    private final CompteRepo compteRepo;

    public List<Compte> getAllComptes() {
        return compteRepo.findAll();
    }

    public Optional<Compte> getCompteByNumero(String numero) {
        return compteRepo.findById(numero);
    }

    public Compte saveCompte(Compte compte) {
        return compteRepo.save(compte);
    }

    public void deleteCompte(String numero) {
        compteRepo.deleteById(numero);
    }
}
