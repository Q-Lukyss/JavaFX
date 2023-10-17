package org.esaip.evalutation;

import java.io.Serializable;
import java.util.Date;

public class Personne implements Serializable {


    private  String prenom;
    private  String nom;
    private Date dateNaissance;

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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    protected void afficher() {
        System.out.println(prenom + " "+ nom + " né(e) le "+dateNaissance);
    }
}
