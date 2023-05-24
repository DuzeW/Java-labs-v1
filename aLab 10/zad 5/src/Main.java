import javax.sql.rowset.serial.SerialArray;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> a = new ArrayList<Figura>();
        Kwadrat k = new Kwadrat(5);
        a.add(k);
        Trójkąt_prostokątny t = new Trójkąt_prostokątny(3,4);
        a.add(t);
        Równoległobok r = new Równoległobok(3,4,5);
        a.add(r);


        for (Figura i: a){
            System.out.println( i.obliczPole());
            System.out.println(i.obliczObwód());
        }
        Collections.sort(a,new c());
        for (Figura i: a){
            System.out.println( i.obliczPole());
        }

    }
}