class A{
    int a,b;
    A(int x, int y){
        a=x;
        b=y;
    }
    void show(){
        System.out.println(a+" "+b);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        A ref=new A(100, 2000);
        ref.show();
    }
    
}
