package OopsLearning.abstraction;

import java.util.Scanner;

class AbstractCal extends AbstractMethod {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int sub(int num1, int num2) {
        return num1 - num2;
    }
    public int mul(int num1, int num2) {
        return num1 * num2;
    }
    public int div(int num1, int num2) {
        return num1 / num2;
    }
}

public class CalculationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number:");
        int first_number = sc.nextInt();

        System.out.println("Second number:");
        int second_number = sc.nextInt();

        AbstractMethod obj = new AbstractCal();
        try {
            System.out.println("Sum: " + obj.add(first_number, second_number));
            System.out.println("Difference: " + obj.sub(first_number, second_number));
            System.out.println("Product: " + obj.mul(first_number, second_number));
            if (first_number > second_number && second_number != 0) {
                System.out.println("Result of division: " + obj.div(first_number, second_number));
            } else if (second_number == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println("No division possible");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
