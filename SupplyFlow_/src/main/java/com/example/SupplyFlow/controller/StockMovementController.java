package com.example.SupplyFlow.controller;

import com.example.SupplyFlow.model.StockMovement;
import com.example.SupplyFlow.service.ProduitService;
import com.example.SupplyFlow.service.StockMovementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class StockMovementController {
    private StockMovementService stockservice;
    private ProduitService produitService;

    public StockMovementController(StockMovementService stockservice,ProduitService produitService){
        this.stockservice=stockservice;
        this.produitService= produitService;
    }

    @GetMapping("/movements")
    public String listMovement(Model model){
        model.addAttribute("movements",stockservice.getAllMovement());
        return "movements";
    }
    @GetMapping("/add-movement")
    public String showForm(Model model){
        model.addAttribute("movement",new StockMovement());
        model.addAttribute("products", produitService.getAllProduit());
        return "Ajouter_movement";
    }
    @PostMapping("/save-movement")
    public String saveMovement(@ModelAttribute StockMovement movement){
        stockservice.saveMovement(movement);
        return "redirect:/products";
    }
}
