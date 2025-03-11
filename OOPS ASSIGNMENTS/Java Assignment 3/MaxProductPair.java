import java.util.*;

public class MaxProductPair {
    public static void findMaxProduct(int[] nums) {
        if (nums.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        Arrays.sort(nums);
        int n = nums.length;
        
        // Consider both cases: largest two numbers OR smallest two (negative) numbers
        int product1 = nums[n - 1] * nums[n - 2];
        int product2 = nums[0] * nums[1];

        if (product1 > product2) {
            System.out.println("Pair is (" + nums[n - 2] + ", " + nums[n - 1] + "), Maximum Product: " + product1);
        } else {
            System.out.println("Pair is (" + nums[0] + ", " + nums[1] + "), Maximum Product: " + product2);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
        findMaxProduct(nums);
    }
}
