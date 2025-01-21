package org.towfeeq.SOLIDPriciples.LSP.Problem;

public class Client {
    public static void main(String[] args) {
        File file = new File();
        file.read();
        file.write();  // This is allowed as File class allows writing

        ReadOnlyFile readOnlyFile = new ReadOnlyFile();
        readOnlyFile.read();

        // Uncomment the following line to see the error
        // readOnlyFile.write(); // This throw exception, which is violation of LSP,
                                 // Ideally this object should not support this kind of method
    }
}
