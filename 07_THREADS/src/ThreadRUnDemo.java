public class ThreadRUnDemo {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
        t.start();
        
    }
}
class A implements Runnable
{
    public void run()
    {
        for(int i =0; i<=5; i++)
        {
            System.out.println("Thread a value ="+i);
        }
    }
}
