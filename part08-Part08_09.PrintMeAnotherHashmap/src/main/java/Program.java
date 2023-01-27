
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("giostra", new Book("Un altro giro di giostra", 2004, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));                
        
        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "stra");
        
    }
    
    public static void printValues(HashMap<String,Book> hashmap) {
        System.out.println(hashmap.values());
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for(Book book : hashmap.values()) {
            if(book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }
    

}
