class Vehicle {
    String type;

    // Superclass constructor
    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle constructor called");
    }
}

class Car extends Vehicle {
    int wheels;

    // Subclass constructor (chains to superclass constructor)
    Car(String type, int wheels) {
        super(type); // Must call super() first
        this.wheels = wheels;
        System.out.println("Car constructor called");
    }

    void display() {
        System.out.println("Type: " + type + ", Wheels: " + wheels);
    }
}

public class SuperChainingDemo {
    public static void main(String[] args) {
        System.out.println("Creating car:");
        Car car = new Car("Land", 4);
        car.display();
    }
}