import java.sql.Array;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(3,4,5);
        Shape rectangle = new Rectangle(4,5);
        Shape square = new Square(4);
        Shape[] shapes = {circle,triangle,rectangle,square} ;
        for (Shape shape : shapes){
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }
}