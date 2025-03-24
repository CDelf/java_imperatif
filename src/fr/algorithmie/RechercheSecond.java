package fr.algorithmie;


public class RechercheSecond {

    public static void main(String[] args) {
        // Recherche le 2nd plus grand élément d'un tableau
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        // Initialiser deux max, parcourir le tableau en remplissant respectivement max1 puis max2
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int num : array) {
            if(num > max1) {
                max2 = max1;
                max1 = num;
            } else if(num > max2 && num < max1) {
                max2 = num;
            }
        }
        // Afficher le 2e
        System.out.println("Le second plus grand élément du tableau est: " + max2);
    }
}
