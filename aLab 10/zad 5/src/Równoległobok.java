public class Równoległobok implements Figura {
    double a,h,b;
    Równoległobok(double h,double a, double b){
        this.a=a;
        this.h=h;
        this.b=b;
    }
    @Override
    public double obliczPole() {
        return a*h;
    }

    @Override
    public double obliczObwód() {
        return a*2+b*2;
    }
}
