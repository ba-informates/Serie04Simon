import java.util.Scanner;

public class Conversion {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String args[]) {

        System.out.println("Entrez une lettre : ");

        char lettre = scanner.next().charAt(0);

        int unicode = (int) lettre;

        if (
            (unicode < 65 || unicode > 90) &&
            (unicode < 97 || unicode > 122)
        ) {
            System.out.println("Merci d'écrire une lettre de l'alphabet entre A et Z (minuscule ou majuscule).");
            return;
        }

        int delta = 97 - 65;
        int matchingUnicode = unicode + (unicode < 90 ? delta : -delta);
        char matchingChar = (char) matchingUnicode;

        System.out.println("La lettre correspondante est " + matchingChar);

    }

}
