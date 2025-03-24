package fr.algorithmie;

public class NombreParfait {

    public static void main(String[] args) {
        // Détermine si un entier est parfait (égal à la somme de ses diviseurs excepté lui-même)

        // Affichage du résultat
        verifier(6, true);
        verifier(28, true);
        verifier(100, false);
        verifier(-6, false);
    }

    // Algorithme
    public static boolean estParfait(int entier) {
        if(entier <= 1) return false;

        int sum = 0; // Initier la somme des diviseurs
        // Boucle pour trouver les diviseurs (sauf lui-même) et les additionner
        for (int i = 1; i < entier; i++) {
            if (entier % i == 0) {
                sum += i;
            }
        }
        // Vérification si le nombre est parfait
        return sum == entier;
    }

    // Vérifier
    public static void verifier(int entier, boolean resultatAttendu) {
        boolean resultat = estParfait(entier);
        System.out.println("Test avec " + entier + " :");
        System.out.println("Résultat attendu : " + resultatAttendu + " | Résultat obtenu : " + resultat);
        System.out.println(resultat == resultatAttendu ? "Test réussi" : "Test échoué");
        System.out.println("----------------------------------------");
    }
}
