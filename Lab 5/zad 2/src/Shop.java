public class Shop{
    protected String addres , size;

    public Shop(String addres, String size) {
        this.addres = addres;
        this.size = size;
    }

    protected String getInformation(){
        String info= addres+"\n"+size;
        return info;
    }

}
