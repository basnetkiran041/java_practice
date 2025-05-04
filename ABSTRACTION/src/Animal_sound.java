abstract class Animal {

    abstract void sound();

        void sleep()
        {
            System.out.println("Zzzzzz.......");

        }
    }

    class Dog extends Animal {

        void sound() {
            System.out.println("Bark");
        }

    }

    class Cat extends Animal {

        void sound() {
            System.out.println("Meow");
        }
    }



public class Animal_sound {
    public static void main(String[] args) throws Exception {
        Dog d = new Dog();
        d.sound();
        d.sleep();

        Cat c = new Cat();
        c.sound();
        c.sleep();
    }
}
