import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Gra {
    int range;
    int user_int;
    int rand_int1;
    int trys=0;
    Scanner scan = new Scanner(System.in);
    Gra (int range){
        rand_int1 = ThreadLocalRandom.current().nextInt(range+1);

    }
    public int game(){
        if(trys>=5){
            System.out.println("przegrales :( wylosowana liczba to: "+rand_int1);
            return 1;
        }
        trys++;
        System.out.println("Jaką liczbę chcesz sprawdzić?");
        user_int = scan.nextInt();
        if(user_int==rand_int1){
            System.out.println("Udało ci się zgadnąć!!!");
            return 0;
        }
        if(user_int>rand_int1){
            System.out.println("za duzo");
            return game();
        }
        if(user_int<rand_int1){
            System.out.println("za malo");
            return game();
        }
        else{
            System.out.println("Błąd");
            return game();
        }

    }

}
