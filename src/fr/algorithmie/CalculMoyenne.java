package fr.algorithmie;

public class CalculMoyenne {

    public static void main(String[] args) {
        // Calcul de la moyenne des éléments d'un tableau d'entiers
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int sum = 0;

        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }

        double moyenne = (double) sum / array.length;
        System.out.println("Moyenne des entiers de array : " + moyenne);
    }
}
