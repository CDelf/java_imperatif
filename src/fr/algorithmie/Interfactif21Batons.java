package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int batonsRestants = 21;

    public static void main(String[] args) {
        // Jeu des 21 bâtons : chacun son tour, l'ordinateur et l'utilisateur
        // peuvent prendre 1 à 3 bâtons. Celui qui prend le dernier a perdu !
        System.out.println("Bienvenue dans le jeu des 21 bâtons !");

        // Qui commence ?
        boolean tourJoueur = random.nextBoolean();
        System.out.println(tourJoueur ? "Vous commencez !" : "Je commence !");

        // Déroulement du jeu
        while (batonsRestants > 0) {
            if (tourJoueur) {
                tourUtilisateur();
            } else {
                tourOrdinateur();
            }

            // Vérifier si la partie est terminée
            if (batonsRestants <= 0) {
                if (tourJoueur) {
                    System.out.println("Vous avez pris le dernier bâton. Vous avez perdu ! =( ");
                } else {
                    System.out.println("J'ai pris le dernier bâton. Vous avez gagné ! =D ");
                }
                break;
            }

            // Changement de tour
            tourJoueur = !tourJoueur;
        }
        scanner.close();
    }

    // Logique du jeu de l'ordinateur à chaque tour
    public static void tourOrdinateur() {
        int jeuOrdinateur = Math.min(random.nextInt(3) + 1, batonsRestants);
        batonsRestants -= jeuOrdinateur;
        System.out.println("Je prends " + jeuOrdinateur + " bâton(s). Il reste " + batonsRestants + " bâton(s).");
    }

    // Logique du jeu de l'utilisateur à chaque tour
    public static void tourUtilisateur() {
        int jeuUtilisateur;
        do {
            System.out.println("Combien de bâtons prenez-vous ? (1, 2 ou 3)");
            if(scanner.hasNextInt()) {
                jeuUtilisateur = scanner.nextInt();
            } else {
                System.out.println("Ceci n'est pas un entier.");
                jeuUtilisateur = 0;
                scanner.next();
            }
        } while (jeuUtilisateur < 1 || jeuUtilisateur > 3 || jeuUtilisateur > batonsRestants);

        batonsRestants -= jeuUtilisateur;
        System.out.println("Vous avez pris " + jeuUtilisateur + " bâton(s). Il reste " + batonsRestants + " bâton(s).");
    }
}

