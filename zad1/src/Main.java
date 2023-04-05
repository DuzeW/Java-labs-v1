public class Main {

    public static void main(String[] args) {
        int rzuty , reszki=0 , orly=0;
        rzuty = 500;
        for(int i = 0; i<rzuty ; i++) {
            Moneta zlotowka = new Moneta();
            if(zlotowka.czy_orzel) {
                System.out.println("orzel");
                orly++;
            }
            else{
                System.out.println("reszka");
                reszki++;
            }
        }
        System.out.println("ilosc orlow "+orly+"\nilosc reszek "+reszki);

        double praw=((orly*100/(orly+reszki)));
        System.out.println("orly to: "+praw+"%");
    }
}