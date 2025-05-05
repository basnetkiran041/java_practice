public class methodOverloading {
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
        System.out.println(cal.Calculate(5, 04));
        System.out.println(cal.Calculate(2, 04, 6));
    }
}
class Calculator{
    public int Calculate(int a, int b)
    {
        return a+b;
    }
    public int Calculate(int a, int b, int c)
    {
        return a+b+c;
    }
    
}