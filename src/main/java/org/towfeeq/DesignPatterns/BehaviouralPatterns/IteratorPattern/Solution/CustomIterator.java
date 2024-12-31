package org.towfeeq.DesignPatterns.BehaviouralPatterns.IteratorPattern.Solution;

// Step 1: Define the Custom Iterator Interface
public interface CustomIterator<T> {
    boolean hasNext(); // Check if there are more elements
    T next();          // Fetch the next element
}
