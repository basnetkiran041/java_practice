public class AbstractingUsingproivate {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 06);
        rect.Area();
        
    }
}
class Rectangle{
    private int length;
    private int breadth;
    Rectangle(int l, int b)
    {
        this.length = l;
        this.breadth = b;
    }
    public void Area()
    {
        System.out.println(length*breadth);
    }
}
