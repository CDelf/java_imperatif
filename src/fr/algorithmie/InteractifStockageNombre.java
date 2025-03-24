package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

    public static void main(String[] args) {
        // Programme proposant 2 options : ajouter nombres / voir nombres existants
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        int option = 0; // choix utilisateur
        int count = 0; // compte les éléments du tableau

        do {
            System.out.println(""" 
                    Choisissez une option :
                    - 1 pour ajouter un nouveau nombre,
                    - 2 pour voir les nombres existants,
                    - 3 pour quitter le programme.
                    """);
            // vérifier l'entrée = entier
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();

                switch (option) {
                    // OPTION 1
                    case 1:
                        System.out.println("Entrez un nombre à ajouter : ");
                        if (scanner.hasNextInt()) {
                            int nombre = scanner.nextInt();

                            // Vérifier si le tableau est plein
                            if (count == numbers.length) {
                                numbers = Arrays.copyOf(numbers, numbers.length * 2); // Double la taille
                            }
                            // Ajoute le nombre au tableau et incrémente count
                            numbers[count] = nombre;
                            count++;
                            System.out.println("Nombre ajouté avec succès !");
                        } else {
                            System.out.println("Erreur : Vous devez entrer un nombre entier valide !");
                            scanner.next(); // Consomme l'entrée invalide pour éviter une boucle infinie
                        }
                        break;
                        // OPTION 2
                    case 2:
                        if (count == 0) {
                            System.out.println("Aucun nombre n'a été ajouté pour l'instant.");
                        } else {
                            System.out.println("Nombres enregistrés : ");
                            for (int i = 0; i < count; i++) {
                                System.out.println("- " + numbers[i]);
                            }
                        }
                        break;
                    // OPTION 3
                    case 3:
                        System.out.println("Programme terminé, merci !");
                        break;
                    // Entrée incorrecte
                    default:
                        System.out.println("Option invalide, veuillez choisir une option valide.");
                        break;
                }
            } else {
                System.out.println("Erreur : Vous devez entrer un nombre entier valide !");
                scanner.next(); // Consomme l'entrée invalide pour éviter une boucle infinie
            }
        } while (option != 3);

        scanner.close();
    }
}
