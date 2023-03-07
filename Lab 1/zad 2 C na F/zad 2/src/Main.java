import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double z = scan.nextInt();
        double cel;
        cel = z * 1.8 + 32;
        System.out.println(cel);

    }
}