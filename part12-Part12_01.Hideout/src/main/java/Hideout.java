/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
import java.util.ArrayList;
import java.util.List;


public class Hideout<T> {
    
    private List<T> elements;
    
    public void setValue() {
        this.elements = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        this.elements.clear();
        this.elements.add(toHide);
    }
    
    public T takeFromHideout() {        
        if(this.elements.isEmpty()) {
            return null;
        } else {
            T obj = this.elements.get(0);
            this.elements.clear();
            return obj;
        }               
    }
    
    public boolean isInHideout() {
        return this.elements.isEmpty();
    }
    
}
