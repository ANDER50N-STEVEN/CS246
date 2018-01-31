package anderson;

import java.util.HashMap;
import java.util.Map;

public class Player {

    int health;
    int mana;
    int gold;
    private Map<String, Integer> equipment;

    public Player(){

    }

    public Player(int _health, int _mana, int _gold){
        health = _health;
        mana = _mana;
        gold = _gold;
        this.equipment = new HashMap<>();
    }

    public void display(){
        System.out.println(health);
        System.out.println(mana);
        System.out.println(gold);
        System.out.println(equipment);
    }

    public void addEquipment(String item, Integer value) {
        equipment.put(item,value);
    }
}
