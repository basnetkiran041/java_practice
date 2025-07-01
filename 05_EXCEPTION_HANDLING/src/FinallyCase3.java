public class FinallyCase3 {
    public static void main(String[] args) {
        try{
            int data = 35/0;
            System.out.println(data);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divided by zero");
        }
        finally
        {
            System.out.println("Finally block is always executed");
        }
        System.out.println("rest of the code");
    }
    
}
