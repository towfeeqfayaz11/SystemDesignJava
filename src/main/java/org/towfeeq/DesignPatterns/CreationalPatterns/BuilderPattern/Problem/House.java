package org.towfeeq.DesignPatterns.CreationalPatterns.BuilderPattern.Problem;

// Example without Builder Pattern
public class House {
    private String foundation; // assume it to be a mandatory parameter
    private String structure; // assume it to be a mandatory parameter
    private String roof; // assume it to be a mandatory parameter
    private boolean hasGarden; // assume it to be an optional parameter
    private boolean hasSwimmingPool; // assume it to be an optional parameter

    // Telescoping constructor
    public House(String foundation, String structure, String roof, boolean hasGarden, boolean hasSwimmingPool) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.hasGarden = hasGarden;
        this.hasSwimmingPool = hasSwimmingPool;
    }


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
