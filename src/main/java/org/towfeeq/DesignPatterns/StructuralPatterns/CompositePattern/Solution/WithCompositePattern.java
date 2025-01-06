package org.towfeeq.DesignPatterns.StructuralPatterns.CompositePattern.Solution;

import java.util.ArrayList;
import java.util.List;

interface FileSystemComponent {
    void showDetails();
}

class File implements FileSystemComponent {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void showDetails() {
        System.out.println("File: " + fileName);
    }
}

class Folder implements FileSystemComponent {
    private String folderName;
    private List<FileSystemComponent> components;

    public Folder(String folderName) {
        this.folderName = folderName;
        this.components = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void showDetails() {
        System.out.println("Folder: " + folderName);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}

public class WithCompositePattern {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");

        Folder folder1 = new Folder("folder1");
        folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder1.showDetails();
        System.out.println();
        FileSystemComponent file3 = new File("file3.txt");
        Folder folder2 = new Folder("folder2");
        folder2.addComponent(file3);
        folder2.showDetails();
        System.out.println();
        folder1.addComponent(folder2);
        folder1.showDetails(); // doing DFS type traversal

        /*
        we are able to achieve uniformity (able to treat files and folders uniformly even if they are structurally different)
        we are able to achieve scalability (we can add new types of components like shortcuts or simlinks)
        we are able to achieve composition (we can add remove components without affecting how clients interact with it)
        */
    }
}
