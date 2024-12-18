/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Arme.Arme;
import Arme.Epee;        
/**
 *
 * @author daugu
 */
public class Guerrier extends Personnage {
    static int nbGuerriers = 0;

// Attribut spécifique au Guerrier
    boolean aCheval;

    // Constructeur
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);  // Appel du constructeur de Personnage
        this.aCheval = aCheval;
        nbGuerriers++;
    }

    public static int getNbGuerriers() {
        return nbGuerriers;
    }
    
    @Override
    protected void finalize() throws Throwable {  // **Ajout de la méthode finalize**
        // Décrémenter le nombre de guerriers lors de la destruction
        nbGuerriers--;
        System.out.println("Un guerrier a été détruit. Il reste " + nbGuerriers + " guerriers.");  // **Affichage d'un message**
        super.finalize();  // **Appel au destructeur de la classe parente**
    }
   
    @Override
    public Class<? extends Arme> typeArmePredilection() {
        return Epee.class;  // Le guerrier préfère les épées
    }
   
    @Override
    public int compterArmesPredilection() {
        int count = 0;
        for (Arme arme : super.inventaire) {
            if (arme instanceof Epee) {
                count++;
            }
        }
        return count;  // Nombre d'épées dans l'inventaire
    }
   
    public boolean isACheval() {
    return aCheval;  // retourne true si le guerrier est à cheval
}

   @Override
    public String toString() {
        return super.toString() + ", À cheval : " + aCheval;
    }

    @Override
    public boolean estrVivant() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
