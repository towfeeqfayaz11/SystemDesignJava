package org.towfeeq.DesignPatterns.BehaviouralPatterns.IteratorPattern.Solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// Rather than having our custom iterator, we are using java builtin iterator (Iterable interface)
// Concrete Collection
class NameCollection implements Iterable<String> {
    private final List<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    @Override
    public Iterator<String> iterator() {
        return names.iterator();
    }
}

public class WithBuiltInJavaIterator {
    public static void main(String[] args) {
        NameCollection nameCollection = new NameCollection();
        nameCollection.addName("Alice");
        nameCollection.addName("Bob");
        nameCollection.addName("Charlie");

        // Use the iterator
        for (String name : nameCollection) {
            System.out.println(name);
        }
    }
}
