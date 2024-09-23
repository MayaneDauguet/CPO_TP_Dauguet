/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author daugu
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour récupérer l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Affichage du menu
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        // Récupération de l'entrée utilisateur
        int operateur = scanner.nextInt();

         // Demande de la première valeur
        System.out.println("Entrez le premier operateur :");
        double operande1 = scanner.nextDouble();  
        System.out.println("Entrez le deuxieme operateur :");
        double operande2 = scanner.nextDouble();

        
        // Affichage de la valeur saisie
        System.out.println("Vous avez selectionne l'operateur: " + operateur);
        System.out.println("La premiere operande (operande1) est: " + operande1);
        System.out.println("La deuxieme operande (operande2) est: " + operande2);

        // Variable pour stocker le résultat
        double resultat = 0;

        
        if (operateur == 1) {
            resultat = operande1 + operande2;
            System.out.println("Le résultat de l'addition est: " + resultat);
        } else if (operateur == 2) {
            resultat = operande1 - operande2;
            System.out.println("Le resultat de la soustraction est: " + resultat);
        } else if (operateur == 3) {
            resultat = operande1 * operande2;
            System.out.println("Le resultat de la multiplication est: " + resultat);
        } else if (operateur == 4) {
            if (operande2 != 0) {
                resultat = operande1 / operande2;
                System.out.println("Le resultat de la division est: " + resultat);
            } else {
                System.out.println("Erreur : Division par zero n'est pas autorisee.");
            }
        } else if (operateur == 5) {
            resultat = operande1 % operande2;
            System.out.println("Le resultat du modulo est: " + resultat);
        } else {
            System.out.println("Operateur invalide.");
        }
        
    }
}