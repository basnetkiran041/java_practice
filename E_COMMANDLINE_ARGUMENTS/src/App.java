public class App {
    public static void main(String[] args) throws Exception {
        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[1]);
        
        double si = (principal*rate*time)/100;
        System.out.println("The Simple interest is"+si);
    }
}
