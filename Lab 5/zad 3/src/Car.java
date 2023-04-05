public class Car {
    protected String color,brand;
    protected Car (String color,String brand){
        this.brand=brand;
        this.color=color;
    }
    protected void info(){
        System.out.println("brand "+brand+" color "+color);
    }

}
