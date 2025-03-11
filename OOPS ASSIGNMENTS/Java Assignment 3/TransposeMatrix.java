import java.util.*;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Original Matrix:");
        for (int[] row : matrix) System.out.println(Arrays.toString(row));

        int[][] transposed = transpose(matrix);
        System.out.println("Transposed Matrix:");
        for (int[] row : transposed) System.out.println(Arrays.toString(row));
    }
}
