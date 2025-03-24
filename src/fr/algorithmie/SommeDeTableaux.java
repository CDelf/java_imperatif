package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableaux {

    public static void main(String[] args) {
        // Créer un tableau qui contient la somme des 2 précédents tableaux de même longueur
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;

        // Affichage du résultat via la méthode sommeDeTableau
        System.out.println("Array3 : " + Arrays.toString(sommeDeTableaux(array1, array2)));
    }

    public static int[] sommeDeTableaux(int[] array1, int[] array2) {
        if(array1.length == array2.length) {
            // Créer un nouveau tableau de la même longueur
            int[] array3 = new int[array1.length];

            // Boucle qui additionne les éléments au même index et les ajoute au 3e tableau
            for (int i = 0; i < array3.length; i++) {
                array3[i] = array1[i] + array2[i];
            }
            return array3;
        } else {
            System.out.println("Les tableaux ne sont pas de la même taille.");
            return null;
        }
    }
}
