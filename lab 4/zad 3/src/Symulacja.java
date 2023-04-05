import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Symulacja {
    int rando,trows,orly=0,reszki=0;
    int proc_o,proc_r;
    Scanner scan = new Scanner(System.in);
    protected void sym(){
        System.out.println("Ile rzutów chcesz wykonać?");
        trows = scan.nextInt();
        for(int i=0;i<=trows;i++) {
            rando=ThreadLocalRandom.current().nextInt(2);
            if(rando==0) {
                orly++;
                Moneta m = new Moneta(Moneta.site.ORZEL);
            }
            if (rando==1){
                reszki++;
                Moneta m = new Moneta(Moneta.site.RESZKA);
            }
        }
        proc_r = reszki*100/trows;
        proc_o = orly*100/trows;
        System.out.println("Reszki: "+proc_r+"%\nOrly: "+proc_o+"%\nw "+trows+" rzutach");
    }
}
