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
        // TODO code application logic here
        // Création des voitures
        // Création des voitures
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Voiture uneC3 = new Voiture("C3", "Citroën", 6);  // Nouvelle voiture pour Bob
        Voiture une208 = new Voiture("208", "Peugeot", 7);  // Nouvelle voiture pour Reno
        Voiture uneMegane = new Voiture("Mégane", "Renault", 7); // Nouvelle voiture pour Reno

        // Affichage des voitures disponibles
        System.out.println("Liste des voitures disponibles :\n" + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra + "\n" + uneC3 + "\n" + une208 + "\n" + uneMegane);

        // Création des personnes
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        // Assignation des voitures à Bob
        bob.ajouterVoiture(uneClio);  // Bob reçoit une Clio
        bob.ajouterVoiture(uneMicra); // Bob reçoit une Micra
        bob.ajouterVoiture(uneC3);    // Bob reçoit une C3

        // Assignation des voitures à Reno
        reno.ajouterVoiture(une2008); // Reno reçoit une 2008
        reno.ajouterVoiture(uneAutreClio); // Reno reçoit une autre Clio
        reno.ajouterVoiture(une208); // Reno reçoit une 208
        reno.ajouterVoiture(uneMegane); // Reno reçoit une Mégane

        // Affichage des informations sur les personnes et leurs voitures
        System.out.println("\nInformations sur les personnes :\n" + bob + "\n" + reno);
        System.out.println("\nDétails des voitures après assignation :");
        System.out.println(uneClio);   // Affiche la voiture de Bob
        System.out.println(uneMicra);  // Affiche la voiture de Bob
        System.out.println(uneC3);     // Affiche la voiture de Bob
        System.out.println(une2008);   // Affiche la voiture de Reno
        System.out.println(uneAutreClio); // Affiche la voiture de Reno
        System.out.println(une208);    // Affiche la voiture de Reno
        System.out.println(uneMegane); // Affiche la voiture de Reno
    }
}