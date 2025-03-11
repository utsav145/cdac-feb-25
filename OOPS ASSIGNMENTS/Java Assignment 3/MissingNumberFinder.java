

public class MissingNumberFinder {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0;
        
        for (int num : arr) {
            arraySum += num;
        }
        
        
        return totalSum - arraySum; // The missing number
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example array (missing 3)
        int n = 6; // Since the array should contain numbers from 1 to 6
        
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
