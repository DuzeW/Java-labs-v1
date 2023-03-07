import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj dzien tygodnia od 1 do 7");
        Scanner scan = new Scanner(System.in);
        int dzien = scan.nextInt();
        switch (dzien) {
            case 1 -> System.out.println("Poniedzialek");
            case 2 -> System.out.println("Wtorek");
            case 3 -> System.out.println("Sroda");
            case 4 -> System.out.println("Czwartek");
            case 5 -> System.out.println("Piatek");
            case 6 -> System.out.println("Sobota");
            case 7 -> System.out.println("Niedziela");
            default -> System.out.println("Zla liczba");
        }
    }
}