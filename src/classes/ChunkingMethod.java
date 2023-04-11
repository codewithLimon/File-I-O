package classes;

import java.io.*;

public class ChunkingMethod {
    public static void main(String[] args) throws Exception{

        String filePath="src/Files/abc.txt";
        String newFilePath="src/Files/cdf.txt";
        InputStream is=new FileInputStream(filePath);
        OutputStream os=new FileOutputStream(newFilePath);

        int chunkSize=256;
        byte[] buffer=new byte[chunkSize];
        int readBytes;

        while((readBytes=is.read(buffer))!=-1){
            os.write(buffer,0,readBytes);
        }


        System.out.println("Copied Successfully");





    }
}
