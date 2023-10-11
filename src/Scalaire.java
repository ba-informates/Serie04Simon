import java.util.Scanner;

public class Scalaire {

    private static Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {

        final int nMax = 10;

        double[] v1 = new double[nMax];
        double[] v2 = new double[nMax];

        System.out.println("Merci d'entrez la taille effective des vecteurs n :");

        int size = scanner.nextInt();

        if (size < 1 || size > nMax) {
            System.out.println("Merci d'entrez le bon n.");
            return;
        }

        for (int j = 1; j <= 2; j++) {
            for (int i = 0; i < size; i++) {
                System.out.println("Merci d'entrez la coordonnée " + i + " du vecteur " + j + " :");
                int value = scanner.nextInt();
                if (j == 1) v1[i] = value;
                else v2[i] = value;
            }
        }

        int pScalaire = 0;

        for (int i = 0; i < size; i++) {
            pScalaire += v1[i]*v2[i];
        }

        System.out.println("Le produit scalaire est " + pScalaire);


    }

    
}
