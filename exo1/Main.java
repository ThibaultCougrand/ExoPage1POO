package exo1;

import java.util.Scanner;

/**
 *
 * @author thibault
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Voitures titine = new Voitures();
        Utilisateur thib = new Utilisateur();
        Parking triangleMtp = new Parking();
        boolean continu = true;
        System.out.println("Bonjour comment vous appelez vous?");
        thib.setName(sc.nextLine());
        while (continu) {
            System.out.println(thib.getName() + " quel marque de voiture souhaitez vous acheter?");
            titine.setMarque(sc.nextLine());
            System.out.println("De quelle couleur sera votre " + titine.getMarque());
            titine.setCouleur(sc.nextLine());
            System.out.println("Voulez vous votre " + titine.getMarque() + " " + titine.getCouleur() + " en 3 ou 5 portes?");
            titine.setNbPortes(sc.nextInt());
            sc.nextLine();
            System.out.println("Souhaitez vous acheter cette voiture '"+titine.affiche()+"' ?");
            String reponseV = sc.nextLine();
            if (reponseV.equals("oui")) {
                thib.acheterVoiture(titine.getMarque(), titine.getCouleur(), titine.getNbPortes());
            }
            System.out.println("Voulez vous acheter une autre voiture?");
            String reponseA = sc.nextLine();
            if (reponseA.equals("non")) {
                continu = false;
            }
        }
        thib.seLaRaconte();
        triangleMtp.inscription(thib.getName(), thib.getVoitures());
        System.out.println(triangleMtp.getAdhérants());
    }

}
