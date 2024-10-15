/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_dauguet;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daugu
 */
public class TP1_stats_DAUGUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] resultats = new int[6]; 

        // Demander à l'utilisateur de saisir un nombre entier m
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez le nombre de tirages (entier m) : ");
        int m = scanner.nextInt();

        // Générateur de nombres aléatoires
        Random generateurAleat = new Random();

        // Boucle sur m itérations pour générer des nombres entre 0 et 5
        for (int i = 0; i < m; i++) {
            int nombre = generateurAleat.nextInt(6);  // Générer un nombre entre 0 et 5
            resultats[nombre]++;  // Incrémenter la case correspondante
        }

        // Affichage des résultats sous forme de nombres
        System.out.println("Resultats des tirages :");
        for (int i = 0; i < resultats.length; i++) {
            System.out.println("Nombre " + i + " : " + resultats[i] + " fois");
        }

        // Affichage des résultats en pourcentages
        System.out.println("\nResultats en pourcentages :");
        for (int i = 0; i < resultats.length; i++) {
            double pourcentage = ((double) resultats[i] / m) * 100;  // Calcul du pourcentage
            System.out.println("Nombre " + i + " : " + String.format("%.2f", pourcentage) + " %");
        }
    }
}