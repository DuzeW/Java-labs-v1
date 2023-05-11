import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        Scanner scanner = new Scanner(System.in);
        String format = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        String formattedDate = date.format(formatter);
        System.out.println("Zmieniony format: " + formattedDate);
    }
}