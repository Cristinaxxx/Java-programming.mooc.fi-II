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
import java.util.Collections;
 

public class ChangeHistory {
    
    private ArrayList<Double> changeHistory;
    
    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }   
    
    public void add(double status) {
        this.changeHistory.add(status);
    }
    
    public void clear() {
        this.changeHistory.clear();
    }
   
    public String toString() {
        return "" + this.changeHistory;
    }
    
    public double maxValue() {
        return Collections.max(this.changeHistory);
    }
    
    public double minValue() {
        if(this.changeHistory.isEmpty()) {
            return 0.0;
        }
        return Collections.min(this.changeHistory);
    }
    
    public double average() {
        if(this.changeHistory.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for(Double value : this.changeHistory) {
            sum += value;
        }
        double average = sum / this.changeHistory.size();
        return average;
    }
    
}
