import java.util.*;

public class ZeroSumSubarrays {
    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sumMap.containsKey(sum)) {
                for (int startIdx : sumMap.get(sum)) {
                    System.out.println("Sub-array with 0 sum: " + Arrays.toString(Arrays.copyOfRange(arr, startIdx + 1, i + 1)));
                }
            }

            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {1, 3, -7, 3, 2, 3, 1, -3, -2, -2},
            {1, 2, -3, 4, 5, 6},
            {1, 2, -2, 3, 4, 5, 6}
        };

        for (int[] nums : testCases) {
            findZeroSumSubarrays(nums);
            System.out.println();
        }
    }
}
