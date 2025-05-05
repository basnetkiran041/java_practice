public class accessPrivate {
    public static void main(String[] args) {
        myClass ref = new myClass();
        ref.show();
        
    }
    
}

class myClass
{
    private int a = 100;
    private void display()
    {
        System.out.println("Private value of a is :"+a);
    }
    void show()
    {
        display();
        System.out.println("Accessing private value of a :" +a);
    }
} 