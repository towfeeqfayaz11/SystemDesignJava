package org.towfeeq.DesignPatterns.BehaviouralPatterns.IteratorPattern.Problem;

// client code
public class WithoutIteratorPattern {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("Python Book"));

        /*
        The problem with this code is that the client code is tightly coupled with the implementation
        of BookCollection
        e.g; in current implementation of BookCollection, we are using List for storing books,
        but if we decide to change from List to set, then the method of iterating will fail
        on client side thus tightly coupling
        */
        for(int i = 0; i<bookCollection.getBooks().size(); i++) {
            System.out.println(bookCollection.getBooks().get(i));
        }
    }
}
