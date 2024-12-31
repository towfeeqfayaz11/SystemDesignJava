package org.towfeeq.DesignPatterns.BehaviouralPatterns.IteratorPattern.Solution;

// Step 2: Define the Custom Iterable Interface
public interface CustomIterable<T> {
    CustomIterator<T> createIterator(); // Create an iterator
}