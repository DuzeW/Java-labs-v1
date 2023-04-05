public class Used extends Car{
    protected String car_condition;
    protected Used(String color,String brand,String car_condition){
        super(color,brand);
        this.car_condition=car_condition;
    }
    protected void info(){
        System.out.println("brand "+brand+" color "+color+" car condition "+car_condition);
    }
}
