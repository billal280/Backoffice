package com.example.api.model;

import javax.persistence.*;


@Entity
public class Billet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String categorie;
    private double prix;

    public Joueur() {}

    public Billet(String type, String categorie, double prix) {
        this.type = type;
        this.categorie = categorie;
        this.prix = prix;
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

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void afficherDetailsBillet() {
        System.out.println("Le billet est de type : " + type);
        System.out.println("Le billet est de catégorie : " + categorie);
        System.out.println("Le prix du billet est de : " + prix);
        // Affichage du logo ici (à implémenter selon les besoins)
    }
}
