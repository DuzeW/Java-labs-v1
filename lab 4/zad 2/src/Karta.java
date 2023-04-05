public class Karta {
    Kolor kolor;
    Figura figura;

    enum Kolor{
        KIER, KARO, TREFL, PIK
    }
    enum Figura{
        DWOJKA, TROJKA, CZWORKA, PIATKA, SZOSTKA, SIODEMKA, OSEMKAWA,
        DZIEWIATKA, DZIESIATKA, WALET, DAMA, KROL, AS
    }

    Karta(Kolor kolor,Figura figura){
        this.kolor = kolor;
        this.figura = figura;
    }
    @Override
    public String toString() {
        return kolor.toString() + " " + figura.toString();
    }
}
