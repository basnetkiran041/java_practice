public class accessPublic{
    
    public int legCount;
    
    public void display()
    {
        System.out.println("I have a Dag");
        System.out.println("It has"+legCount+ "legs");
    }
    
    public class Animal {
    }
    public static void main(String[] args) {
        accessPublic an = new accessPublic();
        an.legCount = 4;
        an.display();
    }
}
