package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {
        // Ecrire un jeu qui fait deviner un nombre entre 1 et 100 à l'utilisateur:
        // à chacune de ses réponses, indique plus/moins/gagné en n coups

        // Générer un nombre aléatoire entre 1 et 100
        Random random = new Random();
        int chiffreADeviner = random.nextInt(100) + 1;
        //System.out.println(chiffreADeviner);

        int reponse = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Le but du jeu est de deviner un entier entre 1 et 100, en faisant le moins de tentatives possible.
                Prêt? C'est parti!"""
        );
        // Affichage conditionnel des indices
        do {
            // vérifier l'entrée = entier
            if (scanner.hasNextInt()) {
                reponse = scanner.nextInt();
                count++;
                // indices plus ou moins
                if (reponse < chiffreADeviner) {
                    System.out.println("C'est plus!");
                } else if (reponse > chiffreADeviner) {
                    System.out.println("C'est moins!");
                }
                // Si l'entrée n'est pas un entier, message d'erreur
            } else {
                System.out.println("Erreur : Vous devez entrer un nombre entier valide !");
                scanner.next(); // Consomme l'entrée invalide pour éviter une boucle infinie
            }
        } while (reponse != chiffreADeviner);
        scanner.close();

        // Réponse trouvée : affichage du résultat
        System.out.println("Bravo! C'était bien " + chiffreADeviner + "! Vous avez trouvé en " + count + " coups!");
    }
}
