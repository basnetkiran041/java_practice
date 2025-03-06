public class variable {
    
static int b = 20; //static variable - using static keyword
int c = 30; //instance variable - inside class but outside of method parameter
    public static void main(String args[])
    {
        int a = 10;//local variable - insde of the method or method parameter.
        variable ref = new variable();
        System.out.println(a);
        System.out.println(variable.b);
        System.out.println(ref.c);
    }
    
}
