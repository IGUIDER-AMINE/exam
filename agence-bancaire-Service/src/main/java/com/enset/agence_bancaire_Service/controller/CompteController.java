package com.enset.agence_bancaire_Service.controller;

import com.enset.agence_bancaire_Service.entities.Compte;
import com.enset.agence_bancaire_Service.service.CompteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comptes")
@AllArgsConstructor
public class CompteController {
    private final CompteService compteService;

    @GetMapping
    public List<Compte> getAllComptes() {
        return compteService.getAllComptes();
    }

    @GetMapping("/{numero}")
    public ResponseEntity<Compte> getCompteByNumero(@PathVariable String numero) {
        return compteService.getCompteByNumero(numero)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Compte createCompte(@RequestBody Compte compte) {
        return compteService.saveCompte(compte);
    }

    @DeleteMapping("/{numero}")
    public ResponseEntity<Void> deleteCompte(@PathVariable String numero) {
        compteService.deleteCompte(numero);
        return ResponseEntity.noContent().build();
    }
}
