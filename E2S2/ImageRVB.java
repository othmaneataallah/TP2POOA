public class ImageRVB extends Image {

    private int[][][] pixels;

    public ImageRVB(int largeur, int hauteur) {
        super(largeur, hauteur);
        pixels = new int[largeur][hauteur][3];
    }

    @Override
    public boolean estEnCouleur() {
        return true;
    }

    public int[] getPixel(int x, int y) {
        return pixels[x][y];
    }

    public void setPixel(int x, int y, int rouge, int vert, int bleu) {
        if (x > this.getLargeur() - 1 || y > this.getHauteur() - 1 || rouge < 0 || rouge > 255 || vert < 0 || vert > 255
                || bleu < 0 || bleu > 255) {
            throw new IllegalArgumentException("Largeur et hauteur doivent être > 0, RVB entre 0 et 255");
        }
        pixels[x][y][0] = rouge;
        pixels[x][y][1] = vert;
        pixels[x][y][2] = bleu;
    }

    public int[][][] getPixels() {
        return pixels;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ImageRVB) {
            ImageRVB img = (ImageRVB) obj;
            if (img.getLargeur() != this.getLargeur() || img.getHauteur() != this.getHauteur()) {
                return false;
            }
            for (int i = 0; i < this.getLargeur(); i++) {
                for (int j = 0; j < this.getHauteur(); j++) {
                    if (img.getPixel(i, j)[0] != this.getPixel(i, j)[0]
                            || img.getPixel(i, j)[1] != this.getPixel(i, j)[1]
                            || img.getPixel(i, j)[2] != this.getPixel(i, j)[2]) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

}
