
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> inputs = new ArrayList<>();
        
         
        System.out.println("Input numbers, type 'end' to stop");
        
        while(true){
            String line = scanner.nextLine();
            if(line.equals("end")) {                
                break;
            }
            inputs.add(line);
        }
        
        double average = inputs.stream()
                .mapToInt(number -> Integer.valueOf(number))
                .average()
                .getAsDouble();
        
        System.out.println("Average of the numbers: " + average);
         
    }
    
    
}
