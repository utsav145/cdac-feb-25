import java.util.*;

public class SubarraySum {
    public static void findSubarrayWithSum(int[] arr, int targetSum) {
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > targetSum && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == targetSum) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray found with sum " + targetSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;

        findSubarrayWithSum(arr, targetSum);
    }
}
