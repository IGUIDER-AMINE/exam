package com.enset.agence_bancaire_Service.repositories;
import com.enset.agence_bancaire_Service.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepo extends JpaRepository<Compte, String> {
}