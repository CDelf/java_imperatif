package fr.algorithmie;

public class AffichagePartiel {

    public static void main(String[] args) {
    // Affichage conditionné des éléments d'un tableau
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        // Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
        System.out.println("Entiers de array supérieurs à 3: ");
        for(int num1 : array) {
            if(num1 > 3) {
                System.out.println(num1);
            }
        }
        // Combiner une boucle et un test de manière à n’afficher que les entiers pairs
        System.out.println("Entiers pairs de array : ");
        for(int num2 : array) {
            if(num2%2 == 0) {
                System.out.println(num2);
            }
        }
        // Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs
        System.out.println("Entiers de array correspondant à des index pairs : ");
        for(int i=0; i<= array.length; i++) {
            if(i%2 == 0) {
                System.out.println(array[i]);
            }
        }
        // Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        System.out.println("Entiers impairs de array : ");
        for(int num3 : array) {
            if(num3%2 != 0) {
                System.out.println(num3);
            }
        }
    }
}
