public class Main {
    public static void main(String[] args) {
        Used c1 = new Used("Black","Toyota","Midium");
        New c2 = new New("Red","Ferrari",589_332);
        Crashed c3 = new Crashed("White","Porshe","LA");
        Car[] garage= {c1,c2,c3};
        int i=0;
        for (Car car : garage){
            garage[i].info();
            i++;
        }
    }
}