public class Kwadrat {
    int bok, pole, ob;

    public Kwadrat(int naszbok){
        this.bok=naszbok;
    }
    public int opole(){
        return bok*bok;
    }
    public int oob(){
        return 4*bok;
    }
    public void wypisz(){
        System.out.println(bok);
        System.out.println(opole());
        System.out.println(oob());
    }
    public static void main(String[] args) {
     Kwadrat mojkwadrat = new Kwadrat(10);
     mojkwadrat.wypisz();
    }
}