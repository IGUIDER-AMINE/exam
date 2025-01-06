package com.enset.agence_bancaire_Service.repositories;
import com.enset.agence_bancaire_Service.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
public interface CompteRepo extends JpaRepository<Compte, String> {
}