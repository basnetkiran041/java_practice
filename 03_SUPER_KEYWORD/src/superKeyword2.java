class Vehicle {
    String type;
    Vehicle(String type) {
        this.type = type;
    }
}

class Car extends Vehicle {
    int wheels;
    Car(String type, int wheels) {
        super(type); // Must call super() first
        this.wheels = wheels;
    }
}

public class superKeyword2 {
    public static void main(String[] args) {
        Car car = new Car("Land", 4);
        System.out.println(car.type + " vehicle with " + car.wheels + " wheels");
        // Output: Land vehicle with 4 wheels
    }
}