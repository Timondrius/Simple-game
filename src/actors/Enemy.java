package actors;

import inventory.Inventory;

public class Enemy extends Actor{
    Inventory inventory;
    public String toString(){
        return "Enemy with: " + inventory.toString() +'\n';
    }
    public Enemy(int itemnum){
        inventory = new Inventory(itemnum);
    }
}
