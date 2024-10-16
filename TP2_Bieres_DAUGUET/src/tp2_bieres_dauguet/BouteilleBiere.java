/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_dauguet;

/**
 *
 * @author daugu
 */
public class BouteilleBiere {
    String nom;        // Le nom de la bière
    double degreAlcool; // Le degré d'alcool de la bière
    String brasserie;  // Le nom de la brasserie
    boolean ouverte;   // Indique si la bouteille est ouverte ou non
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
    }
    
    public boolean decapsuler() {
    if (ouverte != true) {  // Si la bouteille n'est pas ouverte
        ouverte = true;  // On la décapsule (on met ouverte à true)
        System.out.println("La biere a ete decapsulee.");
        return true;  // Indique que l'opération a réussi
    } else {  // Si la bouteille est déjà ouverte
        System.out.println("Erreur : biere déjà ouverte.");
        return false;  // Indique que l'opération a échoué
    }
}
}
