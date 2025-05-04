public class App {

    private int length;
    private int breadth;
    public App(int l, int b)    //Parameterized constructor
    {
        this.length = l;
        this.breadth =b;
    }

    public void Area(){
        System.out.println(length*breadth);
    }


    public static void main(String[] args) throws Exception {
        App ar = new App(8, 2);
        ar.Area();

    }
}
