import java.util.*;

public class DiagonalSum {
    public static int findDiagonalSum(int[][] matrix) {
        int n = matrix.length, sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i] + matrix[i][n - i - 1];
        }
        
        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Diagonal Sum: " + findDiagonalSum(matrix));
    }
}
