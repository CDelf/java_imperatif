package fr.algorithmie;

public class ComparaisonTableau {

    public static void main(String[] args) {
    // compter le nombre d’éléments en commun dans 2 tableaux
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        int result = 0;

        // Double boucle pour comparer chaque élément d'un tableau à tous les éléments de l'autre
        for(int num1 : array1) {
            for(int num2 : array2) {
                if(num1 == num2) {
                    result++;
                }
            }
        }
        // Affichage du résultat
        System.out.println("Nombre d'éléments communs aux 2 tableaux: " + result);
    }
}
