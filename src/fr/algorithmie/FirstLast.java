package fr.algorithmie;

import java.util.Arrays;

public class FirstLast {

    public static void main(String[] args) {
        // Calcul d'une valeur booléenne qui vaut true si le tableau
        // est de longueur supérieure ou égale à 1 et que le
        //premier et le dernier élément du tableau ont la même valeur

        // Tableaux à tester
        int[] array1 = {6, 1, 2, 6}; //true
        int[] array2 = {1, 2, 3, 1}; // true
        int[] array3 = new int[0]; // false
        int[] array4 = {1, 2, 3, 4}; // false

        // Affichage des résultats grâce à la méthode verifier
        verifier(array1, true);
        verifier(array2, true);
        verifier(array3, false);
        verifier(array4, false);
    }

    // Algorithme
    public static boolean firstLast(int[] array) {
        return array.length > 0 && (array[0] == array[array.length-1]);
    }

    // Méthode pour vérifier le bon fonctionnement de l'algorithme
    public static void verifier(int[] array, boolean resultatAttendu) {
        boolean resultat = firstLast(array);
        System.out.println("Test avec " + Arrays.toString(array) + " :");
        System.out.println("Résultat attendu : " + resultatAttendu + " | Résultat obtenu : " + resultat);
        System.out.println(resultat == resultatAttendu ? "Test réussi" : "Test échoué");
        System.out.println("----------------------------------------");
    }
}
