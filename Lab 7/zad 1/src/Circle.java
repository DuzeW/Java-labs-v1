import java.text.DecimalFormat;

public class Circle extends Shape{
    double r;

    Circle ( double r){
        this.r=r;
    }

    @Override
    public double getArea(){

        return Math.round(Math.PI*r*r);
    }

    @Override
    public double getPerimeter(){
        return Math.round(2*Math.PI*r);
    }
}
