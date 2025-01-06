package com.enset.agence_bancaire_Service.entities;
import com.enset.agence_bancaire_Service.enums.TypeOperation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Operation ID
    private Date date; // Date of the operation
    private double montant; // Amount
    private String numeroCheque; // Check number
    @Enumerated(EnumType.STRING)
    private TypeOperation type; // Type of operation (DEBIT, CREDIT, CERTIFICATION_CHEQUE)
    private String description; // Description

    @ManyToOne
    @JoinColumn(name = "compte_id")
    private Compte compte; // Associated account
}
