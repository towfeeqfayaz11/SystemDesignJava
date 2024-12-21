package org.towfeeq.DesignPatterns.CreationalPatterns.BuilderPattern.Solution;

// Using the Builder Pattern
public class WithBuilderPattern {
    public static void main(String[] args) {
        // Constructing the object step-by-step
//        House house = new House.HouseBuilder()
//                .setFoundation("Concrete")
//                .setStructure("Wood")
//                .setRoof("Shingles")
//                .setHasGarden(true)
//                .setHasSwimmingPool(false)
//                .build();


        House house = new House.HouseBuilder("Mud", "Bricks", "Tin")
                .setHasGarden(true) //skipping one optional parameter for "setHasSwimmingPool"
                .build();

        System.out.println(house);
    }
}