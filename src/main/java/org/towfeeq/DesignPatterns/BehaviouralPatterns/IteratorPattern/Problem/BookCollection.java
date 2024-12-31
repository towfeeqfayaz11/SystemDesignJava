package org.towfeeq.DesignPatterns.BehaviouralPatterns.IteratorPattern.Problem;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    // what if it return Set instead of List, then client will have breaking changes
    public List<Book> getBooks(){
        return books;
    }
}
