package com.enset.commercant_service.repositories;

import com.enset.commercant_service.entities.Cheque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ChequeRepo extends JpaRepository<Cheque, String> {
}
