import java.util.*;

public class EvenOddSeparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) evenList.add(arr[i]);
            else oddList.add(arr[i]);
        }

        System.out.println("Even numbers: " + evenList);
        System.out.println("Odd numbers: " + oddList);
    }
}
