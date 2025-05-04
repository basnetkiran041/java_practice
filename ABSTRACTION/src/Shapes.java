abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    void draw()
    {
        System.out.println("Drawing Circle");

    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Shapes {
    public static void main(String[] args) {

        Circle cir = new Circle();
        cir.draw();

        Rectangle r = new Rectangle();
        r.draw();
    }

}
