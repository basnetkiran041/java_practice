public class Example2 {

    int b;
    Example2(int b)
    {
        this.b = b;


    }
    void display()
    {
        System.out.println(b);
    }

    public static void main(String[] args) {
        Example2 ex = new Example2(678);
        ex.display();

    }
}
