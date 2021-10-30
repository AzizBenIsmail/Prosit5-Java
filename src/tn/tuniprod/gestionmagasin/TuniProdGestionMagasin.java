/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class TuniProdGestionMagasin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProduitAliementaire produit1 = new ProduitAliementaire();
        ProduitAliementaire produit2 = new ProduitAliementaire(1021, "Lait", "Delice");
        ProduitAliementaire produit3 = new ProduitAliementaire(2510, "yaourt", "Vitalait");
        ProduitAliementaire produit4 = new ProduitAliementaire(3250, "Tomate", "Sicam", 1.200f);
        ProduitAliementaire produit44 = new ProduitAliementaire(3250, "Tomate", "Sicam", 1.200f);

//        produit2.afficher();
//        
        produit2.affecterPrix(0.7f);
//        
//        produit2.afficher();
//        
//        System.out.println( produit2.toString());
//        System.out.println(produit2);
//        
//        produit2.affecterDateExpiration(new Date(1377249026));
//        System.out.println(produit2.dateExpriration.toString());

//---------------------------------------
        Magasin m1 = new Magasin(12345, "El Aouina");
//        System.out.println(m1);

        m1.ajouterProduit(produit1);
        m1.ajouterProduit(produit2);
        m1.ajouterProduit(produit3);
        m1.ajouterProduit(produit4);
        // m1.ajouterProduit(produit44);

//        System.out.println(m1);
//        
//        System.out.println("Total des Produits  " + m1.getTotalProduits() );
//---------------------------------------
//        System.out.println(produit44.comparer(produit4));
//        
//        System.out.println(Magasin.comparer(produit4,produit2));
//        
//        m1.supprimerProduit(new ProduitAliementaire(98798, "qsd", "qsd"));
//        System.out.println(m1);
//
//        //---------------------------
        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-ville");
        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah6");

//        Caissier caissierC1 = new Caissier(5, 123456, "Ariana", "Mahamed", 36);
//        Caissier caissierC2 = new Caissier(2, 894679, "Tunis", "Ali", 40);
//        Vendeur vendeurC1 = new Vendeur(10, 849895, "Charguia", "Nihel", 50);
//        Responsable responsableC1 = new Responsable(500, 6889566, "Raoued", "taheni", 52);
//
//        Caissier caissierM1 = new Caissier(9, 48912, "Tunis", "Kais", 42);
//        Vendeur vendeurM1 = new Vendeur(15, 9485632, "Bizerte", "Abdou", 15);
//        Responsable responsableM1 = new Responsable(1500, 9821421, "Ghazela", "Mouhaned", 170);
//        System.out.println("SALAIRE :" + responsableM1.getSalaireEmploye());
//        monoprix.ajouterEmploye(caissierC1);
//        monoprix.ajouterEmploye(caissierC2);
//        monoprix.ajouterEmploye(vendeurC1);
//        monoprix.ajouterEmploye(responsableC1);
//
//        carrefour.ajouterEmploye(caissierM1);
//        carrefour.ajouterEmploye(vendeurM1);
//        carrefour.ajouterEmploye(responsableM1);
//        System.out.println("-------------");
//        monoprix.afficherEmployes();
//        System.out.println("-------------");
//        carrefour.afficherEmployes();

//        monoprix.ajouterProduit(produit2);
//        monoprix.ajouterProduit(produit3);
//        carrefour.ajouterProduit(produit3);
//        carrefour.ajouterProduit(produit4);
//        System.out.println("-------------");
//        System.out.println(monoprix);
//        System.out.println("-------------");
//        System.out.println(carrefour);
        ProduitFruit prod1 = new ProduitFruit(12.3f, "mars", 1254, "Fraise", "", 0);
        ProduitFruit prod2 = new ProduitFruit(50f, "juin", 1224, "Pastèque", "", 0);
        ProduitFruit prod3 = new ProduitFruit(25.6f, "décembre", 7896, "Mandarine", "", 0);
        ProduitLegume prod4 = new ProduitLegume(14f, "janvier", 8521, "Artichauts", "", 0);

        carrefour.ajouterProduit(prod1);
        carrefour.ajouterProduit(prod2);
        carrefour.ajouterProduit(prod3);
        carrefour.ajouterProduit(prod4);
        
        System.out.println("LE PRODUIT EST FRAIS : "+prod4.estFrais("février"));
        

        System.out.println("LE TOTAL DES FRUITS :" + carrefour.calculStock());

    }

}
