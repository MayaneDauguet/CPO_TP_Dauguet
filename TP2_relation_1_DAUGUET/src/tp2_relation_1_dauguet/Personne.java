/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_dauguet;

/**
 *
 * @author daugu
 */
public class Personne {
    String nom;
    String prenom;
    Voiture[] liste_voitures; // Tableau de références vers des voitures (maximum 3)
    int nbVoitures; // Nombre de voitures possédées

    // Constructeur qui initialise les attributs
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.liste_voitures = new Voiture[3]; // Initialisation du tableau pour un maximum de 3 voitures
        this.nbVoitures = 0;
    }

    // Méthode pour ajouter une voiture à la liste
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        // Si la voiture a déjà un propriétaire, on ne l'ajoute pas
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("La voiture " + voiture_a_ajouter.modele + " est déjà possédée.");
            return false;
        }
        
        // Si la personne possède déjà 3 voitures, on ne peut pas en ajouter
        if (nbVoitures >= 3) {
            System.out.println("Impossible d'ajouter une nouvelle voiture, " + prenom + " " + nom + " possède déjà 3 voitures.");
            return false;
        }
        
        // Ajout de la voiture dans le tableau
        liste_voitures[nbVoitures] = voiture_a_ajouter; // Ajoute la voiture à la première case libre
        nbVoitures++; // Incrémente le nombre de voitures possédées

        // Définir la voiture comme ayant cette personne comme propriétaire
        voiture_a_ajouter.proprietaire = this;

        System.out.println("La voiture " + voiture_a_ajouter.modele + " a été ajoutée à " + prenom + " " + nom);
        return true;
    }

    // Méthode toString pour afficher les informations de la personne
    @Override
    public String toString() {
        String infoVoitures = (nbVoitures == 0) ? "Aucune voiture" : "Possède " + nbVoitures + " voiture(s)";
        return "Nom : " + nom + ", Prénom : " + prenom + ", " + infoVoitures;
    }
}