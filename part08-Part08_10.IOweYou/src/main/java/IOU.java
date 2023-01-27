/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */

import java.util.HashMap;

public class IOU {
    
    private HashMap<String, Double> list;
    
    public IOU() {
        this.list = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        list.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.list.getOrDefault(toWhom, 0.0);
    }
    
    
    
}
