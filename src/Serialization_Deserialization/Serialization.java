package Serialization_Deserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

//    Steps to serialize:
//
//    1. Your object class should implement serializable interface;
//    2.FileOutputStream fout=new FileOutputStream(file path)
//    3. ObjectOutputStream out=new ObjectOutputStream(fout);
//    4.out.writeObject(ObjectName)
//    5.close fout and out

    public static void main(String[] args) throws Exception {

        //serializaion:

        Worker worker1=new Worker("Abdul Karim",112,22000);
        Worker worker2=new Worker("Fahim ahmed",113,23000);


        FileOutputStream fout=new FileOutputStream("src/Files/workerInfo.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fout);
        oos.writeObject(worker1);

        fout.close();
        oos.close();
        System.out.println("saved");

    }

}
