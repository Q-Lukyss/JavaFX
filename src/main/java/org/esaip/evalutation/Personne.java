package org.esaip.evalutation;

import java.io.Serializable;
import java.time.LocalDate;

public class Personne implements Serializable {


    private  String prenom;
    private  String nom;
    private LocalDate dateNaissance;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    protected void afficher() {
        System.out.println(prenom + " "+ nom + " né(e) le "+dateNaissance);
    }
}
