package fr.declaration.variable;

public class DeclarationApp {

    public static void main(String[] args) {
        byte b = 1;
        short s = 200;
        int i = 200000;
        long l = 1_000_000L;

        float f = 0.1f;
        double db = 1.234;

        char c = 'a';
        String str = "abcd";
        boolean bo = true;

        System.out.println("String : " + str);

        String randomString = "Voici le résultat d’un calcul : \n 1+5=6";
        System.out.println(randomString);
    }
}
