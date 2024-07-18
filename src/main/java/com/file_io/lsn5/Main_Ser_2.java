package com.file_io.lsn5;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main_Ser_2 {
    public static void main(String[] args) {
        Path serPath = Paths.get("alice.ser");
        try(ObjectInputStream ois =  new ObjectInputStream(Files.newInputStream(serPath))) {
            Person target = (Person) ois.readObject();
            System.out.println(target.toString());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
