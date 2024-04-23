public class Main {
    public static void main(String[] args) {
        Noeud n1 = new Noeud(1);
        Noeud n2 = new Noeud(2);
        Noeud n3 = new Noeud(3);
        Noeud n4 = new Noeud(4);
        Noeud n5 = new Noeud(5);
        Noeud n6 = new Noeud(6);
        Noeud n7 = new Noeud(7);
        ABR arbre = new ABR(n1);
        ABR arbre2 = new ABR(n1);
        ABR arbre3 = new ABR(n2);
        n1.setFilsGauche(n2);
        n1.setFilsDroit(n3);
        n2.setFilsGauche(n4);
        n2.setFilsDroit(n5);
        n3.setFilsGauche(n6);
        n3.setFilsDroit(n7);

        System.out.println(ABR.taille(arbre));
        System.out.println(ABR.nombreFeuilles(arbre));
        System.out.println(ABR.estEgale(arbre, arbre2));
        System.out.println(ABR.estEgale(arbre, arbre3));
        System.out.println(ABR.profondeur(arbre));
        System.out.println(ABR.contenir(arbre, 4));
        System.out.println(ABR.contenir(arbre, 8));
        ABR.parcoursPrefixe(arbre);
    }
}