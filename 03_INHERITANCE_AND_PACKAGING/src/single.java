class A
{
    void MethodA()
    {
        System.out.println("This is method A");
    }
}

class B extends A
{
void MethodB()
{
    System.out.println("This is method B");

}
}

public class single {
    public static void main(String[] args) throws Exception {
        B bee = new B();
        bee.MethodA();
        bee.MethodB();
    }
}
