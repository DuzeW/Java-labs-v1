public class Rectangle extends Shape{
    double a,b;
    Rectangle (double a,double b){
        this.a=a;
        this.b=b;
    }
    @Override
    public double getArea(){
        return a*b;
    }

    @Override
    public double getPerimeter(){
        return a*2+b*2;
    }
}
