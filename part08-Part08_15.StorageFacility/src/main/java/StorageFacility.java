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
import java.util.ArrayList;
import java.util.Set;

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storageFacility;
    
    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());
        this.storageFacility.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.storageFacility.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        ArrayList<String> items = contents(storageUnit);
        items.remove(item);
        if(items.isEmpty()) {
            this.storageFacility.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        Set<String> storageUnits = this.storageFacility.keySet(); 
        ArrayList<String> units = new ArrayList<>();
        for(String unit : storageUnits) {
            if(!(storageUnits.isEmpty())) {
                units.add(unit);
            }
        } return units;
    }
    
}
