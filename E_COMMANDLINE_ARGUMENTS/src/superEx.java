public class superEx {
public static void main(String[] args) {
    cat c = new cat();
    c.eat();
    
}
}
class Animal{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class cat extends Animal{
    void eat(){
        super.eat();
        System.out.println("Cat is also eating");
    }
    
}