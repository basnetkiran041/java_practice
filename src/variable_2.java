public class variable_2 {
    static int a = 10;
    void fun()
    {
        int b =10;
        System.out.println(a+" "+b);
        ++a;
        ++b;
    }
    public static void main(String[] args) {
        
        
        variable_2 r =new variable_2();
        r.fun();
        r.fun();
    }
}
