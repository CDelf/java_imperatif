package fr.algorithmie;

public class InversionContenu {

    public static void main(String[] args) {
    // Copie des éléments à partir d'un tableau, mais dans l'ordre inverse

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        // Création d'un tableau vide de même longueur
        int[] arrayCopy = new int[array.length];
        // Copie des éléments dans l'ordre inverse
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length - 1 - i];
        }

        //Affichage des résultats:
        System.out.println("array : ");
        for(int number : array) {
            System.out.println(number);
        }
        System.out.println("arrayCopy (array inversé) : ");
        for(int num : arrayCopy) {
            System.out.println(num);
        }
    }
}
