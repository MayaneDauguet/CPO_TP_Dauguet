/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_dauguet1;


import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author daugu
 */
public class TP1_GuessMyNumber_DAUGUET1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner scanner = new Scanner(System.in);

        // Demander le niveau de difficulté
        System.out.println("Choisissez un niveau de difficulte : facile, normal, difficile");
        String difficulte = scanner.nextLine().toLowerCase();

        int maxTentatives = Integer.MAX_VALUE;  // Par défaut, illimité
        int maxRange = 100;  // Par défaut, entre 0 et 100

        // Choix du niveau de difficulté
        switch (difficulte) {
            case "facile":
                maxRange = 50;  // Nombre entre 0 et 50
                break;
            case "normal":
                maxRange = 100;  // Nombre entre 0 et 100
                break;
            case "difficile":
                maxRange = 100;
                maxTentatives = 5;  // Seulement 5 tentatives autorisées
                break;
            default:
                System.out.println("Niveau de difficulte inconnu. Mode normal active.");
                break;
        }

        // Générer un nombre aléatoire selon la plage définie
        int nombreADeviner = generateurAleat.nextInt(maxRange + 1);
        int tentative;
        int compteur = 0;

        System.out.println("Devinez le nombre entre 0 et " + maxRange + " : ");

        // Boucle principale de jeu avec gestion du nombre de tentatives
        while (compteur < maxTentatives) {
            tentative = scanner.nextInt();
            compteur++;

            if (tentative < nombreADeviner) {
                System.out.println("Trop petit !");
            } else if (tentative > nombreADeviner) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Gagne !");
                break;
            }

            // Si on atteint le nombre maximum de tentatives en mode difficile
            if (compteur == maxTentatives) {
                System.out.println("Vous avez épuise vos tentatives. Le nombre était " + nombreADeviner);
            }
        }

        // Si l'utilisateur a trouvé le nombre avant d'épuiser ses tentatives
        if (compteur != maxTentatives) {
            System.out.println("Vous avez trouve le nombre en " + compteur + " tentatives.");
        }
    }
}
