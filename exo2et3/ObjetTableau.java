package exo2et3;

/**
 *
 * @author thibault
 */
public class ObjetTableau {
    private int n;
    private int [] t;
    private static int j = 0;

    public static int getJ() {
        return j;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getT() {
        return t;
    }

    public void setT(int[] t) {
        this.t = t;
    }
    
    public void rempliTab() {
        t = new int[n];
        for (int i = 1; i <= n; i++) {
            t[i-1] = i;
        }
    }
    
    public void rempliTabRand0a9() {
        t = new int[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random()*10);
        }
    }
    
    public void affiche() {
        System.out.println("Affichage d'un objet");
        System.out.println("n vaut "+n);
        for (int i : t) {
            System.out.print(i+" * ");
        }
        System.out.println("");
    }
    
    public int minimum() {
        int min = t[0];
        for (int i : t) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    
    public int maximum() {
        int max = t[0];
        for (int i : t) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    
    public int somme() {
        int somme = 0;
        for (int i : t) {
            somme += i;
        }
        return somme;
    }
    
    public int egal(int p) {
        int egalitees = 0;
        for (int i : t) {
            if (i == p) {
                egalitees++;
            }
        }
        return egalitees;
    }
    
    public int compris(int p, int q) {
        int compt = 0;
        for (int i : t) {
            if (i > p && i < q) {
                compt++;
            }
        }
        return compt;
    }
    
    public int premier() {
        return t[0];
    }
    
    public int dernier() {
        return t[t.length-1];
    }
    
    public void inverse() {
        for (int i = n-1; i >= 0; i--) {
            System.out.print(t[i]+" * ");
        }
        System.out.println("");
    }
    
    public static void nombreObjets() {
        System.out.println("il y à eu "+j+" tableaux créé.");
    }
    
    public ObjetTableau(int n) {
        this.n = n;
        j++;
    }
}
