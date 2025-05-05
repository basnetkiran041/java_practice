public class methodOverriding 
{
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.draw();
    }
    
}


class Shape
{
    public void draw()
    {
        System.out.println("Can draw any shapes");
    }
}
class Circle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing Circle");
    }

}