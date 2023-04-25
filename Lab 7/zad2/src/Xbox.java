public class Xbox extends GameConsole{
    public static void playGame(Game game){
        if( game instanceof XboxGame){
            System.out.println("gra dziala na xbox");
        }
        else {
            System.out.println("gra nie dziala na xbox");
        }
    }
}
