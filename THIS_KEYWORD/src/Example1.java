public class Example1 {

    void show()
    {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Example1 ref = new Example1();
        System.out.println(ref);
        ref.show();


    }
}
