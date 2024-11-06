/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_dauguet;

/**
 *
 * @author daugu
 */
public class TP2_relation_1_DAUGUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création des voitures
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        // Création des personnes
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        // Tentative d'ajout de voitures
        System.out.println("\nTentatives d'ajout de voitures :");

        // Ajout d'une voiture à Bob
        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(uneMicra);

        // Tentative d'ajouter une voiture à Reno
        reno.ajouter_voiture(une2008);

        // Tentative d'ajouter une voiture qui a déjà un propriétaire (volée) à Bob
        bob.ajouter_voiture(uneAutreClio); // La voiture n'a pas de propriétaire, donc elle est ajoutée correctement
        uneClio.proprietaire = bob; // Changer le propriétaire de la Clio pour la rendre "déjà possédée"
        bob.ajouter_voiture(uneClio); // Cette fois, la Clio ne peut pas être ajoutée car elle a un propriétaire

        // Affichage des informations sur les personnes et leurs voitures
        System.out.println("\nInformations sur les personnes :\n" + bob + "\n" + reno);

        // Affichage des voitures de Bob et Reno
        System.out.println("\nDétails des voitures après assignation :");
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println(bob.liste_voitures[i]);
        }

        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println(reno.liste_voitures[i]);
        }
    }
}