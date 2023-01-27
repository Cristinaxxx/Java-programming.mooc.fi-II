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

public class Herd implements Movable {
    
    private ArrayList<Movable> list;
    
    public Herd() {
        this.list = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }
    
    public void move(int x, int y) {
        for(Movable organism : this.list) {
            organism.move(x, y);
        }
    }
    
    public String toString() {
        String string = "";
        for(Movable organism : this.list) {
            string = string + organism.toString() + "\n";
        }
        return string;
    }
    
    
    
}
