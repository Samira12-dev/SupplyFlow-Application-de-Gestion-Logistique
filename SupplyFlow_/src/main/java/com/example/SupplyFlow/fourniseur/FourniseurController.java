package com.example.SupplyFlow.fourniseur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/fourniseur")
public class FourniseurController {
    @GetMapping
    public List<Fourniseur> getFourniseurs(){
        return List.of(new Fourniseur(
                1,
                "samira",
                "Beni mellal",
                "021345333")
        ) ;
    }

}

