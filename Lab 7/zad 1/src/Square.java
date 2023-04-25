public class Square extends Shape{
    double a;
    Square(double a){
        this.a=a;
    }
    @Override
    public double getArea(){
        return a*a;
    }

    @Override
    public double getPerimeter(){
        return 4*a;
    }
}
