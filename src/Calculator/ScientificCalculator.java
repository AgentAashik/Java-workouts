package Calculator;

import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Scientific Calculator");
        System.out.println("-----------------------------------");
        System.out.println("1. sinθ");
        System.out.println("2. cosθ");
        System.out.println("3. tanθ");

        System.out.print("Enter the option: ");
        int option = sc.nextInt();

        System.out.print("Enter the value: ");
        double degrees = sc.nextDouble();

        double radians = Math.toRadians(degrees);
        double result = 0;
        String function = "";

        switch (option) {
            case 1 -> {
                result = Math.sin(radians);
                function = "sin";
            }
            case 2 -> {
                result = Math.cos(radians);
                function = "cos";
            }
            case 3 -> {
                result = Math.tan(radians);
                function = "tan";
            }
        }

        System.out.printf("o/p: %s %.0f = %.6f%n", function, degrees, result);
        sc.close();
    }
}
