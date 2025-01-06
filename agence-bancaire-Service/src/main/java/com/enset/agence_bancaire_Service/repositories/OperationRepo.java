package com.enset.agence_bancaire_Service.repositories;

import com.enset.agence_bancaire_Service.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepo extends JpaRepository<Operation, Long> {
}