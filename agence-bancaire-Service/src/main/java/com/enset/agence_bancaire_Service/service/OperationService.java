package com.enset.agence_bancaire_Service.service;
import com.enset.agence_bancaire_Service.entities.Operation;
import com.enset.agence_bancaire_Service.repositories.OperationRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OperationService {
    private final OperationRepo operationRepo;

    public List<Operation> getAllOperations() {
        return operationRepo.findAll();
    }

    public Operation saveOperation(Operation operation) {
        return operationRepo.save(operation);
    }
}
