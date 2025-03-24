package fr.algorithmie;

public class RechercheMax {

    public static void main(String[] args) {
        // Rechercher le plus grand élément d'un tableau d'entier
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int max = array[0];

        for(int i=1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("La valeur maximale du tableau est : " + max);
    }
}
