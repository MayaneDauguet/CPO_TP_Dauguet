/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_dauguet;

/**
 *
 * @author daugu
 */
public class Convertisseur {
    int nbConversions ; 
    
    public Convertisseur() {
        nbConversions = 0;
    }

    // Méthodes de conversion, chacune incrémente nbConversions de 1
    public float celsiusVersKelvin(float celsius) {
        nbConversions++;
        return celsius + 273.15f;
    }

    public float kelvinVersCelsius(float kelvin) {
        nbConversions++;
        return kelvin - 273.15f;
    }

    public float fahrenheitVersCelsius(float fahrenheit) {
        nbConversions++;
        return (fahrenheit - 32) * 5 / 9;
    }

    public float celsiusVersFahrenheit(float celsius) {
        nbConversions++;
        return (celsius * 9 / 5) + 32;
    }

    public float fahrenheitVersKelvin(float fahrenheit) {
        nbConversions++;
        return celsiusVersKelvin(fahrenheitVersCelsius(fahrenheit));
    }

    public float kelvinVersFahrenheit(float kelvin) {
        nbConversions++;
        return celsiusVersFahrenheit(kelvinVersCelsius(kelvin));
    }

    // Méthode toString pour afficher le nombre de conversions effectuées
    @Override
    public String toString() {
        return "nb de conversions : " + nbConversions;
    }
}