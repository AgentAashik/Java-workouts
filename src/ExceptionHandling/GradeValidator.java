package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeValidator {
    public void validateGrade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        } else {
            System.out.println("Grade validated. Marks: " + marks);
            if (marks >= 90) System.out.println("Grade: A");
            else if (marks >= 80) System.out.println("Grade: B");
            else if (marks >= 70) System.out.println("Grade: C");
            else if (marks >= 60) System.out.println("Grade: D");
            else System.out.println("Grade: F");
        }
    }
    public static void main(String args[]) {
        GradeValidator obj = new GradeValidator();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks (0-100):");
            int marks = sc.nextInt();
            obj.validateGrade(marks);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid marks! " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("Unexpected Error occurred.");
        }
    }
}
