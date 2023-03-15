public class Main {
    public static void main(String[] args) {
        Wiatrak pierwszy = new Wiatrak();
        Wiatrak drugi = new Wiatrak(3,true,10,"Black");
        System.out.println(pierwszy.informacje());
        System.out.println(drugi.informacje());

    }
}