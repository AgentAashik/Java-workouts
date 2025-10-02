public class JavaWorkout {

    public static void main(String[] args) {
        // 1. Primitive Data Types Workout
        System.out.println("=== Primitive Data Types Workout ===");
        byte age = 25;
        short year = 2025;
        int population = 500000;
        long phoneNumber = 9876543210L;
        float cgpa = 8.76f;
        double pi = 3.14159;
        char grade = 'A';
        boolean isPassed = true;

        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Population: " + population);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Value of pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);

        // 2. Literals Workout
        System.out.println("\n=== Literals Workout ===");
        int decimalLiteral = 100;
        int binaryLiteral = 0b1101;    // 13 in decimal
        int octalLiteral = 0123;       // 83 in decimal
        int hexLiteral = 0xFF;         // 255 in decimal

        float floatLiteral = 12.34f;
        double doubleLiteral = 56.78;

        char charLiteral = 'Z';
        String stringLiteral = "Workout Code";
        boolean boolLiteral = false;

        System.out.println("Decimal literal: " + decimalLiteral);
        System.out.println("Binary literal (0b1101): " + binaryLiteral);
        System.out.println("Octal literal (0123): " + octalLiteral);
        System.out.println("Hex literal (0xFF): " + hexLiteral);
        System.out.println("Float literal: " + floatLiteral);
        System.out.println("Double literal: " + doubleLiteral);
        System.out.println("Char literal: " + charLiteral);
        System.out.println("String literal: " + stringLiteral);
        System.out.println("Boolean literal: " + boolLiteral);

        // 3. Non-Primitive Data Types: String Comparison
        System.out.println("\n=== String Comparison Workout ===");
        String one = new String("Hello");
        String two = "Hello";

        System.out.println("one == two (reference comparison): " + (one == two));
        System.out.println("one.equals(two) (content comparison): " + one.equals(two));

        // 4. ASCII Value Calculation Exercise
        System.out.println("\n=== ASCII Value Calculation ===");
        char ch1 = 'X';
        char ch2 = 'b';
        int sum = ch1 + ch2;
        System.out.println("Sum of ASCII values of '" + ch1 + "' and '" + ch2 + "': " + sum);

        // 5. Boolean Logic Practice
        System.out.println("\n=== Boolean Logic Workout ===");
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        boolean result = (isJavaFun && isFishTasty);

        System.out.println("Is Java Fun AND Fish Tasty? " + result);
    }
}
