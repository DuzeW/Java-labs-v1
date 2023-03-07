import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double y;
        y = 1.609;
        for (int x = 1; x <= 10; x++) {
            System.out.print("kilometry: " + x);
            System.out.println(" mile: " + y);
            y = y + 1.609;
        }
    }
}