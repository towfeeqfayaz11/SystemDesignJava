package org.towfeeq.SOLIDPriciples.LSP.Solution;

// base class for all files that are only readable
public class ReadableFile implements Readable{
    @Override
    public void read() {
        System.out.println("Reading File");
    }
}
