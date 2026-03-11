package com.example.SupplyFlow.service;

import com.example.SupplyFlow.model.Produit;
import com.example.SupplyFlow.model.StockMovement;
import com.example.SupplyFlow.repository.ProduitRepository;
import com.example.SupplyFlow.repository.StockMovementRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class StockMovementService {
    private final StockMovementRepo movementRepo;
    private  final ProduitRepository produitRepository;

    public StockMovementService(StockMovementRepo movementRepo,
                                ProduitRepository produitRepository){
        this.movementRepo=movementRepo;
        this.produitRepository=produitRepository;
    }

    public void saveMovement(StockMovement movement){
        Produit pr= movement.getProduit();
        if(movement.getType().equalsIgnoreCase("ENTREE")){
            pr.setQuantite(pr.getQuantite() + movement.getQuantite());
        }
       else if(movement.getType().equalsIgnoreCase("SORTIE")){
            pr.setQuantite(pr.getQuantite() - movement.getQuantite());
        }

        produitRepository.save(pr);
        movement.setDatee(LocalDate.now());
        movementRepo.save(movement);
    }
    public List<StockMovement> getAllMovement(){
        return movementRepo.findAll();
    }
}
