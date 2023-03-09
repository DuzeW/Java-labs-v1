import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Rozmiar tablicy");
        Scanner scan = new Scanner(System.in);

        int a =scan.nextInt();
        int[] arr = new int[a];
        System.out.println("Podaj liczby: ");
        for (int i=0; i<a ; i++){
            int z =scan.nextInt();
            arr[i] = z;
        }
        for (int i=0; i<a ; i++){
            System.out.println(arr[i]);
        }
    }
}