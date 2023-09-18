package inventory;

public class HealthPotion extends Consumable{
    private int healingPower;

    public String toString(){
        return "Health potion: Healing Power " + healingPower + ".\n";
    }
    public HealthPotion(int x){
        int healingPower = x;
    }
}
