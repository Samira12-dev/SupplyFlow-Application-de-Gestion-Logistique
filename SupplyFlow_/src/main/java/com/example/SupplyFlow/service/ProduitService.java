package com.example.SupplyFlow.service;

import com.example.SupplyFlow.model.Produit;
import com.example.SupplyFlow.repository.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    private final ProduitRepository produitRepository;

    public ProduitService(ProduitRepository produitRepository){
        this.produitRepository=produitRepository;
    }

    public Produit getById(Long id){
        return produitRepository.findById(id).orElse(null);
    }

    public List<Produit> getAllProduit(){
        return produitRepository.findAll();
    }
    public void saveProduit( Produit produit){
         produitRepository.save(produit);
    }

    public void deleteById(Long id){
        produitRepository.deleteById(id);
    }

    public void updateProduit(Long id, Produit updateProduit){
        Produit existingProduit= produitRepository.findById(id).orElseThrow(()->
                new RuntimeException("Produit not found"));

        existingProduit.setNom(updateProduit.getNom());
        existingProduit.setCategorie(updateProduit.getCategorie());
        existingProduit.setPrix(updateProduit.getPrix());
        existingProduit.setQuantite(updateProduit.getQuantite());

        produitRepository.save(existingProduit);
    }
}
