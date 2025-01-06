package com.enset.banquecentrale_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AgenceBancaire {
    @Id
    private String id;
    private String nom;
    private String ville;
    private String urlWebService;
}
