
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {
    
    public static void main(String[] args) {      
        
        try {
           Files.lines(Paths.get("literacy.csv")) 
                   .map(line -> line.split(","))
                   .sorted((rate1, rate2) -> rate1[5].compareTo(rate2[5]))
                   .forEach(row -> System.out.println(row[3] + " (" + row[4] + "), " + row[2].split(" ")[1].trim() + ", " + row[5]));
        }
        catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
        

    }
    
  
}
