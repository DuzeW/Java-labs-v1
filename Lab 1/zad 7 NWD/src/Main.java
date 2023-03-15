import java.util.Scanner;

public class Main {
    public static void NWD(int a,int b){
        while (a!=b){
            if(a>b){
                a-=b;
            }
            if(a<b){
                b-=a;
            }
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = scan.nextInt();
        System.out.println("Podaj b: ");
        b = scan.nextInt();
        NWD(a,b);
    }
}