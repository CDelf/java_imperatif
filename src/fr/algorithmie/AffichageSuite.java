package fr.algorithmie;

public class AffichageSuite {

    public static void main(String[] args) {
    // Exercice : utiliser les boucles for/while

        // Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
        System.out.println("Boucle for : nombres de 1 à 10");
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }
        System.out.println("----------------");

        // Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
        System.out.println("Boucle for : nombres pairs entre 0 et 10");
        for(int j=0; j<=10; j+=2) {
            System.out.println(j);
        }
        System.out.println("----------------");
        // Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
        System.out.println("Boucle for : nombres impairs de 0 à 9");
        for(int k=1; k<=9; k+=2) {
            System.out.println(k);
        }
        System.out.println("----------------");

        // Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
        System.out.println("Boucle while : nombres de 1 à 10");
        int l = 1;
        while(l <= 10) {
            System.out.println(l);
            l++;
        }
        System.out.println("----------------");

        // Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
        System.out.println("Boucle while : nombres pairs de 0 à 10");
        int m = 0;
        while(m <= 10) {
            System.out.println(m);
            m += 2;
        }
        System.out.println("----------------");

        // Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
        System.out.println("Boucle while : nombres impairs de 0 à 9");
        int n = 1;
        while(n <= 9) {
            System.out.println(n);
            n +=2;
        }
        System.out.println("----------------");
    }
}
