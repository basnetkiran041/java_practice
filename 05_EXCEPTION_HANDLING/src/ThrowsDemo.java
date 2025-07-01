public class ThrowsDemo {
    void validate (int age) throws ArithmeticException
    {
        if(age<18)
          throw new ArithmeticException("Not valid");
        else
          System.out.println("Welcome to vote");
    }
    public static void main(String[] args) {
        try
        {
            ThrowsDemo td = new ThrowsDemo();
            td.validate(12);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
