public class Triangle extends Shape {
    double a,b,c,h;
    Triangle(double a,double b,double c) throws IllegalAccessException {
        if((a+b)<c||(a+c)<b||(b+c)<a){
            throw new IllegalAccessException("Z tych bokow nie mozna zbudowac trojkat");
        }
        else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    @Override
    public double getArea(){
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double getPerimeter(){
        return (a+b+c);
    }
}
