import java.util.Arrays;
import java.util.Scanner;

public class Napoleon {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        String noms = "Napoleon Bonaparte Bill Gates Claudia Schiffer Martina Hingis";

        String prenomEntre = scanner.nextLine();

        String[] parsed = noms.split(" ");

        int prenomIdx = Arrays.asList(parsed).indexOf(prenomEntre);

        if (prenomIdx % 2 == 1) {
            System.out.println("Vous avez entré un nom de famille.");
            return;
        }

        int ndfIdx = prenomIdx+1;

        String nomEntre = parsed[ndfIdx];

        System.out.println("Le nom de famille est " + nomEntre);

        

        
    }


}
