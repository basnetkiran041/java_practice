public class multiLevel_Interface implements InterfaceA, InterfaceB{
    public static void main(String[] args) throws Exception{
        multiLevel_Interface mul = new multiLevel_Interface();
        mul.MethodD();
        mul.MethodE();
        
    }
    

@Override
public void MethodD()
{
    System.out.println("This is method D");
}

@Override
public void MethodE()
{
    System.out.println("This is method E");
}
    
}