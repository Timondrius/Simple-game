package inventory;

public class Armor extends Equipment{
    private int defensePower;
    public String toString(){
        return "Armor: Defense Power " + defensePower + ".\n";
    }

    protected Armor(int x){
        defensePower = x;
    }
}
