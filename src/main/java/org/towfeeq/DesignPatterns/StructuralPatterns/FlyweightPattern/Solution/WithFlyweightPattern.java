package org.towfeeq.DesignPatterns.StructuralPatterns.FlyweightPattern.Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Flyweight interface
interface TreeType {
    void draw(int x, int y);
}

// Concrete Flyweight
class SharedTreeType implements TreeType {
    private String type; // Intrinsic state
    private String color; // Intrinsic state
    private String texture; // Intrinsic state

    public SharedTreeType(String type, String color, String texture) {
        this.type = type;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing " + type + " tree with color " + color +
                " and texture " + texture + " at (" + x + ", " + y + ")");
    }
}

// Context class
class Tree {
    private int x; // Extrinsic state
    private int y; // Extrinsic state
    private TreeType treeType; // Intrinsic state (shared)

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.draw(x, y);
    }
}

// Flyweight Factory
class TreeTypeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String type, String color, String texture) {
        String key = type + "-" + color + "-" + texture;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new SharedTreeType(type, color, texture));
        }
        return treeTypes.get(key);
    }
}

// Forest class manages trees
class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(String type, String color, String texture, int x, int y) {
        TreeType treeType = TreeTypeFactory.getTreeType(type, color, texture);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    public void drawForest() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}

// client code
public class WithFlyweightPattern {
    public static void main(String[] args) {
        Forest forest = new Forest();

        // Planting thousands of trees
        forest.plantTree("Oak", "Green", "Rough", 10, 20);
        forest.plantTree("Pine", "Dark Green", "Smooth", 15, 30);
        forest.plantTree("Oak", "Green", "Rough", 50, 60);

        forest.drawForest();
    }
}
