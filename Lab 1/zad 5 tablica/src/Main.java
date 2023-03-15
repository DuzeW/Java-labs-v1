import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Rozmiar tablicy");
        Scanner scan = new Scanner(System.in);

        int a =scan.nextInt();
        char[] arr = new char[a];
        System.out.println("Podaj znaki: ");
        for (int i=0; i<a ; i++){
            arr[i]=scan.next().charAt(0);
        }
        for (int i=0; i<a ; i++){
            System.out.println(arr[i]);
        }
    }
}