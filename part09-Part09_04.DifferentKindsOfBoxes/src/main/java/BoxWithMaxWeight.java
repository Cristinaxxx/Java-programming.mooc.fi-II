
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class BoxWithMaxWeight extends Box { 
    
    private int capacity;
    private ArrayList<Item> itemsList;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemsList = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if(item.getWeight() <= this.capacity) {
            itemsList.add(item);
            this.capacity -= item.getWeight();
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        if(this.itemsList.contains(item)) {
            return true;
        }
        return false;
    }
    
}
