
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> inputs = new ArrayList<>();
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());            
            if(input < 0) {
                break;
            }
            inputs.add(input);
        }
        
        inputs.stream()
            .filter(value -> value <= 5 && value >= 1)
            .forEach(value -> System.out.println(value));                

    }
}
