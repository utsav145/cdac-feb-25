import java.util.*;

public class SumOfMatrices {
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] B = {
            {7, 8, 9},
            {10, 11, 12}
        };

        System.out.println("Matrix A:");
        for (int[] row : A) System.out.println(Arrays.toString(row));

        System.out.println("Matrix B:");
        for (int[] row : B) System.out.println(Arrays.toString(row));

        int[][] result = addMatrices(A, B);
        System.out.println("Sum of Matrices:");
        for (int[] row : result) System.out.println(Arrays.toString(row));
    }
}
