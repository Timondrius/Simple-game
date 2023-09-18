package inventory;
import java.util.Random;
public class Inventory {
    Item[] Items;

    public Inventory (int itemNumber){
        Items = new Item[itemNumber];
        for(int i = 0; i < itemNumber; i++){
            Random random = new Random();
            int it = random.nextInt(4);
            int itemPower = random.nextInt(10);
            if(it == 0){
                Items[i] = new Weapon(itemPower);
            } else if(it == 1){
                Items[i] = new HealthPotion(itemPower);
            } else if(it == 2){
                Items[i] = new Poison(itemPower);
            } else if (it == 3){
                Items[i] = new Armor (itemPower);
            }
        }
    }

    public Inventory (){
        Random random = new Random();
        int itemNumber = random.nextInt(10);
        Items = new Item[itemNumber];
        for(int i = 0; i < itemNumber; i++){
            int it = random.nextInt(4);
            int itemPower = random.nextInt(10);
            if(it == 0){
                Items[i] = new Weapon(itemPower);
            } else if(it == 1){
                Items[i] = new HealthPotion(itemPower);
            } else if(it == 2){
                Items[i] = new Poison(itemPower);
            } else if (it == 3){
                Items[i] = new Armor (itemPower);
            }
        }
    }


    public String toString(){
        String n = "Inventories:" + '\n';
        for(int i = 0; i < Items.length; i++){
            n += '\t' + Items[i].toString() + '\n';
        }
        return n;
    }
}
