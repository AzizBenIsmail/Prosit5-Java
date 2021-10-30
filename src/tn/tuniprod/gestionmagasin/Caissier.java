/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

/**
 *
 * @author ACER
 */
public class Caissier  extends Employe{
    int numeroDeCaisse;

    public Caissier(int numeroDeCaisse, int identifiant, String adresse, String nom, int nbrHeure) {
        super(identifiant, adresse, nom, nbrHeure);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public String toString() {
        return "Caissier{" + "numeroDeCaisse=" + numeroDeCaisse + '}' + super.toString();
    }
    
      public float getSalaireEmploye() {
        float salaire = 0;
        int nbrHeureSup = 0;
        int nbrDeBase = 0;
        if (nbrHeure > 180) {
            nbrHeureSup = nbrHeure - 180;
            nbrDeBase = 180;
        } else {
            nbrHeureSup = 0;
            nbrDeBase = nbrHeure;
        }
        salaire = (float) ((nbrDeBase * 10) + (10 * 1.15 * nbrHeureSup));
        return salaire;
    }

    
    
}
