import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0; // Edge case: Empty array
        
        int j = 0; // Slow pointer for unique elements

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) { // Found a new unique element
                j++;
                arr[j] = arr[i]; // Move it forward
            }
        }
        
        return j + 1; // New length of the array with unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5}; // Sorted input array
        int newLength = removeDuplicates(arr);

        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
        System.out.println("New length: " + newLength);
    }
}
