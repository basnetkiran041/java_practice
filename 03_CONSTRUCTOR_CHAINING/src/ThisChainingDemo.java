class Person {
    String name;
    int age;

    // Default constructor (chains to 2-arg constructor)
    Person() {
        this("John Doe", 30); // Calls Person(String, int)
        System.out.println("Default constructor called");
    }

    // 1-arg constructor (chains to 2-arg constructor)
    Person(String name) {
        this(name, 25); // Calls Person(String, int)
        System.out.println("1-arg constructor called");
    }

    // 2-arg constructor (base constructor)
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("2-arg constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ThisChainingDemo {
    public static void main(String[] args) {
        System.out.println("Creating person1:");
        Person person1 = new Person(); 
        person1.display();

        System.out.println("\nCreating person2:");
        Person person2 = new Person("Alice");
        person2.display();
    }
}