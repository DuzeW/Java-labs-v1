public class Main {
    public static void throwRuntimeException(){
        throw new RuntimeException("rzucam");

    }
    public static void main(String[] args) {
        try {
            throwRuntimeException();
        } catch (RuntimeException ex){
            System.out.println(ex);
        }
        }
}