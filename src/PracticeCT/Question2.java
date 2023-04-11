package PracticeCT;

import java.io.*;
import java.util.Vector;

public class Question2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Vector<String>abilites=new Vector<>();
        abilites.add("invisible");
        abilites.add("healing");
        abilites.add("fly");

        // Serialization
        Characters characters=new Characters(100,100,abilites,"none");


        FileOutputStream fout=new FileOutputStream("src/PracticeCT/characters.sr");
        ObjectOutputStream oos=new ObjectOutputStream(fout);
        oos.writeObject(characters);
        System.out.println("serialized");
        oos.close();
        fout.close();



        //Desrialization:


        FileInputStream fin=new FileInputStream("src/PracticeCT/characters.sr");
        ObjectInputStream ois=new ObjectInputStream(fin);

        Characters chr=null;

        chr=(Characters) ois.readObject();
        System.out.println("deserialized");
        System.out.println(chr);


        ois.close();
        fin.close();


    }
}

class Characters implements Serializable{
    private static final long serialVersionUID = 1L;

    private int health;
    private int strength;
    private Vector<String>abilities=new Vector<>();
    private String bane;

    public Characters(int health, int strength, Vector<String> abilities, String bane) {
        this.health = health;
        this.strength = strength;
        this.abilities = abilities;
        this.bane = bane;
    }

    @Override
    public String toString() {
        return "Characters: {" +
                "health=" + health +
                ", strength=" + strength +
                ", abilities=" + abilities +
                ", bane='" + bane + '\'' +
                '}';
    }
}
