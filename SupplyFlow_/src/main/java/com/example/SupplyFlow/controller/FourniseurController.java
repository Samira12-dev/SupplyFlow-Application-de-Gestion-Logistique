package com.example.SupplyFlow.controller;

import com.example.SupplyFlow.service.FourniseurService;
import com.example.SupplyFlow.model.Fourniseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping(path = "api/v1/fourniseur")
public class FourniseurController {

    private final FourniseurService fourniseurService;

    @Autowired
    public  FourniseurController(FourniseurService fourniseurService){
        this.fourniseurService= fourniseurService;
    }
    @GetMapping("/fourniseur")
    public String listFourniseurs(Model model){
        model.addAttribute("fourniseur",fourniseurService.getAllFourniseur());
        return "fourniseur";
    }
    @GetMapping("/add-fourniseur")
    public String afficherForm(Model model){
        model.addAttribute("fourniseur",new Fourniseur());
        return "Ajouter_fourniseur";
    }
    @PostMapping("/save_fourniseur")
    public String saveFourninseur(@ModelAttribute Fourniseur fourniseur){
        fourniseurService.saveFourniseur(fourniseur);
        return "redirect:/products";
    }
    @GetMapping("/delete-fourniseur/{id}")
    public String deleteFourniseur(@PathVariable Long id){
        fourniseurService.deleteFourniseur(id);
        return "redirect:/products";
    }


}

