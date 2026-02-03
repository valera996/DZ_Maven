package DZ3.GameSettings;

public class Main {
    public static void main(String[] args) {

        GameSettings game1 = new GameSettings("ГТА", 4);
        GameSettings game2 = new GameSettings("МБА", 3);

        GameSettings.maxPlayers = 6;

        game1.addPlayer(1);
        game1.printGameStatus();

        game2.addPlayer(4);
        game2.printGameStatus();

    }
}
