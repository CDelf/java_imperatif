package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

    public static void main(String[] args) {
        // Programme qui demande un nombre à l’utilisateur qui doit être compris
        // entre 1 et 10. Si c'est le cas, affiche la table de multiplication de ce nombre.
        Scanner scanner = new Scanner(System.in);
        int reponse = 0;

        do {
            System.out.println("Ecrire un entier entre 1 et 10: ");
            if (scanner.hasNextInt()) { // Vérifie si l'entrée est bien un entier
                reponse = scanner.nextInt(); //Lit la réponse et l'affecte à la variable
            } else {
                System.out.println("Ceci n'est pas un entier, réessayez. ");
                scanner.next(); // Consomme l'entrée incorrecte pour éviter une boucle infinie
            }
        } while(reponse < 1 || reponse > 10);
        // Affiche la table
        System.out.println("Table de " + reponse + " :");
        for(int i=1; i<=10; i++) {
            System.out.println(reponse + " x " + i + " = " + reponse*i );
        }
        scanner.close();
    }
}
