import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Punkt a = new Punkt();
        Punkt b = new Punkt();
        Punkt c = new Punkt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz x swojego pierwszego punktu");
        b.x = Double.parseDouble(scan.nextLine());
        System.out.println("Wprowadz y swojego pierwszego punktu");
        b.y = Double.parseDouble(scan.nextLine());
        System.out.println("Wprowadz x swojego drugiego punktu");
        c.x = Double.parseDouble(scan.nextLine());
        System.out.println("Wprowadz y swojego drugiego punktu");
        c.y = Double.parseDouble(scan.nextLine());
        System.out.println("Odległość punktu pierwszego od drugiego to "+ b.odleglosc(b.x, b.y, c.x, c.y));
        System.out.println("Odległość punktu pierwszego od punktu 0,0 to "+ b.odzero());
        System.out.println("Odległość punktu drugiego od punktu 0,0 to "+ c.odzero());


    }
}