

public class protected1 {
    public static void main(String[] args) {
        Rohan r = new Rohan();
        r.show();
    }
    
}
class Student
{
    protected int a = 50;
    protected void display()
    {
        System.out.println("The roll no. of student is:"+a);
    }
}
    class Rohan extends Student
    {
        public void show()
    {
        display();
    }
    
    }