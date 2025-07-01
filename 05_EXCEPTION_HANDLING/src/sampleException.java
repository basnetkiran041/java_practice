public class sampleException {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 10;
        try
        {
            int c = b/a;
            System.out.println("The result is "+c);

        }
        catch(ArithmeticException e)
        {
            System.out.println("Divided by zero");

        }
        int sum = a+b;
        System.out.println("Sum is "+sum);

    }
}
