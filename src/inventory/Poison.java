package inventory;

public class Poison extends Consumable{
    private int destroyPower;

    public String toString(){
        return "Poison: Destroy Power " + destroyPower + ".\n";
    }

    public Poison(int x){
        this.destroyPower = x;
    }
}
