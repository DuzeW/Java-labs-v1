import static java.lang.Math.pow;

public class MyCircle {
    double radius;
    public MyCircle(double r){
        this.radius = r;
    }
public double obwod(){
        return 2*Math.PI*radius;
}
public double pole(){
        return Math.PI*pow(radius,2);
}
public double srednica(){
        return radius*2;
}

}
