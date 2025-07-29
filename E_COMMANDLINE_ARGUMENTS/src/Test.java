class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        this("Puppy"); // calling parameterized constructor of same class
        System.out.println("Default Dog constructor called");
    }

    Dog(String name) {
        super(); // calling parent (Animal) constructor
        System.out.println("Dog name is: " + name);
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
