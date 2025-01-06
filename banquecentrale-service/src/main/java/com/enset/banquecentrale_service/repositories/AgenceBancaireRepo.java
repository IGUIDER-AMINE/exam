package com.enset.banquecentrale_service.repositories;

import com.enset.banquecentrale_service.entities.AgenceBancaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AgenceBancaireRepo extends JpaRepository<AgenceBancaire, String> {
}
