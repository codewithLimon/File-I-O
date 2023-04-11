package PracticeCT;

import java.io.*;

public class Question1 {

    public static void main(String[] args) throws Exception{

        String filePath="src/Files/this_is_a_test.txt";

        File f=new File(filePath);
        f.createNewFile();

        OutputStream outputStream=new FileOutputStream(f.getAbsolutePath());

        OutputStreamWriter writer=new OutputStreamWriter(outputStream);

        int i=10;
        while(i-->0){
            writer.write("This is the best course ever\n");
            writer.flush();
        }

        System.out.println("File written");

        writer.close();
        outputStream.close();



        File file=new File(System.getProperty("user.home")+"/Onedrive/Documents");


        if(file.exists()){
            InputStream is=new FileInputStream(filePath);
            OutputStream os=new FileOutputStream(System.getProperty("user.home")+"/Onedrive/Documents/abc.txt");

            int chunkSize=256;
            byte[] buffer=new byte[chunkSize];
            int readBytes;

            while((readBytes=is.read(buffer))!=-1){
                os.write(buffer,0,readBytes);
            }

            System.out.println("Copied Successfully");

        }


    }
}
