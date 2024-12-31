package org.towfeeq.DesignPatterns.BehaviouralPatterns.IteratorPattern.Solution;

/*
Custom Iterator Pattern Example
Step 1: Define the Custom Iterator Interface
    We will create an interface with two core methods:
        hasNext() to check if there are more elements.
        next() to fetch the next element.
Step 2: Define the Custom Iterable Interface
    This interface provides a method to create an iterator.
Step 3: Implement the Concrete Collection and Iterator
    We'll create a class that uses the custom iterator to traverse its elements.


Explanation of the Code
Custom Interfaces:
    CustomIterator<T> provides the contract for traversing the collection.
    CustomIterable<T> provides the contract for creating an iterator.

Concrete Collection:
    BookCollection holds the collection of books and implements CustomIterable to provide the iterator.

Concrete Iterator:
    BookIterator is implemented as an inner class within BookCollection.
    It maintains a currentIndex to keep track of the iteration.

Usage:
    A client creates the BookCollection and uses createIterator() to fetch an iterator.
    The client calls hasNext() and next() on the iterator to traverse the elements.


Solution: The iterator pattern encapsulates the traversal logic, decoupling it from the collection.
*/

public class WithIteratorPattern {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection(5);
        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("Html Book"));
        bookCollection.addBook(new Book("Kubernetes Book"));

        // Use the custom iterator
        CustomIterator<Book> iterator = bookCollection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

/*
Definitions of Key Concepts
Iterable:
    - Represents a collection that can be iterated over (e.g., a list of books).
    - Provides a way to create an Iterator for itself.
    - Example: In Java, Iterable is an interface with a iterator() method.

Iterator:
    - Represents the actual mechanism to traverse through the elements in an Iterable
      (e.g., move to the next element, check if more elements exist).
    - It is like a "cursor" or "pointer" that helps you access elements one by one.

Why Parent Class Implements Iterable
    The parent class (BookCollection) represents the data structure holding the collection of items.
    By implementing Iterable, it tells the outside world:
        - "I am a collection of items that can be iterated over."
        - "I can provide you with an Iterator (using createIterator()) to help traverse my items."
    The parent class only defines how to create an iterator. It doesn't define how the iteration happens
    because the logic for traversal is handled by the iterator itself (the nested class).

Why the Nested Class Implements Iterator
    The nested class (BookIterator) represents the traversal logic for the collection. It does the following:
        - Tracks the current position during iteration.
        - Implements the methods hasNext() and next() to move through the collection.

    By making the iterator a nested class:
        - It has access to the private members (like the books array and size) of the parent class (BookCollection).
        - This keeps the iterator logic tightly coupled with the internal details of the parent
          collection while maintaining encapsulation.

Responsibilities of Each
    Parent Class (BookCollection as Iterable):
        Stores the Data:
            - Holds the actual collection (books array in this case).
        Provides the Iterator:
            - Implements the createIterator() method to return an instance of the BookIterator.
    Nested Class (BookIterator as Iterator):
        Implements Traversal Logic:
            - Uses the hasNext() method to check if there are more elements.
            - Uses the next() method to return the current element and move to the next.

Analogy for Better Understanding
    Imagine a book (NameCollection) with pages (names). To read the book:
        The book (Iterable):
            - Represents the collection of all pages.
            - Provides you with a bookmark (Iterator) to track where you are in the book.

        The bookmark (Iterator):
            - Keeps track of your current page.
            - Knows how to move to the next page (next()).
            - Knows whether there are more pages to read (hasNext()).

Why Split Responsibilities?
    Separation of Concerns:
        - The collection (BookCollection) is responsible for storing data.
        - The iterator (BookIterator) is responsible for traversal logic.
    Encapsulation:
        - The nested iterator class can access the private details of the collection
          (like the names array), but these details are hidden from the outside world.
    Flexibility:
        - You can define multiple iterators (e.g., reverse iterator, filtered iterator) for the same collection.
*/