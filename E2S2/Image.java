public abstract class Image {
    private int largeur;
    private int hauteur;

    public Image(int largeur, int hauteur) throws IllegalArgumentException {
        if (largeur <= 0 || hauteur <= 0) {
            throw new IllegalArgumentException("Les dimensions de l'image doivent être strictement positives.");
        }
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public abstract boolean estEnCouleur();

}