package com.file_io.lsn5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main_Ser_1 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25, "female");
        Path serPath = Paths.get("alice.ser");
        try(ObjectOutputStream oos = new  ObjectOutputStream(new FileOutputStream(String.valueOf(serPath)))) {
            oos.writeObject(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
