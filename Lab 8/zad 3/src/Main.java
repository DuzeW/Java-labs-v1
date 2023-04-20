import java.io.IOException;

public class Main {
    public void throwEXIO() throws IOException{
        throw new IOException("rzut");
    }

    public static void main(String[] args)  {

        try {
            new Main().throwEXIO();
        } catch (IOException ex){
            System.out.println(ex);
        }

    }
}