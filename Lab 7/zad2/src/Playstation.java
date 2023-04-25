public class Playstation extends GameConsole {
    public static void playGame(Game game){
        if( game instanceof PlaystationGame){
            System.out.println("gra dziala na Playstation");
        }
        else {
            System.out.println("gra nie dziala na Playstation");
        }
    }
}
