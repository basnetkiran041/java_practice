package animals;
class Animals{
    public void display()
    {
        System.out.println("All the animals in the world");
    }
}

public class Humans extends Animals{
    public void msgA()
    {
        System.out.println("Class A animals are Humans");
    }
    public void msgB()
    {
        System.out.println("Humans are animals with intelligence");
    }
}
