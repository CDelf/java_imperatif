package fr.algorithmie;

import java.util.Arrays;

public class FirstLast6 {

    public static void main(String[] args) {
        // Calcule une valeur booléenne qui vaut true si le tableau a au moins 1 élément et
        // si le premier élément ou le dernier élément vaut 6. Sinon false.

        // Tableaux à tester
        int[] array1 = {6, 3, 2, 1}; // attendu : true
        int[] array2 = {1, 2, 3, 6}; // true
        int[] array3 = new int[0]; // false
        int[] array4 = {1, 2, 3, 4}; // false

        // Affichage des résultats via la méthode verifier
        verifier(array1, true);
        verifier(array2, true);
        verifier(array3, false);
        verifier(array4, false);
    }

    // Algorithme
    public static boolean firstLast6(int[] array) {
        return array.length > 0 && (array[0] == 6 || array[array.length-1] == 6);
    }
    // Méthode pour verifier le bon fonctionnement de l'algorithme
    public static void verifier(int[] array, boolean resultatAttendu) {
        boolean resultat = firstLast6(array);
        System.out.println("Test avec " + Arrays.toString(array) + " :");
        System.out.println("Résultat attendu : " + resultatAttendu + " | Résultat obtenu : " + resultat);
        System.out.println(resultat == resultatAttendu ? "Test réussi" : "Test échoué");
        System.out.println("----------------------------------------");
    }
}


