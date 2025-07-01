public class FinallyCase1 {
    public static void main(String[] args) {
        try
        {
            int data = 35/5;
            System.out.println(data);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block is always executed");
        }
        System.out.println("rest of the code......");
    }
    
}
