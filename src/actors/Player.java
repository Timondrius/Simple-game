package actors;
import inventory.Inventory;
import inventory.Weapon;
import inventory.Armor;
public class Player extends Actor{
    public String toString(){
        return "Player with: " + this.inventory.toString() + '\n';
    }
    public Player(int itemnum){
        inventory = new Inventory(itemnum);
    }
}
