/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_dauguet;

/**
 *
 * @author daugu
 */
public class TP2_manip_DAUGUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        assiette2.nbCalories += 100;

        System.out.println("Apres incrementation des calories d'assiette2 :");
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // Étape 5 : Inversion des références
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        // Étape 6 : Incompatibilité des types (ces lignes ne fonctionneront pas)
        // Moussaka assiette666 = assiette1;
        // Moussaka assiette667 = new Tartiflette();

        // Étape 7 : Création d'un tableau de 10 objets Moussaka
    Moussaka[] tableauMoussaka = new Moussaka[10];
    for (int i = 0; i < tableauMoussaka.length; i++) {
        tableauMoussaka[i] = new Moussaka(300);
    }
    for (int i = 0; i < tableauMoussaka.length; i++) {
        System.out.println("Moussaka " + (i + 1) + " : " + tableauMoussaka[i].nbCalories + " calories");
    }
}
}
