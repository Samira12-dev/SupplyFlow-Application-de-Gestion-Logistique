package com.example.SupplyFlow.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class StockMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @ManyToOne
    private Produit produit;
    private String type;
    private int quantite;
    private LocalDate datee;

    public StockMovement(){}

    public StockMovement(Long id, String type, int quantite, LocalDate datee) {
        this.id = id;
        this.type = type;
        this.quantite = quantite;
        this.datee = datee;
    }
    public StockMovement(String type, int quantite, LocalDate datee) {
        this.type = type;
        this.quantite = quantite;
        this.datee = datee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public LocalDate getDatee() {
        return datee;
    }

    public void setDatee(LocalDate datee) {
        this.datee = datee;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
