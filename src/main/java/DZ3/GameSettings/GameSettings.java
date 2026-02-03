package DZ3.GameSettings;

public class GameSettings {
    static int maxPlayers = 5;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers){
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public String getGameName(){
        return this.gameName;
    }
    public int getCurrentPlayers(){
        return this.currentPlayers;
    }

    public static void setMaxPlayers(int x){
        maxPlayers = x;
    }
    public void addPlayer(int x) {
        int y = this.currentPlayers;

        if (y + x >= maxPlayers) {
            System.out.println("Больше игроков добавить нельзя");
        } else {
            this.currentPlayers = this.currentPlayers + x;
        }
    }

        public void printGameStatus(){
            System.out.println("Название игры: " + this.getGameName() + ", текщее количество игроков: " + this.getCurrentPlayers() + ", максимальное количесвто игроков: " + maxPlayers);
        }

    }


