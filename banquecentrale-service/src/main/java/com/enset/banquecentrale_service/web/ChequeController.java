package com.enset.banquecentrale_service.web;

import com.enset.banquecentrale_service.entities.AgenceBancaire;
import com.enset.banquecentrale_service.repositories.AgenceBancaireRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@RestController
//@RequestMapping("/api")
public class ChequeController {
    AgenceBancaireRepo agenceBancaireRepo;
    ChequeController (AgenceBancaireRepo agenceBancaireRepo){
        this.agenceBancaireRepo=agenceBancaireRepo;
    }
    @GetMapping("/cheques")
    List<AgenceBancaire> ChequeList(){
        return agenceBancaireRepo.findAll();
    }
    @GetMapping("/cheques/{id}")
    AgenceBancaire getProductById(@PathVariable String id){
        return agenceBancaireRepo.findById(id).get();
    }

}
