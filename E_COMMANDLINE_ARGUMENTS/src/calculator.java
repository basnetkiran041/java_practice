public class calculator {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        cal.add(5, 5);
        cal.add(5, 05, 05);
        
    }
}
class Calculation{
    public void add(int a, int b)
    {
       int sum = a+b;
        System.out.println("First sum is"+sum);
    }
    public void add(int x, int y,int z)
    {
        int sum=x+y+z;
        System.out.println("First sum is"+sum);
    }
}