/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_dauguet;

/**
 *
 * @author daugu
 */
import java.util.Scanner;

public class TP2_convertisseurObjet_DAUGUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      


        Scanner scanner = new Scanner(System.in);

        // Création du premier convertisseur et réalisation de quelques conversions
        Convertisseur convertisseur1 = new Convertisseur();
        System.out.println("Convertisseur 1 : Celsius vers Kelvin (25°C) -> " + convertisseur1.celsiusVersKelvin(25));
        System.out.println("Convertisseur 1 : Kelvin vers Celsius (300K) -> " + convertisseur1.kelvinVersCelsius(300));

        // Création du second convertisseur et réalisation de quelques autres conversions
        Convertisseur convertisseur2 = new Convertisseur();
        System.out.println("Convertisseur 2 : Fahrenheit vers Celsius (98.6°F) -> " + convertisseur2.fahrenheitVersCelsius(98.6f));
        System.out.println("Convertisseur 2 : Celsius vers Fahrenheit (37°C) -> " + convertisseur2.celsiusVersFahrenheit(37));

        // Affichage du nombre de conversions effectuées par chaque objet
        System.out.println("Nombre de conversions pour convertisseur1 : " + convertisseur1);
        System.out.println("Nombre de conversions pour convertisseur2 : " + convertisseur2);

        // Menu interactif
        boolean continuer = true;
        while (continuer) {
            System.out.println("\nMenu de conversion :");
            System.out.println("1 - Celsius vers Kelvin");
            System.out.println("2 - Kelvin vers Celsius");
            System.out.println("3 - Fahrenheit vers Celsius");
            System.out.println("4 - Celsius vers Fahrenheit");
            System.out.println("5 - Fahrenheit vers Kelvin");
            System.out.println("6 - Kelvin vers Fahrenheit");
            System.out.println("0 - Quitter");
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez la temperature en Celsius : ");
                    float celsius = scanner.nextFloat();
                    System.out.println("Resultat : " + convertisseur1.celsiusVersKelvin(celsius) + " K");
                    break;
                case 2:
                    System.out.print("Entrez la temperature en Kelvin : ");
                    float kelvin = scanner.nextFloat();
                    System.out.println("Resultat : " + convertisseur1.kelvinVersCelsius(kelvin) + " °C");
                    break;
                case 3:
                    System.out.print("Entrez la temperature en Fahrenheit : ");
                    float fahrenheit = scanner.nextFloat();
                    System.out.println("Resultat : " + convertisseur1.fahrenheitVersCelsius(fahrenheit) + " °C");
                    break;
                case 4:
                    System.out.print("Entrez la temperature en Celsius : ");
                    celsius = scanner.nextFloat();
                    System.out.println("Resultat : " + convertisseur1.celsiusVersFahrenheit(celsius) + " °F");
                    break;
                case 5:
                    System.out.print("Entrez la temperature en Fahrenheit : ");
                    fahrenheit = scanner.nextFloat();
                    System.out.println("Resultat : " + convertisseur1.fahrenheitVersKelvin(fahrenheit) + " K");
                    break;
                case 6:
                    System.out.print("Entrez la temperature en Kelvin : ");
                    kelvin = scanner.nextFloat();
                    System.out.println("Resultat : " + convertisseur1.kelvinVersFahrenheit(kelvin) + " °F");
                    break;
                case 0:
                    continuer = false;
                    System.out.println("Fin du programme.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez reessayer.");
            }
        }

        scanner.close();
    }
}
  
