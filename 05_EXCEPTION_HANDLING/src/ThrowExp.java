public class ThrowExp {
    void validate(int age)
    {
        if (age<18) {
            throw new ArithmeticException("Not valid");
        }
        else
        System.out.println("Welcome to vote");
    }
   public static void main(String[] args) {
    ThrowExp t = new ThrowExp();
    t.validate(13);
    System.out.println("rest of the code");
   } 
}
