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

public class Box implements Packable {
    
    private double maxCapacity;
    private ArrayList<Packable> list;
    
    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.list = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if(weight() + item.weight() <= this.maxCapacity) {
            this.list.add(item);            
        }
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for(Packable item : this.list) {
            weight += item.weight();
        }
        return weight;
    }
    
    public String toString() {
        return "Box: " + this.list.size() + " items, total weight " + weight() + " kg";
    }
    
}
