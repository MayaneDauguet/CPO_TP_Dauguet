//* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 
package tp1_convertisseur_dauguet1;

/**
 *
 * @author daugu
 */
import java.util.Scanner;

public class TP1_convertisseur_DAUGUET1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir une température
        System.out.print("Veuillez entrer une première variable (température) : ");
        double varC = scanner.nextDouble();

        // Afficher le menu de conversion
        System.out.println("Veuillez choisir une conversion de température :");
        System.out.println("1) Celsius vers Kelvin");
        System.out.println("2) Kelvin vers Celsius");
        System.out.println("3) Fahrenheit vers Celsius");
        System.out.println("4) Celsius vers Fahrenheit");
        System.out.println("5) Kelvin vers Fahrenheit");
        System.out.println("6) Fahrenheit vers Kelvin");

        // Lire le choix de l'utilisateur
        int choix = scanner.nextInt();
        double temperature = 0;

        // Exécuter la conversion basée sur le choix de l'utilisateur
        switch (choix) {
            case 1:
                // Celsius vers Kelvin
                temperature = varC;
                double Kelvin = CelciusversKelvin(temperature);
                System.out.println(temperature + " Celsius équivaut à " + Kelvin + " Kelvin.");
                break;
            case 2:
                // Kelvin vers Celsius
                temperature = varC;
                double Celcius = KelvinVersCelcius(temperature);
                System.out.println(temperature + " Kelvin équivaut à " + Celcius + " Celsius.");
                break;
            case 3:
                // Fahrenheit vers Celsius
                temperature = varC;
                double Celcius2 = FarenheitVersCelcius(temperature);
                System.out.println(temperature + " Fahrenheit équivaut à " + Celcius2 + " Celsius.");
                break;
            case 4:
                // Celsius vers Fahrenheit
                temperature = varC;
                double Farenheit2 = CelciusVersFarenheit(temperature);
                System.out.println(temperature + " Celsius équivaut à " + Farenheit2 + " Fahrenheit.");
                break;
            case 5:
                // Kelvin vers Fahrenheit
                temperature = varC;
                double Farenheit = KelvinVersFarenheit(temperature);
                System.out.println(temperature + " Kelvin équivaut à " + Farenheit + " Fahrenheit.");
                break;
            case 6:
                // Fahrenheit vers Kelvin
                temperature = varC;
                double Kelvin1 = FarenheitVersKelvin(temperature);
                System.out.println(temperature + " Fahrenheit équivaut à " + Kelvin1 + " Kelvin.");
                break;
            default:
                System.out.println("Choix invalide. Veuillez choisir un nombre entre 1 et 6.");
                break;
        }

        // Fermeture du scanner
        scanner.close();
    }

    // Méthodes de conversion
    public static double CelciusversKelvin(double tCelcius) {
        return tCelcius + 273.15;  // Opération de conversion
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15; // Temperature en Celsius
    }     

    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5 / 9;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        return CelciusversKelvin(FarenheitVersCelcius(tFarenheit));
    }
}
