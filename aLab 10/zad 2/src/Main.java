import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        File basedir = new File("basedir");
        List<File> subDirectiores = Arrays.asList(basedir.listFiles());
        int i=0;
        int max=0;
        int j=0;
        for(File subDirectiory: subDirectiores){
            List<File> files = Arrays.asList(subDirectiory.listFiles());
            if(files.size()>=max) {
                max=files.size();
                j=i;
            }
            i++;
        }
        System.out.println(subDirectiores.get(j));
    }
}