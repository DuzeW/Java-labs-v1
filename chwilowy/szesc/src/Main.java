import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Rozmiar tablicy");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int[] arr = new int[a];
        arr[0] = scan.nextInt();
        if ((arr[0] + 1) % 2 == 0) {
            arr[1] = arr[0] + 1;
            for (int i = 2; i < a; i++) {
                arr[i] = arr[i - 1] + 2;
            }
        }
        else {
            arr[1] = arr[0] + 2;
            for (int i = 2; i < a; i++) {
                arr[i] = arr[i - 1] + 2;
            }
        }
        System.out.println("Min: "+arr[1]);
        System.out.println("Max: "+arr[a-1]);
        double sum =0;
        for (int i =0; i<a ; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Suma: "+sum);
        double avg = sum/a;
        System.out.println("Średnia: "+avg);
        for (int i = 0; i<a; i++){
            System.out.println(arr[i]);
        }
    }
}