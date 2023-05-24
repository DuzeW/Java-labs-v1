import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Trójkąt_prostokątny implements Figura {
    double a,b;
    Trójkąt_prostokątny(double a,double b){
        this.a=a;
        this.b=b;
    }
    @Override
    public double obliczPole() {
        return (a*b)/2;
    }

    @Override
    public double obliczObwód() {
        return sqrt(pow(a,2)+pow(b,2))+a+b;
    }
}
