package com.enset.commercant_service.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cheque {
    @Id
    private String id;
    private String numeroCheque;
    private String codeBanque;
    private String numeroCompte;
    private String nomClient;
    private Double montant;
    private boolean estCertifie;
}
