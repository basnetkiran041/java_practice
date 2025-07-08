public class ThreadPriority {
    public static void main(String[] args) {
        Thread1 a = new Thread1();
        Thread2 b = new Thread2();
        Thread3 c = new Thread3();
        System.out.println("Default Priority of Thread1 is:"+a.getPriority());
        System.out.println("Default Priority of Thread2 is:"+b.getPriority());
        System.out.println("Default Priority of Thread3 is:"+c.getPriority());
        a.setPriority(Thread.MIN_PRIORITY);
        b.setPriority(Thread.NORM_PRIORITY);
        c.setPriority(Thread.MAX_PRIORITY);
        System.out.println("New Thread Priority of Thread 1 is:"+a.getPriority());
        System.out.println("New Thread Priority of Thread 2 is:"+b.getPriority());
        System.out.println("New Thread Priority of Thread 3 is:"+c.getPriority());
        a.start();
        b.start();
        c.start();


    }
}
class Thread1 extends Thread
{
    public void run()
    {
        for(int i =0; i<=5; i++){
            System.out.println("Thread1 i="+i);
        }
        System.out.println("Thread 1 is terminated");
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        for(int j =0; j<=5; j++){
            System.out.println("Thread2 j="+j);
        }
        System.out.println("Thread 2 is terminated");
    }
}
class Thread3 extends Thread
{
    public void run()
    {
        for(int k =0; k<=5; k++){
            System.out.println("Thread3 k="+k);
        }
        System.out.println("Thread 3 is terminated");
    }
}