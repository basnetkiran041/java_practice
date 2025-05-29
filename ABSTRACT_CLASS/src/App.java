public class App {
    public static void main(String[] args) throws Exception {
        Lion li = new Lion();
        li.sound();
        li.eat("Flesh");
    }
}
abstract class Animal{
    abstract void sound();//Abstract method
    void eat(String food) //Normal method
    {
        System.out.println("This animal likes to eat "+food);
    }
}
class Lion extends Animal{
    void sound(){
        System.out.println("Lion Roars!!!!");
    }

}
