package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class De {

    //Steps to deserialize:

    //1. FileInputStream fin=new FileInputStream(file path)
    //2. ObjectInputStream in=new ObjectInputStream(fin);
    //3. Object objectName=in.readObject()
    //4. Cast the object to the desired class
    //5. Close fin and in

    public static void main(String[] args) throws Exception {

        //deserialization:

        FileInputStream fin=new FileInputStream("src/Files/workerInfo.ser");
        ObjectInputStream ois=new ObjectInputStream(fin);
        Worker worker=(Worker)ois.readObject();

        System.out.println(worker);

        fin.close();
        ois.close();

    }
}
