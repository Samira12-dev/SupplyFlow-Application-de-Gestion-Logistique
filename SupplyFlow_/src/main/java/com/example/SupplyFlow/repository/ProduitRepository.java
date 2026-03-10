package com.example.SupplyFlow.repository;
import com.example.SupplyFlow.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}