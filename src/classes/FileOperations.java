package classes;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        File file=new File("src/Files/abc.txt");

        if(!file.exists()){
            file.createNewFile();
        }else{
            //....
        }
    }
}
