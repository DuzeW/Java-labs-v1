public class Car {
    float engine_size_in_l;
    int wheels , doors;
    String color;
    Boolean available;
    protected Car(float engine_size_in_l,int wheels,int doors,String color,Boolean available){
        this.color=color;
        this.available=available;
        this.doors=doors;
        this.wheels=wheels;
        this.engine_size_in_l=engine_size_in_l;
    }

    @Override
    public String toString() {
        return "Car\n"+
                "engine size in l: "+engine_size_in_l+
                "\nwheels: "+wheels+
                "\ndoors: "+doors+
                "\ncolor: "+color+
                "\nis available: "+available;
    }
}
