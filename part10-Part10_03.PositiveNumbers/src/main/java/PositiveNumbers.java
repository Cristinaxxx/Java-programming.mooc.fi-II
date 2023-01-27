
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();
        list.add(-4);
        list.add(-9);
        list.add(5);
        list.add(12);
        list.add(-10);
 
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        // OR   .collect(Collectors.toList());
    }

}
