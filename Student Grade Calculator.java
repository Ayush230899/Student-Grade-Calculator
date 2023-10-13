import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        double totalGrade = 0.0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the grade for subject " + i + ": ");
            double grade = scanner.nextDouble();
            totalGrade += grade;
        }
        double averageGrade = totalGrade / numSubjects;
        System.out.println("Average Grade: " + averageGrade);
        String letterGrade = calculateLetterGrade(averageGrade);
        System.out.println("Letter Grade: " + letterGrade);
        scanner.close();
    }
    public static String calculateLetterGrade(double averageGrade) {
        if (averageGrade >= 90.0) {
            return "A";
        } else if (averageGrade >= 80.0) {
            return "B";
        } else if (averageGrade >= 70.0) {
            return "C";
        } else if (averageGrade >= 60.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
