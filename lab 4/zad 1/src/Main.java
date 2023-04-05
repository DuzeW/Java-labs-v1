import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj zakres gry");
        Gra g1 = new Gra(scan.nextInt());
        g1.game();



    }
}