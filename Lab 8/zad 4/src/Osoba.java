public class Osoba {
    String imie , nazwisko;
    int rok;
public static void empty() throws Exception{
    throw new Exception("puste pole nazwisko");
}
    Osoba (String imie,String nazwisko,int rok){
        if(nazwisko.isEmpty()) {
            {
                try {
                    Osoba.empty();
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
