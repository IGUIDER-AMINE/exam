package com.enset.agence_bancaire_Service.entities;

import com.enset.agence_bancaire_Service.enums.TypeCompte;
import jakarta.persistence.*;
        import lombok.*;

        import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Table(name = "comptes")
public class Compte {
    @Id
    private String numero; // Account number
    private double solde;  // Balance
    private String referenceClient; // Client reference
    @Enumerated(EnumType.STRING)
    private TypeCompte type; // Type of account (COURANT, EPARGNE)

    @OneToMany(mappedBy = "compte", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Operation> operations; // Operations linked to the account

}
