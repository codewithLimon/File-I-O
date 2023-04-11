package classes;

import java.io.File;

public class Dirctory {
    public static void main(String[] args) {
        File file=new File("src/Files");

        if(file.exists()){

        }else {
            file.mkdirs();
        }
    }
}
