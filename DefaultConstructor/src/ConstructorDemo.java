class A{
    int a;
    String name;
    A(){
        a=5;
        name="kiran";
    }
    
    
    void show()
    {
        System.out.println(a+" "+name);
    }

}
public class ConstructorDemo {
public static void main(String args[])
{
A r=new A();
r.show();
}
    
}
