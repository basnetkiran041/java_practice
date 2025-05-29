public class App {
    public static void main(String[] args) throws Exception {
        Animal an = new Dog();
        an.eat();
        // an.sound();
    }
}

class Animal {
    public void eat() {
        System.out.println("Eat all eatables");
    }
}
class Dog extends Animal{
    public void eat(){
            super.eat();
        System.out.println("Dog like eating bones");
    }

    public void sound(){
        System.out.println("Dog barks");
    }

}