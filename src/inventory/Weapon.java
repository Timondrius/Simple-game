package inventory;

public class Weapon extends Equipment{
    int attackPower;
    public String toString(){
        return "Weapon: Attack Power " + attackPower + ".\n";
    }
    public Weapon(int x){
        attackPower = x;
    }
}
