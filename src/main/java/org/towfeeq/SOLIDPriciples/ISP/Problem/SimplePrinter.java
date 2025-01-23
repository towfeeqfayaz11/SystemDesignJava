package org.towfeeq.SOLIDPriciples.ISP.Problem;


// this is a voilation of ISP, as Simple printer is being forced to depend on functions like scan() and copy(),
// which it doesn't support
public class SimplePrinter implements Machine{
    @Override
    public void print(Document doc) {
        System.out.println("Printing document...");
    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("Scan not supported");

    }

    @Override
    public void copy(Document doc) {
        throw new UnsupportedOperationException("copy not supported");
    }
}
