package org;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SerializationEntity se = new SerializationEntity(101, "Rahul");

        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("output-renamed.txt"));
        out.writeObject(se);


        ObjectInputStream in=new ObjectInputStream(new FileInputStream("output-renamed.txt"));
        SerializationEntity se2 = (SerializationEntity) in.readObject();
        System.out.println(se2);

    }
}
