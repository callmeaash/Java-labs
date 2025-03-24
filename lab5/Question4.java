import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 3;
        int[][] matrix1 = new int[N][N];
        int[][] matrix2 = new int[N][N];
        System.out.println("Enter the elements of matrix A: ");
        getElements(matrix1, N, sc);
        System.out.println("Enter the elements of matrix B: ");
        getElements(matrix2, N, sc);

        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = 0;
                for (int k = 0; k < N; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for (int[] row : result) {
            for (int element : row) {
                System.out.printf("%d\t", element);
            }
            System.out.println();
        }
        sc.close();
    }

    private static void getElements(int[][] matrix, int n, Scanner sc){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}
