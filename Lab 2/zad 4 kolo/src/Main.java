public class Main {
    public static void main(String[] args) {
        double r=5;
        MyCircle kolo = new MyCircle(r);
        System.out.println(kolo.obwod());
        System.out.println(kolo.pole());
        System.out.println(kolo.srednica());
    }
}