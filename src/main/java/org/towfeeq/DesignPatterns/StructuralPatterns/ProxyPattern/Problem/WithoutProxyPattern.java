package org.towfeeq.DesignPatterns.StructuralPatterns.ProxyPattern.Problem;


/*
Problem Without Proxy
    Imagine a scenario where we need to fetch and display a large image in an application. Loading the
    image takes significant time and memory. The application should not block while the image is being
    loaded. We need a mechanism to load the image lazily (only when required).

Problems Without Proxy
    - Eager Initialization: The real image is loaded as soon as it is created, consuming memory and time
      even if it’s not displayed.
    - Performance Impact: The application blocks while loading large images.

Solution: Proxy Pattern
    - Using the Proxy Pattern, we introduce a proxy class (ProxyImage) that represents the image. The proxy
      only loads the real image when it is required.
*/


// Defines the common interface for images.
// Image Interface
interface Image {
    void display();
}

// Represents a heavy resource that takes time to load.
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


// The client directly interacts with the real image.
public class WithoutProxyPattern {
    public static void main(String[] args) {
        // Loading the image eagerly
        Image image1 = new RealImage("photo1.jpg"); // this loads image here, though it is not actually used here
        image1.display();

        // Loading another image
        Image image2 = new RealImage("photo2.jpg");
        image2.display();
    }
}
