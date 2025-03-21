package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {

        // Exercice déclaration de base
        int[] entiers = { 8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println(entiers[0]);
        System.out.println(entiers.length);
        System.out.println(entiers[entiers.length-1]);
        // System.out.println(entiers[10]); déclenche une erreur out of bounds

        // Exercice déclaration et modification
        String[] villes = {"Paris", "Rome", "Amsterdam", "Sydney", "Las Vegas"};
        for(String ville : villes) {
            System.out.println(ville);
        }
        System.out.println(villes.length);
        villes[3] = "Reims";
        for(String ville : villes) {
            System.out.println(ville);
        }


    }
}
