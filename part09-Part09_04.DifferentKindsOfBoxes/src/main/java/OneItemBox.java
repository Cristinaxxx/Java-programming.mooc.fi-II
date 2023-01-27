
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
public class OneItemBox extends Box {
    
    private int capacity;
    private ArrayList<Item> itemsList;
    
    public OneItemBox() {
        this.capacity = 1;
        this.itemsList = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if(itemsList.isEmpty()) {
            itemsList.add(item);            
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
