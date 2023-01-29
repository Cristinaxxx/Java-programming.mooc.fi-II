/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class Book {
    
    private String bookName;
    private int ageRecommendation;
    
    public Book(String bookName, int ageRecommendation) {
        this.bookName = bookName;
        this.ageRecommendation = ageRecommendation;
    }
    
    public String getBookName() {
        return this.bookName;
    }
    
    public int getAgeRecommendation() {
        return this.ageRecommendation;
    }
    
    public String toString() {
        return this.bookName + " (recommended for " + this.ageRecommendation + " year-olds or older)";
    }
  
    
}
