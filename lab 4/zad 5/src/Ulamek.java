public class Ulamek {
    private int l , m;
   public Ulamek(int l,int m){
        this.l=l;
        this.m=m;
    }
    public Ulamek suma(Ulamek drugi){
        Ulamek trzeci = new Ulamek(l,m);
       int l2=drugi.l;
       int m2=drugi.m;
       if(m==m2){
           int sl = l+l2;
           System.out.println(sl+"/"+m);
           trzeci.l=sl;
       }
       else{
           int m3 = m * m2;

       }
        return trzeci;
    }

}
