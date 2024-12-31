package org.towfeeq.DesignPatterns.BehaviouralPatterns.IteratorPattern.Solution;

// Step 3: Implement the Concrete Collection
public class BookCollection implements CustomIterable<Book> {
    private final Book[] books;
    private int size = 0;

    public BookCollection(int capacity) {
        this.books = new Book[capacity];
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        } else {
            throw new IllegalStateException("Collection is full");
        }
    }

    @Override
    public CustomIterator<Book> createIterator() {
        return new BookIterator();
    }

    // Step 4: Implement the Custom Iterator
    private class BookIterator implements CustomIterator<Book> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Book next() {
            if (!hasNext()) throw new IllegalStateException("No more elements");
            return books[currentIndex++];
        }
    }
}
