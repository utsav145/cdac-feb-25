import java.util.*;

public class MergeSortedArrays1 {
    public static void mergeSortedArrays(int[] A, int[] B) {
        int p = A.length, q = B.length;
        int[] merged = new int[p + q];

        // Merge A and B into one sorted array
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            if (A[i] < B[j]) merged[k++] = A[i++];
            else merged[k++] = B[j++];
        }
        while (i < p) merged[k++] = A[i++];
        while (j < q) merged[k++] = B[j++];

        // Refill A and B with the required elements
        for (i = 0; i < p; i++) A[i] = merged[i];
        for (j = 0; j < q; j++) B[j] = merged[p + j];

        System.out.println("Sorted Arrays:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};
        mergeSortedArrays(A, B);
    }
}
