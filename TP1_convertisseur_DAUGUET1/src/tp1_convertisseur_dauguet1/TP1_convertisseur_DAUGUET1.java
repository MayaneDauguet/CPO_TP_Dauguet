/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_dauguet1;

/**
 *
 * @author daugu
 */
import java.util.Scanner;

public class TP1_convertisseur_DAUGUET1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir une température en Celsius
        System.out.print("Veuillez entrer une temperature en degres Celsius : ");
        double temperatureCelsius = scanner.nextDouble();

        // Affichage de la température saisie
        System.out.println("Vous avez saisi : " + temperatureCelsius + " °C");

        // Conversion de Celsius à Kelvin
        double temperatureKelvin = celsiusToKelvin(temperatureCelsius);

        // Affichage de la température en Kelvin
        System.out.println("La temperature en degres Kelvin est : " + temperatureKelvin + " K");

        // Fermeture du scanner
        scanner.close();
    }

    // Méthode de conversion de Celsius à Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15; // Formule de conversion
    }
}
