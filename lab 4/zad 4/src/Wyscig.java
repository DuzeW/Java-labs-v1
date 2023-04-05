public class Wyscig {
    protected void start(){
        Zawodnik z1 = new Zawodnik("Capibara Adam",2,8);
        Zawodnik z2 = new Zawodnik("Strus Pedziwiatr",5,20);
        Zawodnik z3 = new Zawodnik("Kojot Glodny",4,15);
        while (z1.odleglosc<50&&z2.odleglosc<50&&z3.odleglosc<50){
            z1.biegnij();
            z2.biegnij();
            z3.biegnij();
        }
        System.out.println("Kilka slow od zwyciezcy/zwyciezcow");
        if(z1.odleglosc>=50){
            z1.przedstawSie();
        }
        if(z2.odleglosc>=50){
            z2.przedstawSie();
        }
        if(z3.odleglosc>=50){
            z3.przedstawSie();
        }

    }
}
