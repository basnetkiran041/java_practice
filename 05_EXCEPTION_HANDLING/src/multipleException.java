public class multipleException {
    public static void main(String[] args) {
        try{
            int arr[]={1,2};
            arr[4]=3/0;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Divided by zero");

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound");
        }
    }
    
}
