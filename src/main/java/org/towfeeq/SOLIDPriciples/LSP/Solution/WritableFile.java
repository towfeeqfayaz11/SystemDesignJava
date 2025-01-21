package org.towfeeq.SOLIDPriciples.LSP.Solution;

// concrete implementation for readwrite file
public class WritableFile extends ReadableFile implements Writable{
    @Override
    public void write() {
        System.out.println(" Writing to file");
    }
}
