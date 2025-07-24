
import java.util.Scanner;
public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Number of subjects
        System.out.print("Enter number of subjects: ");
        int numSubjects = input.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Input: Marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = input.nextInt();

            // Optional: Validate input is within 0-100
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid marks. Please enter marks between 0 and 100: ");
                marks[i] = input.nextInt();
            }

            totalMarks += marks[i];
        }

        // Calculate Average Percentage
        double average = (double) totalMarks / numSubjects;

        // Grade Calculation
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + totalMarks + "/" + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        input.close();
    }
}
