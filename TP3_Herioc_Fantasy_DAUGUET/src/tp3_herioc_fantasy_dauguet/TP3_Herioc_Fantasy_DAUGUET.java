/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_herioc_fantasy_dauguet;

/**
 *
 * @author daugu
 */
import java.util.ArrayList;
public class TP3_Herioc_Fantasy_DAUGUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Création des deux épées avec des paramètres différents
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        // Création des deux bâtons avec des paramètres différents
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        // Création d'un tableau dynamique pour stocker les armes
        ArrayList<Arme> armes = new ArrayList<>();

        // Ajout des épées et des bâtons au tableau dynamique
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);

        // Affichage des caractéristiques de chaque arme dans le tableau dynamique
        for (Arme arme : armes) {
            System.out.println(arme.toString());
        }
    }
}
