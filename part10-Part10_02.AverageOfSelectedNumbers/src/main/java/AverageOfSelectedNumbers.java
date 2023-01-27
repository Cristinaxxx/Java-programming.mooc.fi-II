
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> numbers = new ArrayList<>();
       
        System.out.println("Input numbers, type \"end\" to stop.");
                
        while(true) {            
            String line = scanner.nextLine();
            if(line.equals("end")) {
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String answer = scanner.nextLine();
                if(answer.equals("n")) {
                    System.out.println("Average of the negative numbers:" + numbers.stream()
                    .mapToInt(n -> Integer.valueOf(n))
                    .filter(num -> num < 0)
                    .average()
                    .getAsDouble());
                }
                else {
                    System.out.println("Average of the positive numbers: " + numbers.stream()
                    .mapToInt(n -> Integer.valueOf(n))
                    .filter(num -> num > 0)
                    .average()
                    .getAsDouble());
                }
                
                break;
            }
            numbers.add(line);
        }

    }
}
