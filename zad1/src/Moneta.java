import java.util.Random;

public class Moneta {
    Boolean czy_orzel;
    Moneta (){
        double strona = Math.random();
        if (strona>=0.5){
            czy_orzel=true;
        }
        else{
            czy_orzel=false;
        }
    }
}
