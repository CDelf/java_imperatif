package fr.algorithmie;

public class CaracteresConsecutifs {

    public static void main(String[] args) {
        // transformer une chaîne en comptant les répétitions successives
        String str1 = "aaabbc";    // attendu: a3b2c1
        String str2 = "zzzzyyyxxw"; // attendu : z4y3x2w1
        String str3 = "abcd"; // a1b1c1d1
        String str4 = ""; // vérifier retour sur chaîne vide

        // Affichage des résultats
        System.out.println("Résultat pour : " + str1 + " : " + countCarCons(str1));
        System.out.println("Résultat pour : " + str2 + " : " + countCarCons(str2));
        System.out.println("Résultat pour : " + str3 + " : " + countCarCons(str3));
        System.out.println("Résultat pour : " + str4 + " : " + countCarCons(str4)); // pas d'erreur
    }

    public static String countCarCons(String str) {
        if(str.isEmpty()) return "tableau vide"; // Vérification pour éviter les erreurs

        StringBuilder result = new StringBuilder(); // Utilisation de StringBuilder pour optimiser la concaténation
        int count = 1; // Compteur de caractère

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++; // Compter les répétitions successives
            } else {
                result.append(str.charAt(i - 1)).append(count); // Ajoute le caractère et le count
                count = 1; // Réinitialisation du compteur
            }
        }
        result.append(str.charAt(str.length() - 1)).append(count); // Ajout du dernier groupe
        return result.toString(); // Conversion de StringBuilder en string
    }
}