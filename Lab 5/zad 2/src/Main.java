public class Main {
    public static void main(String[] args) {
        Bookshop bookshop = new Bookshop("Prosta 3","Middle", new String[]{"bajka,50 twarzy javy"});
        System.out.println(bookshop.getInformation());
        Bakery bakery = new Bakery("Dolna 11","Middle" ,new String[]{"ciastko","chleb"});
        System.out.println(bakery.getInformation());


    }
}