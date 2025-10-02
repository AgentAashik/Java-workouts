package OopsLearning;

class MultiplicationPolymorphism{
    public int multiplication(int firstValue, int secondValue){
        return firstValue * secondValue;
    }

    public int multiplication(int valueA, int valueB, int valueC){
        return valueA * valueB * valueC;
    }

    public double multiplication(double firstDecimal, double secondDecimal){
        return firstDecimal * secondDecimal;
    }

    public double multiplication(double decimalX, double decimalY, double decimalZ){
        return decimalX * decimalY * decimalZ;
    }
}

public class MultiplicationExample {
    public static void main(String[] args){
        MultiplicationPolymorphism calculator = new MultiplicationPolymorphism();
        System.out.println("Multiplication of 2 numbers:" + calculator.multiplication(5, 4));
        System.out.println("Multiplication of 3 numbers:" + calculator.multiplication(3, 7, 2));
        System.out.println("Multiplication of 2 double numbers:" + calculator.multiplication(2.5, 4.0));
        System.out.println("Multiplication of 3 double numbers:" + calculator.multiplication(1.5, 2.0, 3.0));
    }
}
