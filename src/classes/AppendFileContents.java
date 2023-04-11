package classes;

import java.io.*;
import java.util.Random;

public class AppendFileContents {
    public static void main(String[] args) throws IOException {
        File f=new File("src/Files/abc.txt");
//        BufferedWriter writer=new BufferedWriter(new FileWriter(f));


        OutputStream outputStream=new FileOutputStream(f,true);
        OutputStreamWriter writer=new OutputStreamWriter(outputStream);

        Random random=new Random();

        if(f.exists()){
            int i=15;
            while(i-->0){

                int num=random.nextInt(1000);
                writer.write("\n");
                writer.flush();
                writer.write("Hello "+num);
                writer.flush();
            }
        }
//        writer.close();
    }
}
