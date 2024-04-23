public class Noeud {

    private int valeur;
    private Noeud filsGauche;
    private Noeud filsDroit;

    public Noeud(int valeur) {
        this.valeur = valeur;
        this.filsGauche = null;
        this.filsDroit = null;
    }

    public int getValeur() {
        return this.valeur;
    }

    public Noeud getFilsGauche() {
        return this.filsGauche;
    }

    public Noeud getFilsDroit() {
        return this.filsDroit;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void setFilsGauche(Noeud filsGauche) {
        this.filsGauche = filsGauche;
    }

    public void setFilsDroit(Noeud filsDroit) {
        this.filsDroit = filsDroit;
    }

}
