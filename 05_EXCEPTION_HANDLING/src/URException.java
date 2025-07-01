public class URException {
    public static void main(String[] args) {
        try{
            int a[]={1,2};
            a[3]=5/0;
        }
        catch(ArithmeticException a)
        {
            System.out.println("Divided by zero");
        }
        catch(Exception e)
        {
            System.out.println("Generic Expression");
        }

    }
}
