import java.util.Scanner;

public class AdditionMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclaration des matrices A, B et S
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] S = new int[3][3];

        // Saisie des éléments de la matrice A par l'utilisateur
        System.out.println("Entrez les éléments de la matrice A :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + (i+1) + "][" + (j+1) + "] : ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Saisie des éléments de la matrice B par l'utilisateur
        System.out.println("Entrez les éléments de la matrice B :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + (i+1) + "][" + (j+1) + "] : ");
                B[i][j] = scanner.nextInt();
            }
        }

        // Calcul de la somme des matrices A et B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                S[i][j] = A[i][j] + B[i][j];
            }
        }

        // Affichage de la matrice résultante S
        System.out.println("La somme des matrices A et B est :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(S[i][j] + " ");
            }
            System.out.println();
        }
    }
}
