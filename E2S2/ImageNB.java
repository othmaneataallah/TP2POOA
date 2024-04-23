public class ImageNB extends Image {

    private boolean[][] pixels;

    public ImageNB(int largeur, int hauteur) {
        super(largeur, hauteur);
        pixels = new boolean[largeur][hauteur];
    }

    @Override
    public boolean estEnCouleur() {
        return false;
    }

    public boolean getPixel(int x, int y) {
        return pixels[x][y];
    }

    public void setPixel(int x, int y, boolean valeur) throws IllegalArgumentException {
        if (x > this.getLargeur() - 1 || y > this.getHauteur() - 1) {
            throw new IllegalArgumentException("Largeur et hauteur doivent être > 0");
        }
        pixels[x][y] = valeur;
    }

    public boolean[][] getPixels() {
        return pixels;
    }

}
