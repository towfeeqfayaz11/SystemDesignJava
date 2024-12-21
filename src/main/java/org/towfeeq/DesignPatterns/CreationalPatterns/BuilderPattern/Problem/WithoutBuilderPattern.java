package org.towfeeq.DesignPatterns.CreationalPatterns.BuilderPattern.Problem;

public class WithoutBuilderPattern {
    public static void main(String[] args) {
        // Creating a House object
        // it is difficult to keep track on client side that which are mandatory and which are optional parameters
        House house = new House("Concrete", "Wood", "Shingles", true, false);
        System.out.println(house);

    }
}
