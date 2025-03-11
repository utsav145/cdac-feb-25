import java.util.*;

public class ArrayOperations {
    public static void findUnionAndIntersection(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();
        Set<Integer> arr1Set = new HashSet<>();

        // Add all elements of arr1 to unionSet
        for (int num : arr1) {
            unionSet.add(num);
            arr1Set.add(num);
        }

        // Add elements of arr2 to unionSet and check for intersection
        for (int num : arr2) {
            if (arr1Set.contains(num)) {
                intersectionSet.add(num);
            }
            unionSet.add(num);
        }

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 1, 5, 2, 3, 6};
        int[] arr2 = {3, 8, 6, 20, 7};

        findUnionAndIntersection(arr1, arr2);
    }
}
