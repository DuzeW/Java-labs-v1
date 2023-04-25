public class Main {
    public static void main(String[] args) {
        Game forza_horizon_3 = new XboxGame();
        Game grand_turismo_7 = new PlaystationGame();
        Playstation.playGame(forza_horizon_3);
        Playstation.playGame(grand_turismo_7);
        Xbox.playGame(forza_horizon_3);
        Xbox.playGame(grand_turismo_7);
    }
}