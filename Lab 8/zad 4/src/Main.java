import java.util.Scanner;
public class Main {
    private static String scanStr(String co){
        Scanner scan = new Scanner(System.in);
        System.out.println(co);
        String s= scan.nextLine();
        return s;
    }
    private static int scanInt(String co){
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        return s;
    }
    public static void main(String[] args) {

        Osoba osoba = new Osoba(scanStr("Imie: "),scanStr("Nazwisko: "),scanInt("rok urodzenia: "));

    }
}