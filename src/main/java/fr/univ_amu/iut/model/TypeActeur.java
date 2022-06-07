package fr.univ_amu.iut.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TypeActeur {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    int id;
    @Column(name = "Nom")
    String nom;

    public TypeActeur(String nom) {
        this.nom = nom;
    }

    public TypeActeur() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
