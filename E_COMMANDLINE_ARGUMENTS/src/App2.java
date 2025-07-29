public class App2 {
       public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5); // passing values
        r.findArea();
       }
}
class Rectangle {
    int length, breadth;

    // Parameterized constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void findArea() {
        int area = length * breadth;
        System.out.println("Area = " + area);
    }
}