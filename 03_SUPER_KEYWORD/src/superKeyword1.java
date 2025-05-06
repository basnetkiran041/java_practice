//use case 1 : To access super class members
public class superKeyword1 {
    public static void main(String[] args) throws Exception{
        Cat cat = new Cat();
        cat.eat();
        
    }
}
class Animal{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Cat extends Animal
{
    @Override
    void eat()
    {
        super.eat();
        System.out.println("Cat is also eating");
    }
}