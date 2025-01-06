package com.enset.agence_bancaire_Service.controller;
import com.enset.agence_bancaire_Service.entities.Operation;
import com.enset.agence_bancaire_Service.service.OperationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/operations")
@AllArgsConstructor
public class OperationController {
    private final OperationService operationService;

    @GetMapping
    public List<Operation> getAllOperations() {
        return operationService.getAllOperations();
    }

    @PostMapping
    public Operation createOperation(@RequestBody Operation operation) {
        return operationService.saveOperation(operation);
    }
}

