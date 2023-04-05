public class Main {
    public static void main(String[] args){
        Karta.Kolor[] kolory = Karta.Kolor.values();
        Karta.Figura[] figury = Karta.Figura.values();
        Karta[] talia = new Karta[Karta.Figura.values().length*Karta.Kolor.values().length];
        int k = 0;
        for (Karta.Kolor kolor : kolory ){
            for (Karta.Figura figura : figury){
                talia[k] = new Karta(kolor,figura);
                k++;
            }
        }

        for (Karta karta : talia) {
            System.out.println(karta.toString());
        }

    }
}