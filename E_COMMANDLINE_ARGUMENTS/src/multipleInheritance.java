interface InterfaceA{
    void methodA();

}
interface InterfaceB{
    void methodB();
}

public class multipleInheritance implements InterfaceA,InterfaceB{
    public static void main(String[] args) {
        multipleInheritance cee = new multipleInheritance();
        cee.methodA();
        cee.methodB(); 
        
        
    }

public void methodA()
{
    System.out.println("This is method A");
}
public void methodB()
{
    System.out.println("This is method B");
}
}