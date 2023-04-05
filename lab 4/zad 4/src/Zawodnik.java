import java.util.concurrent.ThreadLocalRandom;

public class Zawodnik {
    String imie;
    float predkosc_min, predkosc_max,odleglosc=0;
    Zawodnik(String imie, float predkosc_min, float predkosc_max){
        this.imie=imie;
        this.predkosc_min=predkosc_min;
        this.predkosc_max=predkosc_max;
    }
    protected void przedstawSie(){
        System.out.println("Jestem "+imie+" biegam z predkoscia "+predkosc_min+"-"+predkosc_max+"km/h");
    }
    protected void biegnij(){
        float rand_float;
        rand_float= ThreadLocalRandom.current().nextFloat();
        odleglosc=odleglosc+((rand_float*(predkosc_max-predkosc_min))+predkosc_min);
        odleglosc=Math.round(odleglosc);
    }
}
