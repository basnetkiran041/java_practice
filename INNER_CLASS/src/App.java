// import Outer.Inner;

public class App {
    public static void main(String[] args) throws Exception {
        Outer o = new Outer();
        o.show();         
    }
}
// Class 1
class Outer { 
    // Class 2
    // Simple nested inner class
    class Inner { 
        // show() method of inner class
        public void show()
        { 
            // Print statement
            System.out.println("In a nested class method");
        }
    }
}
