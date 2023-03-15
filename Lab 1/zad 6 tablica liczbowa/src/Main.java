
import java.util.Scanner;

public class Main {
    public static int mini(int[] arr){
        return arr[0];
    }
    public static int maxi(int[] arr){
        return arr[(arr.length-1)];
    }
    public static int sum(int[] arr){
        int sum=0;
        for (int i=0; i< arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static double avg(int[] arr){
        return (sum(arr)/ arr.length);
    }
    public static double med(int[] arr){
        double med =0;
        if(arr.length%2==0){
            med= (arr[arr.length/2]+arr[(arr.length/2)-1])/2;
        }
        else {
            med=arr[arr.length/2];
        }
        return med;
    }
    public static void main(String[] args) {
        System.out.println("Rozmiar tablicy");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        arr[0] = scan.nextInt();
        int i;
        if ((arr[0] + 1) % 2 == 0) {
            arr[1] = arr[0] + 1;

            for(i = 2; i < a; ++i) {
                arr[i] = arr[i - 1] + 2;
            }
        } else {
            arr[1] = arr[0] + 2;

            for(i = 2; i < a; ++i) {
                arr[i] = arr[i - 1] + 2;
            }
        }
        System.out.println("Min: "+mini(arr));
        System.out.println("Max: "+maxi(arr));
        System.out.println("Suma: "+sum(arr));
        System.out.println("Średnia: "+avg(arr));
        System.out.println("Mediana: "+med(arr));






    }
}
