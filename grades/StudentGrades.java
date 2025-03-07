import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numofSubjects = sc.nextInt();
        
        int[] marks = new int[numofSubjects];
        int totalMarks = 0;
        
        for (int i = 0; i < numofSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        
        double avgPer = (double) totalMarks / numofSubjects;
        char grade;
        
        if (avgPer >= 90) {
            grade = 'A';
        } else if (avgPer >= 80) {
            grade = 'B';
        } else if (avgPer >= 70) {
            grade = 'C';
        } else if (avgPer >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPer + "%");
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
