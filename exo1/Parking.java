package exo1;

/**
 *
 * @author thibault
 */
public class Parking {
    private String adhérants = "Voici nos adhérants et leurs véhicules:\n";

    public String getAdhérants() {
        return adhérants;
    }

    public void setAdhérants(String adhérants) {
        this.adhérants = adhérants;
    }
    
    public void inscription(String nom, String voitures) {
        this.adhérants += nom+"\n"+voitures;
    }
}
