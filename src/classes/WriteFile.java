package classes;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        File file=new File("src/Files/abc.txt");
        BufferedWriter bw=new BufferedWriter(new FileWriter(file));


        if(!file.exists()){
            file.createNewFile();
        }

        bw.write("This is a text file");
        bw.close();

    }
}
