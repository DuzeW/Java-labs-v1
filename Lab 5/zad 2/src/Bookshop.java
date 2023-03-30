public class Bookshop extends Shop{
    protected String products[];
    protected Bookshop(String addres,String size,String [] products){
        super(addres, size);
        this.products=products;

    }
    protected String getInformation(){
        String s = "";
        for(int i =0; i< products.length;i++){
            s = s + " " +products[i];
        }
        String info= "Addres: "+addres+" Size: "+size+"\nProducts: \n"+s;
        return info;

    }
}
