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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson") ;
        System.out.println(uneBiere);

        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe") ;
      
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Desperados",9.0,"Tire bouchon") ;
        
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Heinken",5.0,"Novelty") ;
        
        uneBiere.lireEtiquette();
        deuxiemeBiere.lireEtiquette();
        troisiemeBiere.lireEtiquette();
        quatriemeBiere.lireEtiquette();
        
        boolean resultat;
        resultat = uneBiere.decapsuler();
        System.out.println("Decapsulage reussi ? " + resultat);
        
    }
    
}
