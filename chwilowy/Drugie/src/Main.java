import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int p = scan.nextInt();
        double f=(9.0/5)*p+32;
        System.out.println("fahrenheit: ");
        System.out.println(f);
    }
}