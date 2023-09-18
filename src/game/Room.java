package game;
import actors.Actor;
import actors.Enemy;
import inventory.Inventory;
import java.util.Random;
public class Room {
    protected Actor[] actors;
    protected Inventory inventory;
    public int amount;
    public Room(){
        Random random = new Random();
        int enemies = random.nextInt(4);
        this. amount = enemies;
        this. actors = new Actor[enemies+1];
        this. inventory = new Inventory();
        for(int i = 0; i < enemies; i++){
            this. actors[i] = new Enemy(random.nextInt(enemies));
        }
    }
    /*
    maximum amount of enemies cannot be negative
    @param n is the maximum amount of enemies

     */
    public Room(int n){
        if(n > 0) {
            Random random = new Random();
            int enemies = random.nextInt(n);
            this.amount = enemies;
            this.actors = new Actor[enemies + 1];
            this.inventory = new Inventory();
            for (int i = 0; i < enemies; i++) {
                this. actors[i] = new Enemy(random.nextInt(enemies));
            }
        } else {
            System.out.println("Please enter positive amount of enemies");
        }
    }

    public String toString(){
        String out = "Actors: ";
        for(int i = 0; i < this.amount; i++){
            out += this.actors[i].toString();
        }
        if(this.actors[this.amount] != null){
            out += this.actors[amount].toString();
        }
        out += '\n';
        out += this.inventory.toString() + '\n';
        return out;
    }
}
