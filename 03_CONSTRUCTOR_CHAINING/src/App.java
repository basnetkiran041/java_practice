public class App {
   
    public static void main(String[] args) throws Exception {
        
        ConstructorChain ch=new ConstructorChain();
        
    }
    
    
}
class ConstructorChain
{
    ConstructorChain()
    {
    this("Phoenix College of Management");
    System.out.println("Default Constructor is Called");

    }
    ConstructorChain(String str)
    {
    System.out.println("Parametrize Constructor is Called");
    }
}
