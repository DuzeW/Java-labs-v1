import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punkt {
    double x,y;
public double odleglosc(double ax, double ay, double bx, double by) {
return sqrt((pow(bx-ax,2)+pow(by-ay,2)));
}
public double odzero(){
    return sqrt((pow(x,2)+pow(y,2)));
}
}

