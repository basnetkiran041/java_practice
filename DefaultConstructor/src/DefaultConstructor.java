public class DefaultConstructor {
    public static void main(String[] args){
        A ref= new A();
        ref.display();

    }  
    }
    

class A{
    int a; String b; boolean c;
    A()
    {
        a=10; b="kiran"; c=false;
    }
void display()
{
    System.out.println(a+ " "+b+ " "+c);
}
}