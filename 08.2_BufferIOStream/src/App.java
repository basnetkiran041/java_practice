import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        try
        {
            //read file using BufferInputStream
            //Creating FileInputStream object
            FileInputStream fis = new FileInputStream("input.txt");
            //Creating BufferedInputStream object
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while ((i=bis.read())!=-1) {
                System.out.println((char)i);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
