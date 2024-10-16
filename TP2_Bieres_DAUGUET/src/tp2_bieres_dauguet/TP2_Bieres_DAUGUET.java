/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_dauguet;

/**
 *
 * @author daugu
 */
public class TP2_Bieres_DAUGUET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.nom = "Cuvee des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false ;

        BouteilleBiere deuxiemeBiere = new BouteilleBiere() ;
        deuxiemeBiere.nom = "Leffe";
        deuxiemeBiere.degreAlcool = 6.6 ;
        deuxiemeBiere.brasserie = "Abbaye de Leffe";
        deuxiemeBiere.ouverte = true ;
        
        uneBiere.lireEtiquette();
        deuxiemeBiere.lireEtiquette();
    }
    
}
