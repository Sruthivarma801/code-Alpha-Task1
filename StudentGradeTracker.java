import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();

        // Input grades
        System.out.println("Enter the grades of the students:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Grade of student " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        // Calculate highest, lowest, and average grades
        int highest = grades.get(0);
        int lowest = grades.get(0);
        int total = 0;

        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
            total += grade;
        }

        double average = (double) total / grades.size();

        // Display results
        System.out.println("\n--- Grade Summary ---");
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("Average Grade: " + average);

        scanner.close();
    }
}
