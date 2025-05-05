public class byValue {

    int a = 100;

    public void display(int a) // parameterized constructor
    {
        a = a + 100;

    }

    public static void main(String[] args) throws Exception {
        byValue rect = new byValue();
        System.out.println("The value before changing is :" + rect.a);
        rect.display(500); //Here the display method is called by value

        System.out.println("The value after changing is :" + rect.a);

    }
}
