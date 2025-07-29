public class exceotionPractice {
    public static void main(String[] args) {
        try{
            int arr[]={1,2};
            arr[4]=3/0;
        }
        catch(ArithmeticException a)
        {
            System.out.println("Divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Array index is out of bound");
        }
    }
    
}
