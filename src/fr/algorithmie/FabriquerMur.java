package fr.algorithmie;

public class FabriquerMur {

    public static void main(String[] args) {
        // A partir d’une longueur de mur donnée, écrire un algorithme indiquant s’il est
        //possible ou non de fabriquer ce mur avec un nombre A de briques de longueur 1 et un
        //nombre B de briques de longueur 5

        // Tests
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }

    // Algorithme
    public static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        int maxBig = longueur / 5; // Nombre maximal de briques de 5m que l'on peut utiliser
        int bigsUtilises = Math.min(nbBig, maxBig); // On utilise le minimum entre le max possible et ce qu'on a
        int reste = longueur - (bigsUtilises * 5); // Ce qu'il reste à compléter avec des briques de 1m

        return reste <= nbSmall; // Vérifier si on a assez de briques de 1m pour compléter
    }

    // Méthode verifier : affiche si le test est réussi ou échoué
    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
        } else {
            System.out.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") réussi!");
        }
    }
}