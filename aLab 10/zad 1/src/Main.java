import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner((new File("Input")))){
            int i=0;
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                if(i%2==0) {
                    System.out.println(line);
                }
                i++;
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}