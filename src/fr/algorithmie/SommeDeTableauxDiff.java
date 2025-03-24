package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {

    public static void main(String[] args) {
        // Créer un tableau qui contient la somme des 2 précédents tableaux, de tailles différentes

        // Tableaux à additionner
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
        // Affichage du résultat via la méthode sommeDeTableauxDiff()
        System.out.println("Array3 : " + Arrays.toString(sommeDeTableauxDiff(array1, array2)));
    }
    // Algorithme
    public static int[] sommeDeTableauxDiff(int[] array1, int[] array2) {
        // Comparer les longueurs des 2 tableaux et retenir la plus grande
        int maxLength = Math.max(array1.length, array2.length);

        // Créer un nouveau tableau de la longueur max
        int[] array3 = new int[maxLength];

        // Boucle qui additionne les éléments au même index et les ajoute au 3e tableau
        for (int i = 0; i < maxLength; i++) {
            int val1 = (i < array1.length) ? array1[i] : 0;
            int val2 = (i < array2.length) ? array2[i] : 0;
            array3[i] = val1 + val2;
        }
        return array3;
    }
}
