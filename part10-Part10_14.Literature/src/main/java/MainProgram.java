
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;



public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>(); 
        
        while(true) {
            System.out.println("Input the name of the book, press Enter to stop:");
            String bookName = scanner.nextLine();
            
            if(bookName.isEmpty()) {
                break;
            }
            
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(bookName, age));
        }
        
        printNumberOfBooks(books);
        PrintSortedBooks(books);


    }
    
    public static void printNumberOfBooks(List<Book> books) {
        if(books.size() == 1) {
            System.out.println("There is 1 book in total.");
        } else {
           System.out.println("There are " + books.size() + " books in total."); 
        }        
    }
    
    public static void PrintSortedBooks(List<Book> books) {
        System.out.println("Books:");
        
        Comparator<Book> comparing = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getBookName);
        
        Collections.sort(books, comparing);
        
        books.stream().forEach(book -> System.out.println(book));
    }
    
}
