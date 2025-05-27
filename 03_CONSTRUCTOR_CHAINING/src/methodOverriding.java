public class methodOverriding {
    public static void main(String[] args) {
        Animal an = new Dog();
        an.eat();
    }
}

class Animal
{
    public void eat()
    {
        System.out.println("Eat all eatables");
    }
}
class Dog extends Animal
{
    public void eat()
    {
        super.eat();
        System.out.println("Dog likes eating bones");
    }

}
