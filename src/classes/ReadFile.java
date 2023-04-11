package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        File f=new File("src/Files/abc.txt");
        BufferedReader br=new BufferedReader(new FileReader(f));
        if(!f.exists()){
            System.out.println("File not found");
        }else {

            while(true){
                String s=br.readLine();
                if(s==null) break;
                System.out.println(s);
            }

        }

        br.close();
    }
}
