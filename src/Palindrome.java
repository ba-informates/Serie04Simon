import java.util.Scanner;

public class Palindrome {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String chain = scanner.nextLine();

        String finalString = "";
        String finalReversedString = "";

        for (int i = 0; i < chain.length(); i++) {
            if (Character.isLetter(chain.charAt(i))) {
                finalString += chain.charAt(i);
                finalReversedString = chain.charAt(i) + finalReversedString;
            }
        }

        if (finalReversedString.toLowerCase().equals(finalString.toLowerCase())) {
            System.out.println("ouké");
        }

    }
}
