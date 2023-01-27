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
        
public class Abbreviations {
    
    private HashMap<String, String> listOfAbbreviations = new HashMap<>();
    
    public Abbreviations() {
        this.listOfAbbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        if(!hasAbbreviation(abbreviation)) {
            this.listOfAbbreviations.put(abbreviation, explanation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        sanitizedString(abbreviation);
        return this.listOfAbbreviations.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        if(this.listOfAbbreviations.containsKey(abbreviation)) {
            return this.listOfAbbreviations.get(abbreviation);
        }
        return null;
    }
    
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
    
}
