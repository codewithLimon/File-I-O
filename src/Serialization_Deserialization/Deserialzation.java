package Serialization_Deserialization;

import java.io.*;

public class Deserialzation {

//    Steps to deserialize:
//     1. Declare object
//     2. class should implement serializable
//     3. FileInputStream fileIn=new FileInputStream(file path);
//     4. ObjectInputStream in=new ObjectInputStream(fileIn);
//     5. ObjectName=(object Class name) in.readObject();
//     6. close in and fileIn;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Worker worker=null;

        FileInputStream fileInputStream=new FileInputStream("src/Files/workerInfo.ser");
        ObjectInputStream ois=new ObjectInputStream(fileInputStream);

        worker= (Worker) ois.readObject();
        worker.toString();

        ois.close();
        fileInputStream.close();
    }
}
