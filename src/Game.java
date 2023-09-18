import actors.Actor;
import actors.Player;
import game.GameMap;
public class Game {
    Actor player;
    GameMap map;
    int width;
    int height;
    int maxenemies;
    public Game(int a, int b, int c){
        this.width = a;
        this. height = b;
        this. maxenemies = c;
    }

    public void startGame(){
        this.map = new GameMap(this. width, this. height, this. maxenemies);
        this. player = this. map.allocatePlayer();
    }
    public void printMap(){
        map.printMap();
    }
}
