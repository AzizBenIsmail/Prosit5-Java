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
public class Magasin {

    int identifiant;
    String adresse;
    int capacite;
    int nbrEmploye;
    String nom;

    ProduitAliementaire[] produits;
    Employe[] employes = new Employe[20];

    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.produits = new ProduitAliementaire[50];
    }

    public Magasin(int identifiant, String nom, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.produits = new ProduitAliementaire[50];
        this.nom = nom;
    }

    @Override
    public String toString() {
        String s = "";
        s += "NOM MAGASIN : " + this.nom + " \n";
        s += "identifiant : " + this.identifiant + " \n";
        s += "adresse : " + this.adresse + " \n";
        s += "capacite : " + this.capacite + " \n";

        String prods = "";
        for (int i = 0; i < this.capacite; i++) {
            prods += this.produits[i];
        }

        String empl = "";
        for (int i = 0; i < this.nbrEmploye; i++) {
            empl += this.employes[i];
        }

        return s + prods + "\n" + empl;
    }

    public void ajouterProduit(ProduitAliementaire produit) {
        if (this.chercher(produit)) {
            System.out.println("Produit existant");
        } else {
            this.produits[capacite] = produit;
            this.capacite++;
        }
    }

    public void ajouterEmploye(Employe employe) {
        this.employes[nbrEmploye] = employe;
        this.nbrEmploye++;
    }

    public int getIndexOfProduit(ProduitAliementaire produit) {
        for (int i = 0; i < this.capacite; i++) {
            if (this.produits[i].comparer(produit)) {
                return i;
            }
        }
        return -1;
    }

    public void supprimerProduit(ProduitAliementaire produit) {
        int indexProduit = this.getIndexOfProduit(produit);
        if (indexProduit == -1) {
            System.out.println("impossible de supprimer un produit qui n'existe pas dans le magasin");
        } else {
            for (int i = indexProduit; i < capacite; i++) {
                this.produits[i] = this.produits[i + 1];
                this.produits[capacite] = null;
                this.capacite--;
            }
        }
    }

    public int getTotalProduits() {
        return this.capacite;
    }

    public static boolean comparer(ProduitAliementaire produit, ProduitAliementaire produit2) {
        return produit2.getIdentifiant() == produit.getIdentifiant()
                && produit2.getPrix() == produit.getPrix()
                && produit2.getLibelle() == produit.getLibelle();
    }

    public boolean chercher(ProduitAliementaire produit) {
        for (int i = 0; i < this.capacite; i++) {
            if (this.produits[i].comparer(produit)) {
                return true;
            }
        }
        return false;
    }

    public Magasin comparer(Magasin m) {
        if (this.capacite >= m.capacite) {
            return this;
        } else {
            return m;
        }
    }

    public void afficherEmployes() {
        for (int i = 0; i < nbrEmploye; i++) {
            System.out.println(employes[i]);
        }
    }

    public float calculStock() {
        float total = 0;
        for (int i = 0; i < this.capacite; i++) {
            if (this.produits[i].determinerTypeProduit().equals("Fruit")) {
                total += ((ProduitFruit) this.produits[i]).quantite;
            }
        }

        return total;
    }

}
