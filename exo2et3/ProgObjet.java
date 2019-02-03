package exo2et3;

import java.util.Scanner;

/**
 *
 * @author thibault
 */
public class ProgObjet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /***EXO2***/
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une taille.");
        int saisie = sc.nextInt();
        ObjetTableau obj1 = new ObjetTableau(saisie);
        System.out.println("Veuillez saisir une taille.");
        saisie = sc.nextInt();
        ObjetTableau obj2 = new ObjetTableau(saisie);
        System.out.println("Veuillez saisir une taille.");
        saisie = sc.nextInt();
        ObjetTableau obj3 = new ObjetTableau(saisie);
        obj1.rempliTab();
        obj2.rempliTab();
        obj3.rempliTab();
        obj1.affiche();
        obj2.affiche();
        obj3.affiche();
        ObjetTableau.nombreObjets();
        /***EXO3***/
        System.out.println("Choisissez une taille a votre tableau.");
        saisie = sc.nextInt();
        ObjetTableau obj4 = new ObjetTableau(saisie);
        obj4.rempliTabRand0a9();
        obj4.affiche();
        System.out.println("Le plus petit chiffre de votre tableau est : "+obj4.minimum()+".\n"
                           + "Le plus grand chiffre de votre tableau est : "+obj4.maximum()+".\n"
                           + "La somme de tous les chiffres de votre tableau est : "+obj4.somme()+".\n"
                           + "Il y a "+obj4.egal(4)+" fois le nombre 4 dans votre tableau.\n"
                           + "Il y a "+obj4.compris(3, 7)+" chiffres compris entre 3 et 7.\n"
                           + "Le premier chiffre de votre tableau est "+obj4.premier()+".\n"
                           + "Le dernier chiffre de votre tableau est "+obj4.dernier()+".\n"
                           + "Et pour finir voici votre tableau a l'envers :");
        obj4.inverse();
    }
    /**
     * ObjetTableau.nombreObjets();                 / Methode de classe     / 0           *
     * ObjetTableau obj1 = new ObjetTableau(6);     / Methode de classe     /             *
     * obj1.affiche();                              / Methode d'instance    / 1 2 3 4 5 6 *
     * ObjetTableau.nombreObjets();                 / Methode de classe     / 1           *
     * ObjetTableau obj2 = new ObjetTableau(3);     / Methode de classe     /             *
     * obj2.affiche();                              / Methode d'instance    / 1 2 3       *
     * ObjetTableau.nombreObjets();                 / Methode de classe     / 2           *
     */
    
}
