package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

    public static void main(String[] args) {
        // Effectuer une rotation à droite des éléments d'un tableau d'entiers
        int[] array1 = {0,1,2,3}; // attendu : {3,0,1,2}
        int[] array2 = {0, 10, 20, 30}; // {30, 0, 10, 20}
        int[] array3 = {-2, -4, -6, -8}; // {-8, -2, -4, -6}
        int[] array4 = {}; // vérifie gestion tableau vide

        // Affichage des tableaux après rotation via la méthode rotation(array)
        System.out.println("Rotation de " + Arrays.toString(array1) + " : " + Arrays.toString(rotation(array1)));
        System.out.println("Rotation de " + Arrays.toString(array2) + " : " + Arrays.toString(rotation(array2)));
        System.out.println("Rotation de " + Arrays.toString(array3) + " : " + Arrays.toString(rotation(array3)));
        System.out.println("Rotation de " + Arrays.toString(array4) + " : " + Arrays.toString(rotation(array4)));
    }

    // Algorithme
    public static int[] rotation(int[] array) {
        if (array.length == 0) return array; // Vérification pour éviter les erreurs

        int dernierElement = array[array.length - 1]; // Stocker le dernier élément
        // Décaler tous les éléments vers la droite
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = dernierElement; // Placer le dernier élément en première position
        return array;
    }
}
