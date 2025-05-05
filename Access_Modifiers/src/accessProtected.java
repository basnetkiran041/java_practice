class Animal {
    protected int a = 10;  // protected variable

    // protected method
    protected void display() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    public void Show() {
        display();        // call protected method from Animal
        System.out.println(a);  // access protected variable from Animal
    }
}

public class accessProtected {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Show();
    }
}
