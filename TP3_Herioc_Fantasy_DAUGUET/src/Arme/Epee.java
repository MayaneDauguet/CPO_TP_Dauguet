/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *
 * @author daugu
 */
public class Epee extends Arme {
    private int finesse;

    // Constructeur
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);  // Appel du constructeur de la classe parente Arme
        if (finesse >= 0 && finesse < 100) {
            this.finesse = finesse;
        } else {
            throw new IllegalArgumentException("La finesse doit être comprise entre 0 et 99.");
        }
    }

    // Accesseur pour la finesse
    public int getFinesse() {
        return finesse;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return super.toString() + ", finesse=" + finesse + '}';
    }
}
