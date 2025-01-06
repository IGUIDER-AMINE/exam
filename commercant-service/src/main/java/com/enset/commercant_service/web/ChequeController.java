package com.enset.commercant_service.web;


import com.enset.commercant_service.entities.Cheque;
import com.enset.commercant_service.repositories.ChequeRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/api")
public class ChequeController {
    ChequeRepo chequeRepo;
    ChequeController (ChequeRepo chequeRepo){
        this.chequeRepo=chequeRepo;
    }
    @GetMapping("/cheques")
    List<Cheque> ChequeList(){
        return chequeRepo.findAll();
    }
    @GetMapping("/cheques/{id}")
    Cheque getProductById(@PathVariable String id){
        return chequeRepo.findById(id).get();
    }

}
