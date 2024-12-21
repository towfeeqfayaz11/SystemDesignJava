package org.towfeeq.DesignPatterns.CreationalPatterns.BuilderPattern.Solution;

// Product class
public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarden;
    private boolean hasSwimmingPool;

    // Private constructor to enforce creation through the Builder
    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    // Static nested Builder class
    public static class HouseBuilder {
        private String foundation;
        private String structure;
        private String roof;
        private boolean hasGarden;
        private boolean hasSwimmingPool;

        // mandatory parameters
        public HouseBuilder(String foundation, String structure, String roof) {
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }

//        // Step 1: Methods to set mandatory fields
//        public HouseBuilder setFoundation(String foundation) {
//            this.foundation = foundation;
//            return this;
//        }
//
//        public HouseBuilder setStructure(String structure) {
//            this.structure = structure;
//            return this;
//        }
//
//        public HouseBuilder setRoof(String roof) {
//            this.roof = roof;
//            return this;
//        }

        // Step 2: Methods to set optional fields
        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        // Step 3: Build method to return the final product
        public House build() {
            return new House(this);
        }
    }

    // For demonstration
    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarden=" + hasGarden +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }
}

/*
Static Inner Class:
    - HouseBuilder is a static inner class inside the House class.
    - Because it is static, it can be instantiated without an instance of the enclosing class (House).

Method Chaining:
    - Methods like setFoundation() and setHasGarden() return the same HouseBuilder object (this),
      enabling multiple calls in a single line.
    - This technique is called method chaining.

build() Method:
    - This is the final step where the HouseBuilder object is used to construct and return a House object.



--------


Static Members and Inner Classes: `General Rules`
    - Static Members Can’t Access Non-Static Members Directly:
    - A static member (like a method or variable) belongs to the class rather than an instance. Hence, it cannot
      directly access non-static members because non-static members are tied to an instance of the class.

Static Inner Class Behavior:
    - A static inner class does not depend on an instance of the outer class.
    - However, it can access non-static members of the outer class via an explicit instance of the outer class.
*/
































