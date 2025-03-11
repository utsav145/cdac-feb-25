import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] physics = new int[20], chemistry = new int[20], maths = new int[20];
        int highScoreCount = 0, lowScoreCount = 0;

        System.out.println("Enter marks for 20 students (Physics, Chemistry, Maths):");
        for (int i = 0; i < 20; i++) {
            physics[i] = scanner.nextInt();
            chemistry[i] = scanner.nextInt();
            maths[i] = scanner.nextInt();

            double aggregate = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            if (aggregate >= 75) highScoreCount++;
            if (aggregate <= 40) lowScoreCount++;
        }

        System.out.println("Number of students securing 75% and above: " + highScoreCount);
        System.out.println("Number of students securing 40% and below: " + lowScoreCount);
    }
}
