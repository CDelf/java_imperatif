package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Demander un nombre positif
        do {
            System.out.print("Entrez un entier positif (n ≥ 0) : ");
            while (!scanner.hasNextInt()) { // Vérifie si c'est un entier
                System.out.println("Erreur : Vous devez entrer un nombre entier !");
                scanner.next(); // Consomme l'entrée incorrecte
            }
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Erreur : Le nombre doit être positif ou nul !");
            }
        } while (n < 0); // Répète tant que l'entrée est invalide

        // Affichage du Fibonacci, calculé par la méthode fibonacci(n)
        System.out.println("Le nombre de Fibonacci de rang " + n + " est : " + fibonacci(n));

        scanner.close();
    }

    // Méthode de calcul de Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int prev1 = 0, prev2 = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }
        return result;
    }
}
