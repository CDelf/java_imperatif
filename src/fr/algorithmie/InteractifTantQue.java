package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

    public static void main(String[] args) {
        // Programme : demande entrée utilisateur tant que la réponse n'est pas comprise entre 1 et 10
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
        } while(reponse < 1 || reponse > 10); // Continue tant que la condition n'est pas remplie

        scanner.close(); // Libère les ressources utilisées par l'objet scanner
        System.out.println("Merci. Programme terminé.");
    }
}
