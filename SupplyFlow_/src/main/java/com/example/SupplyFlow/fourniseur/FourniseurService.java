package com.example.SupplyFlow.fourniseur;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FourniseurService {
    public List<Fourniseur> getFourniseurs(){
        return List.of(new Fourniseur(
                1,
                "samira",
                "Beni mellal",
                "021345333")
        ) ;
    }
}
