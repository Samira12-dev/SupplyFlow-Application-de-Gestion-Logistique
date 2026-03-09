package com.example.SupplyFlow.stockMovment;

import java.time.LocalDate;

public class StockMovment {
    private int id;
    private String type;
    private int quantite;
    private LocalDate datee;

    public StockMovment(){}

    public StockMovment(int id, String type, int quantite, LocalDate datee) {
        this.id = id;
        this.type = type;
        this.quantite = quantite;
        this.datee = datee;
    }
    public StockMovment( String type, int quantite, LocalDate datee) {
        this.type = type;
        this.quantite = quantite;
        this.datee = datee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
