package com.example.SupplyFlow.fourniseur;

public class Fourniseur {
    private  int id;
    private  String nom;
    private String ville;
    private String telephone;

    public Fourniseur(){}

    public Fourniseur(int id, String nom, String telephone, String ville) {
        this.id = id;
        this.nom = nom;
        this.telephone = telephone;
        this.ville = ville;
    }

    public Fourniseur(String nom, String ville, String telephone) {
        this.nom = nom;
        this.ville = ville;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Fourniseur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", ville='" + ville + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
