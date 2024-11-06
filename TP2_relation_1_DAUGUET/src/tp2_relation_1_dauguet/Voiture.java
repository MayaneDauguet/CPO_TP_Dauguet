/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_dauguet;

/**
 *
 * @author daugu
 */
public class Voiture {
    String modele;
    String marque;
    int puissanceCV;
    Personne proprietaire; // Référence vers le propriétaire de type Personne, initialisé à null

    // Constructeur qui initialise les attributs
    public Voiture(String modele, String marque, int puissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.puissanceCV = puissanceCV;
        this.proprietaire = null; // Initialisation du propriétaire à null
    }

    // Méthode pour définir le propriétaire
    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    // Méthode toString pour afficher les informations de la voiture
    @Override
    public String toString() {
        String infoProprietaire = (proprietaire != null) ? "Propriétaire : " + proprietaire.nom + " " + proprietaire.prenom : "Pas de propriétaire";
        return "Modèle : " + modele + ", Marque : " + marque + ", Puissance : " + puissanceCV + " CV, " + infoProprietaire;
    }
}
