import java.util.*;

public class MaxElementMatrix {
    public static int findMaxElement(int[][] matrix) {
        int maxElement = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int element : row) {
                maxElement = Math.max(maxElement, element);
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 23, 5},
            {9, 18, 7},
            {3, 15, 21}
        };

        System.out.println("Maximum Element in Matrix: " + findMaxElement(matrix));
    }
}
