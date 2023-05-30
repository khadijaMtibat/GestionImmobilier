package com.example.GestionImmobilier.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Propriete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_prop;

    private String adresse;
    private String type;
    private String superficie;
    private double prix;
    private boolean disponible;

    @ManyToOne
    private Locateur locateur;



    @Override
    public String toString() {
        return "Propriete{" +
                "id_prop=" + id_prop +
                ", adresse='" + adresse + '\'' +
                ", type='" + type + '\'' +
                ", superficie='" + superficie + '\'' +
                ", prix=" + prix +
                ", disponible=" + disponible +
                '}';
    }

    public Propriete(String adresse, String type, String superficie, double prix, boolean disponible) {
        super();
        this.adresse = adresse;
        this.type = type;
        this.superficie = superficie;
        this.prix = prix;
        this.disponible = disponible;
    }

    public Propriete() {
        super();
    }

    public Long getId_prop() {
        return id_prop;
    }

    public void setId_prop(Long id_prop) {
        this.id_prop = id_prop;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
