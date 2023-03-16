/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author crist
 */
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SaveableDictionary {
    
    private Map<String, String> dictionary;
    private String file;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);
        this.dictionary.putIfAbsent(translation, word);
    }
    
    public String translate(String word) {
        return this.dictionary.get(word);
    }
    
    public void delete(String word) {
        this.dictionary.remove(word);
    }
    
    public boolean load() {
        
        try {
            Files.lines(Paths.get(this.file))
                    .map(lines -> lines.split(":"))
                    .forEach(parts -> {
                        this.dictionary.putIfAbsent(parts[0], parts[1]);                        
                    });      
            return true;
        } catch (Exception e) {
            System.out.println("File loading error:" + e.getMessage());
            return false;
        }        
    }
    
    public boolean save() {
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for(String word: this.dictionary.keySet()) {
                String translation = this.dictionary.get(word);
                printWriter.println(word + ":" + translation);
            }
            printWriter.close();
            return true;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
}
