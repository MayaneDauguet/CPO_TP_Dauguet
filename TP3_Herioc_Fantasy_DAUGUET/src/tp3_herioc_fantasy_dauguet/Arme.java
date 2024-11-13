/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_herioc_fantasy_dauguet;

/**
 *
 * @author daugu
 */
public class Arme {
    private String nom;
    private int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque >= 0 && niveauAttaque <= 100) {
            this.niveauAttaque = niveauAttaque;
        }else {
            throw new IllegalArgumentException("Le niveau d'attaque doit être compris entre 0 et 100.");
        }
    }
    
    public int getNiveauAttaque() {
        return niveauAttaque;
    }
    
      public String getNom() {
        return nom;
    }
      
    @Override
    public String toString() {
        return "Arme{" + "nom='" + nom + '\'' + ", niveau d'attaque=" + niveauAttaque + '}';
    }
}
