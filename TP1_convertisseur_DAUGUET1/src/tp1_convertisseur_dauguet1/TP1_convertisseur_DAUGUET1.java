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
        System.out.println("Vous avez saisi : " + temperatureCelsius + " C");

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

    // Méthode de conversion de Kelvin à Celsius
    public static double KelvinVersCelcius(double kelvin) {
        return kelvin - 273.15;
    }

    // Méthode de conversion de Fahrenheit à Celsius
    public static double FarenheitVersCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Méthode de conversion de Celsius à Fahrenheit
    public static double CelciusVersFarenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Méthode de conversion de Kelvin à Fahrenheit en utilisant deux méthodes
    public static double KelvinVersFarenheit(double kelvin) {
        double celsius = KelvinVersCelcius(kelvin);
        return CelciusVersFarenheit(celsius);
    }

    // Méthode de conversion de Fahrenheit à Kelvin en utilisant deux méthodes
    public static double FarenheitVersKelvin(double fahrenheit) {
        double celsius = FarenheitVersCelcius(fahrenheit);
        return celsius + 273.15;
    }
}



public class ConvertisseurSimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir une température
        System.out.print("Bonjour, saisissez une valeur de température : ");
        double temperature = scanner.nextDouble();

        // Affiche un menu pour choisir la conversion
        System.out.println("Saisissez la conversion que vous souhaitez effectuer : ");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        // Lecture du choix de l'utilisateur
        int choix = scanner.nextInt();
        double resultat = 0;

        // Traitement en fonction du choix de conversion
        switch (choix) {
            case 1:
                resultat = celsiusToKelvin(temperature);
                System.out.println(temperature + " degrés Celsius est égal à " + resultat + " degrés Kelvin.");
                break;
            case 2:
                resultat = kelvinToCelsius(temperature);
                System.out.println(temperature + " degrés Kelvin est égal à " + resultat + " degrés Celsius.");
                break;
            case 3:
                resultat = fahrenheitToCelsius(temperature);
                System.out.println(temperature + " degrés Fahrenheit est égal à " + resultat + " degrés Celsius.");
                break;
            case 4:
                resultat = celsiusToFahrenheit(temperature);
                System.out.println(temperature + " degrés Celsius est égal à " + resultat + " degrés Fahrenheit.");
                break;
            case 5:
                resultat = kelvinToFahrenheit(temperature);
                System.out.println(temperature + " degrés Kelvin est égal à " + resultat + " degrés Fahrenheit.");
                break;
            case 6:
                resultat = fahrenheitToKelvin(temperature);
                System.out.println(temperature + " degrés Fahrenheit est égal à " + resultat + " degrés Kelvin.");
                break;
            default:
                System.out.println("Choix invalide. Veuillez choisir une option entre 1 et 6.");
        }

        // Fermeture du scanner
        scanner.close();
    }

    // Méthode de conversion de Celsius à Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Méthode de conversion de Kelvin à Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Méthode de conversion de Fahrenheit à Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Méthode de conversion de Celsius à Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Méthode de conversion de Kelvin à Fahrenheit en utilisant deux méthodes
    public static double kelvinToFahrenheit(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        return celsiusToFahrenheit(celsius);
    }

    // Méthode de conversion de Fahrenheit à Kelvin en utilisant deux méthodes
    public static double fahrenheitToKelvin(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return celsiusToKelvin(celsius);
    }
}
