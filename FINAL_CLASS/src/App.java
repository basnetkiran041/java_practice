public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Bike b =new Bike();
        b.run();
    }
}
final class Bike{
    public void run()
    {
        System.out.println("Bike is running at the speed of 50kmph");
    }
}
class Honda extends Bike{
    public void run(){
        System.out.println("Honda runs even faster");
    }
}