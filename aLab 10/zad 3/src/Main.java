import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int isLeap = 0;
        LocalDate date = LocalDate.now();
        while(isLeap < 100){
            if(date.isLeapYear()){
                System.out.println(date.getYear());
                isLeap++;
            }
            date = date.plusYears(1);
        }
    }
}