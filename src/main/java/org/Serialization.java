package org;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SerializationEntity se = new SerializationEntity(101, "Rahul");

        Path path = Paths.get("output-renamed.txt");
        ObjectOutputStream out=new ObjectOutputStream(Files.newOutputStream(path));
        out.writeObject(se);

        ObjectInputStream in=new ObjectInputStream(Files.newInputStream(path));
        SerializationEntity se2 = (SerializationEntity) in.readObject();
        System.out.println(se2);
    }
}
