public class Kwadrat implements Figura{
    double b;
    Kwadrat(double bok){
        this.b=bok;
    }
    @Override
    public double obliczObwód() {

        return b*4;
    }

    @Override
    public double obliczPole() {
        return b*b;
    }
}
