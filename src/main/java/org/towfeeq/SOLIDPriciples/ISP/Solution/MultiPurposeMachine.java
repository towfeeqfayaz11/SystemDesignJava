package org.towfeeq.SOLIDPriciples.ISP.Solution;

public class MultiPurposeMachine implements Printer, Scanner, Copier{
    @Override
    public void copy() {
        System.out.println("Copying Document...");
    }

    @Override
    public void print() {
        System.out.println("Printing Document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning Document...");
    }
}
