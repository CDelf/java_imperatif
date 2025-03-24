package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

    public static void main(String[] args) {
        // Programme qui demande un nombre à l’utilisateur puis
        // calcule la somme de tous les entiers compris entre 1 et ce nombre.
        Scanner scanner = new Scanner(System.in);
        int reponse = 0;
        int sum = 0;

        System.out.println("Ecrire un entier: ");
        // Contrôle que l'entrée utilisateur est bien un entier
        while (!scanner.hasNextInt()) {
            System.out.println("Ceci n'est pas un entier, réessayez : ");
            scanner.next(); // Consomme l'entrée invalide pour éviter une boucle infinie
        }
        reponse = scanner.nextInt(); // Lit et affecte l'entrée utilisateur

        // Calcul de la somme de tous les entiers entre 1 et la réponse
        for(int i=1; i<= reponse; i++) {
            sum += i;
        }
        // Affiche le résultat
        System.out.println("Somme de tous les entiers entre 1 et " + reponse + " = " + sum);
        scanner.close();
    }
}
