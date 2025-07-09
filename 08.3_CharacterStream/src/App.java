import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        FileReader in = null;
        FileWriter out = null;
        try
        {
            in = new FileReader("input.txt");
            out = new FileWriter("Output.txt");
            int c;
            while ((c=in.read())!= -1) {
                out.write(c);
            }
        }
        finally
        {
            if(in != null)
            {
                in.close();
            }
            if(out != null)
            {
                out.close();
            }
        }
    }
}
