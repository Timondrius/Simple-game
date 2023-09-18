import game.GameMap;
public class Main {
    public static void main(String[] args) {
        Game game = new Game(15, 26, 3);
        game.startGame();
        game.printMap();
    }
}