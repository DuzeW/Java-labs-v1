public class Main {
    public static void main(String[] args) {
        System.out.println("Miles\tKilometers");
        for (int i = 0; i<=10; i++){
            System.out.print(i);
            System.out.print("\t\t");
            System.out.print(i*1.609);
            System.out.print("\n");
        }
    }
}