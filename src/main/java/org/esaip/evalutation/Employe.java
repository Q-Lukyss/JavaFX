package org.esaip.evalutation;

import java.util.Random;

public class Employe extends Personne{
    private int salaire;

    Employe(String nom,String prenom)
    {
        setNom(nom);
        setPrenom(prenom);
        Random random = new Random();
        int nb;
        nb = 1000+random.nextInt(500);
        salaire=1000+ nb;
    }
    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    public void afficher()
    {
        super.afficher();
        System.out.println("code du poste : " +  " salaire :" + salaire);
    }

}
