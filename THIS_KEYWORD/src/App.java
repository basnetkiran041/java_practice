public class App {
    int num ;

    public App(int n)
    {
        this.num = n;
    }

    void display()
    {
        System.out.println("The number is :"+ this.num);

    }
   
    public static void main(String[] args) throws Exception {
        App y = new App(100);
        y.display();

    }
}
