package org.towfeeq.DesignPatterns.BehaviouralPatterns.IteratorPattern.Solution;


// A book class to store the book title
public class Book {
    private final String title;
    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
