public class Osoba {
    String imie , nazwisko;
    int rok;
//public static void empty() throws Exception{
//    throw new Exception("puste pole");
//}
    //Osoba (String imie,String nazwisko,int rok){
    //if(imie.isEmpty()){
    //    try {
    //        Osoba.empty();
    //    } catch (Exception e){
    //        System.out.println(e);
    //    }
    //}
    //if(nazwisko.isEmpty()) {
    //            try {
    //                Osoba.empty();
    //            } catch (Exception e){
    //                System.out.println(e);
    //            }
    //    }

    // }

    @Override
    public String toString() {
        return (
             "Imie: "+this.imie+
             "\nNazwisko: "+this.nazwisko+
             "\nRok urodzenia"+this.rok
        );
    }
}
