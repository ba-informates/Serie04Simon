import java.util.Scanner;

public class TriangleDePascal {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        int n = scanner.nextInt();

        int triangles[][] = new int[n][];

        for (int i = 0; i < n; i++) {

            int cols = i + 1;

            triangles[i] = new int[cols];
            triangles[i][0] = 1;

            System.out.print(1);

            if (i > 0) {
                int[] prevLine = triangles[i-1];
                for (int j = 1; j < (cols-1); j++) {
                    triangles[i][j] = prevLine[j-1] + prevLine[j];
                    System.out.print(" | " +triangles[i][j]);
                }

                triangles[i][cols-1] = 1;

                System.out.print(" | " +1);
            }


            System.out.println();

        }

    }

}
