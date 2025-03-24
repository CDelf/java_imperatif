package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count = 0; // Compteur de nombres valides

        System.out.println("Trouvons le maximum entre 10 nombres entiers.");
        while (count < 10) { // On s'assure que l'utilisateur entre 10 entiers valides
            System.out.print("Entrez le nombre entier n°" + (count + 1) + " : ");

            if (scanner.hasNextInt()) { // Vérifie si l'entrée est bien un entier
                int nombre = scanner.nextInt();
                max = Math.max(max, nombre); // Mise à jour du maximum
                count++; // Compte seulement les entrées valides
            } else {
                System.out.println(" Erreur : Vous devez entrer un nombre entier valide !");
                scanner.next(); // Consomme l'entrée invalide pour éviter une boucle infinie
            }
        }

        scanner.close(); // Fermeture du scanner
        System.out.println("Le plus grand nombre saisi est : " + max);
    }
}
