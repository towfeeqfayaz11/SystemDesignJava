package org.towfeeq.DesignPatterns.BehaviouralPatterns.MediatorPattern.Problem;

import java.util.ArrayList;
import java.util.List;

/*
Problem Without the Mediator Pattern
    Imagine a Chat Room where participants (users) communicate directly with one another. Every user would
    need to maintain references to all other users, and adding/removing users would require updating every participant.


Limitations
    Tight coupling: Users are directly dependent on each other.
    Scalability issues: Adding/removing users requires updating all other users' contact lists.
*/

class User {
    private String name;
    private List<User> contacts = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addContact(User contact) {
        contacts.add(contact);
    }

    public void sendMessage(String message) {
        for (User contact : contacts) {
            contact.receiveMessage(message, this);
        }
    }

    public void receiveMessage(String message, User sender) {
        System.out.println(this.name + " received from " + sender.name + ": " + message);
    }
}

public class WithoutMediatorPattern {
    public static void main(String[] args) {
        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");

        alice.addContact(bob);
        alice.addContact(charlie);

        bob.addContact(alice);
        bob.addContact(charlie);

        alice.sendMessage("Hello, everyone!");
        bob.sendMessage("Hi, Alice!");
    }
}
