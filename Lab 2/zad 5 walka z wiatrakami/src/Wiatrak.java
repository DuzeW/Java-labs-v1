public class Wiatrak {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    int speed;
    boolean on;
    double radius;
    String color;
    public Wiatrak (int s, boolean on, double radius, String c){
        this.speed=s;
        this.on=on;
        this.radius=radius;
        this.color=c;
    }
    public Wiatrak(){
        speed=1;
        on=false;
        radius=5;
        color="White";
    }
    public String informacje(){
        return ("Speed: "+speed+"\n"+"Is it working?: "+ on +"\n"+"Radius: "+radius+"\n"+"Color: "+color );


    }
}
