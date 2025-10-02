package set;

import java.util.*;

class StudentTreeSet {
    TreeSet<String> students = new TreeSet<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter student name: ");
        String student = sc.nextLine();
        if (students.add(student)) {
            System.out.println("Student added!");
        } else {
            System.out.println("Student already exists!");
        }
    }

    public void removeStudent() {
        if (!students.isEmpty()) {
            System.out.print("Enter student to remove: ");
            String student = sc.nextLine();
            if (students.remove(student)) {
                System.out.println("Student removed!");
            } else {
                System.out.println("Student not found!");
            }
        } else {
            System.out.println("No students!");
        }
    }

    public void displayStudents() {
        if (!students.isEmpty()) {
            System.out.println("Students:");
            for (String student : students) {
                System.out.println("- " + student);
            }
            System.out.println("First: " + students.first());
            System.out.println("Last: " + students.last());
        } else {
            System.out.println("No students!");
        }
    }
}

public class StudentTreeSetManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentTreeSet studentSet = new StudentTreeSet();

        System.out.println("=== STUDENT COLLECTION ===");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Display Students");
        System.out.println("4. Exit");

        while (true) {
            System.out.print("\nChoose option (1-4): ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> studentSet.addStudent();
                case 2 -> studentSet.removeStudent();
                case 3 -> studentSet.displayStudents();
                case 4 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}

