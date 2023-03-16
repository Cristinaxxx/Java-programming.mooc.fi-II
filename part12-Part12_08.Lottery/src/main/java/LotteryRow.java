
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random random = new Random();
        while(this.numbers.size() < 7) {
            int randomNumber = random.nextInt(40) + 1;
            if(!(this.numbers.contains(randomNumber))) {
                this.numbers.add(randomNumber);
            }
        }
    }

    public boolean containsNumber(int number) {        
        return this.numbers.contains(number);
    }
}

