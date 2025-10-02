public class TypeCastingExample {
    public static void main(String[] args) {
        short items = 300;
        long longItems = items;

        longItems = 700L;

        double discount = 99.99;
        int intDiscount = (int) discount;

        int population = 1500;
        short shortPopulation = (short) population;

        System.out.println("longItems ===> " + longItems);
        System.out.println("intDiscount ===> " + intDiscount);
        System.out.println("shortPopulation ===> " + shortPopulation);
    }
}
