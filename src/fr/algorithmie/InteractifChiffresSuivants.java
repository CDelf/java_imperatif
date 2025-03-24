package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

    public static void main(String[] args) {
        // Programme qui demande un nombre à l’utilisateur puis affiche les 10 nombres suivants.
        Scanner scanner = new Scanner(System.in);
        int reponse = 0;

        System.out.print("Écrire un entier : ");
        // Contrôle que l'entrée utilisateur est bien un entier
        while (!scanner.hasNextInt()) {
            System.out.println("Ceci n'est pas un entier, réessayez : ");
            scanner.next(); // Consomme l'entrée invalide pour éviter une boucle infinie
        }
        reponse = scanner.nextInt(); // Lit et affecte l'entrée utilisateur

        // Affiche les 10 nombres suivants
        System.out.println("Nombres suivant " + reponse + " :");
        for(int i=1; i<=10; i++) {
            System.out.println(reponse + i);
        }
        scanner.close();
    }
}
