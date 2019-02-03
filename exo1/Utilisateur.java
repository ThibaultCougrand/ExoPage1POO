package exo1;

/**
 *
 * @author thibault
 */
public class Utilisateur {
    private String name;
    private String voitures = "";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVoitures() {
        return voitures;
    }
    public void setVoitures(String voitures) {
        this.voitures = voitures;
    }

    public void acheterVoiture(String marque, String couleur, int nbPortes) {
        this.voitures += marque+" "+couleur+" "+nbPortes+" portes\n";
    }
    public void seLaRaconte() {
        System.out.println("Voici mes voitures:\n"+voitures);
    }
}
