package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {

    public static void main(String[] args) {
    // Affichage normal/inversé de tableaux et copie
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        // Afficher l’ensemble des éléments du tableau grâce à une boucle
        System.out.println("Array : ");
        for(int number : array) {
            System.out.println(number);
        }

        // Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        System.out.println("Array inversé : ");
        for(int i= array.length-1; i>=0; i--) {
            System.out.println(array[i]);
        }
        // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        System.out.println("arrayCopie: ");
        for(int num : arrayCopy) {
            System.out.println(num);
        }
    }
}