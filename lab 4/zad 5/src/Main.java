import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj licznik pierwszego ułamka");
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        System.out.println("Podaj mianownik pierwszego ułamka");
        int m = scan.nextInt();
        Ulamek pierwszy = new Ulamek(l,m);
        System.out.println("Podaj licznik drugiego ułamka");
        int l2 = scan.nextInt();
        System.out.println("Podaj mianownik drugiego ułamka");
        int m2 = scan.nextInt();
        Ulamek drugi = new Ulamek(l2,m2);
        pierwszy.suma(drugi);

    }
}