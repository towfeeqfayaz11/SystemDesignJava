package org.towfeeq.DesignPatterns.StructuralPatterns.ProxyPattern.Solution;


// Image Interface
interface Image {
    void display();
}

// Real Image Class
class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}

// Proxy Image Class
class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName); // Load lazily
        }
        realImage.display();
    }
}

public class WithProxyPattern {
    public static void main(String[] args) {
        // Using proxy instead of real image
        Image image1 = new ProxyImage("photo1.jpg"); // actual image is not loaded here

        // Image will only be loaded when display() is called
        image1.display();
        System.out.println();

        // Image will not be loaded again
        image1.display();
    }
}
