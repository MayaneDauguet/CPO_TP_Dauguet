/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *
 * @author daugu
 */
public class Baton extends Arme {
    private int age;

    // Constructeur
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);  // Appel du constructeur de la classe parente Arme
        if (age >= 0 && age < 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("L'âge doit être compris entre 0 et 99.");
        }
    }

    // Accesseur pour l'âge
    public int getAge() {
        return age;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return super.toString() + ", âge=" + age + '}';
    }
}
