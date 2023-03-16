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


public class Pipe<T> {
    
    private ArrayList<T> objectList;
    
    public Pipe() {
        this.objectList = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.objectList.add(value);
    }
    
    public T takeFromPipe() {
        if(objectList.isEmpty()) {
            return null;
        } else {
            T obj = this.objectList.get(0);
            this.objectList.remove(0);
            return obj;
        }
    }
    
    public boolean isInPipe() {
        return !this.objectList.isEmpty();
    }
    
}
