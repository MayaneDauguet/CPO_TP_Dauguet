/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_dauguet;

/**
 *
 * @author daugu
 */
import java.util.Scanner ;
public class TP1_manipNombresInt_DAUGUET {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir deux entiers
        System.out.print("Veuillez entrer le premier entier : ");
        int premierEntier = scanner.nextInt();

        System.out.print("Veuillez entrer le deuxieme entier : ");
        int deuxiemeEntier = scanner.nextInt();

        int somme = premierEntier + deuxiemeEntier;
        int difference = premierEntier - deuxiemeEntier;
        int produit = premierEntier * deuxiemeEntier;
        int quotient = premierEntier / deuxiemeEntier;
        int reste = premierEntier % deuxiemeEntier;
        
        System.out.println("Vous avez saisi : " + premierEntier + " et " + deuxiemeEntier);
        System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La difference des deux nombres est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);
        System.out.println("Le quotient de la division de " + premierEntier + " par " + deuxiemeEntier + " est : " + quotient);
        System.out.println("Le reste de la division de " + premierEntier + " par " + deuxiemeEntier + " est : " + reste);

    }
}
