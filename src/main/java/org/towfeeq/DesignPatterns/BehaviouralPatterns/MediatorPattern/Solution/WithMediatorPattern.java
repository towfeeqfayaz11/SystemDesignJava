package org.towfeeq.DesignPatterns.BehaviouralPatterns.MediatorPattern.Solution;

import java.util.ArrayList;
import java.util.List;

/*
Solution With Mediator Pattern:
    We introduce a Chat Room as a mediator to handle communication between users. Users don’t directly
    reference each other; instead, they communicate through the chat room.

How It Works
    - Mediator Interface: Defines the methods for managing communication (addUser, sendMessage).
    - Concrete Mediator: The ChatRoom implements the interface and encapsulates interaction logic.
    - Colleague Objects: User objects depend on the mediator for communication and are decoupled from each other.

Benefits:
    Loose Coupling:
        - Colleague objects interact through the mediator, not directly with each other.
        - Adding/removing colleagues doesn’t impact other objects.
    Centralized Logic:
        - Interaction logic is centralized in the mediator, improving readability and maintainability.
    Scalability:
        - New colleagues can be added without modifying existing ones.
    Flexibility:
        - Makes it easier to change how objects interact by modifying the mediator.


Limitations:
    Mediator Complexity:
        - As the number of colleagues grows, the mediator can become a complex “god object.”
    Single Point of Failure:
        - If the mediator fails, the entire system’s communication breaks.
    Performance Overhead:
        - Centralizing all communication can introduce bottlenecks in high-performance systems.
*/

// Mediator Interface
interface ChatMediator {
    void sendMessage(String message, User sender, User receiver);
    void addUser(User user);
}

// Concrete Mediator
class ChatRoom implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender, User receiver) {
        // if message is intended for a specific user
        if (receiver != null){
            receiver.receiveMessage(message, sender);
            return;
        }

        // if message is intended for broadcast to all users
        for (User user : users) {
            if (user != sender) { // Don't send the message back to the sender
                user.receiveMessage(message, sender);
            }
        }
    }
}

// Colleague
class User {
    private String name;
    private ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addUser(this);
    }

    public void sendMessage(String message, User receiver) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this, receiver);
    }
    // since default parameters are not alllowed in java, so using method overloading to simulate same
    public void sendMessage(String message) {
        sendMessage(message, null);
    }

    public void receiveMessage(String message, User sender) {
        System.out.println(this.name + " received from " + sender.name + ": " + message);
    }
}

public class WithMediatorPattern {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User alice = new User("Alice", chatRoom);
        User bob = new User("Bob", chatRoom);
        User charlie = new User("Charlie", chatRoom);

        // broadcast message
        alice.sendMessage("Hello, everyone!");

        // message intended for a specific user in chat room
        bob.sendMessage("Hi, Alice!", alice);

        // broadcast message
        charlie.sendMessage("Good morning!");
    }
}

