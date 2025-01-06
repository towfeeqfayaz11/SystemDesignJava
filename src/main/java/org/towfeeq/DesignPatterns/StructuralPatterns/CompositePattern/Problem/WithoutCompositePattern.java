package org.towfeeq.DesignPatterns.StructuralPatterns.CompositePattern.Problem;


/*
Problems Without Composite Pattern
    - Handling Mixed Types: The client code must explicitly handle files and folders differently,
      resulting in complicated and less extensible code.
    - Inconsistent Interface: Operations like showDetails() need to be implemented differently
      for files and folders.
*/

import java.util.ArrayList;
import java.util.List;

class File {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void showDetails() {
        System.out.println("File: " + fileName);
    }
}

class Folder {
    private String folderName;
    private List<File> files;   // here we are limited to store only files within folder and not other folders

    public Folder(String folderName) {
        this.folderName = folderName;
        this.files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void showDetails() {
        System.out.println("Folder: " + folderName);
        for (File file : files) {
            file.showDetails();
        }
    }
}

public class WithoutCompositePattern {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Folder folder1 = new Folder("folder1");
        folder1.addFile(file1);
        folder1.addFile(file2);

        folder1.showDetails();
    }
}
