

public class Main {

    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(20);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);
        
        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
        
        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
        
        Hold hold = new Hold(100);
        hold.addSuitcase(suitcase);
        
        hold.printItems();
        
    }

}
