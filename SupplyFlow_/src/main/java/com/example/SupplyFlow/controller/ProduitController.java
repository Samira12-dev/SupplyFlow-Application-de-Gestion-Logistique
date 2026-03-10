package com.example.SupplyFlow.controller;

import com.example.SupplyFlow.model.Produit;
import com.example.SupplyFlow.service.FourniseurService;
import com.example.SupplyFlow.service.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProduitController {

    private final ProduitService produitService;
    private final FourniseurService fourniseurService;


    public ProduitController(ProduitService produitService, FourniseurService fourniseurService){
        this.produitService = produitService;
        this.fourniseurService=fourniseurService;
    }

    @GetMapping("/products")
    public String listProducts(Model model){
        model.addAttribute("products", produitService.getAllProduit());
        model.addAttribute("fourniseurs", fourniseurService.getAllFourniseur());

        return "products";
    }

    @PostMapping("/save_product")
    public String saveProduct(@ModelAttribute Produit produit){
        produitService.saveProduit(produit);
        return "redirect:/products";
    }

    @GetMapping("/delete-product/{id}")
    public String deletProduit(@PathVariable Long id){
        produitService.deleteById(id);
        return "redirect:/products";
    }

    @GetMapping("/add-product")
    public String afficherAjouterForm(Model model){
        model.addAttribute("product",new Produit());
        return "Ajouter_product";
    }

    @GetMapping("/edit-product/{id}")
    public String modifiyForm(@PathVariable Long id, Model model){
        Produit produit=produitService.getById(id);
        model.addAttribute("product",produit);
        return "edit_product";
    }

    @PostMapping("/update-product/{id}")
    public  String updateProdcut(@PathVariable Long id, @ModelAttribute Produit produit){
        produitService.updateProduit(id,produit);
        return "redirect:/products";
    }
}