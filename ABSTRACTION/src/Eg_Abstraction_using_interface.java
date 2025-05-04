interface Sketch {
    void draw();
}

class Pentagon implements Sketch {
    public void draw() {
        /*
         * The draw() method in Pentagon must be declared public
         * because it’s implementing the public method from the interface. If public is
         * not used it will show compiler error
         */
        System.out.println("Drawing Pentagon");
    }
}

class Hexagon implements Sketch {
    public void draw() {
        System.out.println("Drawing Hexagon");
    }
}

public class Eg_Abstraction_using_interface {

    public static void main(String[] args) throws Exception {

        Pentagon p = new Pentagon();
        p.draw();

        Hexagon h = new Hexagon();
        h.draw();
    }
}
