public class New extends Car{
    protected float price;
    protected New(String color,String brand,float price){
        super(color,brand);
        this.price=price;
    }
    protected void info(){
        System.out.println("brand "+brand+" color "+color+" price "+price);
    }
}
