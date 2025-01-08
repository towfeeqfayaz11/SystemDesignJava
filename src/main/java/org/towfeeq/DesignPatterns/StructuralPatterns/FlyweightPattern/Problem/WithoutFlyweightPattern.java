package org.towfeeq.DesignPatterns.StructuralPatterns.FlyweightPattern.Problem;


/*
Example Scenario: Trees in a Forest
    Imagine you are creating a graphical application to render a forest with thousands of trees. Each tree
    has shared properties such as type, color, and texture, but unique properties like position. Without
    the Flyweight pattern, creating a separate object for each tree would be memory-intensive.

Problems in the Above Design
    High Memory Usage:
        - Each tree stores redundant data like type, color, and texture, even though they are shared across
          multiple trees.

    Inefficient Object Management:
        - Creating and managing a large number of unique objects increases overhead.
*/

import java.util.ArrayList;
import java.util.List;

// Tree class representing each tree
class Tree {
    private String type;  // Intrinsic state
    private String color; // Intrinsic state
    private String texture; // Intrinsic state
    private int x; // Extrinsic state
    private int y; // Extrinsic state

    public Tree(String type, String color, String texture, int x, int y) {
        this.type = type;
        this.color = color;
        this.texture = texture;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Drawing " + type + " tree at (" + x + ", " + y + ")");
    }
}

// Forest class manages a collection of trees
class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(String type, String color, String texture, int x, int y) {
        Tree tree = new Tree(type, color, texture, x, y);
        trees.add(tree);
    }

    public void drawForest() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}


// client code
public class WithoutFlyweightPattern {
    public static void main(String[] args) {
        Forest forest = new Forest();

        // Planting thousands of trees
        forest.plantTree("Oak", "Green", "Rough", 10, 20);
        forest.plantTree("Pine", "Dark Green", "Smooth", 15, 30);
        forest.plantTree("Oak", "Green", "Rough", 50, 60);

        forest.drawForest();
    }
}
