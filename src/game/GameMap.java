package game;

import actors.Actor;
import actors.Player;
import inventory.Inventory;

import java.util.Random;

public class GameMap {
    Room[][] Rooms;
    int width;
    int height;
    int maxEnemy;
    int enemies;
    public GameMap(int a, int b, int c){
        Random random = new Random();
        this. Rooms = new Room[a][b];
        this. width = a;
        this. height = b;
        this. maxEnemy = c;
        if(maxEnemy < 0) maxEnemy *= -1;
        for (int i = 0; i < this. width; i++) {
                for (int j = 0; j < this. height; j++) {
                    int k = random.nextInt(this. maxEnemy) + 1;
                    this.Rooms[i][j] = new Room(k);
                }
            }
            createInventories();
    }
    public void createInventories(){
        Random random = new Random();
        for(int i = 0; i < this. width; i++){
            for(int j = 0; j < this. height; j++){
                this.Rooms[i][j].inventory = new Inventory(random.nextInt(5));
            }
        }
    }
    public Actor allocatePlayer(){
        Random random = new Random();
        int i = random.nextInt(this.width);
        int j = random.nextInt(this.height);
        try {
            this.Rooms[i][j].actors[this.Rooms[i][j].amount] = new Player(random.nextInt(10));
            return this.Rooms[i][j].actors[this.Rooms[i][j].amount];
        } catch(Exception ex) {
            System.out.println("Rooms were not created");
            return null;
        }
    }
    public String ToString(){
        String out = "";
        for(int i = 0; i < this. width;  i++){
            for(int j = 0; j < this. height; j++){
                out += "room: "+ i +" " + j + " has " + this. Rooms[i][j].toString();
            }
        }
        return out;
    }

    public void printMap(){
        System.out.println(ToString());
    }
}
