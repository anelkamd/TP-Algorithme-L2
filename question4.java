using System;

class Program {
    static void Main(string[] args) {
        // Déclaration des matrices A, B et S
        int[,] A = new int[3, 3];
        int[,] B = new int[3, 3];
        int[,] S = new int[3, 3];

        // Saisie des éléments de la matrice A par l'utilisateur
        Console.WriteLine("Entrez les éléments de la matrice A :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Console.Write($"A[{i+1}][{j+1}] : ");
                A[i, j] = Convert.ToInt32(Console.ReadLine());
            }
        }

        // Saisie des éléments de la matrice B par l'utilisateur
        Console.WriteLine("Entrez les éléments de la matrice B :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Console.Write($"B[{i+1}][{j+1}] : ");
                B[i, j] = Convert.ToInt32(Console.ReadLine());
            }
        }

        // Calcul de la somme des matrices A et B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                S[i, j] = A[i, j] + B[i, j];
            }
        }

        // Affichage de la matrice résultante S
        Console.WriteLine("La somme des matrices A et B est :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Console.Write($"{S[i, j]} ");
            }
            Console.WriteLine();
        }
    }
}
