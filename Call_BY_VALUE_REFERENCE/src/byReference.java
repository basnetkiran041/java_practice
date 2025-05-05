public class byReference {

    int a = 100;

    public void show(byReference rect) // parameterized constructor
    {
        a = a + 100;

    }

    public static void main(String[] args) throws Exception {
        byReference rect = new byReference();
        System.out.println("The value before changing is :" + rect.a);
        rect.show(rect);

        System.out.println("The value after changing is :" + rect.a);

    }
}
