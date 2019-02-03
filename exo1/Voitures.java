package exo1;

/**
 *
 * @author thibault
 */
public class Voitures {
    private String marque;
    private String couleur;
    private int nbPortes;

    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public int getNbPortes() {
        return nbPortes;
    }
    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public String affiche() {
        String affiche = marque+" "+couleur+" "+nbPortes+" portes.";
        return affiche;
    }
}
