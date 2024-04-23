public class ABR {

    private Noeud racine;

    public ABR(Noeud racine) {
        this.racine = racine;
    }

    public Noeud getRacine() {
        return racine;
    }

    public void setRacine(Noeud racine) {
        this.racine = racine;
    }

    public static int taille(ABR arbre) {
        if (arbre.getRacine() == null) {
            return 0;
        }
        ABR sousArbreGauche = new ABR(arbre.getRacine().getFilsGauche());
        ABR sousArbreDroit = new ABR(arbre.getRacine().getFilsDroit());
        return 1 + taille(sousArbreGauche) + taille(sousArbreDroit);
    }

    public static int nombreFeuilles(ABR arbre) {
        if (arbre.getRacine() == null) {
            return 0;
        }
        ABR sousArbreGauche = new ABR(arbre.getRacine().getFilsGauche());
        ABR sousArbreDroit = new ABR(arbre.getRacine().getFilsDroit());
        if (sousArbreGauche.getRacine() == null && sousArbreDroit.getRacine() == null) {
            return 1;
        }
        return nombreFeuilles(sousArbreGauche) + nombreFeuilles(sousArbreDroit);
    }

    public static boolean estEgale(ABR premierArbre, ABR deuxiemeArbre) {
        if (premierArbre.getRacine() == null && deuxiemeArbre.getRacine() == null) {
            return true;
        }
        if (premierArbre.getRacine() == null || deuxiemeArbre.getRacine() == null) {
            return false;
        }
        if (premierArbre.getRacine().getValeur() != deuxiemeArbre.getRacine().getValeur()) {
            return false;
        }
        ABR sousArbreGauchePremier = new ABR(premierArbre.getRacine().getFilsGauche());
        ABR sousArbreDroitPremier = new ABR(premierArbre.getRacine().getFilsDroit());
        ABR sousArbreGaucheDeuxieme = new ABR(deuxiemeArbre.getRacine().getFilsGauche());
        ABR sousArbreDroitDeuxieme = new ABR(deuxiemeArbre.getRacine().getFilsDroit());
        return estEgale(sousArbreGauchePremier, sousArbreGaucheDeuxieme)
                && estEgale(sousArbreDroitPremier, sousArbreDroitDeuxieme);
    }

    public static int profondeur(ABR arbre) {
        if (arbre.getRacine() == null) {
            return 0;
        }
        ABR sousArbreGauche = new ABR(arbre.getRacine().getFilsGauche());
        ABR sousArbreDroit = new ABR(arbre.getRacine().getFilsDroit());
        return 1 + Math.max(profondeur(sousArbreGauche), profondeur(sousArbreDroit));
    }

    public static boolean contenir(ABR arbre, int valeur) {
        if (arbre.getRacine() == null) {
            return false;
        }
        if (arbre.getRacine().getValeur() == valeur)
            return true;
        ABR sousArbreGauche = new ABR(arbre.getRacine().getFilsGauche());
        ABR sousArbreDroit = new ABR(arbre.getRacine().getFilsDroit());
        return contenir(sousArbreDroit, valeur) || contenir(sousArbreGauche, valeur);
    }

    public static void parcoursPrefixe(ABR arbre) {

        if (arbre.getRacine() != null) {
            System.out.print(arbre.getRacine().getValeur() + "");
            ABR filsDroit = new ABR(arbre.getRacine().getFilsDroit());
            ABR filsGauche = new ABR(arbre.getRacine().getFilsGauche());
            parcoursPrefixe(filsGauche);
            parcoursPrefixe(filsDroit);

        }
    }

}
