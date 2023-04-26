import java.util.Scanner;

public class Kalkulator {
    private Scanner scanner =new Scanner(System.in);
    public void run(){
        Integer l1 = pobierzLiczbe();
        System.out.println(l1);
        Integer l2 = pobierzLiczbe();
        System.out.println(l2);
        wybor(l1,l2);
    }

    private Integer pobierzLiczbe(){
        String linia = scanner.nextLine();
            try {
                return Integer.parseInt(linia);
            } catch (NumberFormatException e) {
                System.out.println("To nie jest liczba sprobuj ponownie");
                return pobierzLiczbe();
            }
    }
    private void wybor(Integer l1,Integer l2){
    System.out.println("wybierz co chcesz zrobic z liczbami\n+ - dodac\n- - odjac\n* - pomnozyc\n/ - podzielic");
    String wybor = scanner.nextLine();
    try {
        switch (wybor) {
            case "+" -> dodawanie(l1, l2);
            case "-" -> odejmowanie(l1, l2);
            case "*" -> mnozenie(l1, l2);
            case "/" -> dzielenie(l1, l2);
            default -> throw new Exception("Nieprawidłowy wybór!");
        }
    }catch (Exception e){
        System.out.println("zle wybrany znak");
        wybor(l1, l2);
    }
    }

    private static void dodawanie(int l1,int l2){
        System.out.println(l1+l2);
    }
    private static void odejmowanie(int l1,int l2){
        System.out.println(l1-l2);
    }
    private static void mnozenie(int l1,int l2){
        System.out.println(l1*l2);
    }
    private static void dzielenie(int l1,int l2){
        System.out.println(l1/l2);
    }
}
