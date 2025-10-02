package OopsLearning;

abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class Toyota extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Toyota started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Toyota stopped");
    }
}

class BMW extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("BMW started");
    }

    @Override
    public void stopEngine() {
        System.out.println("BMW stopped");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Toyota car1 = new Toyota();
        car1.startEngine();
        car1.stopEngine();
        System.out.println();

        BMW car2 = new BMW();
        car2.startEngine();
        car2.stopEngine();
    }
}
