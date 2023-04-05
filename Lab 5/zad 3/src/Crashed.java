public class Crashed extends Car {
    protected String where;

    protected Crashed(String color,String brand,String where){
        super(color,brand);
        this.where=where;
    }
    protected void info(){
        System.out.println("brand "+brand+" color "+color+" where "+where);
    }
}
