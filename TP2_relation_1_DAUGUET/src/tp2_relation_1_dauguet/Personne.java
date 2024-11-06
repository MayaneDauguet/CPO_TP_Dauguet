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
        this.nbVoitures = 0; // Initialisation du nombre de voitures à 0
    }

    // Méthode pour ajouter une voiture à la liste
    public void ajouterVoiture(Voiture voiture) {
        if (nbVoitures < 3) {
            liste_voitures[nbVoitures] = voiture;
            voiture.setProprietaire(this); // Définit la personne comme propriétaire de la voiture
            nbVoitures++;
        } else {
            System.out.println("Impossible d'ajouter plus de 3 voitures pour " + prenom + " " + nom);
        }
    }

    // Méthode toString pour afficher les informations de la personne
    @Override
    public String toString() {
        String infoVoitures = (nbVoitures == 0) ? "Aucune voiture" : "Possède " + nbVoitures + " voiture(s)";
        return "Nom : " + nom + ", Prénom : " + prenom + ", " + infoVoitures;
    }
}