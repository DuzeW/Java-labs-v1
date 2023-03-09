import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int day =scan.nextInt();

        while (day < 0 || day > 8) {
            day =scan.nextInt();
        }

            if (day == 1) {
                System.out.println("Poniedziałek");
            }
            if (day == 2) {
                System.out.println("Wtorek");
            }
            if (day == 3) {
                System.out.println("Środa");
            }
            if (day == 4) {
                System.out.println("Czwartek");
            }
            if (day == 5) {
                System.out.println("Piątek");
            }
            if (day == 6) {
                System.out.println("Sobota");
            }
            if (day == 7) {
                System.out.println("Niedziela");
            }
            switch(day){
                case 1 -> System.out.println("Poniedziałek");
                case 2 -> System.out.println("Wtorek");
                case 3 -> System.out.println("Środa");
                case 4 -> System.out.println("Czwartek");
                case 5 -> System.out.println("Piątek");
                case 6 -> System.out.println("Sobota");
                case 7 -> System.out.println("Niedziela");
            }
            }
    }