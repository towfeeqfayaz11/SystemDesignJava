package org.towfeeq.SOLIDPriciples.LSP.Solution;

/*
         IReadable                 IWritable
             |                        |
             |                        |
             |                        |
        ReadableFile (base class)     |
             |                        |
       ---------------------------    |
       |                         |    |
   ReadOnlyFile                 WritableFile
  (concrete class)               (concrete class)

*/

public class Client {
    public static void main(String[] args) {
        WritableFile writableFile = new WritableFile();
        writableFile.read();
        writableFile.write();

        ReadOnlyFile readOnlyFile = new ReadOnlyFile();
        readOnlyFile.read();
        // readOnlyFile.write();   // this method is not available

        readAnyFile(writableFile);
        readAnyFile(readOnlyFile);
    }

    public static void readAnyFile(ReadableFile file){
        file.read();
    }
}
